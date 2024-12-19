/*
 * Created by JFormDesigner on Wed Dec 11 17:07:05 TRT 2024
 */

package panels.managerPanels;

import javax.swing.table.*;

import entities.Booking;
import entities.Employee;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author kerem
 */
public class EmployeesPanel extends Panel {

    @Override
    public void addButtonListener(ActionListener al) {
        btnUpdate.addActionListener(al);
        btnApplyFilter.addActionListener(al);
        btnDelete.addActionListener(al);
        btnAdd.addActionListener(al);
    }

    @Override
    public boolean tfCheck() {
        JTextField[] textFields = {
                tfSsn, tfFirstName, tfLastName, tfType, tfBD,
                tfStartDate, thHotelID, tfSalary, tfPhoneNum,
                tfEmail, tfGender, tfStreet, tfNo, tfApartment,
                tfZipcode
        };

        for (JTextField textField : textFields) {
            if (textField.getText().trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }



    @Override
    public void reset() {

    }

    @Override
    public void setFields(Object[] fieldValues) {
        tfSsn.setText(String.valueOf(fieldValues[0]));
        tfFirstName.setText(String.valueOf(fieldValues[1]));
        tfLastName.setText(String.valueOf(fieldValues[2]));
        tfType.setText(String.valueOf(fieldValues[3]));
        tfBD.setText(String.valueOf(fieldValues[4]));
        tfStartDate.setText(String.valueOf(fieldValues[5]));
        thHotelID.setText(String.valueOf(fieldValues[6]));
        tfSalary.setText(String.valueOf(fieldValues[7]));
        tfPhoneNum.setText(String.valueOf(fieldValues[8]));
        tfEmail.setText(String.valueOf(fieldValues[9]));
        tfGender.setText(String.valueOf(fieldValues[10]));
        tfStreet.setText(String.valueOf(fieldValues[11]));
        tfNo.setText(String.valueOf(fieldValues[12]));
        tfApartment.setText(String.valueOf(fieldValues[13]));
        tfZipcode.setText(String.valueOf(fieldValues[14]));
    }

    @Override
    public Object[] getEntity() {
        Object[] fieldValues = new Object[15];

        try {
            fieldValues[0] = Integer.parseInt(tfSsn.getText().trim());  // Hotel ID as Integer
            fieldValues[1] = tfFirstName.getText().trim();              // First Name as String
            fieldValues[2] = tfLastName.getText().trim();               // Last Name as String
            fieldValues[3] = tfType.getText().trim();                   // Type as String
            fieldValues[4] = tfBD.getText().trim();                     // Birth Date as String
            fieldValues[5] = Date.valueOf(tfStartDate.getText().trim()); // Start Date as java.sql.Date
            fieldValues[6] = Integer.parseInt(thHotelID.getText().trim());  // Hotel ID as Integer
            fieldValues[7] = Double.parseDouble(tfSalary.getText().trim());  // Salary as Double
            fieldValues[8] = tfPhoneNum.getText().trim();               // Phone Number as String
            fieldValues[9] = tfEmail.getText().trim();                  // Email as String
            fieldValues[10] = tfGender.getText().trim();                // Gender as String
            fieldValues[11] = tfStreet.getText().trim();                // Street as String
            fieldValues[12] = tfNo.getText().trim();                    // Number as String
            fieldValues[13] = tfApartment.getText().trim();             // Apartment as String
            fieldValues[14] = tfZipcode.getText().trim();               // Zipcode as String
        } catch (NumberFormatException e) {
            // Handle invalid number format exceptions, e.g. if parsing fails
            System.err.println("Error parsing number fields: " + e.getMessage());
            // Optionally, return null or some default value
            return null;
        } catch (IllegalArgumentException e) {
            // Handle invalid date format
            System.err.println("Invalid date format: " + e.getMessage());
            return null;
        }

        return fieldValues;
    }

    @Override
    public Panel getPanelByName(String panelName) {
        if (panelName.equals("InfoPanel")) {
            return (Panel) pnlInfo;
        }
        return null;
    }

    public EmployeesPanel() {
        initComponents();
        super.cbFilterColumn = cbColumnOption;
        super.cbFilterOption = cbFilterOption;
        super.tfFilterValue = tfFilterValue;
        super.tfFilterUpperValue = tfFilterUpperValue;
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

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.
        border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER
        ,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font
        .BOLD,12),java.awt.Color.red), getBorder())); addPropertyChangeListener(
        new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r"
        .equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblEmployees ----
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
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void initPnlInfo() {
        pnlInfo = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label16 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label15 = new JLabel();
        tfSsn = new JTextField();
        tfFirstName = new JTextField();
        tfLastName = new JTextField();
        tfType = new JTextField();
        tfBD = new JTextField();
        tfStartDate = new JTextField();
        thHotelID = new JTextField();
        tfSalary = new JTextField();
        tfPhoneNum = new JTextField();
        tfEmail = new JTextField();
        tfGender = new JTextField();
        tfStreet = new JTextField();
        tfNo = new JTextField();
        tfApartment = new JTextField();
        tfZipcode = new JTextField();
        btnOK = new JButton();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
            //======== pnlInfo ========
            {
                pnlInfo = new JPanel();
                pnlInfo.setLayout(null);

                //---- label1 ----
                label1.setText("emp_ssn:");
                pnlInfo.add(label1);
                label1.setBounds(10, 10, 90, 35);

                //---- label2 ----
                label2.setText("firstname:");
                pnlInfo.add(label2);
                label2.setBounds(10, 50, 90, 35);

                //---- label3 ----
                label3.setText("lastname:");
                pnlInfo.add(label3);
                label3.setBounds(10, 90, 90, 35);

                //---- label4 ----
                label4.setText("type:");
                pnlInfo.add(label4);
                label4.setBounds(10, 130, 90, 35);

                //---- label5 ----
                label5.setText("birthdate:");
                pnlInfo.add(label5);
                label5.setBounds(10, 170, 90, 35);

                //---- label6 ----
                label6.setText("start date:");
                pnlInfo.add(label6);
                label6.setBounds(10, 210, 90, 35);

                //---- label7 ----
                label7.setText("hotel_id:");
                pnlInfo.add(label7);
                label7.setBounds(10, 250, 90, 35);

                //---- label8 ----
                label16.setText("salary:");
                pnlInfo.add(label8);
                label16.setBounds(10, 285, 90, 35);

                //---- label9 ----
                label9.setText("phone_num:");
                pnlInfo.add(label9);
                label9.setBounds(10, 320, 90, 35);

                //---- label10 ----
                label10.setText("email:");
                pnlInfo.add(label10);
                label10.setBounds(10, 360, 90, 35);

                //---- label11 ----
                label11.setText("gender:");
                pnlInfo.add(label11);
                label11.setBounds(10, 400, 90, 35);

                //---- label12 ----
                label12.setText("street:");
                pnlInfo.add(label12);
                label12.setBounds(10, 440, 90, 35);

                //---- label13 ----
                label13.setText("no:");
                pnlInfo.add(label13);
                label13.setBounds(10, 480, 90, 35);

                //---- label14 ----
                label14.setText("apartment:");
                pnlInfo.add(label14);
                label14.setBounds(10, 515, 90, 35);

                //---- label15 ----
                label15.setText("zip_code:");
                pnlInfo.add(label15);
                label15.setBounds(10, 565, 90, 35);
                pnlInfo.add(tfSsn);
                tfSsn.setBounds(100, 10, 310, 35);
                pnlInfo.add(tfFirstName);
                tfFirstName.setBounds(100, 50, 310, 35);
                pnlInfo.add(tfLastName);
                tfLastName.setBounds(100, 90, 310, 35);
                pnlInfo.add(tfType);
                tfType.setBounds(100, 130, 310, 35);
                pnlInfo.add(tfBD);
                tfBD.setBounds(100, 170, 310, 35);
                pnlInfo.add(tfStartDate);
                tfStartDate.setBounds(100, 210, 310, 35);
                pnlInfo.add(thHotelID);
                thHotelID.setBounds(100, 250, 310, 35);
                pnlInfo.add(tfSalary);
                tfSalary.setBounds(100, 285, 310, 35);
                pnlInfo.add(tfPhoneNum);
                tfPhoneNum.setBounds(100, 325, 310, 35);
                pnlInfo.add(tfEmail);
                tfEmail.setBounds(100, 360, 310, 35);
                pnlInfo.add(tfGender);
                tfGender.setBounds(100, 400, 310, 35);
                pnlInfo.add(tfStreet);
                tfStreet.setBounds(100, 440, 310, 35);
                pnlInfo.add(tfNo);
                tfNo.setBounds(100, 480, 310, 35);
                pnlInfo.add(tfApartment);
                tfApartment.setBounds(100, 520, 310, 35);
                pnlInfo.add(tfZipcode);
                tfZipcode.setBounds(100, 565, 310, 35);

                //---- btnOK ----
                btnOK.setText("OK");
                pnlInfo.add(btnOK);
                btnOK.setBounds(425, 570, 158, 55);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Employees");
                btnAdd.setName("add");
                pnlInfo.add(btnAdd);
                btnAdd.setBounds(425, 515, 155, 50);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Employees");
                btnDelete.setName("delete");
                pnlInfo.add(btnDelete);
                btnDelete.setBounds(425, 460, 155, 50);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Employees");
                btnUpdate.setName("update");
                pnlInfo.add(btnUpdate);
                btnUpdate.setBounds(425, 405, 155, 50);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlInfo.getComponentCount(); i++) {
                        Rectangle bounds = pnlInfo.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlInfo.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlInfo.setMinimumSize(preferredSize);
                    pnlInfo.setPreferredSize(preferredSize);
                }
            }
    }

    private JPanel pnlInfo;
    private JButton btnOK;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label16;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JTextField tfSsn;
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JTextField tfType;
    private JTextField tfBD;
    private JTextField tfStartDate;
    private JTextField thHotelID;
    private JTextField tfSalary;
    private JTextField tfPhoneNum;
    private JTextField tfEmail;
    private JTextField tfGender;
    private JTextField tfStreet;
    private JTextField tfNo;
    private JTextField tfApartment;
    private JTextField tfZipcode;

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
