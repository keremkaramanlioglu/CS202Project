/*
 * Created by JFormDesigner on Wed Dec 18 13:03:37 TRT 2024
 */

package panels.receptionistPanels;

import java.awt.event.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author kutay
 */
public class RoomsPanel extends Panel {

    private DefaultTableModel model;

    public RoomsPanel() {
        initComponents();
        initTable();
        super.table = tblrooms;
        super.model = model;
    }

    public void initTable() {
        model = new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                },
                new String[] {
                        "room_num", "room_size", "room_capacity", "room_price", "room_type", "cleaning_status"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    String.class, Integer.class, String.class, Double.class, String.class, String.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        table.setModel(model);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[table.getColumnCount()];
                int selectedRow = table.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = table.getValueAt(selectedRow, i + 1);
                    }
                }
                setFields(fields);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlRooms = new JScrollPane();
        tblrooms = new JTable();
        pnlControl = new JPanel();
        pnlFilter = new JPanel();
        btnApply = new JButton();
        tfStartDate = new JTextField();
        tfEndDate = new JTextField();
        label8 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlRooms ========
        {
            pnlRooms.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblrooms ----
            pnlRooms.setViewportView(tblrooms);
        }
        add(pnlRooms, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlFilter ========
            {
                pnlFilter.setPreferredSize(new Dimension(450, 0));
                pnlFilter.setLayout(null);

                //---- btnApply ----
                btnApply.setText("View Available Rooms");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnApply.setActionCommand("Rooms");
                btnApply.setName("apply");
                pnlFilter.add(btnApply);
                btnApply.setBounds(300, 120, 245, 60);

                //---- tfStartDate ----
                tfStartDate.setToolTipText("Filter Input");
                tfStartDate.setText("Choose a Date!");
                pnlFilter.add(tfStartDate);
                tfStartDate.setBounds(300, 45, 115, 40);

                //---- tfEndDate ----
                tfEndDate.setToolTipText("Filter Input");
                tfEndDate.setText("Choose a Date!");
                pnlFilter.add(tfEndDate);
                tfEndDate.setBounds(425, 45, 115, 40);

                //---- label8 ----
                label8.setText("-");
                pnlFilter.add(label8);
                label8.setBounds(415, 55, 15, label8.getPreferredSize().height);

                //---- label1 ----
                label1.setText("Start Date");
                pnlFilter.add(label1);
                label1.setBounds(295, 20, 120, 25);

                //---- label2 ----
                label2.setText("End Date");
                pnlFilter.add(label2);
                label2.setBounds(420, 20, 120, 25);

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

    @Override
    public void addButtonListener(ActionListener al) {

    }

    @Override
    public boolean tfCheck() {
        return !tfStartDate.getText().equals("Choose a Date!") && !tfEndDate.getText().equals("Choose a Date!");
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfStartDate.addMouseListener(ml);
        tfEndDate.addMouseListener(ml);
    }@Override
    public void reset() {

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane pnlRooms;
    private JTable tblrooms;
    private JPanel pnlControl;
    private JPanel pnlFilter;
    private JButton btnApply;
    private JTextField tfStartDate;
    private JTextField tfEndDate;
    private JLabel label8;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
