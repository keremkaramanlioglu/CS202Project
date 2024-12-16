/*
 * Created by JFormDesigner on Wed Dec 11 17:06:06 TRT 2024
 */

package panels.adminPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
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
    public void setSelectedButton(JButton b) {
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
    public void setCenterPanel(Panel panel) {

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
        btnBakarız = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfRoomType = new JTextField();
        tfRoomSize = new JTextField();
        tfRoomPrice = new JTextField();
        tfCapacity = new JTextField();
        tfRoomNum = new JTextField();
        filterPanel = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterValue = new JTextField();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== scrollPane1 ========
        {

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
            table1.setPreferredSize(new Dimension(525, 350));
            table1.setPreferredScrollableViewportSize(new Dimension(450, 200));
            scrollPane1.setViewportView(table1);
        }
        add(scrollPane1);

        //======== controlPanel ========
        {
            controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

            //======== selectionPanel ========
            {
                selectionPanel.setPreferredSize(new Dimension(470, 89));
                selectionPanel.setLayout(null);

                //---- btnAdd ----
                btnAdd.setText("Add");
                selectionPanel.add(btnAdd);
                btnAdd.setBounds(25, 55, 80, btnAdd.getPreferredSize().height);

                //---- btnBakarız ----
                btnBakarız.setText("bakar\u0131z");
                selectionPanel.add(btnBakarız);
                btnBakarız.setBounds(280, 55, 80, btnBakarız.getPreferredSize().height);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                selectionPanel.add(btnDelete);
                btnDelete.setBounds(110, 55, 80, btnDelete.getPreferredSize().height);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                selectionPanel.add(btnUpdate);
                btnUpdate.setBounds(195, 55, 80, btnUpdate.getPreferredSize().height);

                //---- tfRoomType ----
                tfRoomType.setToolTipText("Room Type");
                selectionPanel.add(tfRoomType);
                tfRoomType.setBounds(100, 10, 80, 34);

                //---- tfRoomSize ----
                tfRoomSize.setToolTipText("Room Size");
                selectionPanel.add(tfRoomSize);
                tfRoomSize.setBounds(180, 10, 80, 34);

                //---- tfRoomPrice ----
                tfRoomPrice.setToolTipText("Room Price");
                selectionPanel.add(tfRoomPrice);
                tfRoomPrice.setBounds(260, 10, 80, 34);

                //---- tfCapacity ----
                tfCapacity.setToolTipText("Capacity");
                selectionPanel.add(tfCapacity);
                tfCapacity.setBounds(340, 10, 80, 34);

                //---- tfRoomNum ----
                tfRoomNum.setToolTipText("Room Number");
                selectionPanel.add(tfRoomNum);
                tfRoomNum.setBounds(20, 10, 80, 34);

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
                    "Room Id",
                    "Room Number",
                    "Room Type",
                    "Room Size",
                    "Room Price",
                    "Capacity"
                }));
                filterPanel.add(cbSelectColumn);
                cbSelectColumn.setBounds(0, 10, 100, 30);

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
                filterPanel.add(cbFilterOption);
                cbFilterOption.setBounds(110, 10, 100, 30);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                filterPanel.add(tfFilterValue);
                tfFilterValue.setBounds(0, 55, 130, 30);

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
        add(controlPanel);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel controlPanel;
    private JPanel selectionPanel;
    private JButton btnAdd;
    private JButton btnBakarız;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfRoomType;
    private JTextField tfRoomSize;
    private JTextField tfRoomPrice;
    private JTextField tfCapacity;
    private JTextField tfRoomNum;
    private JPanel filterPanel;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterValue;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
