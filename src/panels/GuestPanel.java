package panels;

import panels.guestPanels.BookARoomPanel;
import panels.guestPanels.MyBookingsPanel;
import panels.guestPanels.ProfilePanel;

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
    private final Panel pnlBookARoom;
    private final Panel pnlMyBookings;
    private final Panel profilePanel;

    public GuestPanel() {
        initComponents();
        pnlBookARoom = new BookARoomPanel();
        pnlMyBookings = new MyBookingsPanel();
        profilePanel = new ProfilePanel();
        super.prevCenterPanel = null;
        super.prevSelectedButton = null;
    }

    @Override
    public void reset() {
        if(super.prevSelectedButton != null) super.prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        super.prevSelectedButton = null;
    }


    @Override
    public Panel getPanelByName(String panelName) {
        return switch (panelName) {

            case "Book a room" -> pnlBookARoom;
            case "My Bookings" -> pnlMyBookings;
            case "Profile" -> profilePanel;
            default -> null;
        };
    }

    @Override
    public void addButtonListener(ActionListener l) {
        btnBack.addActionListener(l);
        btnProfile.addActionListener(l);
        btnMyBookings.addActionListener(l);
        btnBookARoom.addActionListener(l);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        pnlMyBookings.addMouseListener(ml);
        pnlBookARoom.addMouseListener(ml);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlSide = new JPanel();
        btnBookARoom = new JButton();
        btnMyBookings = new JButton();
        btnProfile = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setLayout(new BorderLayout());

        //======== pnlSide ========
        {
            pnlSide.setPreferredSize(new Dimension(120, 0));
            pnlSide.setBackground(new Color(0x333333));
            pnlSide.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnBookARoom ----
            btnBookARoom.setText("Book a room");
            btnBookARoom.setPreferredSize(new Dimension(120, 40));
            btnBookARoom.setBackground(new Color(0x333333));
            btnBookARoom.setForeground(Color.white);
            btnBookARoom.setBorder(null);
            btnBookARoom.setFocusable(false);
            btnBookARoom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBookARoom.setHorizontalAlignment(SwingConstants.CENTER);
            pnlSide.add(btnBookARoom);

            //---- btnMyBookings ----
            btnMyBookings.setText("My Bookings");
            btnMyBookings.setBackground(new Color(0x333333));
            btnMyBookings.setForeground(Color.white);
            btnMyBookings.setBorder(null);
            btnMyBookings.setPreferredSize(new Dimension(120, 40));
            btnMyBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnMyBookings.setFocusable(false);
            pnlSide.add(btnMyBookings);

            //---- btnProfile ----
            btnProfile.setText("Profile");
            btnProfile.setBackground(new Color(0x333333));
            btnProfile.setForeground(Color.white);
            btnProfile.setBorder(null);
            btnProfile.setPreferredSize(new Dimension(120, 40));
            btnProfile.setFocusable(false);
            btnProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            pnlSide.add(btnProfile);

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
            pnlHeader.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Guest Panel");
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
            label1.setBackground(new Color(0x333333));
            label1.setForeground(Color.white);
            pnlHeader.add(label1, BorderLayout.CENTER);
        }
        add(pnlHeader, BorderLayout.NORTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel pnlSide;
    private JButton btnBookARoom;
    private JButton btnMyBookings;
    private JButton btnProfile;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
