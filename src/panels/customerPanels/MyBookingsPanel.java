/*
 * Created by JFormDesigner on Wed Dec 11 20:10:49 TRT 2024
 */

package panels.customerPanels;

import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class MyBookingsPanel extends Panel {

    private DefaultTableModel tableModel;

    public MyBookingsPanel() {
        initComponents();
        initTable();
    }

    @Override
    public String getPanelName() {
        return "CustomerPanel";
    }

    private void initTable() {  // TODO write a cancel booking function in hotel dao
       tableModel = new DefaultTableModel(
               new Object[][] {
               },
               new String[] {
                       "hotel_name", "hotel_phone", "hotel_email", "zip_code", "room_num", "room_type", "booking_start_date", "booking_end_date"
               }
       ) {
           final Class<?>[] columnTypes = new Class<?>[] {
                   String.class, Object.class, Object.class, String.class, Object.class, String.class, String.class, String.class
           };
           @Override
           public Class<?> getColumnClass(int columnIndex) {
               return columnTypes[columnIndex];
           }
       };
        tblBookings.setModel(tableModel);
        tblBookings.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblBookings.getColumnCount()];
                int selectedRow = tblBookings.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblBookings.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblBookings;
        super.model = tableModel;
    }


    @Override
    public void addButtonListener(ActionListener al) {
        btnCancel.addActionListener(al);
    }

    @Override
    public boolean tfCheck() {
        return false;
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {
        // TODO reset the components
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
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        pnlBookings = new JScrollPane();
        tblBookings = new JTable();
        pnlControl = new JPanel();
        btnCancel = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
        . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder
        . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
        awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder( )) )
        ;  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
        ;
        setLayout(new BorderLayout());

        //======== pnlBookings ========
        {
            pnlBookings.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblBookings ----
            tblBookings.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "hotel_name", "hotel_phone", "hotel_email", "zip_code", "room_num", "room_type", "booking_start_date", "booking_end_date"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, Object.class, Object.class, String.class, Object.class, String.class, String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            tblBookings.setAutoCreateRowSorter(true);
            pnlBookings.setViewportView(tblBookings);
        }
        add(pnlBookings, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(null);

            //---- btnCancel ----
            btnCancel.setText("Cancel Booking");
            btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnCancel.setActionCommand("My Bookings");
            btnCancel.setName("Cancel Booking");
            pnlControl.add(btnCancel);
            btnCancel.setBounds(330, 60, 225, 75);

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
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JScrollPane pnlBookings;
    private JTable tblBookings;
    private JPanel pnlControl;
    private JButton btnCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
