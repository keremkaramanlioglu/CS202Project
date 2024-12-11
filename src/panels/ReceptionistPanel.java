package panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceptionistPanel extends Panel {

    private JButton prevSelectedButton;

    public ReceptionistPanel() {
        initComponents();
        prevSelectedButton = null;
    }

    @Override
    public void setSelectedButton(JButton button) {
        if (prevSelectedButton == button) return;
        if (prevSelectedButton != null) {
            prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        }
        prevSelectedButton = button;
        button.setBackground(MainPanel.centerPanelColor);
    }

    @Override
    public void resetPanel() {
        if(prevSelectedButton != null) prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        prevSelectedButton = null;
    }

    @Override
    public void setCenterPanel(JPanel panel) {

    }

    @Override
    public JPanel getPanelByName(String panelName) {
        return null;
    }

    @Override
    public void addButtonListener(ActionListener l) {
        btnHousekeeping.addActionListener(l);
        btnFinance.addActionListener(l);
        btnBookings.addActionListener(l);
        btnEmployees.addActionListener(l);
        btnUsers.addActionListener(l);
        btnRooms.addActionListener(l);
        btnBack.addActionListener(l);
    }

    private void btnRoomsMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnHousekeepingMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnBackMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public JButton getBtnHousekeeping() {
        return btnHousekeeping;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        btnRooms = new JButton();
        btnHousekeeping = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnRooms ----
            btnRooms.setText("Bookings");
            btnRooms.setPreferredSize(new Dimension(120, 40));
            btnRooms.setBackground(new Color(0x333333));
            btnRooms.setForeground(Color.white);
            btnRooms.setBorder(null);
            btnRooms.setFocusable(false);
            btnRooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnRooms.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnRoomsMouseClicked(e);
                }
            });
            panel1.add(btnRooms);

            //---- btnHousekeeping ----
            btnHousekeeping.setText("Housekeeping");
            btnHousekeeping.setBackground(new Color(0x333333));
            btnHousekeeping.setForeground(Color.white);
            btnHousekeeping.setBorder(null);
            btnHousekeeping.setPreferredSize(new Dimension(120, 40));
            btnHousekeeping.setFocusable(false);
            btnHousekeeping.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnHousekeeping.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnHousekeepingMouseClicked(e);
                }
            });
            panel1.add(btnHousekeeping);

            //---- btnBack ----
            btnBack.setText("Back");
            btnBack.setBackground(new Color(0x333333));
            btnBack.setForeground(Color.white);
            btnBack.setBorder(null);
            btnBack.setPreferredSize(new Dimension(120, 40));
            btnBack.setFocusable(false);
            btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBack.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnBackMouseClicked(e);
                }
            });
            panel1.add(btnBack);
        }
        add(panel1, BorderLayout.WEST);

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
    private JPanel panel1;
    private JButton btnRooms;
    private JButton btnHousekeeping;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
