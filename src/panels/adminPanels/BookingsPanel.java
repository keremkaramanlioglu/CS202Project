/*
 * Created by JFormDesigner on Wed Dec 11 17:07:20 TRT 2024
 */

package panels.adminPanels;

import java.awt.event.MouseListener;
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
        // TODO add button listeners to components
        btnAdd.addActionListener(al);
        btnDelete.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnApply.addActionListener(al);
        btnGetSelectedRow.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfStartDate.addMouseListener(ml);
        tfEndDate.addMouseListener(ml);
    }

    @Override
    public void reset() {
        // TODO reset the components
    }


    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    public BookingsPanel() {
        initComponents();
        super.dataTable = table;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        scrollPane1 = new JScrollPane();
        table = new JTable();
        panel1 = new JPanel();
        panel3 = new JPanel();
        tfCSsn = new JTextField();
        tfPaymentStatus = new JTextField();
        tfPaymentMethod = new JTextField();
        tfRoomID = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        cbCheckin = new JCheckBox();
        cbCheckout = new JCheckBox();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfStartDate = new JTextField();
        tfEndDate = new JTextField();
        label5 = new JLabel();
        label7 = new JLabel();
        btnGetSelectedRow = new JButton();
        panel2 = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        label6 = new JLabel();
        tfFilterValue = new JTextField();
        btnApply = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
        ( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
        . TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
        propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- table ----
            table.setPreferredSize(new Dimension(150, 400));
            table.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, false, false},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "Book ID", "Customer SSN", "Room ID", "Payment Status", "Payment Method", "Start Date", "End Date", "Checked in", "Checked out"
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
            scrollPane1.setViewportView(table);
        }
        add(scrollPane1, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(0, 230));
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //======== panel3 ========
            {
                panel3.setLayout(null);
                panel3.add(tfCSsn);
                tfCSsn.setBounds(20, 55, 100, 34);
                panel3.add(tfPaymentStatus);
                tfPaymentStatus.setBounds(230, 55, 100, 34);
                panel3.add(tfPaymentMethod);
                tfPaymentMethod.setBounds(335, 55, 100, 34);
                panel3.add(tfRoomID);
                tfRoomID.setBounds(125, 55, 100, 34);

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

                //---- cbCheckin ----
                cbCheckin.setText("Checked in");
                cbCheckin.setFont(new Font("Inter", Font.PLAIN, 12));
                cbCheckin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel3.add(cbCheckin);
                cbCheckin.setBounds(125, 105, 100, 34);

                //---- cbCheckout ----
                cbCheckout.setText("Checked out");
                cbCheckout.setFont(new Font("Inter", Font.PLAIN, 12));
                cbCheckout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel3.add(cbCheckout);
                cbCheckout.setBounds(20, 105, 100, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Bookings");
                panel3.add(btnAdd);
                btnAdd.setBounds(15, 145, 140, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Bookings");
                panel3.add(btnDelete);
                btnDelete.setBounds(160, 145, 140, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Bookings");
                panel3.add(btnUpdate);
                btnUpdate.setBounds(305, 145, 140, 60);

                //---- tfStartDate ----
                tfStartDate.setEditable(false);
                tfStartDate.setName("dateChooser");
                tfStartDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel3.add(tfStartDate);
                tfStartDate.setBounds(230, 110, 100, 34);

                //---- tfEndDate ----
                tfEndDate.setEditable(false);
                tfEndDate.setName("dateChooser");
                tfEndDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel3.add(tfEndDate);
                tfEndDate.setBounds(335, 110, 100, 34);

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

                //---- btnGetSelectedRow ----
                btnGetSelectedRow.setText("Get Selected Row");
                btnGetSelectedRow.setActionCommand("Bookings");
                btnGetSelectedRow.setFont(new Font("Inter", Font.PLAIN, 13));
                panel3.add(btnGetSelectedRow);
                btnGetSelectedRow.setBounds(450, 145, 140, 60);

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
                    "Book ID",
                    "Customer SSN",
                    "Room ID",
                    "Payment Method",
                    "Payment Status",
                    "Start Date",
                    "End Date",
                    "Checked in",
                    "Checked out"
                }));
                cbSelectColumn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
                    "contains",
                    "Completed",
                    "Pending",
                    "Canceled",
                    "In Advance",
                    "During Check-out",
                    "Checked in",
                    "Checked out"
                }));
                cbFilterOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                panel2.add(cbFilterOption);
                cbFilterOption.setBounds(130, 20, 120, 45);

                //---- label6 ----
                label6.setText("Filter Value:");
                panel2.add(label6);
                label6.setBounds(10, 75, 245, 30);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                panel2.add(tfFilterValue);
                tfFilterValue.setBounds(5, 100, 245, 40);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Bookings");
                panel2.add(btnApply);
                btnApply.setBounds(5, 145, 245, 60);

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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane scrollPane1;
    private JTable table;
    private JPanel panel1;
    private JPanel panel3;
    private JTextField tfCSsn;
    private JTextField tfPaymentStatus;
    private JTextField tfPaymentMethod;
    private JTextField tfRoomID;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JCheckBox cbCheckin;
    private JCheckBox cbCheckout;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfStartDate;
    private JTextField tfEndDate;
    private JLabel label5;
    private JLabel label7;
    private JButton btnGetSelectedRow;
    private JPanel panel2;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel label6;
    private JTextField tfFilterValue;
    private JButton btnApply;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
