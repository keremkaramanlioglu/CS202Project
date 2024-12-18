import entities.Booking;
import entities.Employee;
import entities.Hotel;

import panels.Panel;
import panels.customerPanels.ProfilePanel;
import panels.managerPanels.BookingsPanel;
import panels.managerPanels.EmployeesPanel;
import panels.managerPanels.FinancePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
            case "Customer" -> action.equals("Customer");
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
            return false;
        } else if (!action.equals("Back") && !isValidAction(action)) {
            JOptionPane.showMessageDialog(hotelView,"Invalid action!", "Authority Error", JOptionPane.ERROR_MESSAGE);
            try {
                setCurrSsn();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return false;
        }
        return true;
    }

    private void setCurrEmployee() throws SQLException {
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
            //System.out.println(command);
            //System.out.println(button.getName());

            //if (currSsn.isEmpty() && !command.equals("Guest")) return;

            String[] sidePanelOptions = {"Rooms", "Users", "Employees", "Finance", "Bookings", "Housekeeping",
                    "Book a room", "My Bookings", "Profile", "My Jobs", "Query Panel"};
            String [] mainPanelOptions = {"Manager", "Customer", "Housekeeper", "Receptionist", "Database Manager","Back"};
            if (compare(command, sidePanelOptions) && button.getName().equals("side")) {
                Panel activePanel = hotelView.getActivePanel();
                activePanel.setSelectedButton(button);
                if (activePanel.getCenterPanel() != null) activePanel.getCenterPanel().reset();
                activePanel.setCenterPanel(activePanel.getPanelByName(command));
            } else if (compare(command, mainPanelOptions)) {
                //if (!command.equals("Customer")) if (!checkAction(command)) return;
                hotelView.getActivePanel().reset();
                hotelView.setActivePanel(hotelView.getPanelByName(command));
            } else {
                switch (command) {
                    case "Employees":
                        Employee empl;
                        if (button.getName().equals("applyFilter")) {
                            EmployeesPanel panel = (EmployeesPanel) hotelView.getActivePanel().getPanelByName(command);
                            System.out.println("entered");
                            try {
                                System.out.println(panel.getSelectedFilterOption().equals("None"));
                                System.out.println(panel.getSelectedFilterColumn() + " " + panel.getSelectedFilterColumn() + " " + panel.getSelectedFilterColumn());
                                ArrayList<Employee> emps = hotelDao.getEmployees(panel.getSelectedFilterColumn(), panel.getSelectedFilterOption(), panel.getSelectedFilterValue());
                                panel.setTableWithEmployees(emps);
                                for (Employee emp : emps) {
                                    System.out.println(emp);
                                }
                            } catch (SQLException ex) {
                                throw new RuntimeException(ex);
                            }
                        } else if (button.getName().equals("getRow")) {
                            Panel panel = hotelView.getActivePanel().getPanelByName(command);
                            empl = new Employee(panel.getSelectedRow());
                        }
                        break;
                    case "Bookings":
                        Booking booking;
                        if (button.getName().equals("apply")) {
                            BookingsPanel panel = (BookingsPanel) hotelView.getActivePanel().getPanelByName(command);
                            System.out.println("entered");
                            try {
                                System.out.println(panel.getSelectedFilterOption().equals("None"));
                                System.out.println(panel.getSelectedFilterColumn() + " " + panel.getSelectedFilterOption() + " " + panel.getSelectedFilterValue());
                                ArrayList<Booking> bookings = hotelDao.getBookings(panel.getSelectedFilterColumn(), panel.getSelectedFilterOption(), panel.getSelectedFilterValue());
                                panel.setTableWithBookings(bookings);
                                for (Booking book : bookings) {
                                    System.out.println(book);
                                }
                            }catch (SQLException ex){
                                throw new RuntimeException(ex);
                            }
                        }
                        break;
                    case "Delete":
                        break;
                    case "getRow":
                        System.out.println(Arrays.toString(hotelView.getActivePanel().getCenterPanel().getSelectedRow()));
                        break;
                    case "Show Revenue":
                        ((FinancePanel)hotelView.getActivePanel().getPanelByName("Finance")).setRevenue("111");
                        break;
                    case "New Booking":
                        hotelView.getActivePanel().setCenterPanel(hotelView.getActivePanel().getPanelByName("Book a room"));
                        break;
                    case "Profile_Edit":
                        ((ProfilePanel)hotelView.getActivePanel().getPanelByName("Profile")).pushEditButton();
                        break;
                    case "Profile_Confirm":
                        ((ProfilePanel)hotelView.getActivePanel().getPanelByName("Profile")).pushConfirmButton();
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JTextField tf = (JTextField) e.getSource();
            if (tf.isEnabled()) tf.setText(datePicker.getPickedDate());
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

