/*
 * Created by JFormDesigner on Wed Dec 11 17:06:54 TRT 2024
 */

package panels.managerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Types;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

import static java.sql.JDBCType.NULL;


/**
 * @author kerem
 */
public class UsersPanel extends Panel {

    private DefaultTableModel model1;

    public UsersPanel() {
        initComponents();
        initTable();
        super.cbFilterColumn = cbColumnOption;
        super.cbFilterOption = cbFilterOption;
        super.tfFilterUpperValue = tfFilterUpperValue;
        super.tfFilterValue = tfFilterValue;
    }

    public String getPanelName() {
        return "ManagerPanel";
    }

    private void initTable() {
       model1 = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "ssn", "firstname", "lastname", "bd", "room_id", "email", "phone_num", "gender", "zip_code"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, Integer.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        tblData.setModel(model1);
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblData.getColumnCount()];
                int selectedRow = tblData.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblData.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblData;
        super.model = model1;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnDelete.addActionListener(al);
        btnApplyFilter.addActionListener(al);
        cbFilterOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filterOption = String.valueOf(cbFilterOption.getSelectedItem());
                if (filterOption.equals("between")) {
                    String filterColumn = String.valueOf(cbFilterColumn.getSelectedItem());
                    enableTfUpperValue();
                    if (filterColumn.equals("c_bd")) {
                        makeDate(tfFilterUpperValue);
                    }
                } else {
                    resetTf(tfFilterUpperValue);
                    disableTfUpperValue();
                }
            }
        });
        cbFilterColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filterColumn = String.valueOf(cbFilterColumn.getSelectedItem());
                if (filterColumn.equals("c_bd")) {
                    makeDate(tfFilterValue);
                } else {
                    resetTf(tfFilterValue);
                }
            }
        });
    }

    public JButton getBtnApplyFilter() {
        return btnApplyFilter;
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfBirthDate.addMouseListener(ml);
        tfFilterUpperValue.addMouseListener(ml);
        tfFilterValue.addMouseListener(ml);
    }

    @Override
    public void reset() {
    }

    @Override
    public void setFields(Object[] rowValues) {
        tfSsn.setText(String.valueOf(rowValues[0]));
        tfFirstName.setText(String.valueOf(rowValues[1]));
        tfLastName.setText(String.valueOf(rowValues[2]));
        tfBirthDate.setText(String.valueOf(rowValues[3]));
        tfRoomID.setText(String.valueOf(rowValues[4]));
        tfEmail.setText(String.valueOf(rowValues[5]));
        tfPhoneNo.setText(String.valueOf(rowValues[6]));
        tfGender.setText(String.valueOf(rowValues[7]));
        tfZipCode.setText(String.valueOf(rowValues[8]));
    }

    @Override
    public boolean tfCheck() {
        return !tfSsn.getText().isEmpty()
                && !tfBirthDate.getText().isEmpty() && !tfZipCode.getText().isEmpty() && !tfFirstName.getText().isEmpty()
                && !tfLastName.getText().isEmpty() && !tfEmail.getText().isEmpty() && !tfPhoneNo.getText().isEmpty()
                && !tfGender.getText().isEmpty();
    }

    private void enableTfUpperValue() {
        tfFilterUpperValue.setEditable(true);
        tfFilterUpperValue.setEnabled(true);
    }

    private void disableTfUpperValue() {
        tfFilterUpperValue.setText("");
        tfFilterUpperValue.setEditable(false);
        tfFilterUpperValue.setEnabled(false);
    }

    private void makeDate(JTextField tf) {
        tf.setText("Choose a Date!");
        tf.setEnabled(true);
        tf.setEditable(false);
    }

    private void resetTf(JTextField tf) {
        tf.setText("");
        tf.setEnabled(true);
        tf.setEditable(true);
    }

    @Override
    public Object[] getEntity() {
//        if (!tfCheck()) {
//            throw new IllegalArgumentException("Please enter all required fields!");
//        }

        return new Object[] {
                tfSsn.getText(),
                tfFirstName.getText(),
                tfLastName.getText(),
                tfBirthDate.getText(),
                ((tfRoomID.getText().isEmpty() || tfRoomID.getText().equals("0")) ? NULL : tfRoomID.getText()),
                tfEmail.getText(),
                tfPhoneNo.getText(),
                tfGender.getText(),
                tfZipCode.getText()
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
        tblData = new JTable();
        panel1 = new JPanel();
        pnlSelection = new JPanel();
        tfLastName = new JTextField();
        tfRoomID = new JTextField();
        tfFirstName = new JTextField();
        tfBirthDate = new JTextField();
        tfEmail = new JTextField();
        tfSsn = new JTextField();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        lblSsn = new JLabel();
        lblFirstName = new JLabel();
        lblLastName = new JLabel();
        lblBirthDate = new JLabel();
        lblRoomID = new JLabel();
        lblEmail = new JLabel();
        tfPhoneNo = new JTextField();
        tfGender = new JTextField();
        lblPhoneNo = new JLabel();
        lblGender = new JLabel();
        tfZipCode = new JTextField();
        lblZipCode = new JLabel();
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
        setPreferredSize(new Dimension(900, 700));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
        javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax
        . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
        . awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .
        PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "borde\u0072" .
        equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setPreferredSize(new Dimension(900, 450));
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblData ----
            tblData.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, "", null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "ssn", "firstname", "lastname", "bd", "room_id", "email", "phone_num", "gender", "zip_code"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false, false, false
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
            tblData.setAutoCreateRowSorter(true);
            pnlData.setViewportView(tblData);
        }
        add(pnlData, BorderLayout.CENTER);

        //======== panel1 ========
        {
            panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(350, 200));
                pnlSelection.setLayout(null);
                pnlSelection.add(tfLastName);
                tfLastName.setBounds(185, 20, 80, 34);
                pnlSelection.add(tfRoomID);
                tfRoomID.setBounds(100, 65, 80, 34);
                pnlSelection.add(tfFirstName);
                tfFirstName.setBounds(100, 20, 80, 34);

                //---- tfBirthDate ----
                tfBirthDate.setEditable(false);
                tfBirthDate.setText("Choose a Date!");
                tfBirthDate.setFont(new Font("Inter", Font.PLAIN, 11));
                tfBirthDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfBirthDate.setAction(null);
                tfBirthDate.setName("dateChooser");
                pnlSelection.add(tfBirthDate);
                tfBirthDate.setBounds(15, 65, 80, 34);
                pnlSelection.add(tfEmail);
                tfEmail.setBounds(185, 65, 80, 34);
                pnlSelection.add(tfSsn);
                tfSsn.setBounds(15, 20, 80, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Users");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(295, 10, 100, 50);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Users");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(295, 65, 100, 50);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Users");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(295, 120, 100, 50);

                //---- lblSsn ----
                lblSsn.setText("Ssn");
                pnlSelection.add(lblSsn);
                lblSsn.setBounds(20, 5, 75, lblSsn.getPreferredSize().height);

                //---- lblFirstName ----
                lblFirstName.setText("First Name");
                pnlSelection.add(lblFirstName);
                lblFirstName.setBounds(105, 5, 75, lblFirstName.getPreferredSize().height);

                //---- lblLastName ----
                lblLastName.setText("Last Name");
                pnlSelection.add(lblLastName);
                lblLastName.setBounds(185, 5, 75, lblLastName.getPreferredSize().height);

                //---- lblBirthDate ----
                lblBirthDate.setText("Birth Date");
                pnlSelection.add(lblBirthDate);
                lblBirthDate.setBounds(15, 50, 75, 17);

                //---- lblRoomID ----
                lblRoomID.setText("Room ID");
                pnlSelection.add(lblRoomID);
                lblRoomID.setBounds(100, 50, 75, 17);

                //---- lblEmail ----
                lblEmail.setText("E-mail");
                pnlSelection.add(lblEmail);
                lblEmail.setBounds(185, 50, 75, 17);
                pnlSelection.add(tfPhoneNo);
                tfPhoneNo.setBounds(15, 110, 80, 34);
                pnlSelection.add(tfGender);
                tfGender.setBounds(100, 110, 80, 34);

                //---- lblPhoneNo ----
                lblPhoneNo.setText("Phone No");
                pnlSelection.add(lblPhoneNo);
                lblPhoneNo.setBounds(15, 95, 75, 17);

                //---- lblGender ----
                lblGender.setText("Gender");
                pnlSelection.add(lblGender);
                lblGender.setBounds(95, 95, 75, 17);
                pnlSelection.add(tfZipCode);
                tfZipCode.setBounds(185, 110, 80, 34);

                //---- lblZipCode ----
                lblZipCode.setText("Zip Code");
                pnlSelection.add(lblZipCode);
                lblZipCode.setBounds(185, 95, 75, 17);

                //---- textArea1 ----
                textArea1.setText("Please choose a row to update!");
                textArea1.setLineWrap(true);
                textArea1.setWrapStyleWord(true);
                pnlSelection.add(textArea1);
                textArea1.setBounds(395, 115, 100, 60);

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
            panel1.add(pnlSelection);

            //======== pnlFilter ========
            {
                pnlFilter.setPreferredSize(new Dimension(350, 0));
                pnlFilter.setLayout(null);

                //---- cbColumnOption ----
                cbColumnOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "c_ssn",
                    "c_firstname",
                    "c_lastname",
                    "c_bd",
                    "c_room_id",
                    "c_email",
                    "c_phone_cum",
                    "c_gender",
                    "zip_code"
                }));
                cbColumnOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbColumnOption);
                cbColumnOption.setBounds(45, 35, 120, 40);

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
                cbFilterOption.setBounds(175, 35, 120, 40);

                //---- lblFilterInput ----
                lblFilterInput.setText("Filter Input");
                pnlFilter.add(lblFilterInput);
                lblFilterInput.setBounds(50, 85, 245, lblFilterInput.getPreferredSize().height);

                //---- btnApplyFilter ----
                btnApplyFilter.setText("Apply Filters");
                btnApplyFilter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApplyFilter.setActionCommand("Users");
                btnApplyFilter.setName("applyFilter");
                pnlFilter.add(btnApplyFilter);
                btnApplyFilter.setBounds(45, 150, 245, 40);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(45, 105, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                tfFilterUpperValue.setEditable(false);
                tfFilterUpperValue.setEnabled(false);
                pnlFilter.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(175, 105, 115, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(165, 120, 15, label8.getPreferredSize().height);

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
            panel1.add(pnlFilter);
        }
        add(panel1, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane pnlData;
    private JTable tblData;
    private JPanel panel1;
    private JPanel pnlSelection;
    private JTextField tfLastName;
    private JTextField tfRoomID;
    private JTextField tfFirstName;
    private JTextField tfBirthDate;
    private JTextField tfEmail;
    private JTextField tfSsn;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JLabel lblSsn;
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblBirthDate;
    private JLabel lblRoomID;
    private JLabel lblEmail;
    private JTextField tfPhoneNo;
    private JTextField tfGender;
    private JLabel lblPhoneNo;
    private JLabel lblGender;
    private JTextField tfZipCode;
    private JLabel lblZipCode;
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