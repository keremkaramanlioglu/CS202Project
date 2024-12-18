/*
 * Created by JFormDesigner on Wed Dec 18 13:56:32 TRT 2024
 */

package panels.databaseManagerPanel;

import java.awt.*;
import javax.swing.*;

/**
 * @author kutay
 */
public class Finance extends JPanel {
    public Finance() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        tfStartDate = new JTextField();
        tfEndDate = new JTextField();
        btnShowRevenue = new JButton();
        tfRevenue = new JTextField();
        lblStartDate = new JLabel();
        lblEndDate = new JLabel();
        lblRevenue = new JLabel();
        tfHotelID = new JTextField();
        lblHotelID = new JLabel();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
        border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax. swing. border. TitledBorder. CENTER
        , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069al\u006fg" ,java .awt .Font
        .BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
        new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062or\u0064er"
        .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(null);

        //---- tfStartDate ----
        tfStartDate.setEditable(false);
        tfStartDate.setText("Please Choose a Date");
        add(tfStartDate);
        tfStartDate.setBounds(325, 180, 200, 40);

        //---- tfEndDate ----
        tfEndDate.setEditable(false);
        tfEndDate.setText("Please Choose a Date");
        add(tfEndDate);
        tfEndDate.setBounds(325, 250, 200, 40);

        //---- btnShowRevenue ----
        btnShowRevenue.setText("Show Revenue");
        btnShowRevenue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(btnShowRevenue);
        btnShowRevenue.setBounds(325, 320, 200, 40);

        //---- tfRevenue ----
        tfRevenue.setEditable(false);
        add(tfRevenue);
        tfRevenue.setBounds(325, 385, 200, 40);

        //---- lblStartDate ----
        lblStartDate.setText("Start Date: ");
        lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblStartDate);
        lblStartDate.setBounds(120, 180, 200, 40);

        //---- lblEndDate ----
        lblEndDate.setText("End Date: ");
        lblEndDate.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblEndDate);
        lblEndDate.setBounds(120, 250, 200, 40);

        //---- lblRevenue ----
        lblRevenue.setText("Your Revenue in given Interval: ");
        lblRevenue.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblRevenue);
        lblRevenue.setBounds(120, 385, 200, 40);

        //---- tfHotelID ----
        tfHotelID.setEditable(false);
        tfHotelID.setText("Please Enter a Hotel ID");
        add(tfHotelID);
        tfHotelID.setBounds(325, 110, 200, 40);

        //---- lblHotelID ----
        lblHotelID.setText("Hotel ID:");
        lblHotelID.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblHotelID);
        lblHotelID.setBounds(120, 110, 200, 40);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JTextField tfStartDate;
    private JTextField tfEndDate;
    private JButton btnShowRevenue;
    private JTextField tfRevenue;
    private JLabel lblStartDate;
    private JLabel lblEndDate;
    private JLabel lblRevenue;
    private JTextField tfHotelID;
    private JLabel lblHotelID;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
