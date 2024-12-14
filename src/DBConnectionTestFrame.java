import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sat Dec 14 01:50:28 TRT 2024
 */



/**
 * @author kerem
 */
public class DBConnectionTestFrame extends JFrame {
    public DBConnectionTestFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        frame1 = new JFrame();
        panel1 = new JPanel();
        label8 = new JLabel();
        textField8 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        label10 = new JLabel();
        textField10 = new JTextField();
        label11 = new JLabel();
        textField11 = new JTextField();
        label12 = new JLabel();
        textField12 = new JTextField();
        label13 = new JLabel();
        textField13 = new JTextField();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== frame1 ========
        {
            frame1.setVisible(true);
            frame1.setPreferredSize(new Dimension(650, 670));
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setBackground(new Color(0x666666));
            frame1.setForeground(SystemColor.textInactiveText);
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setPreferredSize(new Dimension(650, 660));
                panel1.setBackground(new Color(0x333333));
                panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
                . swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing
                . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
                Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
                ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
                public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName (
                ) )) throw new RuntimeException( ); }} );

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

                //---- label11 ----
                label11.setText("Password:");
                label11.setPreferredSize(new Dimension(40, 20));
                label11.setForeground(Color.white);

                //---- textField11 ----
                textField11.setPreferredSize(new Dimension(502, 40));
                textField11.setBackground(new Color(0x333333));
                textField11.setForeground(Color.white);
                textField11.setBorder(new LineBorder(Color.lightGray));
                textField11.setCaretColor(Color.white);
                textField11.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                textField11.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label12 ----
                label12.setText("Database:");
                label12.setPreferredSize(new Dimension(40, 20));
                label12.setForeground(Color.white);

                //---- textField12 ----
                textField12.setPreferredSize(new Dimension(502, 40));
                textField12.setBackground(new Color(0x333333));
                textField12.setForeground(Color.white);
                textField12.setBorder(new LineBorder(Color.lightGray));
                textField12.setCaretColor(Color.white);
                textField12.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                textField12.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label13 ----
                label13.setText("URL:");
                label13.setPreferredSize(new Dimension(40, 20));
                label13.setForeground(Color.white);

                //---- textField13 ----
                textField13.setPreferredSize(new Dimension(502, 40));
                textField13.setBackground(new Color(0x333333));
                textField13.setForeground(Color.white);
                textField13.setBorder(new LineBorder(Color.lightGray));
                textField13.setCaretColor(Color.white);
                textField13.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 14));
                textField13.setHorizontalAlignment(SwingConstants.CENTER);

                //---- button4 ----
                button4.setText("Back");
                button4.setForeground(Color.white);
                button4.setBackground(new Color(0x0099ff));
                button4.setBorder(new LineBorder(Color.lightGray));

                //---- button5 ----
                button5.setText("OK");
                button5.setBackground(new Color(0x0099ff));
                button5.setForeground(Color.white);
                button5.setBorder(new LineBorder(Color.lightGray));

                //---- button6 ----
                button6.setText("Test Connection");
                button6.setBackground(new Color(0x0099ff));
                button6.setForeground(Color.white);
                button6.setBorder(LineBorder.createBlackLineBorder());

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField13, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(button6, GroupLayout.PREFERRED_SIZE, 606, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(520, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(textField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addGap(204, 204, 204)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(421, Short.MAX_VALUE))
                );
            }
            frame1ContentPane.add(panel1, BorderLayout.CENTER);
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JFrame frame1;
    private JPanel panel1;
    private JLabel label8;
    private JTextField textField8;
    private JLabel label9;
    private JTextField textField9;
    private JLabel label10;
    private JTextField textField10;
    private JLabel label11;
    private JTextField textField11;
    private JLabel label12;
    private JTextField textField12;
    private JLabel label13;
    private JTextField textField13;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
