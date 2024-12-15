/*
 * Created by JFormDesigner on Wed Dec 11 17:06:06 TRT 2024
 */

package panels.adminPanels;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class RoomsPanel extends JPanel {
    public RoomsPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        dataPanel = new JScrollPane();
        table1 = new JTable();
        controlPanel = new JPanel();
        selectionPanel = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        filterPanel = new JPanel();
        ColumOptions = new JComboBox();
        filter = new JComboBox();
        filterInput = new JTextField();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0
        ,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
        ,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.red),
         getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== dataPanel ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                },
                new String[] {
                    "Room ID", "Hotel Id", "Room Number", "Room Type", "Room Size", "Room Price", "Capacity"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, Integer.class, Integer.class, String.class, Float.class, Float.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            dataPanel.setViewportView(table1);
        }
        add(dataPanel, BorderLayout.NORTH);

        //======== controlPanel ========
        {
            controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

            //======== selectionPanel ========
            {
                selectionPanel.setLayout(null);

                //---- button1 ----
                button1.setText("Add");
                selectionPanel.add(button1);
                button1.setBounds(new Rectangle(new Point(25, 55), button1.getPreferredSize()));

                //---- button2 ----
                button2.setText("bakar\u0131z");
                selectionPanel.add(button2);
                button2.setBounds(new Rectangle(new Point(325, 55), button2.getPreferredSize()));

                //---- button3 ----
                button3.setText("Delete");
                selectionPanel.add(button3);
                button3.setBounds(new Rectangle(new Point(125, 55), button3.getPreferredSize()));

                //---- button4 ----
                button4.setText("Update");
                selectionPanel.add(button4);
                button4.setBounds(225, 55, 75, button4.getPreferredSize().height);

                //---- textField1 ----
                textField1.setText("Room Number");
                textField1.setFont(new Font("Inter", Font.PLAIN, 10));
                selectionPanel.add(textField1);
                textField1.setBounds(10, 10, 90, textField1.getPreferredSize().height);

                //---- textField2 ----
                textField2.setText("Room Type");
                selectionPanel.add(textField2);
                textField2.setBounds(100, 10, 90, 34);

                //---- textField3 ----
                textField3.setText("Room Size");
                selectionPanel.add(textField3);
                textField3.setBounds(190, 10, 90, 34);

                //---- textField4 ----
                textField4.setText("Room Price");
                selectionPanel.add(textField4);
                textField4.setBounds(280, 10, 90, 34);

                //---- textField5 ----
                textField5.setText("Capacity");
                selectionPanel.add(textField5);
                textField5.setBounds(370, 10, 90, 34);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < selectionPanel.getComponentCount(); i++) {
                        Rectangle bounds = selectionPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = selectionPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    selectionPanel.setMinimumSize(preferredSize);
                    selectionPanel.setPreferredSize(preferredSize);
                }
            }
            controlPanel.add(selectionPanel);

            //======== filterPanel ========
            {
                filterPanel.setLayout(null);
                filterPanel.add(ColumOptions);
                ColumOptions.setBounds(new Rectangle(new Point(15, 10), ColumOptions.getPreferredSize()));
                filterPanel.add(filter);
                filter.setBounds(115, 10, 91, 34);
                filterPanel.add(filterInput);
                filterInput.setBounds(15, 65, 95, filterInput.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < filterPanel.getComponentCount(); i++) {
                        Rectangle bounds = filterPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = filterPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    filterPanel.setMinimumSize(preferredSize);
                    filterPanel.setPreferredSize(preferredSize);
                }
            }
            controlPanel.add(filterPanel);
        }
        add(controlPanel, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane dataPanel;
    private JTable table1;
    private JPanel controlPanel;
    private JPanel selectionPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel filterPanel;
    private JComboBox ColumOptions;
    private JComboBox filter;
    private JTextField filterInput;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
