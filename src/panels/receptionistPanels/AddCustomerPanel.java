/*
 * Created by JFormDesigner on Wed Dec 11 20:10:58 TRT 2024
 */

package panels.receptionistPanels;

import panels.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.util.Objects;

/**
 * @author kerem
 */
public class AddCustomerPanel extends Panel {
    public AddCustomerPanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
    }

    @Override
    public boolean tfCheck() {
        return !tfGender.getText().isEmpty() && !tfPhoneNumber.getText().isEmpty() && !tfEmail.getText().isEmpty()
                && !tfSsn.getText().isEmpty() && !tfFirstName.getText().isEmpty() && !tfLastName.getText().isEmpty()
                && !tfBirthDate.getText().isEmpty() && !tfZipCode.getText().isEmpty();
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfBirthDate.addMouseListener(ml);
    }

    @Override
    public void reset() {
        // TODO reset the components
    }

    @Override
    public void setFields(Object[] rowValues) {

    }

    @Override
    public Object[] getEntity() {
        if (!tfCheck()) {
            JOptionPane.showMessageDialog(this, "Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }


        return new Object[] {
                tfSsn.getText(),
                tfFirstName.getText(),
                tfLastName.getText(),
                Date.valueOf(tfBirthDate.getText()),
                tfEmail.getText(),
                tfPhoneNumber.getText(),
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
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        lblfirstName = new JLabel();
        tfFirstName = new JTextField();
        lblLastName = new JLabel();
        tfLastName = new JTextField();
        lblSsn = new JLabel();
        tfSsn = new JTextField();
        lblBirthDate = new JLabel();
        tfBirthDate = new JTextField();
        lblEmail = new JLabel();
        tfEmail = new JTextField();
        lblPhoneNumber = new JLabel();
        tfPhoneNumber = new JTextField();
        lblGender = new JLabel();
        tfGender = new JTextField();
        lblZipCode = new JLabel();
        tfZipCode = new JTextField();
        btnAdd = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
        javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax
        . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
        . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .
        PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .
        equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
        setLayout(null);

        //---- lblfirstName ----
        lblfirstName.setText("First Name:");
        add(lblfirstName);
        lblfirstName.setBounds(150, 50, 200, 22);

        //---- tfFirstName ----
        tfFirstName.setEditable(false);
        tfFirstName.setSelectionColor(new Color(0x666666));
        tfFirstName.setForeground(new Color(0x333333));
        add(tfFirstName);
        tfFirstName.setBounds(165, 80, 200, 40);

        //---- lblLastName ----
        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(160, 175, 195, 22);

        //---- tfLastName ----
        tfLastName.setEditable(false);
        add(tfLastName);
        tfLastName.setBounds(170, 200, 200, 40);

        //---- lblSsn ----
        lblSsn.setText("Ssn:");
        add(lblSsn);
        lblSsn.setBounds(150, 295, 195, 22);

        //---- tfSsn ----
        tfSsn.setEditable(false);
        add(tfSsn);
        tfSsn.setBounds(170, 315, 200, 40);

        //---- lblBirthDate ----
        lblBirthDate.setText("Birth Date:");
        add(lblBirthDate);
        lblBirthDate.setBounds(155, 420, 195, 22);

        //---- tfBirthDate ----
        tfBirthDate.setText("Choose a Date!");
        tfBirthDate.setName("dateChooser");
        tfBirthDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tfBirthDate.setEditable(false);
        add(tfBirthDate);
        tfBirthDate.setBounds(170, 440, 200, 40);

        //---- lblEmail ----
        lblEmail.setText("E-Mail:");
        add(lblEmail);
        lblEmail.setBounds(610, 40, 200, 22);

        //---- tfEmail ----
        tfEmail.setEditable(false);
        add(tfEmail);
        tfEmail.setBounds(625, 70, 200, 40);

        //---- lblPhoneNumber ----
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(605, 175, 200, 22);

        //---- tfPhoneNumber ----
        tfPhoneNumber.setEditable(false);
        add(tfPhoneNumber);
        tfPhoneNumber.setBounds(630, 195, 200, 40);

        //---- lblGender ----
        lblGender.setText("Gender:");
        add(lblGender);
        lblGender.setBounds(605, 295, 200, 22);

        //---- tfGender ----
        tfGender.setEditable(false);
        add(tfGender);
        tfGender.setBounds(635, 315, 200, 40);

        //---- lblZipCode ----
        lblZipCode.setText("Zip Code:");
        add(lblZipCode);
        lblZipCode.setBounds(605, 415, 195, 22);

        //---- tfZipCode ----
        tfZipCode.setEditable(false);
        add(tfZipCode);
        tfZipCode.setBounds(635, 435, 200, 40);

        //---- btnAdd ----
        btnAdd.setText("Add");
        btnAdd.setActionCommand("Profile_Edit");
        btnAdd.setName("edit");
        add(btnAdd);
        btnAdd.setBounds(370, 530, 200, 40);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JLabel lblfirstName;
    private JTextField tfFirstName;
    private JLabel lblLastName;
    private JTextField tfLastName;
    private JLabel lblSsn;
    private JTextField tfSsn;
    private JLabel lblBirthDate;
    private JTextField tfBirthDate;
    private JLabel lblEmail;
    private JTextField tfEmail;
    private JLabel lblPhoneNumber;
    private JTextField tfPhoneNumber;
    private JLabel lblGender;
    private JTextField tfGender;
    private JLabel lblZipCode;
    private JTextField tfZipCode;
    private JButton btnAdd;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
