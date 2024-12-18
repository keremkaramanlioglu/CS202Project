/*
 * Created by JFormDesigner on Tue Dec 17 21:24:08 TRT 2024
 */

package panels.receptionistPanels;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kutay
 */
public class HouseKeepingPanel extends JPanel {
    public HouseKeepingPanel() {
        initComponents();
    }

    private void cbSelectColumn(ActionEvent e) {
        if (((String)cbSelectColumn.getSelectedItem()).equals("Status")) {
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None", "Pending", "Completed"}));
        } else if (((String)cbSelectColumn.getSelectedItem()).equals("None")) {
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None"}));
        } else {
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None", "==", "!=", "<", ">", "<=", ">=", "between", "contains"}));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlHouseKeeping = new JScrollPane();
        tblHouseKeeping = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfSsn = new JTextField();
        tfTime = new JTextField();
        tfRoomNumber = new JTextField();
        lblSsn = new JLabel();
        lblRoomNumber = new JLabel();
        lblTime = new JLabel();
        btnGetRow = new JButton();
        tfStatus = new JTextField();
        lblStatus = new JLabel();
        pnlFilter = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        lblFilterValue = new JLabel();
        tfFilterValue = new JTextField();
        btnApply = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
        javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
        . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
        .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans.
        PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
        equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlHouseKeeping ========
        {
            pnlHouseKeeping.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblHouseKeeping ----
            tblHouseKeeping.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null},
                    {null, null, null, null},
                },
                new String[] {
                    "House Keeper SSN", "Room Number", "Time", "Status"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            pnlHouseKeeping.setViewportView(tblHouseKeeping);
        }
        add(pnlHouseKeeping, BorderLayout.CENTER);

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
                btnAdd.setActionCommand("Housekeeping");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(15, 125, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Housekeeping");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(120, 125, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Housekeeping");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(225, 125, 100, 60);
                pnlSelection.add(tfSsn);
                tfSsn.setBounds(15, 65, 100, 34);
                pnlSelection.add(tfTime);
                tfTime.setBounds(225, 65, 100, 34);
                pnlSelection.add(tfRoomNumber);
                tfRoomNumber.setBounds(120, 65, 100, 34);

                //---- lblSsn ----
                lblSsn.setText("House Keeper SSN:");
                lblSsn.setFont(new Font("Inter", Font.BOLD, 10));
                pnlSelection.add(lblSsn);
                lblSsn.setBounds(15, 45, 100, 25);

                //---- lblRoomNumber ----
                lblRoomNumber.setText("Room Number:");
                lblRoomNumber.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblRoomNumber);
                lblRoomNumber.setBounds(120, 45, 100, 25);

                //---- lblTime ----
                lblTime.setText("Time:");
                lblTime.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblTime);
                lblTime.setBounds(225, 45, 100, 25);

                //---- btnGetRow ----
                btnGetRow.setText("Get Row");
                btnGetRow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnGetRow.setActionCommand("Housekeeping");
                pnlSelection.add(btnGetRow);
                btnGetRow.setBounds(330, 125, 100, 60);
                pnlSelection.add(tfStatus);
                tfStatus.setBounds(330, 65, 100, 34);

                //---- lblStatus ----
                lblStatus.setText("Status");
                lblStatus.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblStatus);
                lblStatus.setBounds(330, 45, 100, 25);

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

                //---- cbSelectColumn ----
                cbSelectColumn.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None",
                    "House Keeper SSN",
                    "Room Number",
                    "Time",
                    "Status"
                }));
                cbSelectColumn.addActionListener(e -> cbSelectColumn(e));
                pnlFilter.add(cbSelectColumn);
                cbSelectColumn.setBounds(30, 30, 120, 45);

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
                    "contains",
                    "Pending",
                    "Completed"
                }));
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(150, 30, 120, 45);

                //---- lblFilterValue ----
                lblFilterValue.setText("Filter Value:");
                pnlFilter.add(lblFilterValue);
                lblFilterValue.setBounds(30, 90, 245, 30);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(25, 115, 245, 40);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Housekeeping");
                pnlFilter.add(btnApply);
                btnApply.setBounds(25, 160, 245, 60);

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
    private JScrollPane pnlHouseKeeping;
    private JTable tblHouseKeeping;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfSsn;
    private JTextField tfTime;
    private JTextField tfRoomNumber;
    private JLabel lblSsn;
    private JLabel lblRoomNumber;
    private JLabel lblTime;
    private JButton btnGetRow;
    private JTextField tfStatus;
    private JLabel lblStatus;
    private JPanel pnlFilter;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel lblFilterValue;
    private JTextField tfFilterValue;
    private JButton btnApply;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
