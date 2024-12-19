package panels;

import panels.customerPanels.BookARoomPanel;
import panels.customerPanels.MyBookingsPanel;
import panels.customerPanels.ProfilePanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




/**
 * @author kerem
 */
public class CustomerPanel extends Panel {
    private final Panel pnlBookARoom;
    private final Panel pnlMyBookings;
    private final Panel pnlProfile;

    public CustomerPanel() {
        initComponents();
        pnlBookARoom = new BookARoomPanel();
        pnlMyBookings = new MyBookingsPanel();
        pnlProfile = new ProfilePanel();
        super.prevCenterPanel = null;
        super.prevSelectedButton = null;
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
    public Object[] getEntity() {
        return new Object[0];
    }


    @Override
    public Panel getPanelByName(String panelName) {
        return switch (panelName) {

            case "Book a room" -> pnlBookARoom;
            case "My Bookings" -> pnlMyBookings;
            case "Profile" -> pnlProfile;
            default -> null;
        };
    }

    @Override
    public void addButtonListener(ActionListener l) {
        btnBack.addActionListener(l);
        btnProfile.addActionListener(l);
        btnMyBookings.addActionListener(l);
        btnBookARoom.addActionListener(l);
        pnlMyBookings.addButtonListener(l);
        pnlProfile.addButtonListener(l);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        pnlMyBookings.addMouseListener(ml);
        pnlBookARoom.addMouseListener(ml);
        pnlProfile.addMouseListener(ml);
    }

    public JButton getBtnProfile() {
        return btnProfile;
    }

    public JButton getBtnBack() {
        return btnBack;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlSide = new JPanel();
        btnBookARoom = new JButton();
        btnMyBookings = new JButton();
        btnProfile = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
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
            btnBookARoom.setName("side");
            pnlSide.add(btnBookARoom);

            //---- btnMyBookings ----
            btnMyBookings.setText("My Bookings");
            btnMyBookings.setBackground(new Color(0x333333));
            btnMyBookings.setForeground(Color.white);
            btnMyBookings.setBorder(null);
            btnMyBookings.setPreferredSize(new Dimension(120, 40));
            btnMyBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnMyBookings.setFocusable(false);
            btnMyBookings.setName("side");
            pnlSide.add(btnMyBookings);

            //---- btnProfile ----
            btnProfile.setText("Profile");
            btnProfile.setBackground(new Color(0x333333));
            btnProfile.setForeground(Color.white);
            btnProfile.setBorder(null);
            btnProfile.setPreferredSize(new Dimension(120, 40));
            btnProfile.setFocusable(false);
            btnProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnProfile.setName("side");
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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JPanel pnlSide;
    private JButton btnBookARoom;
    private JButton btnMyBookings;
    private JButton btnProfile;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
