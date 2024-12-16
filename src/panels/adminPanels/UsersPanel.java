/*
 * Created by JFormDesigner on Wed Dec 11 17:06:54 TRT 2024
 */

package panels.adminPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class UsersPanel extends Panel {
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

    }@Override
    public Panel getPanelByName(String panelName) {
        return null;
    } // comment

    public UsersPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlData = new JScrollPane();
        tblUsers = new JTable();
        pnlControl = new JPanel();
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
        pnlFilter = new JPanel();
        cbColumnOption = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterInput = new JTextField();
        lblFilterInput = new JLabel();
        btnApplyFilter = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(900, 700));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setPreferredSize(new Dimension(900, 450));

            //---- tblUsers ----
            tblUsers.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, "", null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "Ssn", "First Name", "Last Name", "Birth Date", "Room ID", "E-Mail", "Phone No", "Gender", "Zip Code"
                }
            ));
            pnlData.setViewportView(tblUsers);
        }
        add(pnlData, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(350, 200));
                pnlSelection.setLayout(null);
                pnlSelection.add(tfLastName);
                tfLastName.setBounds(15, 65, 80, 34);
                pnlSelection.add(tfRoomID);
                tfRoomID.setBounds(15, 110, 80, 34);
                pnlSelection.add(tfFirstName);
                tfFirstName.setBounds(100, 20, 80, 34);
                pnlSelection.add(tfBirthDate);
                tfBirthDate.setBounds(100, 65, 80, 34);
                pnlSelection.add(tfEmail);
                tfEmail.setBounds(100, 110, 80, 34);
                pnlSelection.add(tfSsn);
                tfSsn.setBounds(15, 20, 80, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(230, 20, 100, 50);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(230, 75, 100, 50);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(230, 130, 100, 50);

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
                lblLastName.setBounds(20, 50, 75, lblLastName.getPreferredSize().height);

                //---- lblBirthDate ----
                lblBirthDate.setText("Birth Date");
                pnlSelection.add(lblBirthDate);
                lblBirthDate.setBounds(105, 50, 75, 17);

                //---- lblRoomID ----
                lblRoomID.setText("Room ID");
                pnlSelection.add(lblRoomID);
                lblRoomID.setBounds(20, 95, 75, 17);

                //---- lblEmail ----
                lblEmail.setText("E-mail");
                pnlSelection.add(lblEmail);
                lblEmail.setBounds(105, 95, 75, 17);
                pnlSelection.add(tfPhoneNo);
                tfPhoneNo.setBounds(15, 155, 80, 34);
                pnlSelection.add(tfGender);
                tfGender.setBounds(100, 155, 80, 34);

                //---- lblPhoneNo ----
                lblPhoneNo.setText("Phone No");
                pnlSelection.add(lblPhoneNo);
                lblPhoneNo.setBounds(20, 140, 75, 17);

                //---- lblGender ----
                lblGender.setText("Gender");
                pnlSelection.add(lblGender);
                lblGender.setBounds(105, 140, 75, 17);
                pnlSelection.add(tfZipCode);
                tfZipCode.setBounds(55, 200, 80, 34);

                //---- lblZipCode ----
                lblZipCode.setText("Zip Code");
                pnlSelection.add(lblZipCode);
                lblZipCode.setBounds(60, 185, 75, 17);

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
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(175, 35, 120, 40);
                pnlFilter.add(tfFilterInput);
                tfFilterInput.setBounds(45, 100, 250, 40);

                //---- lblFilterInput ----
                lblFilterInput.setText("Filter Input");
                pnlFilter.add(lblFilterInput);
                lblFilterInput.setBounds(50, 85, 245, lblFilterInput.getPreferredSize().height);

                //---- btnApplyFilter ----
                btnApplyFilter.setText("Apply Filters");
                pnlFilter.add(btnApplyFilter);
                btnApplyFilter.setBounds(45, 150, 250, 40);

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlData;
    private JTable tblUsers;
    private JPanel pnlControl;
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
    private JPanel pnlFilter;
    private JComboBox<String> cbColumnOption;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterInput;
    private JLabel lblFilterInput;
    private JButton btnApplyFilter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
