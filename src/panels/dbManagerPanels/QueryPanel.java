/*
 * Created by JFormDesigner on Wed Dec 18 14:44:39 TRT 2024
 */

package panels.dbManagerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author kutay
 */
public class QueryPanel extends panels.Panel {

    private DefaultTableModel model;

    public QueryPanel() {
        initComponents();
        //initTable();
        super.table = tblData;
        super.model = model;
    }

//    private void initTable() {
//        model = new DefaultTableModel(
//                new Object[][] {},
//                new String[] {
//                        "booking_id", "c_ssn", "room_id", "payment_status", "payment_method", "booking_start_date", "booking_end_date", "c_check_in_status", "c_check_out_status"
//                }
//        ) {
//            final Class<?>[] columnTypes = new Class<?>[] {
//                    Integer.class, String.class, Integer.class, String.class, String.class, Date.class, Date.class, Boolean.class, Boolean.class
//            };
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnTypes[columnIndex];
//            }
//        };
//        table.setModel(model);
//        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                Object[] fields = new Object[table.getColumnCount()];
//                int selectedRow = table.getSelectedRow();
//
//                if (selectedRow != -1) {
//                    for (int i = 0; i < fields.length; i++) {
//                        fields[i] = table.getValueAt(selectedRow, i + 1);
//                    }
//                }
//                setFields(fields);
//            }
//        });
//    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnExecute.addActionListener(al);
    }

    @Override
    public boolean tfCheck() {
        return false;
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }@Override
    public void reset() {
        taQuery.setText("");
    }

    @Override
    public void setFields(Object[] rowValues) {

    }

    @Override
    public Object[] getEntity() {
        return new Object[0];
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlData = new JScrollPane();
        tblData = new JTable();
        pnlControl = new JPanel();
        pnlQuery = new JScrollPane();
        taQuery = new JTextArea();
        btnExecute = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
        0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
        .BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
        red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
        beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            pnlData.setViewportView(tblData);
        }
        add(pnlData, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(null);

            //======== pnlQuery ========
            {

                //---- taQuery ----
                taQuery.setWrapStyleWord(true);
                taQuery.setLineWrap(true);
                pnlQuery.setViewportView(taQuery);
            }
            pnlControl.add(pnlQuery);
            pnlQuery.setBounds(20, 15, 630, 170);

            //---- btnExecute ----
            btnExecute.setText("Execute");
            btnExecute.setActionCommand("Query");
            btnExecute.setName("execute");
            pnlControl.add(btnExecute);
            btnExecute.setBounds(670, 20, 130, 50);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < pnlControl.getComponentCount(); i++) {
                    Rectangle bounds = pnlControl.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = pnlControl.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                pnlControl.setMinimumSize(preferredSize);
                pnlControl.setPreferredSize(preferredSize);
            }
        }
        add(pnlControl, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlData;
    private JTable tblData;
    private JPanel pnlControl;
    private JScrollPane pnlQuery;
    private JTextArea taQuery;
    private JButton btnExecute;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
