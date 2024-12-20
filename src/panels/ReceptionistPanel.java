package panels;

import panels.managerPanels.BookingsPanel;
import panels.managerPanels.HousekeepingPanel;
import panels.receptionistPanels.AddCustomerPanel;
import panels.receptionistPanels.HouseKeepingPanel;
import panels.receptionistPanels.RoomsPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceptionistPanel extends Panel {

    private final Panel pnlBookings;
    private final Panel pnlHousekeeping;
    private final Panel pnlRooms;
    private final Panel pnlAddCustomers;

    public ReceptionistPanel() {
        initComponents();
        pnlBookings = new BookingsPanel();
        pnlHousekeeping = new HouseKeepingPanel();
        pnlRooms = new RoomsPanel();
        pnlAddCustomers = new AddCustomerPanel();
        super.prevCenterPanel = null;
        super.prevSelectedButton = null;
    }

    public String getPanelName() {
        return "ReceptionistPanel";
    }

    @Override
    public void reset() {
        if(prevSelectedButton != null) prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        if(prevCenterPanel != null) prevCenterPanel.reset();
        prevSelectedButton = null;
        if (prevCenterPanel != null) this.remove(prevCenterPanel);
        prevCenterPanel = null;
    }

    @Override
    public void setFields(Object[] rowValues) {

    }

    @Override
    public Object[] getEntity() {
        return new Object[0];
    }

    @Override
    public Panel getPanelByName(String panelName) {
        // TODO implement this panels sub panels
        return switch (panelName) {
            case "Bookings" -> pnlBookings;
            case "Housekeeping" -> pnlHousekeeping;
            case "Rooms" -> pnlRooms;
            case "Add Customer" -> pnlAddCustomers;
            default -> null;
        };
    }

    @Override
    public void addButtonListener(ActionListener l) {
        btnBookings.addActionListener(l);
        btnHousekeeping.addActionListener(l);
        btnRooms.addActionListener(l);
        btnBack.addActionListener(l);
        btnAddCustomer.addActionListener(l);
        pnlBookings.addButtonListener(l);
        pnlHousekeeping.addButtonListener(l);
        pnlAddCustomers.addButtonListener(l);
        pnlRooms.addButtonListener(l);
    }

    @Override
    public boolean tfCheck() {
        return false;
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        pnlBookings.addMouseListener(ml);
        pnlHousekeeping.addMouseListener(ml);
        pnlAddCustomers.addMouseListener(ml);
        pnlRooms.addMouseListener(ml);
    }

    public JButton getBtnHousekeeping() {
        return btnHousekeeping;
    }

    public JButton getBtnRooms() {
        return btnRooms;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlSide = new JPanel();
        btnBookings = new JButton();
        btnHousekeeping = new JButton();
        btnRooms = new JButton();
        btnAddCustomer = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== pnlSide ========
        {
            pnlSide.setPreferredSize(new Dimension(120, 0));
            pnlSide.setBackground(new Color(0x333333));
            pnlSide.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnBookings ----
            btnBookings.setText("Bookings");
            btnBookings.setPreferredSize(new Dimension(120, 40));
            btnBookings.setBackground(new Color(0x333333));
            btnBookings.setForeground(Color.white);
            btnBookings.setBorder(null);
            btnBookings.setFocusable(false);
            btnBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBookings.setName("side");
            pnlSide.add(btnBookings);

            //---- btnHousekeeping ----
            btnHousekeeping.setText("Housekeeping");
            btnHousekeeping.setBackground(new Color(0x333333));
            btnHousekeeping.setForeground(Color.white);
            btnHousekeeping.setBorder(null);
            btnHousekeeping.setPreferredSize(new Dimension(120, 40));
            btnHousekeeping.setFocusable(false);
            btnHousekeeping.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnHousekeeping.setName("side");
            pnlSide.add(btnHousekeeping);

            //---- btnRooms ----
            btnRooms.setText("Rooms");
            btnRooms.setBackground(new Color(0x333333));
            btnRooms.setForeground(Color.white);
            btnRooms.setBorder(null);
            btnRooms.setPreferredSize(new Dimension(120, 40));
            btnRooms.setFocusable(false);
            btnRooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnRooms.setName("side");
            pnlSide.add(btnRooms);

            //---- btnAddCustomer ----
            btnAddCustomer.setText("Add Customer");
            btnAddCustomer.setPreferredSize(new Dimension(120, 40));
            btnAddCustomer.setBackground(new Color(0x333333));
            btnAddCustomer.setForeground(Color.white);
            btnAddCustomer.setBorder(null);
            btnAddCustomer.setFocusable(false);
            btnAddCustomer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnAddCustomer.setName("side");
            btnAddCustomer.setActionCommand("Add Customer");
            pnlSide.add(btnAddCustomer);

            //---- btnBack ----
            btnBack.setText("Back");
            btnBack.setBackground(new Color(0x333333));
            btnBack.setForeground(Color.white);
            btnBack.setBorder(null);
            btnBack.setPreferredSize(new Dimension(120, 40));
            btnBack.setFocusable(false);
            btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            pnlSide.add(btnBack);
        }
        add(pnlSide, BorderLayout.WEST);

        //======== pnlHeader ========
        {
            pnlHeader.setPreferredSize(new Dimension(0, 50));
            pnlHeader.setBackground(new Color(0x333333));
            pnlHeader.setForeground(Color.white);
            pnlHeader.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Receptionist Panel");
            label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setBackground(Color.white);
            label1.setForeground(Color.white);
            pnlHeader.add(label1, BorderLayout.CENTER);
        }
        add(pnlHeader, BorderLayout.NORTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel pnlSide;
    private JButton btnBookings;
    private JButton btnHousekeeping;
    private JButton btnRooms;
    private JButton btnAddCustomer;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
