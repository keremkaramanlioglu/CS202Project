package panels;

import panels.housekeeperPanels.MyJobsPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HousekeeperPanel extends Panel {

    private JButton prevSelectedButton;
    private final Panel MyJobsPanel;

    public HousekeeperPanel() {
        initComponents();
        prevSelectedButton = null;
        MyJobsPanel = new MyJobsPanel();
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
    public Panel getPanelByName(String panelName) {
        return switch (panelName) {
            case "My Jobs" -> MyJobsPanel;
            default -> null;
        };
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnMyJobs.addActionListener(al);
        btnBack.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    public JButton getBtnBack() {
        return btnBack;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        panel1 = new JPanel();
        btnMyJobs = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
        swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border
        .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog"
        ,java.awt.Font.BOLD,12),java.awt.Color.red), getBorder
        ())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
        .beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException
        ();}});
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnMyJobs ----
            btnMyJobs.setText("My Jobs");
            btnMyJobs.setPreferredSize(new Dimension(120, 40));
            btnMyJobs.setBackground(new Color(0x333333));
            btnMyJobs.setForeground(Color.white);
            btnMyJobs.setBorder(null);
            btnMyJobs.setFocusable(false);
            btnMyJobs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnMyJobs.setName("side");
            panel1.add(btnMyJobs);

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

        //======== pnlHeader ========
        {
            pnlHeader.setPreferredSize(new Dimension(0, 50));
            pnlHeader.setBackground(new Color(0x333333));
            pnlHeader.setForeground(Color.white);
            pnlHeader.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Housekeeper Panel");
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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JPanel panel1;
    private JButton btnMyJobs;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
