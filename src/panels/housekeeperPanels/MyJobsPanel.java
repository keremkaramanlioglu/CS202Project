/*
 * Created by JFormDesigner on Wed Dec 11 20:11:47 TRT 2024
 */

package panels.housekeeperPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class MyJobsPanel extends Panel {

    private DefaultTableModel tableModel;
    
    // button action command is ConfirmCS

    public MyJobsPanel() {
        initComponents();
        initTable();
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Room Number", "Cleaning Date", "Service Status"
                }
        );
        tblJobs.setModel(tableModel);
        tblJobs.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblJobs.getColumnCount()];
                int selectedRow = tblJobs.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblJobs.getValueAt(selectedRow, i + 1);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblJobs;
        super.model = tableModel;
    }

    public boolean getCompleted() {
        return rbMark.isSelected();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnConfirm.addActionListener(al);
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
        pnlJobs = new JScrollPane();
        tblJobs = new JTable();
        pnlControl = new JPanel();
        rbMark = new JRadioButton();
        btnConfirm = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
        .border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border.TitledBorder
        .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067",java.
        awt.Font.BOLD,12),java.awt.Color.red), getBorder()))
        ; addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
        ){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException();}})
        ;
        setLayout(new BorderLayout());

        //======== pnlJobs ========
        {
            pnlJobs.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblJobs ----
            tblJobs.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null},
                    {null, null, null},
                },
                new String[] {
                    "Room Number", "Cleaning Date", "Service Status"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            tblJobs.setAutoCreateRowSorter(true);
            pnlJobs.setViewportView(tblJobs);
        }
        add(pnlJobs, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(null);

            //---- rbMark ----
            rbMark.setText("Mark as Completed");
            pnlControl.add(rbMark);
            rbMark.setBounds(60, 15, 250, 25);

            //---- btnConfirm ----
            btnConfirm.setText("Confirm");
            btnConfirm.setActionCommand("My Jobs");
            btnConfirm.setName("confirm");
            pnlControl.add(btnConfirm);
            btnConfirm.setBounds(60, 60, 155, 40);

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
    private JScrollPane pnlJobs;
    private JTable tblJobs;
    private JPanel pnlControl;
    private JRadioButton rbMark;
    private JButton btnConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
