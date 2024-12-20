import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;
import javax.swing.border.*;
import javax.xml.transform.stream.StreamSource;

import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sat Dec 14 01:50:28 TRT 2024
 */



/**
 * @author kerem
 */
public class DBConnectionTestFrame extends JFrame {
    static int x = 0;
    public DBConnectionTestFrame() {
        initComponents();
    }

    public String getHostName() {
        return textField8.getText();
    }

    public String getPort() {
        return textField9.getText();
    }

    public String getDatabaseName() {
        return textField11.getText();
    }

    public String getUsername() {
        return textField10.getText();
    }

    public String getPassword() {
        return String.valueOf(passwordField1.getPassword());
    }

    public void addButtonListener(ActionListener al) {
        button4.addActionListener(al);
        button5.addActionListener(al);
        button6.addActionListener(al);
    }

    private void textField11KeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && x == 0) {
            button6.doClick();
            x++;
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER && x == 1) {
            button5.doClick();
            x--;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        panel1 = new JPanel();
        label8 = new JLabel();
        textField8 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        label10 = new JLabel();
        textField10 = new JTextField();
        label11 = new JLabel();
        label12 = new JLabel();
        textField11 = new JTextField();
        button6 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========
        setVisible(true);
        setPreferredSize(new Dimension(650, 670));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setForeground(SystemColor.textInactiveText);
        setTitle("Connect to a Database");
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/icons/MySQL.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x333333));
            panel1.setForeground(Color.white);
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );

            //---- label8 ----
            label8.setText("Host:");
            label8.setPreferredSize(new Dimension(40, 20));
            label8.setBackground(new Color(0x333333));
            label8.setForeground(Color.white);

            //---- textField8 ----
            textField8.setPreferredSize(new Dimension(264, 40));
            textField8.setForeground(Color.white);
            textField8.setCaretColor(Color.white);
            textField8.setBackground(new Color(0x333333));
            textField8.setBorder(new LineBorder(Color.lightGray));
            textField8.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
            textField8.setHorizontalAlignment(SwingConstants.CENTER);
            textField8.setText("localhost");

            //---- label9 ----
            label9.setText("Port:");
            label9.setPreferredSize(new Dimension(40, 20));
            label9.setForeground(Color.white);

            //---- textField9 ----
            textField9.setPreferredSize(new Dimension(165, 40));
            textField9.setBackground(new Color(0x333333));
            textField9.setForeground(Color.white);
            textField9.setCaretColor(Color.white);
            textField9.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
            textField9.setBorder(new LineBorder(Color.lightGray));
            textField9.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
            textField9.setHorizontalAlignment(SwingConstants.CENTER);
            textField9.setText("3306");

            //---- label10 ----
            label10.setText("Username:");
            label10.setPreferredSize(new Dimension(40, 20));
            label10.setForeground(Color.white);

            //---- textField10 ----
            textField10.setPreferredSize(new Dimension(502, 40));
            textField10.setBackground(new Color(0x333333));
            textField10.setForeground(Color.white);
            textField10.setBorder(new LineBorder(Color.lightGray));
            textField10.setCaretColor(Color.white);
            textField10.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
            textField10.setHorizontalAlignment(SwingConstants.CENTER);
            textField10.setText("root");

            //---- label11 ----
            label11.setText("Password:");
            label11.setPreferredSize(new Dimension(40, 20));
            label11.setForeground(Color.white);

            //---- label12 ----
            label12.setText("Database:");
            label12.setPreferredSize(new Dimension(40, 20));
            label12.setForeground(Color.white);

            //---- textField11 ----
            textField11.setPreferredSize(new Dimension(502, 40));
            textField11.setBackground(new Color(0x333333));
            textField11.setForeground(Color.white);
            textField11.setBorder(new LineBorder(Color.lightGray));
            textField11.setCaretColor(Color.white);
            textField11.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
            textField11.setHorizontalAlignment(SwingConstants.CENTER);
            textField11.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    textField11KeyPressed(e);
                }
            });

            //---- button6 ----
            button6.setText("Test Connection");
            button6.setBackground(new Color(0x0099ff));
            button6.setForeground(Color.white);
            button6.setBorder(LineBorder.createBlackLineBorder());
            button6.setFocusable(false);

            //---- button4 ----
            button4.setText("Back");
            button4.setForeground(Color.white);
            button4.setBackground(new Color(0x0099ff));
            button4.setBorder(new LineBorder(Color.lightGray));
            button4.setFocusable(false);

            //---- button5 ----
            button5.setText("OK");
            button5.setBackground(new Color(0x0099ff));
            button5.setForeground(Color.white);
            button5.setBorder(new LineBorder(Color.lightGray));
            button5.setFocusable(false);

            //---- passwordField1 ----
            passwordField1.setPreferredSize(new Dimension(502, 40));
            passwordField1.setCaretColor(Color.white);
            passwordField1.setBorder(new LineBorder(Color.lightGray));
            passwordField1.setForeground(Color.white);
            passwordField1.setBackground(new Color(0x333333));
            passwordField1.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button6, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label11, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
            );
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JPanel panel1;
    private JLabel label8;
    private JTextField textField8;
    private JLabel label9;
    private JTextField textField9;
    private JLabel label10;
    private JTextField textField10;
    private JLabel label11;
    private JLabel label12;
    private JTextField textField11;
    private JButton button6;
    private JButton button4;
    private JButton button5;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
