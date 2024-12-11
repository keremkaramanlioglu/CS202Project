import panels.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HotelView extends JFrame {
    private static MainPanel mainPanel;
    private static AdminPanel adminPanel;
    private static GuestPanel guestPanel;
    private static HousekeeperPanel housekeeperPanel;
    private static ReceptionistPanel receptionistPanel;
    private String currPanel;
    public static Color sidePanelColor = new Color(0x333333);
    public static Color centerPanelColor = new Color(0x666666);

    public HotelView() {
        mainPanel = new MainPanel();
        adminPanel = new AdminPanel();
        guestPanel = new GuestPanel();
        receptionistPanel = new ReceptionistPanel();
        housekeeperPanel = new HousekeeperPanel();
        currPanel = "Main Panel";


        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 600));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.revalidate();
    }

    public String getCurrPanel() {
        return currPanel;
    }

    public void setCurrPanel(String currPanel) {
        this.currPanel = currPanel;
    }

    public MainPanel getMainPanel() {
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
