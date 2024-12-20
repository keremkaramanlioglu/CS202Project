import entities.*;

import panels.Panel;
import panels.customerPanels.ProfilePanel;
import panels.dbManagerPanels.QueryPanel;
import panels.managerPanels.*;
import panels.receptionistPanels.HouseKeepingPanel;
import panels.receptionistPanels.RoomsPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class HotelManager {
    private final HotelView hotelView;
    private final DatePicker datePicker;
    private final DBConnectionControl dbConnectionControl;
    private HotelDao hotelDao;
    private final SSNPopUpMenu ssnPopUpMenu;
    private String currSsn;
    private Employee currEmployee;

    public HotelManager(HotelView hotelView, DBConnectionControl dbConnectionControl) throws SQLException {
        this.hotelView = hotelView;
        //hotelView.setVisible(true);
        this.currSsn = "";
        ButtonListener buttonListener = new ButtonListener();
        hotelView.addButtonListener(buttonListener);
        hotelView.addMouseListener(buttonListener);
        datePicker = new DatePicker(hotelView);
        ssnPopUpMenu = new SSNPopUpMenu(hotelView);
        this.dbConnectionControl = dbConnectionControl;
    }

    private void connectionControl() {
        try {
            if (!dbConnectionControl.isConnected()) {
                Icon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/connection-error.png")));
                JOptionPane.showMessageDialog(hotelView,"Please connect to a database!", "Connection Lost", JOptionPane.QUESTION_MESSAGE, icon);
                dbConnectionControl.reinitiate();
            } else {
                hotelDao = new HotelDao(dbConnectionControl.getConnection());
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void setCurrSsn() throws SQLException {
        currSsn = ssnPopUpMenu.getSsn();
        if (currSsn.isEmpty()) {
            JOptionPane.showMessageDialog(hotelView,"You can not continue without verifying your ssn!", "Empty Ssn!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        setCurrEmployee();
    }

    private boolean isValidAction(String action) {
        return switch (currEmployee.getEmp_type()) {
            case "Manager" -> compare(action, new String[]{"Manager", "Customer", "Housekeeper", "Receptionist"});
            case "Database Manager" -> true;
            case "Receptionist" -> compare(action, new String[]{"Customer", "Receptionist"});
            case "Housekeeper" -> compare(action, new String[]{"Customer", "Housekeeper"});
            default -> false;
        };
    }

    public boolean checkAction(String action) {
        if (currEmployee == null && !action.equals("Back")) {
            try {
                setCurrSsn();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            if (currEmployee == null) {
                return false;
            }
        } else if (!action.equals("Back") && !isValidAction(action)) {
            JOptionPane.showMessageDialog(hotelView,"Invalid action!", "Authority Error", JOptionPane.ERROR_MESSAGE);
            try {
                setCurrSsn();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            if (currEmployee == null) {
                return false;
            }
        }
        return true;
    }

    private void setCurrEmployee() throws SQLException {
        if (hotelDao.getEmployees("ssn", "=", currSsn).isEmpty()) {
            JOptionPane.showMessageDialog(hotelView, "No such Employee! Please enter a valid ssn!", "Invalid SSN!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        currEmployee = hotelDao.getEmployees("ssn", "=", currSsn).getFirst();
    }

    public boolean compare(String s1, String[] strings) {
        for (String str : strings) {
            if (s1.equals(str)) return true;
        }
        return false;
    }


    private class ButtonListener implements ActionListener, MouseListener {
        public void actionPerformed(ActionEvent e) {

            connectionControl();

            //System.out.println("Curr Ssn: " + currSsn);

            String command = e.getActionCommand();
            JButton button = (JButton) e.getSource();
            String name = button.getName();
            //System.out.println(command);
            //System.out.println(button.getName());

            //if (currSsn.isEmpty() && !command.equals("Guest")) return;
            String[] sidePanelOptions = {"Rooms", "Users", "Employees", "Finance", "Bookings", "Housekeeping",
                    "Book a room", "My Bookings", "Profile", "My Jobs", "Query Panel",  "Add Customer"};
            String [] mainPanelOptions = {"Manager", "Customer", "Housekeeper", "Receptionist", "Database Manager","Back"};
            if (compare(command, sidePanelOptions) && button.getName().equals("side")) {
                Panel activePanel = hotelView.getActivePanel();
                activePanel.setSelectedButton(button);
                if (activePanel.getCenterPanel() != null) activePanel.getCenterPanel().reset();
                activePanel.setCenterPanel(activePanel.getPanelByName(command));
            } else if (compare(command, mainPanelOptions)) {
                if (!command.equals("Customer")) if (!checkAction(command)) return;
                hotelView.getActivePanel().reset();
                hotelView.setActivePanel(hotelView.getPanelByName(command));
            } else {
                int currHotelID = currEmployee.getEmp_hotel_id();
                Panel activePanel = hotelView.getActivePanel();
                try {
                    switch (name) {
                        case "add":
                            if (command.equals("Bookings")) {
                                System.out.println("add button pressed in booking panel");
                                int affectedRows = hotelDao.insertBooking(new Booking(activePanel.getCenterPanel().getEntity()));
                                if (affectedRows > 0) {
                                    JOptionPane.showMessageDialog(hotelView, affectedRows + " " + command + " added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else if (command.equals("Employees")) {
                                //System.out.println("add button pressed in employees panel by manager");
                                EmpInfos emp = new EmpInfos(hotelView);
                                Employee employee = emp.getEmployee();
                                if (employee != null) {
                                    hotelDao.insertEmployee(employee);
                                }

                                // TODO ADD ROOM NUM CONSTRAINTS
                            } else if (command.equals("Housekeeping")) {
                                System.out.println("add button pressed in housekeeping panel by manager");
                                hotelDao.insertCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getEntity()));
                            } else if (command.equals("Rooms")) {
                                System.out.println("add button pressed in rooms panel by manager");
                                int affectedRows = hotelDao.insertRoom(new Room(activePanel.getCenterPanel().getEntity()));
                                if (affectedRows > 0) {
                                    JOptionPane.showMessageDialog(hotelView, affectedRows + " " + command + " added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else if (command.equals("Users")) {
                                System.out.println("add button pressed in users panel by manager");
                                hotelDao.insertCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                            } else if (command.equals("Add Customer")) {
                                System.out.println("add button pressed in add customer panel by receptionist");
                                hotelDao.insertCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                            } else if (command.equals("houseKeeping")) {
                                System.out.println("add button pressed in housekeeping panel by receptionist");
                                hotelDao.insertCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getEntity()));
                            }
                            break;
                        case "update":
                            if (command.equals("Bookings")) {
                                Booking book = new Booking(activePanel.getCenterPanel().getEntity());
                                book.setBooking_id(Integer.parseInt(String.valueOf(activePanel.getCenterPanel().getSelectedRow()[0])));
                                int affectedRows = hotelDao.updateBooking(book);
                                if( affectedRows > 0) {
                                    JOptionPane.showMessageDialog(null, command + " updated successfully!" + " Affected rows: " + affectedRows);
                                }
                            } else if (command.equals("Employees")) {
                                Object[] emps = activePanel.getCenterPanel().getSelectedRow();
                                if (emps == null) {
                                    JOptionPane.showMessageDialog(null, "No row selected!");
                                    return;
                                }
                                Employee employee = new Employee(activePanel.getCenterPanel().getSelectedRow());
                                if (employee != null) {
                                    EmpInfos emp = new EmpInfos(hotelView);
                                    emp.setEmp(employee);
                                    employee = emp.getEmployee();
                                    if (employee.equals(employee)) {return;}
                                    hotelDao.updateEmployee(employee);
                                }
                            } else if (command.equals("Housekeeping")) {
                                hotelDao.updateCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getEntity()));
                            } else if (command.equals("Rooms")) {
                                Room room = new Room(activePanel.getCenterPanel().getEntity());
                                room.setRoom_id(Integer.parseInt(String.valueOf(activePanel.getCenterPanel().getSelectedRow()[0])));
                                int affectedRows = hotelDao.updateRoom(room);
                                if( affectedRows > 0) {
                                    JOptionPane.showMessageDialog(null, "Room updated successfully!" + " Affected rows: " + affectedRows);
                                }
                            } else if (command.equals("Users")) {

                            } else if (command.equals("houseKeeping")) {
                                hotelDao.updateCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getEntity()));
                            }
                            break;
                        case "delete":
                            int rowsAffected = 0;
                            if (command.equals("Bookings")) {
                                 rowsAffected = hotelDao.deleteBooking(new Booking(activePanel.getCenterPanel().getSelectedRow()));
                            } else if (command.equals("Employees")) {
                                rowsAffected = hotelDao.deleteEmployee(new Employee(activePanel.getCenterPanel().getSelectedRow()));
                            } else if (command.equals("Housekeeping")) {
                                rowsAffected = hotelDao.deleteCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getSelectedRow()));
                            } else if (command.equals("Rooms")) {
                                rowsAffected = hotelDao.deleteRoom(new Room(activePanel.getCenterPanel().getSelectedRow()));
                            } else if (command.equals("Users")) {
                                rowsAffected = hotelDao.deleteCustomer(new Customer(activePanel.getCenterPanel().getSelectedRow()));
                            } else if (command.equals("houseKeeping")) {
                                rowsAffected = hotelDao.deleteCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getSelectedRow()));
                            }
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, rowsAffected + " " + command + " deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        case "applyFilter":
                            if (command.equals("Bookings")) { //from both
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterBookings(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue()));
                            } else if (command.equals("Employees")) { //from manager
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterEmployees(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), currEmployee.getEmp_hotel_id()));
                            } else if (command.equals("Housekeeping")) { //from manager
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterCleaningSchedule(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), currEmployee.getEmp_hotel_id()));
                            } else if (command.equals("Rooms")) { //from manager
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterRooms(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), currEmployee.getEmp_hotel_id()));
                            } else if (command.equals("Users")) { //from manager
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterCustomers(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), currEmployee.getEmp_hotel_id()));
                            } else if (command.equals("houseKeeping")) { //from receptionist
                                activePanel.getCenterPanel().setTableRows(hotelDao.filterCleaningScheduleRcp(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                        activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), currEmployee.getEmp_hotel_id()));
                            }
                            break;
                        case "ok":
                            if (command.equals("Employees")) {
                                System.out.println("ok button pressed in EmpInfos panel");
                            }
                            break;
                        case "show revenue":
                            if (command.equals("Finance")) {
                                System.out.println("show revenue button pressed in finance panel");
                                FinancePanel pnl = (FinancePanel)activePanel.getCenterPanel();
                                double revenue = hotelDao.calculateRevenue(pnl.getStartDate(), pnl.getEndDate(), currHotelID);
                                pnl.setRevenue(String.valueOf(revenue));
                            }
                            break;
                        case "view rooms":
                            if (command.equals("Rooms")) {
                                System.out.println("view available rooms button pressed in rooms panel");
                                RoomsPanel pnl = (RoomsPanel)activePanel.getCenterPanel();
                                pnl.setTableRows(hotelDao.viewAvailableRooms(pnl.getTfStartDate(), pnl.getTfEndDate(), currHotelID));
                            }
                            break;
                        case "confirm":
                            if (command.equals("My Jobs")) {
                                boolean b = hotelDao.updateCleaningSchedule(activePanel.getCenterPanel().getSelectedRow(), currEmployee.getEmp_ssn());
                            } else if (command.equals("Profile")) {
                                ProfilePanel profile = (ProfilePanel) activePanel.getPanelByName("Profile");
                                hotelDao.insertCustomer(profile.getCustomer());
                                System.out.println("done");
                                profile.pushConfirmButton();
                            }
                            break;
                        case "execute":
                            if (command.equals("Query")) {
                                QueryPanel pnl = (QueryPanel) activePanel.getPanelByName("Query");
                                String query = pnl.getTaQuery();
                                System.out.println(query);

                                ArrayList<Object> columnValues = new ArrayList<>();

                                ResultSet resultSet = hotelDao.getResultSet(query);
                                ResultSetMetaData metaData = resultSet.getMetaData();

                                int columnCount = metaData.getColumnCount();
                                for (int i = 1; i <= columnCount; i++) {
                                    columnValues.add(i - 1, metaData.getColumnName(i));
                                    System.out.println(columnValues.get(i - 1));
                                }
                                pnl.setTableColumns(columnValues);
                                pnl.setTableRows(hotelDao.getRowsAsObject(resultSet, columnValues));
                            }
                            break;
                        case "edit":
                            if (command.equals("Profile")) {
                                System.out.println("edit button pressed in profile panel");
                                ProfilePanel profile = (ProfilePanel) activePanel.getPanelByName("Profile");
                                profile.pushEditButton();
                            }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(hotelView, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JTextField tf = (JTextField) e.getSource();
            if (tf.isEnabled() && !tf.isEditable()) tf.setText(datePicker.getPickedDate());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}

