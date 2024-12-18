/*
 * Created by JFormDesigner on Wed Dec 18 14:44:39 TRT 2024
 */

package panels.dbManagerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kutay
 */
public class QueryPanel extends panels.Panel {
    public QueryPanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnExecute.addActionListener(al);
    }@Override
    public void addMouseListener(MouseListener ml) {

    }@Override
    public void reset() {
        taQuery.setText("");
    }@Override
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
