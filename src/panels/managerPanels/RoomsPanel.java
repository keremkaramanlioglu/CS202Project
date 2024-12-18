/*
 * Created by JFormDesigner on Wed Dec 11 17:06:06 TRT 2024
 */

package panels.managerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class RoomsPanel extends Panel {

    public RoomsPanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnDelete.addActionListener(al);
        btnUpdate.addActionListener(al);
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
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        controlPanel = new JPanel();
        selectionPanel = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfRoomType = new JTextField();
        tfRoomSize = new JTextField();
        tfRoomPrice = new JTextField();
        tfCapacity = new JTextField();
        tfRoomNum = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        btnGetRow = new JButton();
        filterPanel = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterValue = new JTextField();
        label6 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                },
                new String[] {
                    "Room ID", "Hotel Id", "Room Number", "Room Type", "Room Size", "Room Price", "Capacity"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, Integer.class, Integer.class, String.class, Float.class, Float.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
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
                selectionPanel.add(btnAdd);
                btnAdd.setBounds(20, 150, 130, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnDelete.setActionCommand("Rooms");
                selectionPanel.add(btnDelete);
                btnDelete.setBounds(160, 150, 130, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnUpdate.setActionCommand("Rooms");
                selectionPanel.add(btnUpdate);
                btnUpdate.setBounds(300, 150, 130, 60);

                //---- tfRoomType ----
                tfRoomType.setToolTipText("Room Type");
                selectionPanel.add(tfRoomType);
                tfRoomType.setBounds(125, 55, 100, 34);

                //---- tfRoomSize ----
                tfRoomSize.setToolTipText("Room Size");
                selectionPanel.add(tfRoomSize);
                tfRoomSize.setBounds(230, 55, 100, 34);

                //---- tfRoomPrice ----
                tfRoomPrice.setToolTipText("Room Price");
                selectionPanel.add(tfRoomPrice);
                tfRoomPrice.setBounds(335, 55, 100, 34);

                //---- tfCapacity ----
                tfCapacity.setToolTipText("Capacity");
                selectionPanel.add(tfCapacity);
                tfCapacity.setBounds(440, 55, 100, 34);

                //---- tfRoomNum ----
                tfRoomNum.setToolTipText("Room Number");
                selectionPanel.add(tfRoomNum);
                tfRoomNum.setBounds(20, 55, 100, 34);

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
                label5.setText("Capacity:");
                selectionPanel.add(label5);
                label5.setBounds(440, 35, 90, 25);

                //---- btnGetRow ----
                btnGetRow.setText("Get Row");
                btnGetRow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnGetRow.setActionCommand("Rooms");
                selectionPanel.add(btnGetRow);
                btnGetRow.setBounds(440, 150, 130, 60);

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
                    "Room Id",
                    "Hotel ID",
                    "Room Number",
                    "Room Type",
                    "Room Size",
                    "Room Price",
                    "Capacity"
                }));
                cbSelectColumn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                filterPanel.add(cbSelectColumn);
                cbSelectColumn.setBounds(40, 35, 120, 45);

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
                filterPanel.add(cbFilterOption);
                cbFilterOption.setBounds(165, 35, 120, 45);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                filterPanel.add(tfFilterValue);
                tfFilterValue.setBounds(45, 110, 235, 40);

                //---- label6 ----
                label6.setText("Filter Value:");
                filterPanel.add(label6);
                label6.setBounds(50, 85, 225, 30);

                //---- button1 ----
                button1.setText("Apply");
                button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                filterPanel.add(button1);
                button1.setBounds(45, 150, 235, 60);

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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel controlPanel;
    private JPanel selectionPanel;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfRoomType;
    private JTextField tfRoomSize;
    private JTextField tfRoomPrice;
    private JTextField tfCapacity;
    private JTextField tfRoomNum;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton btnGetRow;
    private JPanel filterPanel;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterValue;
    private JLabel label6;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
