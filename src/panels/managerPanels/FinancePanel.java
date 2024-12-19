/*
 * Created by JFormDesigner on Wed Dec 11 17:07:12 TRT 2024
 */

package panels.managerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Date;
import javax.swing.*;

/**
 * @author kerem
 */
public class FinancePanel extends Panel {

    private final String tfText = "Please Choose a Date";

    public FinancePanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnShowRevenue.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfEndDate.addMouseListener(ml);
        tfStartDate.addMouseListener(ml);
    }

    public boolean tfCheck() {
        return !tfStartDate.getText().isEmpty() && !tfEndDate.getText().isEmpty();
    }

    public Date getStartDate() {
        return Date.valueOf(tfStartDate.getText());
    }

    public Date getEndDate() {
        return Date.valueOf(tfEndDate.getText());
    }

    public void setTfRevenue(double d){
        tfRevenue.setText(d+"");
    }

    @Override
    public void reset() {
        tfStartDate.setText(tfText);
        tfEndDate.setText(tfText);
        tfRevenue.setText("");
    }

    @Override
    public void setFields(Object[] rowValues) {

    }

    @Override
    public Object[] getEntity() {
        return new Object[0];
    }

    public void setRevenue(String revenue) {
        tfRevenue.setText(revenue + "$");
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        tfStartDate = new JTextField();
        tfEndDate = new JTextField();
        btnShowRevenue = new JButton();
        tfRevenue = new JTextField();
        lblStartDate = new JLabel();
        lblEndDate = new JLabel();
        lblRevenue = new JLabel();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
        0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
        . BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
        red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
        beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(null);

        //---- tfStartDate ----
        tfStartDate.setEditable(false);
        tfStartDate.setText("Choose a Date!");
        add(tfStartDate);
        tfStartDate.setBounds(300, 100, 200, 40);

        //---- tfEndDate ----
        tfEndDate.setEditable(false);
        tfEndDate.setText("Choose a Date!");
        add(tfEndDate);
        tfEndDate.setBounds(300, 170, 200, 40);

        //---- btnShowRevenue ----
        btnShowRevenue.setText("Show Revenue");
        btnShowRevenue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnShowRevenue.setActionCommand("Finance");
        btnShowRevenue.setName("show revenue");
        add(btnShowRevenue);
        btnShowRevenue.setBounds(300, 240, 200, 40);

        //---- tfRevenue ----
        tfRevenue.setEditable(false);
        add(tfRevenue);
        tfRevenue.setBounds(300, 305, 200, 40);

        //---- lblStartDate ----
        lblStartDate.setText("Start Date: ");
        lblStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblStartDate);
        lblStartDate.setBounds(95, 100, 200, 40);

        //---- lblEndDate ----
        lblEndDate.setText("End Date: ");
        lblEndDate.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblEndDate);
        lblEndDate.setBounds(95, 170, 200, 40);

        //---- lblRevenue ----
        lblRevenue.setText("Your Revenue in given Interval: ");
        lblRevenue.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblRevenue);
        lblRevenue.setBounds(95, 305, 200, 40);

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
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JTextField tfStartDate;
    private JTextField tfEndDate;
    private JButton btnShowRevenue;
    private JTextField tfRevenue;
    private JLabel lblStartDate;
    private JLabel lblEndDate;
    private JLabel lblRevenue;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
