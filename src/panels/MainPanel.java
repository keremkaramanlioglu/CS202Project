/*
 * Created by JFormDesigner on Sun Dec 08 02:52:02 TRT 2024
 */

package panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author kerem
 */
public class MainPanel extends Panel {

    public static Color sidePanelColor = new Color(0x333333);
    public static Color centerPanelColor = new Color(0x666666);

    public MainPanel() {
        initComponents();
    }

    public void addButtonListener(ActionListener l) {
        btnManager.addActionListener(l);
        btnCustomer.addActionListener(l);
        btnHousePanel.addActionListener(l);
        btnRecepPanel.addActionListener(l);
        btnDBManagerPanel.addActionListener(l);
    }

    @Override
    public boolean tfCheck() {
        return false;
    }

    @Override
    public void addMouseListener(MouseListener ml) {

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
        return null;
    }

    public JButton getBtnDBManagerPanel() {
        return btnDBManagerPanel;
    }

    public JButton getBtnManager() {
        return btnManager;
    }

    public JButton getBtnCustomer() {
        return btnCustomer;
    }

    public JButton getBtnHousePanel() {
        return btnHousePanel;
    }

    public JButton getBtnRecepPanel() {
        return btnRecepPanel;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        label1 = new JLabel();
        lblWelcome = new JLabel();
        sidePanel = new JPanel();
        btnDBManagerPanel = new JButton();
        btnManager = new JButton();
        btnCustomer = new JButton();
        btnHousePanel = new JButton();
        btnRecepPanel = new JButton();

        //======== this ========
        setBackground(new Color(0x666666));
        setForeground(Color.white);
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
        new javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
        ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
        ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
        ,java.awt.Color.red), getBorder())); addPropertyChangeListener(
        new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
        ;}});
        setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("Choose the suitable panel at the top!");
        label1.setPreferredSize(new Dimension(234, 300));
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setBackground(Color.black);
        label1.setForeground(Color.white);
        add(label1, BorderLayout.SOUTH);

        //---- lblWelcome ----
        lblWelcome.setText("Welcome to Hotel Management Application");
        lblWelcome.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 22));
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setPreferredSize(new Dimension(528, 20));
        lblWelcome.setBackground(new Color(0x666666));
        lblWelcome.setForeground(Color.white);
        add(lblWelcome, BorderLayout.CENTER);

        //======== sidePanel ========
        {
            sidePanel.setPreferredSize(new Dimension(0, 40));
            sidePanel.setBackground(new Color(0x333333));
            sidePanel.setBorder(null);
            sidePanel.setForeground(Color.white);
            sidePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

            //---- btnDBManagerPanel ----
            btnDBManagerPanel.setText("Database Manager");
            btnDBManagerPanel.setPreferredSize(new Dimension(120, 40));
            btnDBManagerPanel.setBorder(null);
            btnDBManagerPanel.setBackground(new Color(0x333333));
            btnDBManagerPanel.setForeground(Color.white);
            btnDBManagerPanel.setFocusable(false);
            btnDBManagerPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnDBManagerPanel.setMaximumSize(new Dimension(106, 40));
            btnDBManagerPanel.setAlignmentY(0.0F);
            btnDBManagerPanel.setIconTextGap(0);
            sidePanel.add(btnDBManagerPanel);

            //---- btnManager ----
            btnManager.setText("Manager");
            btnManager.setPreferredSize(new Dimension(120, 40));
            btnManager.setBorder(null);
            btnManager.setBackground(new Color(0x333333));
            btnManager.setForeground(Color.white);
            btnManager.setFocusable(false);
            btnManager.setFocusPainted(false);
            btnManager.setSelected(true);
            btnManager.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnManager.setAlignmentY(0.0F);
            btnManager.setIconTextGap(0);
            btnManager.setActionCommand("Manager");
            sidePanel.add(btnManager);

            //---- btnCustomer ----
            btnCustomer.setText("Customer");
            btnCustomer.setPreferredSize(new Dimension(120, 40));
            btnCustomer.setBorder(null);
            btnCustomer.setBackground(new Color(0x333333));
            btnCustomer.setForeground(Color.white);
            btnCustomer.setFocusable(false);
            btnCustomer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnCustomer.setAlignmentY(0.0F);
            btnCustomer.setIconTextGap(0);
            sidePanel.add(btnCustomer);

            //---- btnHousePanel ----
            btnHousePanel.setText("Housekeeper");
            btnHousePanel.setPreferredSize(new Dimension(120, 40));
            btnHousePanel.setBorder(null);
            btnHousePanel.setBackground(new Color(0x333333));
            btnHousePanel.setForeground(Color.white);
            btnHousePanel.setFocusable(false);
            btnHousePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnHousePanel.setAlignmentY(0.0F);
            btnHousePanel.setIconTextGap(0);
            sidePanel.add(btnHousePanel);

            //---- btnRecepPanel ----
            btnRecepPanel.setText("Receptionist");
            btnRecepPanel.setPreferredSize(new Dimension(120, 40));
            btnRecepPanel.setBorder(null);
            btnRecepPanel.setBackground(new Color(0x333333));
            btnRecepPanel.setForeground(Color.white);
            btnRecepPanel.setFocusable(false);
            btnRecepPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnRecepPanel.setMaximumSize(new Dimension(106, 40));
            btnRecepPanel.setAlignmentY(0.0F);
            btnRecepPanel.setIconTextGap(0);
            sidePanel.add(btnRecepPanel);
        }
        add(sidePanel, BorderLayout.NORTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JLabel label1;
    private JLabel lblWelcome;
    private JPanel sidePanel;
    private JButton btnDBManagerPanel;
    private JButton btnManager;
    private JButton btnCustomer;
    private JButton btnHousePanel;
    private JButton btnRecepPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
