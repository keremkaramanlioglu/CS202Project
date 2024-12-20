import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Wed Dec 18 15:22:42 TRT 2024
 */



/**
 * @author kerem
 */
public class SSNPopUpMenu extends JDialog {
    private String ssn;


    public SSNPopUpMenu(JFrame owner) {
        super(owner);
        ssn = "";
        initComponents();
        btnCancel.addActionListener(new ButtonListener());
        btnOK.addActionListener(new ButtonListener());
    }

    protected String getSsn() {
        this.setVisible(true);
        return ssn;
    }

    private void tfSsnKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOK.doClick();  // Programmatically clicks the OK button
        }
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnOK) {
                ssn = tfSsn.getText();
            }
            dispose();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        label1 = new JLabel();
        tfSsn = new JTextField();
        btnOK = new JButton();
        btnCancel = new JButton();

        //======== this ========
        setAlwaysOnTop(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setTitle("SSN Menu");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Please enter your ssn before continue:");
        label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 16));
        contentPane.add(label1);
        label1.setBounds(25, 5, 495, 90);

        //---- tfSsn ----
        tfSsn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                tfSsnKeyPressed(e);
            }
        });
        contentPane.add(tfSsn);
        tfSsn.setBounds(25, 90, 550, 50);

        //---- btnOK ----
        btnOK.setText("OK");
        contentPane.add(btnOK);
        btnOK.setBounds(440, 170, 153, 45);

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        contentPane.add(btnCancel);
        btnCancel.setBounds(285, 170, 153, 45);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JLabel label1;
    private JTextField tfSsn;
    private JButton btnOK;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
