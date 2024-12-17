/*
 * Created by JFormDesigner on Wed Dec 11 17:07:28 TRT 2024
 */

package panels.adminPanels;

import javax.swing.table.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class HousekeepingPanel extends Panel {
    public HousekeepingPanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnAdd.addActionListener(al);
        btnDelete.addActionListener(al);
        btnUpdate.addActionListener(al);
        btnApply.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfCleaningDate.addMouseListener(ml);
    }

    @Override
    public void reset() {

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
        checkBox1 = new JCheckBox();
        pnlFilter = new JPanel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        textField6 = new JTextField();
        label1 = new JLabel();
        btnApply = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(1920, 1080));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
        border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER
        ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font
        . BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener(
        new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
        .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
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
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "Schedule ID", "Housekeeper SSN", "Receptionist SSN", "Room ID", "Cleaning Date", "Status"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        Integer.class, String.class, String.class, Integer.class, String.class, String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                dataTable.setPreferredScrollableViewportSize(new Dimension(450, 500));
                dataTable.setPreferredSize(new Dimension(450, 300));
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
                pnlSelection.add(tfCleaningDate);
                tfCleaningDate.setBounds(345, 30, 100, 34);

                //---- btnAdd ----
                btnAdd.setText("Add");
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(15, 125, 100, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(120, 125, 100, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
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

                //---- checkBox1 ----
                checkBox1.setText("Completed");
                pnlSelection.add(checkBox1);
                checkBox1.setBounds(30, 70, 105, 32);

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

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Schedule ID",
                    "Housekeeper SSN",
                    "Receptionist SSN",
                    "Room ID",
                    "Cleaning Date",
                    "Status"
                }));
                pnlFilter.add(comboBox1);
                comboBox1.setBounds(25, 23, 98, comboBox1.getPreferredSize().height);

                //---- comboBox2 ----
                comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
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
                pnlFilter.add(comboBox2);
                comboBox2.setBounds(135, 23, 105, comboBox2.getPreferredSize().height);
                pnlFilter.add(textField6);
                textField6.setBounds(25, 87, 215, textField6.getPreferredSize().height);

                //---- label1 ----
                label1.setText("Filter Value:");
                pnlFilter.add(label1);
                label1.setBounds(25, 59, 215, 23);

                //---- btnApply ----
                btnApply.setText("Apply");
                pnlFilter.add(btnApply);
                btnApply.setBounds(25, 125, 215, 60);

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
    private JCheckBox checkBox1;
    private JPanel pnlFilter;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JTextField textField6;
    private JLabel label1;
    private JButton btnApply;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
