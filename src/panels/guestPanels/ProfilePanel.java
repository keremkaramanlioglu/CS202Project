/*
 * Created by JFormDesigner on Wed Dec 11 20:10:58 TRT 2024
 */

package panels.guestPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class ProfilePanel extends Panel {
    public ProfilePanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        // TODO add button listeners to components
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
        btnEdit = new JButton();
        btnConfirm = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(null);

        //---- lblfirstName ----
        lblfirstName.setText("First Name:");
        add(lblfirstName);
        lblfirstName.setBounds(55, 50, 200, 22);

        //---- tfFirstName ----
        tfFirstName.setEditable(false);
        tfFirstName.setSelectionColor(new Color(0x666666));
        tfFirstName.setForeground(new Color(0x333333));
        add(tfFirstName);
        tfFirstName.setBounds(55, 75, 200, 40);

        //---- lblLastName ----
        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(60, 170, 195, 22);

        //---- tfLastName ----
        tfLastName.setEditable(false);
        add(tfLastName);
        tfLastName.setBounds(55, 195, 200, 40);

        //---- lblSsn ----
        lblSsn.setText("Ssn:");
        add(lblSsn);
        lblSsn.setBounds(60, 295, 195, 22);

        //---- tfSsn ----
        tfSsn.setEditable(false);
        add(tfSsn);
        tfSsn.setBounds(55, 320, 200, 40);

        //---- lblBirthDate ----
        lblBirthDate.setText("Birth Date:");
        add(lblBirthDate);
        lblBirthDate.setBounds(60, 420, 195, 22);

        //---- tfBirthDate ----
        tfBirthDate.setText("Choose a Date!");
        tfBirthDate.setName("dateChooser");
        tfBirthDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tfBirthDate.setEnabled(false);
        tfBirthDate.setEditable(false);
        add(tfBirthDate);
        tfBirthDate.setBounds(55, 445, 200, 40);

        //---- lblEmail ----
        lblEmail.setText("E-Mail:");
        add(lblEmail);
        lblEmail.setBounds(380, 50, 200, 22);

        //---- tfEmail ----
        tfEmail.setEditable(false);
        add(tfEmail);
        tfEmail.setBounds(380, 75, 200, 40);

        //---- lblPhoneNumber ----
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(380, 170, 200, 22);

        //---- tfPhoneNumber ----
        tfPhoneNumber.setEditable(false);
        add(tfPhoneNumber);
        tfPhoneNumber.setBounds(380, 195, 200, 40);

        //---- lblGender ----
        lblGender.setText("Gender:");
        add(lblGender);
        lblGender.setBounds(380, 295, 200, 22);

        //---- tfGender ----
        tfGender.setEditable(false);
        add(tfGender);
        tfGender.setBounds(380, 320, 200, 40);

        //---- lblZipCode ----
        lblZipCode.setText("Zip Code:");
        add(lblZipCode);
        lblZipCode.setBounds(385, 420, 195, 22);

        //---- tfZipCode ----
        tfZipCode.setEditable(false);
        add(tfZipCode);
        tfZipCode.setBounds(380, 445, 200, 40);

        //---- btnEdit ----
        btnEdit.setText("Edit");
        btnEdit.setActionCommand("Profile");
        add(btnEdit);
        btnEdit.setBounds(55, 540, 200, 40);

        //---- btnConfirm ----
        btnConfirm.setText("Confirm");
        btnConfirm.setActionCommand("Profile");
        add(btnConfirm);
        btnConfirm.setBounds(380, 540, 200, 40);

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
    private JButton btnEdit;
    private JButton btnConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
