import entities.*;

import panels.CustomerPanel;
import panels.Panel;
import panels.customerPanels.BookARoomPanel;
import panels.customerPanels.MyBookingsPanel;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static java.sql.Types.NULL;

public class HotelManager {
    private final HotelView hotelView;
    private final DatePicker datePicker;
    private final DBConnectionControl dbConnectionControl;
    private HotelDao hotelDao;
    private final SSNPopUpMenu ssnPopUpMenu;
    private String currSsn;
    private Employee currEmployee;
    private Customer currCustomer;

    public HotelManager(HotelView hotelView, DBConnectionControl dbConnectionControl) throws SQLException {
        this.hotelView = hotelView;
        //hotelView.setVisible(true);
        this.currSsn = "";
        ButtonListener buttonListener = new ButtonListener();
        hotelView.addButtonListener(buttonListener);
        hotelView.addMouseListener(buttonListener);
        datePicker = new DatePicker(hotelView);
        ssnPopUpMenu = new SSNPopUpMenu(hotelView, new ButtonListener());
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

//    private void setCurrSsn() throws SQLException {
//        currSsn = ssnPopUpMenu.getSsn();
//        if (currSsn.isEmpty()) {
//            JOptionPane.showMessageDialog(hotelView,"You can not continue without verifying your ssn!", "Empty Ssn!", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        if (hotelDao.getEmpType(currSsn) == null) {
//            System.out.println("entered");
//            setCurrCustomer();
//            System.out.println(currCustomer.getC_type());
//        } else {
//            setCurrEmployee();
//            System.out.println(currEmployee.getEmp_type());
//        }
//    }

    private boolean checkEmployeeAction(String action) {
//        if ("Back".equals(action)) {
//            return true;
//        }
//        if (currCustomer != null){
//            return switch (String.valueOf(currCustomer.getC_type())) {
//                case "Customer" -> compare(action, new String[]{"Customer"});
//                default -> false;
//            };
//        } else {
//            return switch (String.valueOf(currEmployee.getEmp_type())) {
//                case "Manager" -> compare(action, new String[]{"Manager", "Customer", "Housekeeper", "Receptionist"});
//                case "Database Manager" -> true;
//                case "Receptionist" -> compare(action, new String[]{"Customer", "Receptionist"});
//                case "Housekeeper" -> compare(action, new String[]{"Customer", "Housekeeper"});
//                default -> false;
//            };
//        }
        if (currSsn.isEmpty()) {
            ssnPopUpMenu.setVisible(true);
        }
        try {
            ArrayList<Employee> c = hotelDao.getEmployees("ssn", "=", currSsn);
            currEmployee = (c.isEmpty() ? null : c.getFirst());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(hotelView,"Something went wrong!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (currEmployee == null) {
            JOptionPane.showMessageDialog(hotelView, "Please enter a valid SSN!", "Employee Not Found!", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!isValidEmpAction(action, String.valueOf(currEmployee.getEmp_type()))) {
            JOptionPane.showMessageDialog(hotelView, String.valueOf(currEmployee.getEmp_type()) + "(s) can not enter the " + action + " Panel!", "Invalid Action!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean checkCustomerAction(String action) throws SQLException {
        System.out.println("Entered");
        if (currSsn.isEmpty()) {
            ssnPopUpMenu.setVisible(true);
        }
        ArrayList<Customer> c = hotelDao.getCustomers("ssn", "=", currSsn);

        currCustomer = (c.isEmpty() ? null : c.getFirst());

        if (currCustomer == null) {
            System.out.println("entered");
            hotelView.setActivePanel(hotelView.getPanelByName("Customer"));
            hotelView.getActivePanel().setCenterPanel(hotelView.getActivePanel().getPanelByName("Profile"));
            ((ProfilePanel)hotelView.getActivePanel().getCenterPanel()).setTfSsn(currSsn);
            return false;
        } else if (!isValidCustomerAction(action)) {
            JOptionPane.showMessageDialog(hotelView, "Customers can only see Customer Menu!", "Invalid Action!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

//    public boolean customerSidePanelCheck() {
//        if (currCustomer == null) return false;
//        return true;
//    }

    public boolean isValidEmpAction(String action, String empType) {
        return switch (empType) {
            case "Manager" -> compare(action, new String[]{"Manager", "Housekeeper", "Receptionist"});
            case "Database Manager" -> compare(action, new String[]{"Database Manager","Manager", "Housekeeper", "Receptionist"});
            case "Receptionist" -> compare(action, new String[]{"Receptionist"});
            case "Housekeeper" -> compare(action, new String[]{"Housekeeper"});
            default -> false;
        };
    }

//    public boolean checkAction(String action) {
//        if ((currEmployee == null && currCustomer == null) && !action.equals("Back")) {
//            try {
//                setCurrSsn();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//            if (currEmployee ==  null && currCustomer == null) {
//                return false;
//            }
//        }
//        if (!isValidAction(action)) {
//            JOptionPane.showMessageDialog(hotelView,"Invalid action!", "Authority Error", JOptionPane.ERROR_MESSAGE);
//            try {
//                setCurrSsn();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//            if(!isValidAction(action)) {
//                return false;
//            }
//            if (currEmployee ==  null && currCustomer == null) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean isValidCustomerAction(String action) {
        if (currCustomer == null) return false;

        if(!action.equals("Customer")) return false;

        return true;
    }

//    private void setCurrEmployee() throws SQLException {
//        if (hotelDao.getEmployees("ssn", "=", currSsn).isEmpty()) {
//            JOptionPane.showMessageDialog(hotelView, "No such Employee! Please enter a valid ssn!", "Invalid SSN!", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        currEmployee = hotelDao.getEmployees("ssn", "=", currSsn).getFirst();
//        currCustomer = null;
//    }

//    private void setCurrCustomer() throws SQLException {
//        if (hotelDao.getCustomers("ssn", "=", currSsn).isEmpty()) {
//            JOptionPane.showMessageDialog(hotelView, "No such Employee! Please enter a valid ssn!", "Invalid SSN!", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        currCustomer = hotelDao.getCustomers("ssn", "=", currSsn).getFirst();
//        currEmployee = null;
//    }

    public boolean compare(String s1, String[] strings) {
        for (String str : strings) {
            if (s1.equals(str)) return true;
        }
        return false;
    }


    private class ButtonListener implements ActionListener, MouseListener {
        public void actionPerformed(ActionEvent e) {

            try {
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
                    if (activePanel instanceof CustomerPanel && currCustomer == null) {
                        JOptionPane.showMessageDialog(hotelView, "Enter your credentials first!", "Invalid Action!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    activePanel.setSelectedButton(button);
                    if (activePanel.getCenterPanel() != null) activePanel.getCenterPanel().reset();
                    activePanel.setCenterPanel(activePanel.getPanelByName(command));
                    if (activePanel.getCenterPanel().table != null && !activePanel.getCenterPanel().getPanelName().equals("Book a Room")) {
                        System.out.println(command);
                        activePanel.getCenterPanel().setTableRows(hotelDao.initializeTable(command, activePanel.getCenterPanel().getPanelName(), (currEmployee != null ? currEmployee.getEmp_hotel_id() : NULL), currSsn));
                    }
                    if (command.equals("Profile")) {
                        if(currCustomer != null) {
                            ((ProfilePanel)activePanel.getCenterPanel()).setFieldsWithCus(currCustomer);
                        } else {
                            ((ProfilePanel)activePanel.getCenterPanel()).setTfSsn(currSsn);
                        }
                    }
                } else if (compare(command, mainPanelOptions)) {
                    if( !command.equals("Back") && !command.equals("Customer")) {
                        if (!checkEmployeeAction(command)) {
                            return;
                        }
                    } else if (command.equals("Customer")) {
                        if (!checkCustomerAction(command)) return;
                    }
                    hotelView.getActivePanel().reset();
                    hotelView.setActivePanel(hotelView.getPanelByName(command));
                } else {
                    Object currHotelID = (currEmployee != null ? currEmployee.getEmp_hotel_id() : null);
                    Panel activePanel = hotelView.getActivePanel();
                    int rowsAffected = 0;
                    try {
                        switch (name) {
                            case "add":
                                if (command.equals("Bookings")) {
                                    System.out.println("add button pressed in booking panel");
                                    rowsAffected = hotelDao.insertBooking(new Booking(activePanel.getCenterPanel().getEntity()));
//                                if (affectedRows > 0) {
//                                    JOptionPane.showMessageDialog(hotelView, affectedRows + " " + command + " added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
//                                }
                                } else if (command.equals("Employees")) {
                                    EmployeesPanel pnl = ((EmployeesPanel)activePanel.getCenterPanel());
                                    pnl.initEmpInfos();
                                    pnl.setAction(name);
                                    // TODO ADD ROOM NUM CONSTRAINTS
                                } else if (command.equals("Housekeeping")) {
                                    rowsAffected = hotelDao.insertCleaningSchedule(new CleaningSchedule(activePanel.getCenterPanel().getEntity()));
                                } else if (command.equals("Rooms")) {
                                    rowsAffected = hotelDao.insertRoom(new Room(activePanel.getCenterPanel().getEntity()));
//                                if (affectedRows > 0) {
//                                    JOptionPane.showMessageDialog(hotelView, affectedRows + " " + command + " added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
//                                }
                                } else if (command.equals("Users")) {
                                    rowsAffected = hotelDao.insertCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                                } else if (command.equals("Add Customer")) {
                                    rowsAffected = hotelDao.insertCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                                } else if (command.equals("houseKeeping")) {
                                    HouseKeepingPanel hk = (HouseKeepingPanel) activePanel.getCenterPanel();
                                    CleaningSchedule cs = new CleaningSchedule(activePanel.getCenterPanel().getEntity());
                                    cs.setReceptionist_ssn(currSsn);
                                    rowsAffected = hotelDao.insertCleaningScheduleWithRoomNum(cs, hk.getRoomNum(), currHotelID);
                                }
                                break;
                            case "update":
                                if (command.equals("Bookings")) {
                                    Booking book = new Booking(activePanel.getCenterPanel().getEntity());
                                    book.setBooking_id(Integer.parseInt(String.valueOf(activePanel.getCenterPanel().getSelectedRow()[0])));
                                    rowsAffected = hotelDao.updateBooking(book);
//                                if( affectedRows > 0) {
//                                    JOptionPane.showMessageDialog(null, command + " updated successfully!" + " Affected rows: " + affectedRows);
//                                }
                                } else if (command.equals("Employees")) {
                                    EmployeesPanel pnl = ((EmployeesPanel)activePanel.getCenterPanel());
                                    Object[] emp = activePanel.getCenterPanel().getSelectedRow();
                                    if (emp != null) {
                                        pnl.initEmpInfos();
                                        pnl.setAction(name);
                                        pnl.setFields(emp);
                                    }
                                } else if (command.equals("Housekeeping")) {
                                    CleaningSchedule cs = new CleaningSchedule(activePanel.getCenterPanel().getEntity());
                                    cs.setSchedule_id(activePanel.getCenterPanel().getSelectedRow()[0]);
                                    rowsAffected = hotelDao.updateCleaningSchedule(cs);
                                } else if (command.equals("Rooms")) {
                                    Room room = new Room(activePanel.getCenterPanel().getEntity());
                                    room.setRoom_id(Integer.parseInt(String.valueOf(activePanel.getCenterPanel().getSelectedRow()[0])));
                                    rowsAffected = hotelDao.updateRoom(room);
//                                if( affectedRows > 0) {
//                                    JOptionPane.showMessageDialog(null, "Room updated successfully!" + " Affected rows: " + affectedRows);
//                                }
                                } else if (command.equals("Users")) {
                                    rowsAffected = hotelDao.updateCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                                } else if (command.equals("houseKeeping")) {
                                    HouseKeepingPanel hk = (HouseKeepingPanel) activePanel.getCenterPanel();
                                    Object[] arr = hk.getSelectedRow();
                                    arr[2] = currSsn;
                                    arr[3] = null;
                                    CleaningSchedule cs = new CleaningSchedule(arr);
                                    rowsAffected = hotelDao.updateCleaningScheduleWithRoomNum(cs, hk.getRoomNum(), currHotelID);
                                }
                                break;
                            case "delete":
                                if (command.equals("Bookings")) {
                                    rowsAffected = hotelDao.deleteBooking(new Booking(activePanel.getCenterPanel().getSelectedRow()));
                                } else if (command.equals("Employees")) {
                                    rowsAffected = hotelDao.deleteEmployee(new Employee(activePanel.getCenterPanel().getSelectedRow()));
                                } else if (command.equals("Housekeeping")) {
                                    CleaningSchedule cs = new CleaningSchedule(activePanel.getCenterPanel().getEntity());
                                    cs.setSchedule_id(activePanel.getCenterPanel().getSelectedRow()[0]);
                                    rowsAffected = hotelDao.deleteCleaningSchedule(cs);
                                } else if (command.equals("Rooms")) {
                                    rowsAffected = hotelDao.deleteRoom(new Room(activePanel.getCenterPanel().getSelectedRow()));
                                } else if (command.equals("Users")) {
                                    rowsAffected = hotelDao.deleteCustomer(new Customer(activePanel.getCenterPanel().getSelectedRow()));
                                } else if (command.equals("houseKeeping")) {
                                    CleaningSchedule cs = new CleaningSchedule(activePanel.getCenterPanel().getEntity());
                                    cs.setSchedule_id(activePanel.getCenterPanel().getSelectedRow()[0]);
                                    rowsAffected = hotelDao.deleteCleaningSchedule(cs);
                                }
                                break;
                            case "applyFilter":
                                if (command.equals("Bookings")) { //from both
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterBookings(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                } else if (command.equals("Employees")) { //from manager
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterEmployees(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                } else if (command.equals("Housekeeping")) { //from manager
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterCleaningSchedule(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                } else if (command.equals("Rooms")) { //from manager
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterRooms(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                } else if (command.equals("Users")) { //from manager
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterCustomers(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                } else if (command.equals("houseKeeping")) { //from receptionist
                                    activePanel.getCenterPanel().setTableRows(hotelDao.filterCleaningScheduleRcp(activePanel.getCenterPanel().getSelectedFilterColumn(),
                                            activePanel.getCenterPanel().getSelectedFilterOption(), activePanel.getCenterPanel().getSelectedFilterValue(), activePanel.getCenterPanel().getSelectedFilterUpperValue(), Integer.parseInt(String.valueOf(currHotelID))));
                                }
                                break;
                            case "ok":
                                if (command.equals("Employees")) {
                                    Employee emp = new Employee(activePanel.getCenterPanel().getEntity());
                                    if (!(String.valueOf(currEmployee.getEmp_type())).equalsIgnoreCase("Database Manager") && (String.valueOf(emp.getEmp_type()).equalsIgnoreCase("Manager")) || String.valueOf(emp.getEmp_type()).equalsIgnoreCase("Database Manager")) {
                                        JOptionPane.showMessageDialog(hotelView, "Only Database Managers can add " + String.valueOf(emp.getEmp_type()) + "!", "Error", JOptionPane.ERROR_MESSAGE);
                                        return;
                                    }
                                    EmployeesPanel pnlEmp = ((EmployeesPanel) activePanel.getCenterPanel());
                                    if (pnlEmp.getAction().equals("update")) {
                                        rowsAffected = hotelDao.updateEmployee(new Employee(pnlEmp.getEntity()));
                                    } else if (pnlEmp.getAction().equals("add")) {
                                        rowsAffected = hotelDao.insertEmployee(new Employee(pnlEmp.getEntity()));

                                    pnlEmp.reset();
                                    pnlEmp.closeEmpInfos();
                                    }
                                }
                            break;
                        case "cancel":
                            System.out.println("entered");
                            if(command.equals("Employees")) {
                                EmployeesPanel pnlEmp = ((EmployeesPanel) activePanel.getCenterPanel());
                                pnlEmp.closeEmpInfos();
                                pnlEmp.reset();
                            }
                            break;
                        case "show revenue":
                            if (command.equals("Finance")) {
                                System.out.println("show revenue button pressed in finance panel");
                                FinancePanel pnl = (FinancePanel)activePanel.getCenterPanel();
                                double revenue = hotelDao.calculateRevenue(pnl.getStartDate(), pnl.getEndDate(), Integer.parseInt(String.valueOf(currHotelID)));
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
                        case "make booking":
                            if (command.equals("Rooms")) {
                                //System.out.println("make booking button pressed in rooms panel");
                                int roomID = hotelDao.getRoomID(activePanel.getCenterPanel().getSelectedRow()[0], currHotelID);
                                activePanel.setCenterPanel(activePanel.getPanelByName("Bookings"));
                                ((BookingsPanel)activePanel.getCenterPanel()).setTfRoomID(roomID);
                            }
                        case "confirm":
                            if (command.equals("My Jobs")) {
                                Object[] cs = activePanel.getCenterPanel().getSelectedRow();
                                cs[2] = activePanel.getCenterPanel().getEntity()[0];
                                rowsAffected = hotelDao.updateCleaningScheduleWithServiceStatus(cs, currSsn, currHotelID);

                            } else if (command.equals("Profile")) {
                                ProfilePanel profile = (ProfilePanel) activePanel.getPanelByName("Profile");
                                if (!hotelDao.isCustomerExist(currSsn)){
                                    rowsAffected = hotelDao.insertCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                                }else {
//                                    System.out.println("customer already exist");
                                    rowsAffected = hotelDao.updateCustomer(new Customer(activePanel.getCenterPanel().getEntity()));
                                }
                                if (rowsAffected > 0) currCustomer = hotelDao.getCustomers("ssn", "=", currSsn).getFirst();
                                profile.pushConfirmButton();
                            }
                            break;
                        case "execute":
                            if (command.equals("Query")) {
//                                QueryPanel pnl = (QueryPanel) activePanel.getPanelByName("Query");
//                                String query = pnl.getTaQuery();
//                                System.out.println(query);
//
//                                ArrayList<Object> columnValues = new ArrayList<>();
//
//                                try {
//                                    ResultSet resultSet = hotelDao.getResultSet(query);
//                                    ResultSetMetaData metaData = resultSet.getMetaData();
//
//                                    int columnCount = metaData.getColumnCount();
//                                    for (int i = 1; i <= columnCount; i++) {
//                                        columnValues.add(i - 1, metaData.getColumnName(i));
//                                        System.out.println(columnValues.get(i - 1));
//
//                                    }
//                                } catch (Exception exception) {
//
//                                }

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
                            break;
                        case "show rooms":
                            if (command.equals("Book a room")) {
                                BookARoomPanel panel = (BookARoomPanel) activePanel.getPanelByName("Book a room");
                                activePanel.getCenterPanel().setTableRows(hotelDao.viewAvailableRooms(panel.getStartDate(), panel.getEndDate()));
                            }
                            break;
                        case "show":
                            if (command.equals("My Jobs")) {
                                System.out.println("show cleaning duties button pressed in My Jobs panel by Housekeeper");
                            } else if (command.equals("My Bookings")) {
                                System.out.println("show bookings button pressed in My Bookings panel by Customer");
                                MyBookingsPanel panel = (MyBookingsPanel) activePanel.getPanelByName("My Bookings");
                                activePanel.getCenterPanel().setTableRows(hotelDao.viewMyBookings(currSsn));
                            }
                            break;
                        case "book":
                            if (command.equals("Book a room")) {
                                BookARoomPanel pnl = (BookARoomPanel) activePanel.getCenterPanel();
                                Object[] selectedRow = pnl.getSelectedRow();
                                currCustomer.setC_room_id(hotelDao.getRoomID(selectedRow[7], hotelDao.getHotelID(selectedRow[1])));
                                hotelDao.updateCustomer(currCustomer);
                                Object[] booking = pnl.getEntity();
                                booking[0] = currCustomer.getC_ssn();
                                booking[1] = currCustomer.getC_room_id();
                                Booking b = new Booking(booking);
                                rowsAffected = hotelDao.insertBooking(b);
                            }
                            break;
                        case "ssnpopup":
                            if (command.equals("Cancel")) {
                                ssnPopUpMenu.setVisible(false);
                                return;
                            } else if (command.equals("OK")) {
                                currSsn = ssnPopUpMenu.getSsn();
                                ssnPopUpMenu.setVisible(false);
                            }
                            break;
                        case "Cancel Booking":
                            Object[] b = activePanel.getCenterPanel().getSelectedRow();
                            rowsAffected = hotelDao.deleteBookingWithRoomNum(b[1], b[4]);
                            break;
                        case "Bookings":

                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(hotelView, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (rowsAffected > 0) {
                        if (activePanel.getCenterPanel().table != null && !activePanel.getCenterPanel().getPanelName().equals("Book a Room")) {}
                            activePanel.getCenterPanel().setTableRows(hotelDao.initializeTable(command, activePanel.getCenterPanel().getPanelName(), (currEmployee != null ? currEmployee.getEmp_hotel_id() : NULL), currSsn));
                        JOptionPane.showMessageDialog(hotelView, rowsAffected + " " + command + " " + name +"'d successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                JOptionPane.showMessageDialog(hotelView, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

