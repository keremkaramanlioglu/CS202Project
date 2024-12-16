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
    public void reset() {
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
        btnBookings.addActionListener(l);
        btnHousekeeping.addActionListener(l);
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

    public JButton getBtnRooms() {
        return btnRooms;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnHousekeeping() {
        return btnHousekeeping;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        btnBookings = new JButton();
        btnHousekeeping = new JButton();
        btnRooms = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnBookings ----
            btnBookings.setText("Bookings");
            btnBookings.setPreferredSize(new Dimension(120, 40));
            btnBookings.setBackground(new Color(0x333333));
            btnBookings.setForeground(Color.white);
            btnBookings.setBorder(null);
            btnBookings.setFocusable(false);
            btnBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBookings.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnRoomsMouseClicked(e);
                }
            });
            panel1.add(btnBookings);

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

            //---- btnRooms ----
            btnRooms.setText("Rooms");
            btnRooms.setBackground(new Color(0x333333));
            btnRooms.setForeground(Color.white);
            btnRooms.setBorder(null);
            btnRooms.setPreferredSize(new Dimension(120, 40));
            btnRooms.setFocusable(false);
            btnRooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnRooms.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnHousekeepingMouseClicked(e);
                }
            });
            panel1.add(btnRooms);

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
    private JButton btnBookings;
    private JButton btnHousekeeping;
    private JButton btnRooms;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
