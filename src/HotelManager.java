import entities.Hotel;

import panels.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelManager {
    private Hotel hotel;
    private HotelView hotelView;

    public HotelManager(Hotel hotel, HotelView hotelView) {
        this.hotel = hotel;
        this.hotelView = hotelView;
        hotelView.addButtonListener(new ButtonListener());
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            JButton button = (JButton) e.getSource();  // maybe define a compare function to check if a button is side panel button to apply selection operations
            String[] sidePanelOptions = {"Rooms", "Users", "Employees", "Finance", "Bookings", "Housekeeping",
                    "Book a room", "My Bookings", "Profile"};
            if (compare(command, sidePanelOptions)) ((Panel)hotelView.getContentPane()).setSelectedButton(button);
            switch (command) {   // each button needs to have a unique name so that we will know where we are
                case "Admin":
                    hotelView.setCurrPanel(command);
                    changeContentPane(hotelView.getAdminPanel());
                    break;
                case "Guest":
                    hotelView.setCurrPanel(command);
                    changeContentPane(hotelView.getGuestPanel());
                    break;
                case "Housekeeper":
                    hotelView.setCurrPanel(command);
                    changeContentPane(hotelView.getHousekeeperPanel());
                    break;
                case "Receptionist":
                    hotelView.setCurrPanel(command);
                    changeContentPane(hotelView.getReceptionistPanel());
                    break;
                case "Back":
                    ((Panel)hotelView.getContentPane()).resetPanel();
                    changeContentPane(hotelView.getMainPanel());
                    break;
                case "Rooms":
                    if (hotelView.getCurrPanel().equals("Admin")) {
                         Panel adminPanel = hotelView.getAdminPanel();
                         adminPanel.setCenterPanel(adminPanel.getPanelByName(command));
                    } else if (hotelView.getCurrPanel().equals("Receptionist")) {

                    }
                    break;
            }
        }

        private boolean compare(String s1, String[] strings) {
            for (String str : strings) {
                if (s1.equals(str)) return true;
            }
            return false;
        }

        private void changeContentPane(Container component) {
            hotelView.setContentPane(component);
            hotelView.revalidate();
        }
    }
}

