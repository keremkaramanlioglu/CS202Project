import panels.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HotelView extends JFrame {
    private static Panel mainPanel;
    private static Panel adminPanel;
    private static Panel guestPanel;
    private static Panel housekeeperPanel;
    private static Panel receptionistPanel;
    private Panel activePanel;
    public static Color sidePanelColor = new Color(0x333333);
    public static Color centerPanelColor = new Color(0x666666);

    public HotelView() {
        mainPanel = new MainPanel();
        adminPanel = new AdminPanel();
        guestPanel = new GuestPanel();
        receptionistPanel = new ReceptionistPanel();
        housekeeperPanel = new HousekeeperPanel();
        activePanel = null;
        setActivePanel(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(1000, 750));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Panel getPanelByName(String name) {
        return switch (name) {
            case "Admin" -> adminPanel;
            case "Guest" -> guestPanel;
            case "Receptionist" -> receptionistPanel;
            case "Housekeeper" -> housekeeperPanel;
            default -> mainPanel;
        };
    }

    public Panel getActivePanel() {
        return activePanel;
    }

    public void setActivePanel(Panel activePanel) {
        if (this.activePanel == activePanel) return;
        if (this.activePanel != null) {
            this.activePanel.reset();
            this.remove(this.activePanel);
        }
        this.activePanel = activePanel;
        this.setContentPane(activePanel);
        this.revalidate();
    }

    public Panel getMainPanel() {
        return mainPanel;
    }

    public Panel getAdminPanel() {
        return adminPanel;
    }

    public Panel getGuestPanel() {
        return guestPanel;
    }

    public Panel getHousekeeperPanel() {
        return housekeeperPanel;
    }

    public Panel getReceptionistPanel() {
        return receptionistPanel;
    }

    public void addButtonListener(ActionListener listener) {
        mainPanel.addButtonListener(listener);
        adminPanel.addButtonListener(listener);
        guestPanel.addButtonListener(listener);
        housekeeperPanel.addButtonListener(listener);
        receptionistPanel.addButtonListener(listener);
    }
}
