/*
 * Created by JFormDesigner on Wed Dec 11 17:06:54 TRT 2024
 */

package panels.adminPanels;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class UsersPanel extends JPanel {
    public UsersPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //======== this ========
        setMaximumSize(new Dimension(65534, 65534));
        setMinimumSize(new Dimension(630, 109));
        setPreferredSize(new Dimension(680, 516));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setMinimumSize(new Dimension(105, 40));
            table1.setPreferredSize(new Dimension(525, 350));
            table1.setPreferredScrollableViewportSize(new Dimension(450, 350));
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, "", null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "ssn", "First Name", "Last Name", "Birth Date", "Room ID", "E-mail", "Phone Number", "Gender", "Zip Code"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, Integer.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(630, 89));
            panel1.setMaximumSize(new Dimension(65534, 32767));
            panel1.setPreferredSize(new Dimension(630, 89));
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //======== panel2 ========
            {
                panel2.setMinimumSize(new Dimension(420, 89));
                panel2.setPreferredSize(new Dimension(400, 0));
                panel2.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2);

            //======== panel3 ========
            {
                panel3.setMinimumSize(new Dimension(210, 85));
                panel3.setPreferredSize(new Dimension(200, 0));
                panel3.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel3);
        }
        add(panel1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
