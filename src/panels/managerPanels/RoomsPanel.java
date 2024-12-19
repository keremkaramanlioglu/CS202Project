/*
 * Created by JFormDesigner on Wed Dec 11 17:06:06 TRT 2024
 */

package panels.managerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class RoomsPanel extends Panel {

    private DefaultTableModel model1;

    public RoomsPanel() {
        super();
        initComponents();
        initTable();
        super.cbFilterColumn = cbSelectColumn;
        super.cbFilterOption = cbFilterOption;
        super.tfFilterUpperValue = tfFilterUpperValue;
        super.tfFilterValue = tfFilterValue;
    }

    private void initTable() {
        model1 = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "room_id", "hotel_id", "room_num", "room_type", "room_size", "room_price", "capacity"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, Integer.class, Integer.class, String.class, Float.class, Float.class, String.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        table1.setModel(model1);
        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[table1.getColumnCount()];
                int selectedRow = table1.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = table1.getValueAt(selectedRow, i + 1);
                    }
                }
                setFields(fields);
            }
        });
        super.table = table1;
        super.model = model1;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnDelete.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnFilter.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {
        tfRoomNum.setText("");
        tfRoomType.setText("");
        tfFilterValue.setText("");
        tfCapacity.setText("");
        tfRoomSize.setText("");
        tfRoomPrice.setText("");
        cbFilterOption.setSelectedIndex(0);
        cbSelectColumn.setSelectedIndex(0);
    } // comment

    @Override
    public void setFields(Object[] rowValues) {
        tfHotelID.setText(String.valueOf(rowValues[0]));
        tfRoomNum.setText(String.valueOf(rowValues[1]));
        tfRoomType.setText(String.valueOf(rowValues[2]));
        tfRoomSize.setText(String.valueOf(rowValues[3]));
        tfRoomPrice.setText(String.valueOf(rowValues[4]));
        tfCapacity.setText(String.valueOf(rowValues[5]));
    }

    @Override
    public Object[] getEntity() {
        if (!tfCheck()) {
            JOptionPane.showMessageDialog(this, "Please enter all required fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }


        return new Object[] {
                Integer.parseInt(tfHotelID.getText()),
                tfRoomNum.getText(),
                tfRoomType.getText(),
                Integer.parseInt(tfRoomSize.getText()),
                Double.parseDouble(tfRoomPrice.getText()),
                tfCapacity.getText()
        };
    }

    public boolean tfCheck() {
        return !tfHotelID.getText().isEmpty() && !tfRoomNum.getText().isEmpty()
                && !tfRoomPrice.getText().isEmpty() && !tfRoomSize.getText().isEmpty() && !tfCapacity.getText().isEmpty();
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        controlPanel = new JPanel();
        selectionPanel = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfRoomNum = new JTextField();
        tfRoomType = new JTextField();
        tfRoomSize = new JTextField();
        tfCapacity = new JTextField();
        tfHotelID = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textArea1 = new JTextArea();
        tfRoomPrice = new JTextField();
        label7 = new JLabel();
        filterPanel = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        label6 = new JLabel();
        btnFilter = new JButton();
        tfFilterValue = new JTextField();
        tfFilterUpperValue = new JTextField();
        label8 = new JLabel();

        //======== this ========
        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "room_id", "hotel_id", "room_num", "room_type", "room_size", "room_price", "capacity"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, Integer.class, String.class, String.class, Double.class, Double.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false
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
            table1.setPreferredSize(new Dimension(525, 400));
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1, BorderLayout.CENTER);

        //======== controlPanel ========
        {
            controlPanel.setPreferredSize(new Dimension(750, 230));
            controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

            //======== selectionPanel ========
            {
                selectionPanel.setPreferredSize(new Dimension(470, 89));
                selectionPanel.setLayout(null);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnAdd.setActionCommand("Rooms");
                btnAdd.setName("add");
                selectionPanel.add(btnAdd);
                btnAdd.setBounds(20, 150, 130, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Rooms");
                btnDelete.setName("delete");
                selectionPanel.add(btnDelete);
                btnDelete.setBounds(160, 150, 130, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Rooms");
                btnUpdate.setName("update");
                selectionPanel.add(btnUpdate);
                btnUpdate.setBounds(300, 150, 130, 60);

                //---- tfRoomNum ----
                tfRoomNum.setToolTipText("Room Type");
                selectionPanel.add(tfRoomNum);
                tfRoomNum.setBounds(125, 55, 100, 34);

                //---- tfRoomType ----
                tfRoomType.setToolTipText("Room Size");
                selectionPanel.add(tfRoomType);
                tfRoomType.setBounds(230, 55, 100, 34);

                //---- tfRoomSize ----
                tfRoomSize.setToolTipText("Room Price");
                selectionPanel.add(tfRoomSize);
                tfRoomSize.setBounds(335, 55, 100, 34);

                //---- tfCapacity ----
                tfCapacity.setToolTipText("Capacity");
                selectionPanel.add(tfCapacity);
                tfCapacity.setBounds(440, 55, 100, 34);

                //---- tfHotelID ----
                tfHotelID.setToolTipText("Room Number");
                selectionPanel.add(tfHotelID);
                tfHotelID.setBounds(20, 55, 100, 34);

                //---- label1 ----
                label1.setText("Room Number:");
                selectionPanel.add(label1);
                label1.setBounds(125, 35, 90, 25);

                //---- label2 ----
                label2.setText("Hotel ID:");
                selectionPanel.add(label2);
                label2.setBounds(20, 35, 90, 25);

                //---- label3 ----
                label3.setText("Room Type:");
                selectionPanel.add(label3);
                label3.setBounds(230, 35, 90, 25);

                //---- label4 ----
                label4.setText("Room Size:");
                selectionPanel.add(label4);
                label4.setBounds(335, 35, 90, 25);

                //---- label5 ----
                label5.setText("Room Price:");
                selectionPanel.add(label5);
                label5.setBounds(20, 90, 90, 25);

                //---- textArea1 ----
                textArea1.setText("Please choose a row to update!");
                textArea1.setLineWrap(true);
                textArea1.setWrapStyleWord(true);
                selectionPanel.add(textArea1);
                textArea1.setBounds(435, 150, 100, 60);

                //---- tfRoomPrice ----
                tfRoomPrice.setToolTipText("Capacity");
                selectionPanel.add(tfRoomPrice);
                tfRoomPrice.setBounds(20, 105, 100, 34);

                //---- label7 ----
                label7.setText("Capacity:");
                selectionPanel.add(label7);
                label7.setBounds(435, 35, 90, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < selectionPanel.getComponentCount(); i++) {
                        Rectangle bounds = selectionPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = selectionPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    selectionPanel.setMinimumSize(preferredSize);
                    selectionPanel.setPreferredSize(preferredSize);
                }
            }
            controlPanel.add(selectionPanel);

            //======== filterPanel ========
            {
                filterPanel.setLayout(null);

                //---- cbSelectColumn ----
                cbSelectColumn.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None",
                    "room_id",
                    "hotel_id",
                    "room_num",
                    "room_type",
                    "room_size",
                    "room_price",
                    "capacity"
                }));
                cbSelectColumn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                filterPanel.add(cbSelectColumn);
                cbSelectColumn.setBounds(40, 35, 120, 45);

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
                cbFilterOption.setEnabled(false);
                filterPanel.add(cbFilterOption);
                cbFilterOption.setBounds(165, 35, 120, 45);

                //---- label6 ----
                label6.setText("Filter Value:");
                filterPanel.add(label6);
                label6.setBounds(50, 85, 225, 30);

                //---- btnFilter ----
                btnFilter.setText("Apply");
                btnFilter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnFilter.setName("applyFilter");
                btnFilter.setActionCommand("Rooms");
                filterPanel.add(btnFilter);
                btnFilter.setBounds(40, 150, 245, 60);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                filterPanel.add(tfFilterValue);
                tfFilterValue.setBounds(40, 110, 115, 40);

                //---- tfFilterUpperValue ----
                tfFilterUpperValue.setToolTipText("Filter Input");
                filterPanel.add(tfFilterUpperValue);
                tfFilterUpperValue.setBounds(170, 110, 115, 40);

                //---- label8 ----
                label8.setText("-");
                filterPanel.add(label8);
                label8.setBounds(160, 125, 15, label8.getPreferredSize().height);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < filterPanel.getComponentCount(); i++) {
                        Rectangle bounds = filterPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = filterPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    filterPanel.setMinimumSize(preferredSize);
                    filterPanel.setPreferredSize(preferredSize);
                }
            }
            controlPanel.add(filterPanel);
        }
        add(controlPanel, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel controlPanel;
    private JPanel selectionPanel;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfRoomNum;
    private JTextField tfRoomType;
    private JTextField tfRoomSize;
    private JTextField tfCapacity;
    private JTextField tfHotelID;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextArea textArea1;
    private JTextField tfRoomPrice;
    private JLabel label7;
    private JPanel filterPanel;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JLabel label6;
    private JButton btnFilter;
    private JTextField tfFilterValue;
    private JTextField tfFilterUpperValue;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
