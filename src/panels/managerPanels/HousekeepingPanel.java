/*
 * Created by JFormDesigner on Wed Dec 11 17:07:28 TRT 2024
 */

package panels.managerPanels;

import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

import entities.CleaningSchedule;
import entities.Employee;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;

/**
 * @author kerem
 */
public class HousekeepingPanel extends Panel {

    DefaultTableModel tableModel;

    public HousekeepingPanel() {
        super();
        initComponents();
        initTable();
        super.cbFilterColumn = this.cbFilterColumn;
        super.cbFilterOption = this.cbFilterOption;
        super.tfFilterValue = tfFilterValue;
        super.tfFilterUpperValue = tfFilterUpperValue;
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "schedule_id", "housekeeper_ssn", "receptionist_ssn", "room_id", "cleaning_date", "service_status"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, Integer.class, String.class, String.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        dataTable.setModel(tableModel);
        dataTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[dataTable.getColumnCount()];
                int selectedRow = dataTable.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 1; i < dataTable.getColumnCount(); i++) {
                        fields[i - 1] = dataTable.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = this.dataTable;
        super.model = this.tableModel;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnDelete.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnApply.addActionListener(al);
    }

    @Override
    public boolean tfCheck() {
        return !(tfCleaningDate.getText().isEmpty()) && !(tfHousekeeperSsn.getText().isEmpty()) && !(tfReceptionistSsn.getText().isEmpty()) &&
                !(tfRoomID.getText().isEmpty()) && !(tfCleaningDate.getText().equals("Choose a Date!"));
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfCleaningDate.addMouseListener(ml);
    }

    @Override
    public void reset() {

    }

    @Override
    public void setFields(Object[] rowValues) {
        tfHousekeeperSsn.setText(String.valueOf(rowValues[0]));
        tfReceptionistSsn.setText(String.valueOf(rowValues[1]));
        tfRoomID.setText(String.valueOf(rowValues[2]));
        tfCleaningDate.setText(String.valueOf(rowValues[3]));
        cbCompleted.setSelected((!String.valueOf(rowValues[4]).equals("Pending")));
    }

    @Override
    public Object[] getEntity() {
//        if (!tfCheck()) {
//            JOptionPane.showMessageDialog(this, "Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }


        return new Object[] {
                tfHousekeeperSsn.getText(),
                tfReceptionistSsn.getText(),
                tfRoomID.getText(),
                tfCleaningDate.getText(),
                cbCompleted.isSelected() ? ("Completed") : ("Pending")
        };
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlData = new JPanel();
        scrollPane1 = new JScrollPane();
        dataTable = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        tfHousekeeperSsn = new JTextField();
        tfReceptionistSsn = new JTextField();
        tfRoomID = new JTextField();
        tfCleaningDate = new JTextField();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        cbCompleted = new JCheckBox();
        textArea1 = new JTextArea();
        pnlFilter = new JPanel();
        cbFilterColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        label1 = new JLabel();
        btnApply = new JButton();
        tfFilterValue = new JTextField();
        tfFilterUpperValue = new JTextField();
        label8 = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(1920, 1080));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
        new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e"
        , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 )
        , java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setPreferredSize(new Dimension(462, 600));
            pnlData.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {
                scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                //---- dataTable ----
                dataTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "schedule_id", "housekeeper_ssn", "receptionist_ssn", "room_id", "cleaning_date", "service_status"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Integer.class, String.class, String.class, Integer.class, String.class, String.class
                    };
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false
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
                dataTable.setPreferredScrollableViewportSize(new Dimension(450, 500));
                dataTable.setPreferredSize(new Dimension(450, 300));
                dataTable.setAutoCreateRowSorter(true);
                scrollPane1.setViewportView(dataTable);
            }
            pnlData.add(scrollPane1, BorderLayout.CENTER);
        }
        add(pnlData, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(400, 200));
                pnlSelection.setLayout(null);
                pnlSelection.add(tfHousekeeperSsn);
                tfHousekeeperSsn.setBounds(30, 30, 100, 34);
                pnlSelection.add(tfReceptionistSsn);
                tfReceptionistSsn.setBounds(135, 30, 100, 34);
                pnlSelection.add(tfRoomID);
                tfRoomID.setBounds(240, 30, 100, 34);

                //---- tfCleaningDate ----
                tfCleaningDate.setEditable(false);
                tfCleaningDate.setName("dateChooser");
                tfCleaningDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfCleaningDate.setText("Choose a Date!");
                pnlSelection.add(tfCleaningDate);
                tfCleaningDate.setBounds(345, 30, 100, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Housekeeping");
                btnAdd.setName("add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(15, 125, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Housekeeping");
                btnDelete.setName("delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(120, 125, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setActionCommand("Housekeeping");
                btnUpdate.setName("update");
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(225, 125, 100, 60);

                //---- label2 ----
                label2.setText("Housekeeper SSN:");
                pnlSelection.add(label2);
                label2.setBounds(25, 10, 85, 24);

                //---- label3 ----
                label3.setText("Recetionist SSN:");
                pnlSelection.add(label3);
                label3.setBounds(135, 15, 80, label3.getPreferredSize().height);

                //---- label4 ----
                label4.setText("Room ID:");
                pnlSelection.add(label4);
                label4.setBounds(235, 15, 80, label4.getPreferredSize().height);

                //---- label5 ----
                label5.setText("Cleaning Date:");
                pnlSelection.add(label5);
                label5.setBounds(340, 15, 91, label5.getPreferredSize().height);

                //---- cbCompleted ----
                cbCompleted.setText("Completed");
                cbCompleted.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlSelection.add(cbCompleted);
                cbCompleted.setBounds(30, 70, 105, 32);

                //---- textArea1 ----
                textArea1.setText("Please choose a row to update!");
                textArea1.setLineWrap(true);
                textArea1.setWrapStyleWord(true);
                pnlSelection.add(textArea1);
                textArea1.setBounds(325, 125, 100, 60);

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
                pnlFilter.setPreferredSize(new Dimension(400, 200));
                pnlFilter.setLayout(null);

                //---- cbFilterColumn ----
                cbFilterColumn.setModel(new DefaultComboBoxModel<>(new String[] {
                    "schedule_id",
                    "housekeeper_ssn",
                    "receptionist_ssn",
                    "room_id",
                    "cleaning_date",
                    "service_status"
                }));
                cbFilterColumn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbFilterColumn);
                cbFilterColumn.setBounds(25, 23, 98, cbFilterColumn.getPreferredSize().height);

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
                    "contains",
                    "Pending",
                    "Completed"
                }));
                cbFilterOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(135, 23, 105, cbFilterOption.getPreferredSize().height);

                //---- label1 ----
                label1.setText("Filter Value:");
                pnlFilter.add(label1);
                label1.setBounds(25, 59, 215, 23);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Housekeeping");
                btnApply.setName("applyFilter");
                pnlFilter.add(btnApply);
                btnApply.setBounds(25, 125, 215, 60);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(25, 80, 95, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(135, 80, 105, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(125, 95, 15, label8.getPreferredSize().height);

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
    private JPanel pnlData;
    private JScrollPane scrollPane1;
    private JTable dataTable;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JTextField tfHousekeeperSsn;
    private JTextField tfReceptionistSsn;
    private JTextField tfRoomID;
    private JTextField tfCleaningDate;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JCheckBox cbCompleted;
    private JTextArea textArea1;
    private JPanel pnlFilter;
    private JComboBox<String> cbFilterColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel label1;
    private JButton btnApply;
    private JTextField tfFilterValue;
    private JTextField tfFilterUpperValue;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
