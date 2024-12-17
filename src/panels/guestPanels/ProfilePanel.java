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

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
        setLayout(null);

        //---- lblfirstName ----
        lblfirstName.setText("First Name:");
        add(lblfirstName);
        lblfirstName.setBounds(55, 50, 200, 22);
        add(tfFirstName);
        tfFirstName.setBounds(55, 75, 200, 40);

        //---- lblLastName ----
        lblLastName.setText("Last Name:");
        add(lblLastName);
        lblLastName.setBounds(60, 180, 195, 22);
        add(tfLastName);
        tfLastName.setBounds(55, 205, 200, 40);

        //---- lblSsn ----
        lblSsn.setText("Ssn:");
        add(lblSsn);
        lblSsn.setBounds(60, 315, 195, 22);
        add(tfSsn);
        tfSsn.setBounds(55, 340, 200, 40);

        //---- lblBirthDate ----
        lblBirthDate.setText("Birth Date:");
        add(lblBirthDate);
        lblBirthDate.setBounds(60, 450, 195, 22);
        add(tfBirthDate);
        tfBirthDate.setBounds(55, 475, 200, 40);

        //---- lblEmail ----
        lblEmail.setText("E-Mail:");
        add(lblEmail);
        lblEmail.setBounds(380, 50, 200, 22);
        add(tfEmail);
        tfEmail.setBounds(380, 75, 200, 40);

        //---- lblPhoneNumber ----
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(380, 180, 200, 22);
        add(tfPhoneNumber);
        tfPhoneNumber.setBounds(380, 205, 200, 40);

        //---- lblGender ----
        lblGender.setText("Gender:");
        add(lblGender);
        lblGender.setBounds(380, 315, 200, 22);
        add(tfGender);
        tfGender.setBounds(380, 340, 200, 40);

        //---- lblZipCode ----
        lblZipCode.setText("Zip Code:");
        add(lblZipCode);
        lblZipCode.setBounds(385, 450, 195, 22);
        add(tfZipCode);
        tfZipCode.setBounds(380, 475, 200, 40);

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
