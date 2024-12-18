/*
 * Created by JFormDesigner on Wed Dec 11 20:10:49 TRT 2024
 */

package panels.customerPanels;

import java.awt.event.*;
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
    public MyBookingsPanel() {
        initComponents();
    }


    @Override
    public void addButtonListener(ActionListener al) {
        btnNewBooking.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {
        // TODO reset the components
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlBookings = new JScrollPane();
        tblBookings = new JTable();
        pnlControl = new JPanel();
        btnCancel = new JButton();
        btnNewBooking = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlBookings ========
        {
            pnlBookings.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblBookings ----
            tblBookings.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "Hotel name", "Zip Code", "Room Type", "#People", "Check-in Date", "Check-out Date"
                }
            ));
            pnlBookings.setViewportView(tblBookings);
        }
        add(pnlBookings, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(null);

            //---- btnCancel ----
            btnCancel.setText("Cancel");
            btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnCancel.setActionCommand("My Bookings");
            pnlControl.add(btnCancel);
            btnCancel.setBounds(90, 60, 225, 75);

            //---- btnNewBooking ----
            btnNewBooking.setText("New Booking");
            btnNewBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            btnNewBooking.setActionCommand("New Booking");
            pnlControl.add(btnNewBooking);
            btnNewBooking.setBounds(590, 60, 225, 75);

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
    private JScrollPane pnlBookings;
    private JTable tblBookings;
    private JPanel pnlControl;
    private JButton btnCancel;
    private JButton btnNewBooking;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
