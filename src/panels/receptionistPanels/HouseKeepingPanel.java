/*
 * Created by JFormDesigner on Tue Dec 17 21:24:08 TRT 2024
 */

package panels.receptionistPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.*;
import java.sql.Timestamp;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author kutay
 */
public class HouseKeepingPanel extends Panel {

    private DefaultTableModel tableModel;

    public HouseKeepingPanel() {
        super();
        initComponents();
        initTable();
        super.cbFilterColumn = cbSelectColumn;
        super.cbFilterOption = cbFilterOption;
        super.tfFilterUpperValue = tfFilterUpperValue;
        super.tfFilterValue = tfFilterValue;
    }

    public String getPanelName() {
        return "ReceptionistPanel";
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "schedule_id", "housekeeper_ssn", "room_num", "cleaning_date", "service_status"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, String.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        tblData.setModel(tableModel);
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblData.getColumnCount()]; // 5
                int selectedRow = tblData.getSelectedRow();


                if (selectedRow != -1) {
                    for (int i = 1; i < tblData.getColumnCount(); i++) {
                        fields[i - 1] = tblData.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblData;
        super.model = tableModel;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnUpdate.addActionListener(al);
        btnDelete.addActionListener(al);
        btnAdd.addActionListener(al);
        btnApply.addActionListener(al);
    }
    @Override
    public boolean tfCheck() {
        return !tfRoomNum.getText().isEmpty() && !tfSsn.getText().isEmpty() && !tfTime.getText().equals("Choose a Date!");
    }
    @Override
    public void addMouseListener(MouseListener ml) {
        tfTime.addMouseListener(ml);
    }
    @Override
    public void reset() {

    }
    @Override
    public void setFields(Object[] rowValues) {
        tfSsn.setText(String.valueOf(rowValues[0]));
        tfRoomNum.setText(String.valueOf(rowValues[1]));
        tfTime.setText(String.valueOf(rowValues[2]));
        cbStatus.setSelectedItem(rowValues[3]);
    }
    @Override
    public Object[] getEntity() {
//        if (!tfCheck()) {
//            JOptionPane.showMessageDialog(this, "Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }

        Object[] rowValues = new Object[5];
        rowValues[0] = tfSsn.getText();
        rowValues[1] = null;
        rowValues[2] = null;
        rowValues[3] = tfTime.getText();
        rowValues[4] = String.valueOf(cbStatus.getSelectedItem());
        return rowValues;
    }

    @Override
    public Object[] getSelectedRow() {
        if (table == null) return null;
        int rowIndex = table.getSelectedRow();
        int columnCount = table.getColumnCount();
        Object[] rowValues = new Object[columnCount + 1];

        boolean b = false;

        if (rowIndex != -1) {
            for (int col = 0; col < columnCount + 1; col++) {
                if (col == 2) {
                    b = true;
                    col += 2;
                    continue;
                }
                rowValues[col] = table.getValueAt(rowIndex, (b ? col - 1 : col));
            }
        } else {
            return null;
        }
        return rowValues;
    }

    public Object getRoomNum() {
        if (tfRoomNum.getText().isEmpty()) { JOptionPane.showMessageDialog(null, "Please enter a room number."); }
        return tfRoomNum.getText();
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlHouseKeeping = new JScrollPane();
        tblData = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfSsn = new JTextField();
        tfTime = new JTextField();
        tfRoomNum = new JTextField();
        lblSsn = new JLabel();
        lblRoomNumber = new JLabel();
        lblTime = new JLabel();
        lblStatus = new JLabel();
        textArea1 = new JTextArea();
        cbStatus = new JComboBox<>();
        pnlFilter = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        lblFilterValue = new JLabel();
        btnApply = new JButton();
        tfFilterValue = new JTextField();
        tfFilterUpperValue = new JTextField();
        label8 = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
        (0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border
        .TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt
        .Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
        propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException()
        ;}});
        setLayout(new BorderLayout());

        //======== pnlHouseKeeping ========
        {
            pnlHouseKeeping.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblData ----
            tblData.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                },
                new String[] {
                    "schedule_id", "housekeeper_ssn", "room_num", "cleaning_date", "service_status"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, Integer.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    true, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            tblData.setAutoCreateRowSorter(true);
            pnlHouseKeeping.setViewportView(tblData);
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
                btnAdd.setActionCommand("houseKeeping");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(15, 125, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("houseKeeping");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(120, 125, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("houseKeeping");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(225, 125, 100, 60);
                pnlSelection.add(tfSsn);
                tfSsn.setBounds(15, 65, 100, 34);

                //---- tfTime ----
                tfTime.setEditable(false);
                tfTime.setText("Choose a Date!");
                pnlSelection.add(tfTime);
                tfTime.setBounds(225, 65, 100, 34);
                pnlSelection.add(tfRoomNum);
                tfRoomNum.setBounds(120, 65, 100, 34);

                //---- lblSsn ----
                lblSsn.setText("House Keeper SSN:");
                lblSsn.setFont(new Font("Inter", Font.BOLD, 10));
                pnlSelection.add(lblSsn);
                lblSsn.setBounds(15, 45, 100, 25);

                //---- lblRoomNumber ----
                lblRoomNumber.setText("Room Num:");
                lblRoomNumber.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblRoomNumber);
                lblRoomNumber.setBounds(120, 45, 100, 25);

                //---- lblTime ----
                lblTime.setText("Cleaning Date:");
                lblTime.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblTime);
                lblTime.setBounds(225, 45, 100, 25);

                //---- lblStatus ----
                lblStatus.setText("Status:");
                lblStatus.setFont(new Font("Inter", Font.PLAIN, 12));
                pnlSelection.add(lblStatus);
                lblStatus.setBounds(330, 45, 100, 25);

                //---- textArea1 ----
                textArea1.setText("Please choose a row to update!");
                textArea1.setLineWrap(true);
                textArea1.setWrapStyleWord(true);
                pnlSelection.add(textArea1);
                textArea1.setBounds(330, 125, 100, 60);

                //---- cbStatus ----
                cbStatus.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Pending",
                    "Completed"
                }));
                pnlSelection.add(cbStatus);
                cbStatus.setBounds(330, 65, 95, 30);

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
                    "housekeeper_ssn",
                    "room_num",
                    "cleaning_date",
                    "service_status"
                }));
                pnlFilter.add(cbSelectColumn);
                cbSelectColumn.setBounds(30, 30, 120, 45);

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
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(150, 30, 120, 45);

                //---- lblFilterValue ----
                lblFilterValue.setText("Filter Value:");
                pnlFilter.add(lblFilterValue);
                lblFilterValue.setBounds(30, 90, 245, 30);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("houseKeeping");
                btnApply.setName("applyFilter");
                pnlFilter.add(btnApply);
                btnApply.setBounds(25, 160, 245, 60);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(25, 120, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(155, 120, 115, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(145, 135, 15, label8.getPreferredSize().height);

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
    private JScrollPane pnlHouseKeeping;
    private JTable tblData;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfSsn;
    private JTextField tfTime;
    private JTextField tfRoomNum;
    private JLabel lblSsn;
    private JLabel lblRoomNumber;
    private JLabel lblTime;
    private JLabel lblStatus;
    private JTextArea textArea1;
    private JComboBox<String> cbStatus;
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
