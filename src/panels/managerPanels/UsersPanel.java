/*
 * Created by JFormDesigner on Wed Dec 11 17:06:54 TRT 2024
 */

package panels.managerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class UsersPanel extends Panel {
    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnDelete.addActionListener(al);
        btnApplyFilter.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfBirthDate.addMouseListener(ml);
    }

    @Override
    public void reset() {
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    public UsersPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlData = new JScrollPane();
        tblUsers = new JTable();
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
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
        new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e"
        , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 )
        , java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setPreferredSize(new Dimension(900, 450));
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblUsers ----
            tblUsers.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, "", null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "ssn", "firstname", "lastname", "bd", "room_id", "email", "phone_num", "gender", "zip_code"
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
            pnlData.setViewportView(tblUsers);
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
                    "Ssn",
                    "First Name",
                    "Last Name",
                    "Birth Date",
                    "Room ID",
                    "E-mail",
                    "Phone Number",
                    "Gender",
                    "Zip Code"
                }));
                cbColumnOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbColumnOption);
                cbColumnOption.setBounds(45, 35, 120, 40);

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
                btnApplyFilter.setName("apply");
                pnlFilter.add(btnApplyFilter);
                btnApplyFilter.setBounds(45, 150, 245, 40);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(45, 105, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlData;
    private JTable tblUsers;
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