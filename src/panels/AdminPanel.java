package panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class AdminPanel extends Panel {
    private JButton prevSelectedButton;
    private JPanel prevCenterPanel;

    public AdminPanel() {
        initComponents();
        prevSelectedButton = null;
        prevCenterPanel = null;
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
        // other components needs reset too.
    }

    @Override
    public void setCenterPanel(JPanel panel) {
        if (prevCenterPanel == panel) return;
        if (prevCenterPanel != null) this.remove(prevCenterPanel);
        this.add(panel, BorderLayout.CENTER);
        prevCenterPanel = panel;
        this.revalidate();
    }

    @Override
    public JPanel getPanelByName(String panelName) {
        switch(panelName) {
            case "Rooms":
                return pnlRooms;
        }
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

    private void btnUsersMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnEmployeesMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnFinanceMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnBookingsMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnHousekeepingMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnBackMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public JButton getBtnEmployees() {
        return btnEmployees;
    }

    public JButton getBtnFinance() {
        return btnFinance;
    }

    public JButton getBtnBookings() {
        return btnBookings;
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
        btnUsers = new JButton();
        btnEmployees = new JButton();
        btnFinance = new JButton();
        btnBookings = new JButton();
        btnHousekeeping = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();
        pnlRooms = new JPanel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
        0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
        .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
        red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
        beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnRooms ----
            btnRooms.setText("Rooms");
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

            //---- btnUsers ----
            btnUsers.setText("Users");
            btnUsers.setBackground(new Color(0x333333));
            btnUsers.setForeground(Color.white);
            btnUsers.setBorder(null);
            btnUsers.setPreferredSize(new Dimension(120, 40));
            btnUsers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnUsers.setFocusable(false);
            btnUsers.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnUsersMouseClicked(e);
                }
            });
            panel1.add(btnUsers);

            //---- btnEmployees ----
            btnEmployees.setText("Employees");
            btnEmployees.setBackground(new Color(0x333333));
            btnEmployees.setForeground(Color.white);
            btnEmployees.setBorder(null);
            btnEmployees.setPreferredSize(new Dimension(120, 40));
            btnEmployees.setFocusable(false);
            btnEmployees.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnEmployees.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnEmployeesMouseClicked(e);
                }
            });
            panel1.add(btnEmployees);

            //---- btnFinance ----
            btnFinance.setText("Finance");
            btnFinance.setBackground(new Color(0x333333));
            btnFinance.setForeground(Color.white);
            btnFinance.setBorder(null);
            btnFinance.setPreferredSize(new Dimension(120, 40));
            btnFinance.setFocusable(false);
            btnFinance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnFinance.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnFinanceMouseClicked(e);
                }
            });
            panel1.add(btnFinance);

            //---- btnBookings ----
            btnBookings.setText("Bookings");
            btnBookings.setBackground(new Color(0x333333));
            btnBookings.setForeground(Color.white);
            btnBookings.setBorder(null);
            btnBookings.setPreferredSize(new Dimension(120, 40));
            btnBookings.setFocusable(false);
            btnBookings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnBookings.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnBookingsMouseClicked(e);
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
            label1.setText("Admin Panel");
            label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setBackground(Color.white);
            label1.setForeground(Color.white);
            pnlHeader.add(label1, BorderLayout.CENTER);
        }
        add(pnlHeader, BorderLayout.NORTH);

        //======== pnlRooms ========
        {
            pnlRooms.setBackground(new Color(0x666666));
            pnlRooms.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,pnlRooms. getBorder( )) ); pnlRooms. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            pnlRooms.setLayout(new BorderLayout());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel panel1;
    private JButton btnRooms;
    private JButton btnUsers;
    private JButton btnEmployees;
    private JButton btnFinance;
    private JButton btnBookings;
    private JButton btnHousekeeping;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    private JPanel pnlRooms;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
