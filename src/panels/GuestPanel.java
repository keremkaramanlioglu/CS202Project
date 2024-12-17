package panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Dec 07 23:18:30 TRT 2024
 */



/**
 * @author kerem
 */
public class GuestPanel extends Panel {
    private JButton prevSelectedButton;

    public GuestPanel() {
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
    public void setCenterPanel(Panel panel) {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    @Override
    public void addButtonListener(ActionListener l) {
        btnBack.addActionListener(l);
        btnProfile.addActionListener(l);
        btnMyBookings.addActionListener(l);
        btnBookARoom.addActionListener(l);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        btnBookARoom = new JButton();
        btnMyBookings = new JButton();
        btnProfile = new JButton();
        btnBack = new JButton();
        panel2 = new JPanel();
        label1 = new JLabel();

        //======== this ========

        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnBookARoom ----
            btnBookARoom.setText("Book a room");
            btnBookARoom.setPreferredSize(new Dimension(120, 40));
            btnBookARoom.setBackground(new Color(0x333333));
            btnBookARoom.setForeground(Color.white);
            btnBookARoom.setBorder(null);
            btnBookARoom.setFocusable(false);
            btnBookARoom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBookARoom.setHorizontalAlignment(SwingConstants.CENTER);
            panel1.add(btnBookARoom);

            //---- btnMyBookings ----
            btnMyBookings.setText("My Bookings");
            btnMyBookings.setBackground(new Color(0x333333));
            btnMyBookings.setForeground(Color.white);
            btnMyBookings.setBorder(null);
            btnMyBookings.setPreferredSize(new Dimension(120, 40));
            btnMyBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnMyBookings.setFocusable(false);
            panel1.add(btnMyBookings);

            //---- btnProfile ----
            btnProfile.setText("Profile");
            btnProfile.setBackground(new Color(0x333333));
            btnProfile.setForeground(Color.white);
            btnProfile.setBorder(null);
            btnProfile.setPreferredSize(new Dimension(120, 40));
            btnProfile.setFocusable(false);
            btnProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            panel1.add(btnProfile);

            //---- btnBack ----
            btnBack.setText("Back");
            btnBack.setBackground(new Color(0x333333));
            btnBack.setForeground(Color.white);
            btnBack.setBorder(null);
            btnBack.setPreferredSize(new Dimension(120, 40));
            btnBack.setFocusable(false);
            btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            panel1.add(btnBack);
        }
        add(panel1, BorderLayout.WEST);

        //======== panel2 ========
        {
            panel2.setPreferredSize(new Dimension(0, 50));
            panel2.setBackground(new Color(0x333333));
            panel2.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Guest Panel");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
            label1.setBackground(new Color(0x333333));
            label1.setForeground(Color.white);
            panel2.add(label1, BorderLayout.CENTER);
        }
        add(panel2, BorderLayout.NORTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel panel1;
    private JButton btnBookARoom;
    private JButton btnMyBookings;
    private JButton btnProfile;
    private JButton btnBack;
    private JPanel panel2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
