/*
 * Created by JFormDesigner on Wed Dec 18 22:15:59 TRT 2024
 */

package panels.managerPanels;

import entities.Employee;
import entities.Hotel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.*;

/**
 * @author kerem
 */
public class EmpInfos extends JDialog {
    private Employee emp;
    JFrame parent;
    public EmpInfos(JFrame parent) {
        super(parent);
        emp = new Employee();
    }

    public boolean checkFields() {
        return !(tfSsn.getText().isEmpty()) && !(tfFirstName.getText().isEmpty()) && !(tfLastName.getText().isEmpty()) && !(tfEmail.getText().isEmpty())
                && !(tfSalary.getText().isEmpty()) && !(tfGender.getText().isEmpty()) && !(tfType.getText().isEmpty()) && !(tfBD.getText().isEmpty())
                && !(tfPhoneNum.getText().isEmpty()) && !(tfStartDate.getText().isEmpty());
    }

//    public checkInitiateEmp() {
//        emp.setEmp_bd(tfBD.getText());
//        emp.setEmp_type(tfType.getText());
//        emp.setEmp_ssn(tfSsn.getText());
//        emp.setYears(tf);
//    }

    public Employee getEmployee() {
        setVisible(true);
        initComponents();
        setPreferredSize(new Dimension(800, 600));
        btnOK.addActionListener(ae -> {
            if (checkFields()) {
                emp.setEmp_ssn(tfSsn.getText());
                emp.setEmp_type(tfType.getText());
                emp.setYears(Date.valueOf(tfStartDate.getText()));
                emp.setEmp_salary(Double.parseDouble(tfSalary.getText()));
                emp.setEmp_gender(tfGender.getText());
                emp.setEmp_firstname(tfFirstName.getText());
                emp.setEmp_lastname(tfLastName.getText());
                emp.setEmp_email(tfEmail.getText());
                emp.setEmp_hotel_id(Integer.parseInt(tfHotelID.getText()));
                emp.setZip_code(tfZipcode.getText());
                emp.setStreet(tfStreet.getText());
                emp.setNo(tfNo.getText());
                emp.setApartment(tfApartment.getText());
                emp.setEmp_bd(Date.valueOf(tfBD.getText()));
                emp.setEmp_phone_num(tfPhoneNum.getText());
                dispose();
                setVisible(false);
            } else {
                try {
                    throw new Exception("Please enter all required Fields!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        btnCancel.addActionListener(ae -> {
            dispose();
            setVisible(false);
        });
        if(!checkFields()) return null;
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
        tfSsn.setText(String.valueOf(emp.getEmp_ssn()));
        tfFirstName.setText(String.valueOf(emp.getEmp_firstname()));
        tfLastName.setText(String.valueOf(emp.getEmp_lastname()));
        tfType.setText(String.valueOf(emp.getEmp_type()));
        tfSalary.setText(String.valueOf(emp.getEmp_salary()));
        tfEmail.setText(String.valueOf(emp.getEmp_email()));
        tfGender.setText(String.valueOf(emp.getEmp_gender()));
        tfStreet.setText(String.valueOf(emp.getEmp_firstname()));
        tfNo.setText(String.valueOf(emp.getEmp_lastname()));
        tfApartment.setText(String.valueOf(emp.getEmp_bd()));
        tfZipcode.setText(String.valueOf(emp.getZip_code()));
        tfBD.setText(String.valueOf(emp.getEmp_bd()));
        tfPhoneNum.setText(String.valueOf(emp.getEmp_phone_num()));
        tfStartDate.setText(String.valueOf(emp.getYears()));
        tfHotelID.setText(String.valueOf(emp.getEmp_hotel_id()));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
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
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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

            //---- label8 ----
            label8.setText("salary:");
            panel1.add(label8);
            label8.setBounds(10, 285, 90, 35);

            //---- label9 ----
            label9.setText("phone_num:");
            panel1.add(label9);
            label9.setBounds(10, 320, 90, 35);

            //---- label10 ----
            label10.setText("email:");
            panel1.add(label10);
            label10.setBounds(10, 360, 90, 35);

            //---- label11 ----
            label11.setText("gender:");
            panel1.add(label11);
            label11.setBounds(10, 400, 90, 35);

            //---- label12 ----
            label12.setText("street:");
            panel1.add(label12);
            label12.setBounds(10, 440, 90, 35);

            //---- label13 ----
            label13.setText("no:");
            panel1.add(label13);
            label13.setBounds(10, 480, 90, 35);

            //---- label14 ----
            label14.setText("apartment:");
            panel1.add(label14);
            label14.setBounds(10, 515, 90, 35);

            //---- label15 ----
            label15.setText("zip_code:");
            panel1.add(label15);
            label15.setBounds(10, 565, 90, 35);
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
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
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
