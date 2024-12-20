/*
 * Created by JFormDesigner on Wed Dec 18 14:44:39 TRT 2024
 */

package panels.dbManagerPanels;

import java.awt.event.*;
import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
        initTable();
    }

    public void setTableColumns(ArrayList<Object> columnValues) {
        model.setColumnCount(0);

        for (Object columnValue : columnValues) {
            model.addColumn(columnValue.toString());
        }
        table.revalidate();
        table.repaint();
        this.revalidate();
        this.repaint();
    }

    private void initTable() {
        model = new DefaultTableModel();
        tblData.setModel(model);
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblData.getColumnCount()];
                int selectedRow = tblData.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblData.getValueAt(selectedRow, i + 1);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblData;
        super.model = this.model;
    }

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

    public String getTaQuery() {
        return taQuery.getText();
    }

    private void taQueryKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isShiftDown()) {
            btnExecute.doClick();
        }
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
        label1 = new JLabel();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;
        setLayout(new BorderLayout());

        //======== pnlData ========
        {
            pnlData.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblData ----
            tblData.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null},
                    {null, null},
                },
                new String[] {
                    null, null
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            tblData.setEnabled(false);
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
                taQuery.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        taQueryKeyPressed(e);
                    }
                });
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

            //---- label1 ----
            label1.setText("Enter + Shift");
            pnlControl.add(label1);
            label1.setBounds(680, 75, 125, 35);

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
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
