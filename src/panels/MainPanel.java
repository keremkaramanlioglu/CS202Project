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
        btnAdminPanel.addActionListener(l);
        btnGuestPanel.addActionListener(l);
        btnHousePanel.addActionListener(l);
        btnRecepPanel.addActionListener(l);
    }

    @Override
    public void setSelectedButton(JButton b) {

    }

    @Override
    public void reset() {
        return;
    }


    @Override
    public void setCenterPanel(Panel panel) {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void btnAdminPanelMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void btnAdminPanelMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void btnAdminPanelMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnGuestPanelMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void btnGuestPanelMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void btnGuestPanelMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnHousePanelMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void btnHousePanelMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void btnHousePanelMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void btnRecepPanelMouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void btnRecepPanelMouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void btnRecepPanelMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public JButton getBtnAdminPanel() {
        return btnAdminPanel;
    }

    public JButton getBtnGuestPanel() {
        return btnGuestPanel;
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
        btnAdminPanel = new JButton();
        btnGuestPanel = new JButton();
        btnHousePanel = new JButton();
        btnRecepPanel = new JButton();

        //======== this ========
        setBackground(new Color(0x666666));
        setForeground(Color.white);
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

            //---- btnAdminPanel ----
            btnAdminPanel.setText("Admin");
            btnAdminPanel.setPreferredSize(new Dimension(78, 40));
            btnAdminPanel.setBorder(null);
            btnAdminPanel.setBackground(new Color(0x333333));
            btnAdminPanel.setForeground(Color.white);
            btnAdminPanel.setFocusable(false);
            btnAdminPanel.setFocusPainted(false);
            btnAdminPanel.setSelected(true);
            btnAdminPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnAdminPanel.setAlignmentY(0.0F);
            btnAdminPanel.setIconTextGap(0);
            btnAdminPanel.setActionCommand("Admin");
            btnAdminPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnAdminPanelMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnAdminPanelMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnAdminPanelMouseExited(e);
                }
            });
            sidePanel.add(btnAdminPanel);

            //---- btnGuestPanel ----
            btnGuestPanel.setText("Guest");
            btnGuestPanel.setPreferredSize(new Dimension(78, 40));
            btnGuestPanel.setBorder(null);
            btnGuestPanel.setBackground(new Color(0x333333));
            btnGuestPanel.setForeground(Color.white);
            btnGuestPanel.setFocusable(false);
            btnGuestPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnGuestPanel.setAlignmentY(0.0F);
            btnGuestPanel.setIconTextGap(0);
            btnGuestPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnGuestPanelMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnGuestPanelMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnGuestPanelMouseExited(e);
                }
            });
            sidePanel.add(btnGuestPanel);

            //---- btnHousePanel ----
            btnHousePanel.setText("Housekeeper");
            btnHousePanel.setPreferredSize(new Dimension(100, 40));
            btnHousePanel.setBorder(null);
            btnHousePanel.setBackground(new Color(0x333333));
            btnHousePanel.setForeground(Color.white);
            btnHousePanel.setFocusable(false);
            btnHousePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnHousePanel.setAlignmentY(0.0F);
            btnHousePanel.setIconTextGap(0);
            btnHousePanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnHousePanelMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnHousePanelMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnHousePanelMouseExited(e);
                }
            });
            sidePanel.add(btnHousePanel);

            //---- btnRecepPanel ----
            btnRecepPanel.setText("Receptionist");
            btnRecepPanel.setPreferredSize(new Dimension(100, 40));
            btnRecepPanel.setBorder(null);
            btnRecepPanel.setBackground(new Color(0x333333));
            btnRecepPanel.setForeground(Color.white);
            btnRecepPanel.setFocusable(false);
            btnRecepPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnRecepPanel.setMaximumSize(new Dimension(106, 40));
            btnRecepPanel.setAlignmentY(0.0F);
            btnRecepPanel.setIconTextGap(0);
            btnRecepPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    btnRecepPanelMouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    btnRecepPanelMouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    btnRecepPanelMouseExited(e);
                }
            });
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
    private JButton btnAdminPanel;
    private JButton btnGuestPanel;
    private JButton btnHousePanel;
    private JButton btnRecepPanel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
