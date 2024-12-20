/*
 * Created by JFormDesigner on Wed Dec 11 17:07:05 TRT 2024
 */

package panels.managerPanels;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

import entities.Booking;
import entities.Employee;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author kerem
 */
public class EmployeesPanel extends Panel {

    private DefaultTableModel tableModel;

    public EmployeesPanel() {
        initComponents();
        initTable();
        super.cbFilterColumn = cbColumnOption;
        super.cbFilterOption = cbFilterOption;
        super.tfFilterValue = tfFilterValue;
        super.tfFilterUpperValue = tfFilterUpperValue;
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "ssn", "firstname", "lastname", "type", "bd", "years", "hotel_id", "salary", "phone_num", "email", "gender", "street", "no", "apartment", "zip_code"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Float.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        tblEmployees.setModel(tableModel);
        tblEmployees.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblEmployees.getColumnCount()];
                int selectedRow = tblEmployees.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblEmployees.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblEmployees;
        super.model = tableModel;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnUpdate.addActionListener(al);
        btnApplyFilter.addActionListener(al);
        btnDelete.addActionListener(al);
        btnAdd.addActionListener(al);
        cbFilterOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filterOption = String.valueOf(cbFilterOption.getSelectedItem());
                if (filterOption.equals("between")) {
                    enableTfUpperValue();
                } else  {
                    disableTfUpperValue();
                }
            }
        });
    }

    private void enableTfUpperValue() {
        tfFilterUpperValue.setEnabled(true);
        tfFilterUpperValue.setEditable(true);
    }

    private void disableTfUpperValue() {
        tfFilterUpperValue.setText("");
        tfFilterUpperValue.setEnabled(false);
        tfFilterUpperValue.setEditable(false);
    }

    @Override
    public boolean tfCheck() {
        return false;
    }

    @Override
    public void addMouseListener(MouseListener ml) {
    }


    @Override
    public void reset() {

    }

    @Override
    public void setFields(Object[] rowValues) {

    }

    @Override
    public Object[] getEntity() {
        return new Object[] {
                tfSsn.getText(),
                tfFirstName.getText(),
                tfLastName.getText(),
                tfType.getText(),
                tfBD.getText(),
                tfStartDate.getText(),
                tfHotelID.getText(),
                tfSalary.getText(),
                tfPhoneNum.getText(),
                tfEmail.getText(),
                tfGender.getText(),
                tfStreet.getText(),
                tfNo.getText(),
                tfApartment.getText(),
                tfZipcode.getText()
        };
    }


    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlData = new JScrollPane();
        tblEmployees = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        textArea1 = new JTextArea();
        pnlFilter = new JPanel();
        cbColumnOption = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        lblFilterInput = new JLabel();
        btnApplyFilter = new JButton();
        tfFilterValue = new JTextField();
        tfFilterUpperValue = new JTextField();
        label8 = new JLabel();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        tfSsn = new JTextField();
        tfFirstName = new JTextField();
        tfLastName = new JTextField();
        tfType = new JTextField();
        tfBD = new JTextField();
        tfStartDate = new JTextField();
        tfHotelID = new JTextField();
        tfSalary = new JTextField();
        tfPhoneNum = new JTextField();
        tfEmail = new JTextField();
        tfGender = new JTextField();
        tfStreet = new JTextField();
        tfNo = new JTextField();
        tfApartment = new JTextField();
        tfZipcode = new JTextField();
        btnOK = new JButton();
        btnCancel = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
        .border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder
        .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
        awt.Font.BOLD,12),java.awt.Color.red), getBorder()))
        ; addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
        ;
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblEmployees ----
            tblEmployees.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, "", null, null, null, "", null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "ssn", "firstname", "lastname", "type", "bd", "years", "hotel_id", "salary", "phone_num", "email", "gender", "street", "no", "apartment", "zip_code"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Double.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            tblEmployees.setAutoCreateRowSorter(true);
            pnlData.setViewportView(tblEmployees);
        }
        add(pnlData, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(450, 0));
                pnlSelection.setLayout(null);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Employees");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(20, 125, 100, 50);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Employees");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(125, 125, 100, 50);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Employees");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(230, 125, 100, 50);

                //---- textArea1 ----
                textArea1.setText("Please choose a row to delete or update an employee or press add to add new one:");
                textArea1.setOpaque(false);
                textArea1.setWrapStyleWord(true);
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                textArea1.setEnabled(false);
                textArea1.setSelectionColor(Color.black);
                textArea1.setDisabledTextColor(Color.black);
                pnlSelection.add(textArea1);
                textArea1.setBounds(20, 55, 310, 75);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlSelection.getComponentCount(); i++) {
                        Rectangle bounds = pnlSelection.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlSelection.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlSelection.setMinimumSize(preferredSize);
                    pnlSelection.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlSelection);

            //======== pnlFilter ========
            {
                pnlFilter.setPreferredSize(new Dimension(450, 0));
                pnlFilter.setLayout(null);

                //---- cbColumnOption ----
                cbColumnOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "ssn",
                    "firstname",
                    "lastname",
                    "type",
                    "bd",
                    "years",
                    "hotel_id",
                    "salary",
                    "phone_num",
                    "email",
                    "gender",
                    "street",
                    "no",
                    "apartment",
                    "zip_code"
                }));
                cbColumnOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbColumnOption);
                cbColumnOption.setBounds(55, 30, 120, 40);

                //---- cbFilterOption ----
                cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None",
                    "=",
                    "!=",
                    "<",
                    ">",
                    "<=",
                    ">=",
                    "between",
                    "contains"
                }));
                cbFilterOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(185, 30, 120, 40);

                //---- lblFilterInput ----
                lblFilterInput.setText("Filter Input");
                pnlFilter.add(lblFilterInput);
                lblFilterInput.setBounds(60, 80, 245, 17);

                //---- btnApplyFilter ----
                btnApplyFilter.setText("Apply Filters");
                btnApplyFilter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApplyFilter.setActionCommand("Employees");
                btnApplyFilter.setName("applyFilter");
                pnlFilter.add(btnApplyFilter);
                btnApplyFilter.setBounds(55, 145, 245, 40);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(55, 100, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                tfFilterUpperValue.setEnabled(false);
                tfFilterUpperValue.setEditable(false);
                pnlFilter.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(185, 100, 115, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(175, 115, 15, label8.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlFilter.getComponentCount(); i++) {
                        Rectangle bounds = pnlFilter.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlFilter.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlFilter.setMinimumSize(preferredSize);
                    pnlFilter.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlFilter);
        }
        add(pnlControl, BorderLayout.SOUTH);

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),
            java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))
            throw new RuntimeException();}});
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("emp_ssn:");
            panel1.add(label1);
            label1.setBounds(10, 10, 90, 35);

            //---- label2 ----
            label2.setText("firstname:");
            panel1.add(label2);
            label2.setBounds(10, 50, 90, 35);

            //---- label3 ----
            label3.setText("lastname:");
            panel1.add(label3);
            label3.setBounds(10, 90, 90, 35);

            //---- label4 ----
            label4.setText("type:");
            panel1.add(label4);
            label4.setBounds(10, 130, 90, 35);

            //---- label5 ----
            label5.setText("birthdate:");
            panel1.add(label5);
            label5.setBounds(10, 170, 90, 35);

            //---- label6 ----
            label6.setText("start date:");
            panel1.add(label6);
            label6.setBounds(10, 210, 90, 35);

            //---- label7 ----
            label7.setText("hotel_id:");
            panel1.add(label7);
            label7.setBounds(10, 250, 90, 35);

            //---- label9 ----
            label9.setText("salary:");
            panel1.add(label9);
            label9.setBounds(10, 285, 90, 35);

            //---- label10 ----
            label10.setText("phone_num:");
            panel1.add(label10);
            label10.setBounds(10, 320, 90, 35);

            //---- label11 ----
            label11.setText("email:");
            panel1.add(label11);
            label11.setBounds(10, 360, 90, 35);

            //---- label12 ----
            label12.setText("gender:");
            panel1.add(label12);
            label12.setBounds(10, 400, 90, 35);

            //---- label13 ----
            label13.setText("street:");
            panel1.add(label13);
            label13.setBounds(10, 440, 90, 35);

            //---- label14 ----
            label14.setText("no:");
            panel1.add(label14);
            label14.setBounds(10, 480, 90, 35);

            //---- label15 ----
            label15.setText("apartment:");
            panel1.add(label15);
            label15.setBounds(10, 515, 90, 35);

            //---- label16 ----
            label16.setText("zip_code:");
            panel1.add(label16);
            label16.setBounds(10, 565, 90, 35);
            panel1.add(tfSsn);
            tfSsn.setBounds(100, 10, 310, 35);
            panel1.add(tfFirstName);
            tfFirstName.setBounds(100, 50, 310, 35);
            panel1.add(tfLastName);
            tfLastName.setBounds(100, 90, 310, 35);
            panel1.add(tfType);
            tfType.setBounds(100, 130, 310, 35);
            panel1.add(tfBD);
            tfBD.setBounds(100, 170, 310, 35);
            panel1.add(tfStartDate);
            tfStartDate.setBounds(100, 210, 310, 35);
            panel1.add(tfHotelID);
            tfHotelID.setBounds(100, 250, 310, 35);
            panel1.add(tfSalary);
            tfSalary.setBounds(100, 285, 310, 35);
            panel1.add(tfPhoneNum);
            tfPhoneNum.setBounds(100, 325, 310, 35);
            panel1.add(tfEmail);
            tfEmail.setBounds(100, 360, 310, 35);
            panel1.add(tfGender);
            tfGender.setBounds(100, 400, 310, 35);
            panel1.add(tfStreet);
            tfStreet.setBounds(100, 440, 310, 35);
            panel1.add(tfNo);
            tfNo.setBounds(100, 480, 310, 35);
            panel1.add(tfApartment);
            tfApartment.setBounds(100, 520, 310, 35);
            panel1.add(tfZipcode);
            tfZipcode.setBounds(100, 565, 310, 35);

            //---- btnOK ----
            btnOK.setText("OK");
            btnOK.setActionCommand("Employees");
            btnOK.setName("ok");
            panel1.add(btnOK);
            btnOK.setBounds(485, 505, 158, 55);

            //---- btnCancel ----
            btnCancel.setText("Cancel");
            btnCancel.setActionCommand("Employees");
            btnCancel.setName("ok");
            panel1.add(btnCancel);
            btnCancel.setBounds(485, 565, 158, 55);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane pnlData;
    private JTable tblEmployees;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextArea textArea1;
    private JPanel pnlFilter;
    private JComboBox<String> cbColumnOption;
    private JComboBox<String> cbFilterOption;
    private JLabel lblFilterInput;
    private JButton btnApplyFilter;
    private JTextField tfFilterValue;
    private JTextField tfFilterUpperValue;
    private JLabel label8;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JTextField tfSsn;
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField tfType;
    private JTextField tfBD;
    private JTextField tfStartDate;
    private JTextField tfHotelID;
    private JTextField tfSalary;
    private JTextField tfPhoneNum;
    private JTextField tfEmail;
    private JTextField tfGender;
    private JTextField tfStreet;
    private JTextField tfNo;
    private JTextField tfApartment;
    private JTextField tfZipcode;
    private JButton btnOK;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
