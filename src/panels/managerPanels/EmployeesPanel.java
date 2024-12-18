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
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {

    }

    public void setTableWithEmployees(ArrayList<Employee> emps) {
        // Define column names (adjust to match the fields in your Customer class)
        String[] columnNames = {"ssn", "firstname", "lastname", "type", "bd", "years", "hotel_id", "salary", "phone_num", "email", "gender", "street", "no", "apartment", "zip_code"};
        table = new JTable();
        // Create a table model with column names
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Loop through the customers list and add each as a row to the model
        for ( Employee emp : emps) {
            Object[] row = {
                    emp.getEmp_ssn(),
                    emp.getEmp_firstname(),
                    emp.getEmp_lastname(),
                    emp.getEmp_type(),
                    emp.getEmp_bd(),
                    emp.getYears(),
                    emp.getEmp_hotel_id(),
                    emp.getEmp_salary(),
                    emp.getEmp_phone_num(),
                    emp.getEmp_email(),
                    emp.getEmp_gender(),
                    emp.getStreet(),
                    emp.getNo(),
                    emp.getApartment(),
                    emp.getZip_code()
            };
            model.addRow(row);
        }

        // Set the table model to the JTable
        tblEmployees.setModel(model);
        tblEmployees.revalidate();
        tblEmployees.repaint();
        this.revalidate();
        this.repaint();
    }

    @Override
    public Panel getPanelByName(String panelName) {
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
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
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
                    Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Float.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
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
                    "None",
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
