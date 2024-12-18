import panels.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HotelView extends JFrame {
    private static Panel mainPanel;
    private static Panel managerPanel;
    private static Panel customerPanel;
    private static Panel housekeeperPanel;
    private static Panel receptionistPanel;
    private static Panel dbManagerPanel;
    private Panel activePanel;
    public static Color sidePanelColor = new Color(0x333333);
    public static Color centerPanelColor = new Color(0x666666);

    public HotelView() {
        mainPanel = new MainPanel();
        managerPanel = new ManagerPanel();
        customerPanel = new CustomerPanel();
        receptionistPanel = new ReceptionistPanel();
        housekeeperPanel = new HousekeeperPanel();
        dbManagerPanel = new DBManagerPanel();
        activePanel = null;
        setActivePanel(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.pack();
        //this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public Panel getPanelByName(String name) {
        return switch (name) {
            case "Manager" -> managerPanel;
            case "Customer" -> customerPanel;
            case "Receptionist" -> receptionistPanel;
            case "Housekeeper" -> housekeeperPanel;
            case "Database Manager" -> dbManagerPanel;
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
        this.repaint();
    }

    public void addButtonListener(ActionListener listener) {
        mainPanel.addButtonListener(listener);
        managerPanel.addButtonListener(listener);
        customerPanel.addButtonListener(listener);
        housekeeperPanel.addButtonListener(listener);
        receptionistPanel.addButtonListener(listener);
        dbManagerPanel.addButtonListener(listener);
    }

    public void addMouseListener(MouseListener listener) {
        managerPanel.addMouseListener(listener);
        customerPanel.addMouseListener(listener);
        receptionistPanel.addMouseListener(listener);
    }
}
