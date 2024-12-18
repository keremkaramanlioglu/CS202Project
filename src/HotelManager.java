import entities.Hotel;

import panels.Panel;
import panels.adminPanels.BookingsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Arrays;

public class HotelManager {
    private Hotel hotel;
    private final HotelView hotelView;
    private final DatePicker datePicker;
    private final DBConnectionControl dbConnectionControl;
    private final HotelDao hotelDao;

    public HotelManager(HotelView hotelView, DBConnectionControl dbConnectionControl) throws SQLException {
        this.hotelView = hotelView;
        ButtonListener buttonListener = new ButtonListener();
        hotelView.addButtonListener(buttonListener);
        hotelView.addMouseListener(buttonListener);
        datePicker = new DatePicker(hotelView);
        this.dbConnectionControl = dbConnectionControl;
        this.hotelDao = new HotelDao(dbConnectionControl.getConnection());
    }


    private class ButtonListener implements ActionListener, MouseListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (!dbConnectionControl.isConnected()) {
                    JOptionPane.showMessageDialog(hotelView, "Please connect to database", "Error", JOptionPane.QUESTION_MESSAGE);
                    dbConnectionControl.reinitiate();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            String command = e.getActionCommand();
            JButton button = (JButton) e.getSource();
            String[] sidePanelOptions = {"Rooms", "Users", "Employees", "Finance", "Bookings", "Housekeeping",
                    "Book a room", "My Bookings", "Profile", "My Jobs"};
            String [] mainPanelOptions = {"Admin", "Guest", "Housekeeper", "Receptionist", "Back"};
            if (compare(command, sidePanelOptions)) {
                Panel activePanel = hotelView.getActivePanel();
                activePanel.setSelectedButton(button);
                activePanel.setCenterPanel(activePanel.getPanelByName(command));
            } else if (compare(command, mainPanelOptions)) {
                hotelView.setActivePanel(hotelView.getPanelByName(command));
            } else {
                switch (command) {
                    case "Add":

                        break;
                    case "Update":
                        break;
                    case "Delete":
                        break;
                    case "getRow":
                        System.out.println(Arrays.toString(hotelView.getActivePanel().getCenterPanel().getSelectedRow()));
                        break;
                }
            }
        }

        private boolean compare(String s1, String[] strings) {
            for (String str : strings) {
                if (s1.equals(str)) return true;
            }
            return false;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JTextField tf = (JTextField) e.getSource();
            switch (tf.getName()) {
                case "dateChooser":
                    if (tf.isEnabled()) tf.setText(datePicker.setPickedDate());
                    break;
            }
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

