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

    }

    @Override
    public void setSelectedButton(JButton b) {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setCenterPanel(JPanel panel) {

    }

    @Override
    public JPanel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        dataPanel = new JScrollPane();
        table1 = new JTable();
        controlPanel = new JPanel();
        selectionPanel = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        filterPanel = new JPanel();
        ColumnOptions = new JComboBox<>();
        filter = new JComboBox<>();
        filterInput = new JTextField();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //======== dataPanel ========
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
            dataPanel.setViewportView(table1);
        }
        add(dataPanel);

        //======== controlPanel ========
        {
            controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.X_AXIS));

            //======== selectionPanel ========
            {
                selectionPanel.setPreferredSize(new Dimension(470, 89));
                selectionPanel.setLayout(null);

                //---- button1 ----
                button1.setText("Add");
                selectionPanel.add(button1);
                button1.setBounds(25, 55, 80, button1.getPreferredSize().height);

                //---- button2 ----
                button2.setText("bakar\u0131z");
                selectionPanel.add(button2);
                button2.setBounds(280, 55, 80, button2.getPreferredSize().height);

                //---- button3 ----
                button3.setText("Delete");
                selectionPanel.add(button3);
                button3.setBounds(110, 55, 80, button3.getPreferredSize().height);

                //---- button4 ----
                button4.setText("Update");
                selectionPanel.add(button4);
                button4.setBounds(195, 55, 80, button4.getPreferredSize().height);

                //---- textField2 ----
                textField2.setText("Room Type");
                selectionPanel.add(textField2);
                textField2.setBounds(100, 10, 80, 34);

                //---- textField3 ----
                textField3.setText("Room Size");
                selectionPanel.add(textField3);
                textField3.setBounds(180, 10, 80, 34);

                //---- textField4 ----
                textField4.setText("Room Price");
                selectionPanel.add(textField4);
                textField4.setBounds(260, 10, 80, 34);

                //---- textField5 ----
                textField5.setText("Capacity");
                selectionPanel.add(textField5);
                textField5.setBounds(340, 10, 80, 34);

                //---- textField6 ----
                textField6.setText("Room Number");
                selectionPanel.add(textField6);
                textField6.setBounds(20, 10, 80, 34);

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

                //---- ColumnOptions ----
                ColumnOptions.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Room Id",
                    "Room Number",
                    "Room Type",
                    "Room Size",
                    "Room Price",
                    "Capacity"
                }));
                filterPanel.add(ColumnOptions);
                ColumnOptions.setBounds(0, 10, 100, 30);

                //---- filter ----
                filter.setModel(new DefaultComboBoxModel<>(new String[] {
                    "==",
                    "!=",
                    "<",
                    ">",
                    "<=",
                    ">=",
                    "between",
                    "contains"
                }));
                filterPanel.add(filter);
                filter.setBounds(110, 10, 100, 30);

                //---- filterInput ----
                filterInput.setText("Filter Input");
                filterPanel.add(filterInput);
                filterInput.setBounds(0, 55, 130, 30);

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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane dataPanel;
    private JTable table1;
    private JPanel controlPanel;
    private JPanel selectionPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel filterPanel;
    private JComboBox<String> ColumnOptions;
    private JComboBox<String> filter;
    private JTextField filterInput;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
