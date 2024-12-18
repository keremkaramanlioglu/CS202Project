package panels.receptionistPanels;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class BookingPanel extends Panel {

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

    private void cbSelectColumn(ActionEvent e) {
        if (((String)cbSelectColumn.getSelectedItem()).contains("Check")){
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None", "Checked in", "Checked out"}));
        } else if (((String)cbSelectColumn.getSelectedItem()).equals("Payment Status")) {
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None", "Completed", "Pending", "Canceled"}));
        } else if (((String)cbSelectColumn.getSelectedItem()).equals("Payment Method")) {
            cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None", "In Advance", "During Check-out"}));
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
        pnlBooking = new JScrollPane();
        tblBooking = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        tfSsn = new JTextField();
        tfPaymentStatus = new JTextField();
        tfPaymentMethod = new JTextField();
        tfRoomID = new JTextField();
        cbCheckIn = new JCheckBox();
        cbCheckOut = new JCheckBox();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfStartDate = new JTextField();
        tfEndDate = new JTextField();
        lblStartDate = new JLabel();
        lblEndDate = new JLabel();
        lblSsn = new JLabel();
        lblRoomID = new JLabel();
        lblPaymentStatus = new JLabel();
        lblPaymentMethod = new JLabel();
        btnGetRow = new JButton();
        pnlFilter = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        lblFilterValue = new JLabel();
        tfFilterValue = new JTextField();
        btnApply = new JButton();
        btnChooseDate = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
        swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
        . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
        , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder
        () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
        . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
        ( ) ;} } );
        setLayout(new BorderLayout());

        //======== pnlBooking ========
        {
            pnlBooking.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblBooking ----
            tblBooking.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "Book Id", "Customer SSN", "Room ID", "Payment Status", "Payment Method", "Start Date", "End Date", "Checked In", "Checked Out"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, Integer.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            pnlBooking.setViewportView(tblBooking);
        }
        add(pnlBooking, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(450, 0));
                pnlSelection.setLayout(null);
                pnlSelection.add(tfSsn);
                tfSsn.setBounds(15, 45, 100, 34);
                pnlSelection.add(tfPaymentStatus);
                tfPaymentStatus.setBounds(225, 45, 100, 34);
                pnlSelection.add(tfPaymentMethod);
                tfPaymentMethod.setBounds(330, 45, 100, 34);
                pnlSelection.add(tfRoomID);
                tfRoomID.setBounds(120, 45, 100, 34);

                //---- cbCheckIn ----
                cbCheckIn.setText("Checked in");
                cbCheckIn.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(cbCheckIn);
                cbCheckIn.setBounds(120, 95, 100, 34);

                //---- cbCheckOut ----
                cbCheckOut.setText("Checked out");
                cbCheckOut.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(cbCheckOut);
                cbCheckOut.setBounds(15, 95, 100, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Bookings");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(15, 135, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Bookings");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(120, 135, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Bookings");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(225, 135, 100, 60);

                //---- tfStartDate ----
                tfStartDate.setEditable(false);
                pnlSelection.add(tfStartDate);
                tfStartDate.setBounds(225, 100, 100, 34);

                //---- tfEndDate ----
                tfEndDate.setEditable(false);
                pnlSelection.add(tfEndDate);
                tfEndDate.setBounds(330, 100, 100, 34);

                //---- lblStartDate ----
                lblStartDate.setText("Start date:");
                lblStartDate.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblStartDate);
                lblStartDate.setBounds(225, 80, 100, 25);

                //---- lblEndDate ----
                lblEndDate.setText("End Date:");
                lblEndDate.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblEndDate);
                lblEndDate.setBounds(330, 80, 100, 25);

                //---- lblSsn ----
                lblSsn.setText("Customer SSN:");
                lblSsn.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblSsn);
                lblSsn.setBounds(15, 25, 100, 25);

                //---- lblRoomID ----
                lblRoomID.setText("Room ID:");
                lblRoomID.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblRoomID);
                lblRoomID.setBounds(120, 25, 100, 25);

                //---- lblPaymentStatus ----
                lblPaymentStatus.setText("Payment Status:");
                lblPaymentStatus.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblPaymentStatus);
                lblPaymentStatus.setBounds(225, 25, 100, 25);

                //---- lblPaymentMethod ----
                lblPaymentMethod.setText("Payment Method:");
                lblPaymentMethod.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblPaymentMethod);
                lblPaymentMethod.setBounds(330, 25, 100, 25);

                //---- btnGetRow ----
                btnGetRow.setText("Get Row");
                btnGetRow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnGetRow.setActionCommand("Bookings");
                btnGetRow.setName("get row");
                pnlSelection.add(btnGetRow);
                btnGetRow.setBounds(330, 135, 100, 60);

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
                    "Book ID",
                    "Customer SSN",
                    "Room ID",
                    "Payment Method",
                    "Payment Status",
                    "Start Date",
                    "End Date",
                    "Checked in",
                    "Checked out"
                }));
                cbSelectColumn.addActionListener(e -> cbSelectColumn(e));
                pnlFilter.add(cbSelectColumn);
                cbSelectColumn.setBounds(30, 25, 120, 45);

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
                    "Completed",
                    "Pending",
                    "Canceled",
                    "In Advance",
                    "During Check-out",
                    "Checked in",
                    "Checked out"
                }));
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(150, 25, 120, 45);

                //---- lblFilterValue ----
                lblFilterValue.setText("Filter Value:");
                pnlFilter.add(lblFilterValue);
                lblFilterValue.setBounds(30, 85, 245, 30);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(25, 110, 245, 40);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Bookings");
                btnApply.setName("apply");
                pnlFilter.add(btnApply);
                btnApply.setBounds(25, 150, 122, 60);

                //---- btnChooseDate ----
                btnChooseDate.setText("Choose Date");
                btnChooseDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnChooseDate.setActionCommand("Bookings");
                btnChooseDate.setName("date picker");
                pnlFilter.add(btnChooseDate);
                btnChooseDate.setBounds(150, 150, 122, 60);

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
    private JScrollPane pnlBooking;
    private JTable tblBooking;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JTextField tfSsn;
    private JTextField tfPaymentStatus;
    private JTextField tfPaymentMethod;
    private JTextField tfRoomID;
    private JCheckBox cbCheckIn;
    private JCheckBox cbCheckOut;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfStartDate;
    private JTextField tfEndDate;
    private JLabel lblStartDate;
    private JLabel lblEndDate;
    private JLabel lblSsn;
    private JLabel lblRoomID;
    private JLabel lblPaymentStatus;
    private JLabel lblPaymentMethod;
    private JButton btnGetRow;
    private JPanel pnlFilter;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel lblFilterValue;
    private JTextField tfFilterValue;
    private JButton btnApply;
    private JButton btnChooseDate;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
