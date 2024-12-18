/*
 * Created by JFormDesigner on Wed Dec 11 17:07:05 TRT 2024
 */

package panels.managerPanels;

import javax.swing.table.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class EmployeesPanel extends Panel {

    @Override
    public void addButtonListener(ActionListener al) {

    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    public EmployeesPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlData = new JScrollPane();
        tblEmployees = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        textArea1 = new JTextArea();
        btnGetRow = new JButton();
        textField1 = new JTextField();
        label1 = new JLabel();
        pnlFilter = new JPanel();
        cbColumnOption = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterInput = new JTextField();
        lblFilterInput = new JLabel();
        btnApplyFilter = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblEmployees ----
            tblEmployees.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "Ssn", "First Name", "Last Name", "Type", "Birth Date", "Years", "Hotel ID", "Salary", "Phone No", "E-mail", "Gender", "Street", "No", "Apartment", "Zip Code"
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
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(20, 125, 100, 50);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Employees");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(125, 125, 100, 50);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Employees");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(230, 125, 100, 50);

                //---- textArea1 ----
                textArea1.setText("Please choose an option to add, delete or update an employee:");
                textArea1.setOpaque(false);
                textArea1.setWrapStyleWord(true);
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                textArea1.setEnabled(false);
                textArea1.setSelectionColor(Color.black);
                textArea1.setDisabledTextColor(Color.black);
                pnlSelection.add(textArea1);
                textArea1.setBounds(20, 55, 310, 75);

                //---- btnGetRow ----
                btnGetRow.setText("Get Row");
                btnGetRow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnGetRow.setActionCommand("Employees");
                pnlSelection.add(btnGetRow);
                btnGetRow.setBounds(335, 125, 100, 50);

                //---- textField1 ----
                textField1.setEditable(false);
                pnlSelection.add(textField1);
                textField1.setBounds(335, 90, 100, 34);

                //---- label1 ----
                label1.setText("SSN");
                pnlSelection.add(label1);
                label1.setBounds(new Rectangle(new Point(370, 75), label1.getPreferredSize()));

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
                    "Ssn",
                    "First Name",
                    "Last Name",
                    "Type",
                    "Birth Date",
                    "Years",
                    "Hotel ID",
                    "Salary",
                    "Phone No",
                    "E-Mail",
                    "Gender",
                    "Street",
                    "No",
                    "Apartment",
                    "Zip Code"
                }));
                cbColumnOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbColumnOption);
                cbColumnOption.setBounds(55, 30, 120, 40);

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
                cbFilterOption.setBounds(185, 30, 120, 40);
                pnlFilter.add(tfFilterInput);
                tfFilterInput.setBounds(55, 95, 250, 40);

                //---- lblFilterInput ----
                lblFilterInput.setText("Filter Input");
                pnlFilter.add(lblFilterInput);
                lblFilterInput.setBounds(60, 80, 245, 17);

                //---- btnApplyFilter ----
                btnApplyFilter.setText("Apply Filters");
                btnApplyFilter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApplyFilter.setActionCommand("Employees");
                pnlFilter.add(btnApplyFilter);
                btnApplyFilter.setBounds(55, 145, 250, 40);

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
    private JTable tblEmployees;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextArea textArea1;
    private JButton btnGetRow;
    private JTextField textField1;
    private JLabel label1;
    private JPanel pnlFilter;
    private JComboBox<String> cbColumnOption;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterInput;
    private JLabel lblFilterInput;
    private JButton btnApplyFilter;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
