/*
 * Created by JFormDesigner on Wed Dec 18 13:03:37 TRT 2024
 */

package panels.receptionistPanels;

import java.awt.event.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kutay
 */
public class RoomsPanel extends Panel {
    public RoomsPanel() {
        initComponents();
    }

    private void cbSelectColumn(ActionEvent e) {
        if (((String)cbSelectColumn.getSelectedItem()).contains("Status")) {
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
        pnlRooms = new JScrollPane();
        tblrooms = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfRoomNumber = new JTextField();
        tfCleaningStatus = new JTextField();
        tfRoomStatus = new JTextField();
        lblRoomNumber = new JLabel();
        lblRoomstatus = new JLabel();
        lblCleaningStatus = new JLabel();
        pnlFilter = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        lblFilterValue = new JLabel();
        btnApply = new JButton();
        tfFilterValue = new JTextField();
        tfFilterUpperValue = new JTextField();
        label8 = new JLabel();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );
        setLayout(new BorderLayout());

        //======== pnlRooms ========
        {
            pnlRooms.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblrooms ----
            tblrooms.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                    {null, null, null},
                },
                new String[] {
                    "Room Number", "Room Status", "Cleaning Status"
                }
            ));
            pnlRooms.setViewportView(tblrooms);
        }
        add(pnlRooms, BorderLayout.CENTER);

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
                btnAdd.setActionCommand("Rooms");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(25, 100, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Rooms");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(130, 100, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Rooms");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(235, 100, 100, 60);
                pnlSelection.add(tfRoomNumber);
                tfRoomNumber.setBounds(25, 40, 100, 34);
                pnlSelection.add(tfCleaningStatus);
                tfCleaningStatus.setBounds(235, 40, 100, 34);
                pnlSelection.add(tfRoomStatus);
                tfRoomStatus.setBounds(130, 40, 100, 34);

                //---- lblRoomNumber ----
                lblRoomNumber.setText("Room Number:");
                lblRoomNumber.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblRoomNumber);
                lblRoomNumber.setBounds(25, 20, 100, 25);

                //---- lblRoomstatus ----
                lblRoomstatus.setText("Room Status:");
                lblRoomstatus.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblRoomstatus);
                lblRoomstatus.setBounds(130, 20, 100, 25);

                //---- lblCleaningStatus ----
                lblCleaningStatus.setText("Cleaning Status:");
                lblCleaningStatus.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblCleaningStatus);
                lblCleaningStatus.setBounds(235, 20, 100, 25);

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
                    "Room Number",
                    "Room Status",
                    "Cleaning Status"
                }));
                cbSelectColumn.addActionListener(e -> cbSelectColumn(e));
                pnlFilter.add(cbSelectColumn);
                cbSelectColumn.setBounds(35, 25, 120, 45);

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
                cbFilterOption.setBounds(155, 25, 120, 45);

                //---- lblFilterValue ----
                lblFilterValue.setText("Filter Value:");
                pnlFilter.add(lblFilterValue);
                lblFilterValue.setBounds(35, 85, 245, 30);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Rooms");
                btnApply.setName("apply");
                pnlFilter.add(btnApply);
                btnApply.setBounds(30, 155, 245, 60);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(30, 115, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(160, 115, 115, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(150, 130, 15, label8.getPreferredSize().height);

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

    @Override
    public void addButtonListener(ActionListener al) {

    }@Override
    public void addMouseListener(MouseListener ml) {

    }@Override
    public void reset() {

    }@Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlRooms;
    private JTable tblrooms;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfRoomNumber;
    private JTextField tfCleaningStatus;
    private JTextField tfRoomStatus;
    private JLabel lblRoomNumber;
    private JLabel lblRoomstatus;
    private JLabel lblCleaningStatus;
    private JPanel pnlFilter;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel lblFilterValue;
    private JButton btnApply;
    private JTextField tfFilterValue;
    private JTextField tfFilterUpperValue;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
