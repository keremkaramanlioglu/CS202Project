import entities.Hotel;

import panels.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelManager {
    private Hotel hotel;
    private final HotelView hotelView;


    public HotelManager(HotelView hotelView) {
        this.hotelView = hotelView;
        hotelView.addButtonListener(new ButtonListener());
    }


    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            JButton button = (JButton) e.getSource();
            String[] sidePanelOptions = {"Rooms", "Users", "Employees", "Finance", "Bookings", "Housekeeping",
                    "Book a room", "My Bookings", "Profile", "My Jobs"};
            String [] mainPanelOptions = {"Admin", "Guest", "Housekeeper", "Receptionist", "Back"};
            if (compare(command, sidePanelOptions)) {
                hotelView.getActivePanel().setSelectedButton(button);
                hotelView.getActivePanel().setCenterPanel(hotelView.getActivePanel().getPanelByName(command));
            } else if (compare(command, mainPanelOptions)) {
                hotelView.setActivePanel(hotelView.getPanelByName(command));
            }
        }

        private boolean compare(String s1, String[] strings) {
            for (String str : strings) {
                if (s1.equals(str)) return true;
            }
            return false;
        }
    }
}

