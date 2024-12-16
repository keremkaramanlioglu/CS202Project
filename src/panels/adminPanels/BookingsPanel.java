/*
 * Created by JFormDesigner on Wed Dec 11 17:07:20 TRT 2024
 */

package panels.adminPanels;

import java.util.*;
import javax.swing.table.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class BookingsPanel extends Panel {

    @Override
    public void addButtonListener(ActionListener al) {

    }

    @Override
    public void setSelectedButton(JButton b) {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setCenterPanel(Panel panel) {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    public BookingsPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel1 = new JPanel();
        panel3 = new JPanel();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        textField9 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        textField10 = new JTextField();
        textField11 = new JTextField();
        label5 = new JLabel();
        label7 = new JLabel();
        panel2 = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        label6 = new JLabel();
        tfFilterValue = new JTextField();
        button1 = new JButton();
        btnDelete2 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
        .swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing
        .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
        Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.red
        ), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
        public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName(
        )))throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setPreferredSize(new Dimension(150, 400));
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "booking_id", "c_ssn", "room_id", "payment_status", "payment_method", "booking_start_date", "booking_end_date", "c_check_in_status", "c_check_out_status"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, Integer.class, String.class, String.class, Date.class, Date.class, Boolean.class, Boolean.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(0, 230));
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //======== panel3 ========
            {
                panel3.setLayout(null);
                panel3.add(textField6);
                textField6.setBounds(20, 55, 100, 34);
                panel3.add(textField7);
                textField7.setBounds(230, 55, 100, 34);
                panel3.add(textField8);
                textField8.setBounds(335, 55, 100, 34);
                panel3.add(textField9);
                textField9.setBounds(125, 55, 100, 34);

                //---- label1 ----
                label1.setText("Customer SSN:");
                label1.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label1);
                label1.setBounds(20, 35, 100, 25);

                //---- label2 ----
                label2.setText("Room ID:");
                label2.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label2);
                label2.setBounds(125, 35, 100, 25);

                //---- label3 ----
                label3.setText("Payment Status:");
                label3.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label3);
                label3.setBounds(230, 35, 100, 25);

                //---- label4 ----
                label4.setText("Payment Method:");
                label4.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label4);
                label4.setBounds(335, 35, 100, 25);

                //---- checkBox2 ----
                checkBox2.setText("Checked in");
                checkBox2.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(checkBox2);
                checkBox2.setBounds(125, 105, 100, 34);

                //---- checkBox3 ----
                checkBox3.setText("Checked out");
                checkBox3.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(checkBox3);
                checkBox3.setBounds(20, 105, 100, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                panel3.add(btnAdd);
                btnAdd.setBounds(20, 145, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                panel3.add(btnDelete);
                btnDelete.setBounds(125, 145, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                panel3.add(btnUpdate);
                btnUpdate.setBounds(230, 145, 100, 60);

                //---- textField10 ----
                textField10.setEditable(false);
                panel3.add(textField10);
                textField10.setBounds(230, 110, 100, 34);

                //---- textField11 ----
                textField11.setEditable(false);
                panel3.add(textField11);
                textField11.setBounds(335, 110, 100, 34);

                //---- label5 ----
                label5.setText("Start date:");
                label5.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label5);
                label5.setBounds(230, 90, 100, 25);

                //---- label7 ----
                label7.setText("End Date:");
                label7.setFont(new Font("Inter", Font.PLAIN, 12));
                panel3.add(label7);
                label7.setBounds(335, 90, 100, 25);

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

            //======== panel2 ========
            {
                panel2.setLayout(null);

                //---- cbSelectColumn ----
                cbSelectColumn.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Room Id",
                    "Room Number",
                    "Room Type",
                    "Room Size",
                    "Room Price",
                    "Capacity"
                }));
                panel2.add(cbSelectColumn);
                cbSelectColumn.setBounds(10, 20, 120, 45);

                //---- cbFilterOption ----
                cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None",
                    "==",
                    "!=",
                    "<",
                    ">",
                    "<=",
                    ">=",
                    "between",
                    "contains"
                }));
                panel2.add(cbFilterOption);
                cbFilterOption.setBounds(130, 20, 120, 45);

                //---- label6 ----
                label6.setText("Filter Value:");
                panel2.add(label6);
                label6.setBounds(10, 80, 245, 30);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                panel2.add(tfFilterValue);
                tfFilterValue.setBounds(5, 105, 245, 40);

                //---- button1 ----
                button1.setText("Apply");
                panel2.add(button1);
                button1.setBounds(5, 145, 122, 60);

                //---- btnDelete2 ----
                btnDelete2.setText("Choose Date");
                panel2.add(btnDelete2);
                btnDelete2.setBounds(130, 145, 122, 60);

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
        }
        add(panel1, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JPanel panel3;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField textField10;
    private JTextField textField11;
    private JLabel label5;
    private JLabel label7;
    private JPanel panel2;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel label6;
    private JTextField tfFilterValue;
    private JButton button1;
    private JButton btnDelete2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
