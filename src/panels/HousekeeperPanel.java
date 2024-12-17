package panels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HousekeeperPanel extends Panel {

    private JButton prevSelectedButton;

    public HousekeeperPanel() {
        initComponents();
        prevSelectedButton = null;
    }

    @Override
    public void reset() {
        if(prevSelectedButton != null) prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        prevSelectedButton = null;
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnMyJobs.addActionListener(al);
        btnBack.addActionListener(al);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        btnMyJobs = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
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
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel panel1;
    private JButton btnMyJobs;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
