import entities.Booking;
import entities.CleaningSchedule;
import entities.Employee;

import panels.Panel;
import panels.customerPanels.ProfilePanel;
import panels.managerPanels.*;
import panels.receptionistPanels.HouseKeepingPanel;

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
        hotelView.setVisible(true);
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

            //connectionControl();

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
                //if (!command.equals("Customer")) if (!checkAction(command)) return;
                hotelView.getActivePanel().reset();
                hotelView.setActivePanel(hotelView.getPanelByName(command));
            } else {
                switch (name) {
                    case "add":
                        if (command.equals("Bookings")){
                            System.out.println("add button pressed in booking panel");
                        } else if (command.equals("Employees")) {
                            System.out.println("add button pressed in employees panel by manager");
                        } else if (command.equals("Housekeeping")) {
                            System.out.println("add button pressed in housekeeping panel by manager");
                        } else if (command.equals("Rooms")) {
                            System.out.println("add button pressed in rooms panel by manager");
                        } else if (command.equals("Users")) {
                            System.out.println("add button pressed in users panel by manager");
                        } else if (command.equals("Add Customer")) {
                            System.out.println("add button pressed in add customer panel by receptionist");
                        } else if (command.equals("houseKeeping")) {
                            System.out.println("add button pressed in housekeeping panel by receptionist");
                        }
                        break;
                    case "update":
                        if (command.equals("Bookings")) {
                            System.out.println("update button pressed in booking panel");
                        } else if (command.equals("Employees")) {
                            System.out.println("update button pressed in employees panel by manager");
                        } else if (command.equals("Housekeeping")) {
                            System.out.println("update button pressed in housekeeping panel by manager");
                        } else if (command.equals("Rooms")) {
                            System.out.println("update button pressed in rooms panel by manager");
                        } else if (command.equals("Users")) {
                            System.out.println("update button pressed in users panel by manager");
                        } else if (command.equals("houseKeeping")) {
                            System.out.println("update button pressed in housekeeping panel by receptionist");
                        }
                        break;
                    case "delete":
                        if (command.equals("Bookings")) {
                            System.out.println("delete button pressed in booking panel");
                        } else if (command.equals("Employees")) {
                            System.out.println("delete button pressed in employees panel by manager");
                        } else if (command.equals("Housekeeping")) {
                            System.out.println("delete button pressed in housekeeping panel by manager");
                        } else if (command.equals("Rooms")) {
                            System.out.println("delete button pressed in rooms panel by manager");
                        } else if (command.equals("Users")) {
                            System.out.println("delete button pressed in users panel by manager");
                        } else if (command.equals("houseKeeping")) {
                            System.out.println("delete button pressed in housekeeping panel by receptionist");
                        }
                        break;
                    case "applyFilter":
                        if (command.equals("Bookings")){ //from both
                            System.out.println("filter button pressed in booking panel");
                        } else if (command.equals("Employees")) { //from manager
                            System.out.println("filter button pressed in employees panel by manager");
                        } else if (command.equals("Housekeeping")) { //from manager
                            System.out.println("filter button pressed in housekeeping panel by manager");
                        } else if (command.equals("Rooms")) { //from manager
                            System.out.println("filter button pressed in rooms panel by manager");
                        } else if (command.equals("Users")) { //from manager
                            System.out.println("filter button pressed in users panel by manager");
                        } else if (command.equals("houseKeeping")) { //from receptionist
                            System.out.println("filter button pressed in housekeeping panel by receptionist");
                        }
                        break;
                    case "ok":
                        if (command.equals("Employees")) {
                            System.out.println("ok button pressed in EmpInfos panel");
                        }
                        break;
                    case "show revenue":
                        if (command.equals("Finance")){
                            System.out.println("show revenue button pressed in finance panel");
                        }
                        break;
                    case "view rooms":
                        System.out.println(command);
                        if (command.equals("Rooms")){
                            System.out.println("view available rooms button pressed in rooms panel");
                        }
                        break;
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

