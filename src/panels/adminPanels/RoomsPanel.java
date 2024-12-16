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
    }

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
        dataPanel = new JScrollPane();
        dataTable = new JTable();
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
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        filterPanel = new JPanel();
        cbRoomId = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterValue = new JTextField();
        label6 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== dataPanel ========
        {
            dataPanel.setBackground(new Color(0x666666));

            //---- dataTable ----
            dataTable.setModel(new DefaultTableModel(
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
            dataTable.setBackground(new Color(0x666666));
            dataTable.setForeground(Color.white);
            dataPanel.setViewportView(dataTable);
        }
        add(dataPanel);

        //======== controlPanel ========
        {
            controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

            //======== selectionPanel ========
            {
                selectionPanel.setPreferredSize(new Dimension(470, 89));
                selectionPanel.setBackground(new Color(0x666666));
                selectionPanel.setLayout(null);

                //---- btnAdd ----
                btnAdd.setText("Add");
                selectionPanel.add(btnAdd);
                btnAdd.setBounds(25, 65, 80, btnAdd.getPreferredSize().height);

                //---- btnBakarız ----
                btnBakarız.setText("bakar\u0131z");
                selectionPanel.add(btnBakarız);
                btnBakarız.setBounds(280, 65, 80, btnBakarız.getPreferredSize().height);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                selectionPanel.add(btnDelete);
                btnDelete.setBounds(110, 65, 80, btnDelete.getPreferredSize().height);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                selectionPanel.add(btnUpdate);
                btnUpdate.setBounds(195, 65, 80, btnUpdate.getPreferredSize().height);
                selectionPanel.add(tfRoomType);
                tfRoomType.setBounds(95, 20, 80, 34);
                selectionPanel.add(tfRoomSize);
                tfRoomSize.setBounds(180, 20, 80, 34);
                selectionPanel.add(tfRoomPrice);
                tfRoomPrice.setBounds(265, 20, 80, 34);
                selectionPanel.add(tfCapacity);
                tfCapacity.setBounds(350, 20, 80, 34);
                selectionPanel.add(tfRoomNum);
                tfRoomNum.setBounds(10, 20, 80, 34);

                //---- label1 ----
                label1.setText("Room Number:");
                label1.setFont(new Font("Inter", Font.PLAIN, 10));
                label1.setForeground(Color.white);
                label1.setPreferredSize(new Dimension(75, 15));
                selectionPanel.add(label1);
                label1.setBounds(10, 0, 75, 25);

                //---- label2 ----
                label2.setText("Room Type:");
                label2.setFont(new Font("Inter", Font.PLAIN, 10));
                label2.setForeground(Color.white);
                label2.setPreferredSize(new Dimension(75, 15));
                selectionPanel.add(label2);
                label2.setBounds(95, 0, 75, 25);

                //---- label3 ----
                label3.setText("Room Size:");
                label3.setFont(new Font("Inter", Font.PLAIN, 10));
                label3.setForeground(Color.white);
                selectionPanel.add(label3);
                label3.setBounds(180, 0, 75, 25);

                //---- label4 ----
                label4.setText("Room Price:");
                label4.setFont(new Font("Inter", Font.PLAIN, 10));
                label4.setForeground(Color.white);
                selectionPanel.add(label4);
                label4.setBounds(265, 0, 75, 25);

                //---- label5 ----
                label5.setText("Capacity:");
                label5.setFont(new Font("Inter", Font.PLAIN, 10));
                label5.setForeground(Color.white);
                selectionPanel.add(label5);
                label5.setBounds(350, 0, 75, 25);

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
                filterPanel.setBackground(new Color(0x666666));
                filterPanel.setLayout(null);

                //---- cbRoomId ----
                cbRoomId.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Room Id",
                    "Room Number",
                    "Room Type",
                    "Room Size",
                    "Room Price",
                    "Capacity"
                }));
                filterPanel.add(cbRoomId);
                cbRoomId.setBounds(0, 10, 100, 30);

                //---- cbFilterOption ----
                cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
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
                filterPanel.add(tfFilterValue);
                tfFilterValue.setBounds(0, 65, 130, 30);

                //---- label6 ----
                label6.setText("Filter Value:");
                label6.setFont(new Font("Inter", Font.PLAIN, 11));
                label6.setForeground(Color.white);
                filterPanel.add(label6);
                label6.setBounds(0, 40, 125, 25);

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
    private JScrollPane dataPanel;
    private JTable dataTable;
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
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPanel filterPanel;
    private JComboBox<String> cbRoomId;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterValue;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
