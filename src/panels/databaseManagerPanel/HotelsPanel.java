/*
 * Created by JFormDesigner on Wed Dec 18 13:37:50 TRT 2024
 */

package panels.databaseManagerPanel;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kutay
 */
public class HotelsPanel extends JPanel {
    public HotelsPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlHotels = new JScrollPane();
        tblHotels = new JTable();
        pnlControl = new JPanel();
        pnlSelection = new JPanel();
        btnAdd = new JButton();
        btnDelete = new JButton();
        btnUpdate = new JButton();
        tfZipCode = new JTextField();
        tfPhoneNo = new JTextField();
        tfEmail = new JTextField();
        tfStreet = new JTextField();
        tfHotelName = new JTextField();
        lblZipcode = new JLabel();
        lblHotelName = new JLabel();
        lblPhoneNo = new JLabel();
        lblEmail = new JLabel();
        lblStreet = new JLabel();
        tfNo = new JTextField();
        lblNo = new JLabel();
        pnlFilter = new JPanel();
        cbSelectColumn = new JComboBox<>();
        cbFilterOption = new JComboBox<>();
        tfFilterValue = new JTextField();
        label7 = new JLabel();
        btnApply = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );
        setLayout(new BorderLayout());

        //======== pnlHotels ========
        {

            //---- tblHotels ----
            tblHotels.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null},
                },
                new String[] {
                    "Hotel ID", "Hotel Name", "Zip Code", "Phone", "E-Mail", "street", "no"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Integer.class, String.class, String.class, String.class, String.class, String.class, String.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            tblHotels.setPreferredSize(new Dimension(525, 400));
            pnlHotels.setViewportView(tblHotels);
        }
        add(pnlHotels, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 200));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlSelection ========
            {
                pnlSelection.setPreferredSize(new Dimension(450, 300));
                pnlSelection.setLayout(null);

                //---- btnAdd ----
                btnAdd.setText("Add");
                btnAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlSelection.add(btnAdd);
                btnAdd.setBounds(5, 130, 140, 60);

                //---- btnDelete ----
                btnDelete.setText("Delete");
                btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlSelection.add(btnDelete);
                btnDelete.setBounds(155, 130, 140, 60);

                //---- btnUpdate ----
                btnUpdate.setText("Update");
                btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlSelection.add(btnUpdate);
                btnUpdate.setBounds(305, 130, 140, 60);

                //---- tfZipCode ----
                tfZipCode.setToolTipText("Room Type");
                pnlSelection.add(tfZipCode);
                tfZipCode.setBounds(170, 30, 100, 34);

                //---- tfPhoneNo ----
                tfPhoneNo.setToolTipText("Room Size");
                pnlSelection.add(tfPhoneNo);
                tfPhoneNo.setBounds(275, 30, 100, 34);

                //---- tfEmail ----
                tfEmail.setToolTipText("Room Price");
                pnlSelection.add(tfEmail);
                tfEmail.setBounds(65, 85, 100, 34);

                //---- tfStreet ----
                tfStreet.setToolTipText("Capacity");
                pnlSelection.add(tfStreet);
                tfStreet.setBounds(170, 85, 100, 34);

                //---- tfHotelName ----
                tfHotelName.setToolTipText("Room Number");
                pnlSelection.add(tfHotelName);
                tfHotelName.setBounds(65, 30, 100, 34);

                //---- lblZipcode ----
                lblZipcode.setText("Zip Code:");
                pnlSelection.add(lblZipcode);
                lblZipcode.setBounds(170, 10, 90, 25);

                //---- lblHotelName ----
                lblHotelName.setText("Hotel Name:");
                pnlSelection.add(lblHotelName);
                lblHotelName.setBounds(65, 10, 90, 25);

                //---- lblPhoneNo ----
                lblPhoneNo.setText("Phone no:");
                pnlSelection.add(lblPhoneNo);
                lblPhoneNo.setBounds(275, 10, 90, 25);

                //---- lblEmail ----
                lblEmail.setText("E-Mail:");
                pnlSelection.add(lblEmail);
                lblEmail.setBounds(65, 65, 90, 25);

                //---- lblStreet ----
                lblStreet.setText("Street:");
                pnlSelection.add(lblStreet);
                lblStreet.setBounds(170, 65, 90, 25);

                //---- tfNo ----
                tfNo.setToolTipText("Room Size");
                pnlSelection.add(tfNo);
                tfNo.setBounds(275, 85, 100, 34);

                //---- lblNo ----
                lblNo.setText("no:");
                pnlSelection.add(lblNo);
                lblNo.setBounds(275, 65, 90, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlSelection.getComponentCount(); i++) {
                        Rectangle bounds = pnlSelection.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlSelection.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlSelection.setMinimumSize(preferredSize);
                    pnlSelection.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlSelection);

            //======== pnlFilter ========
            {
                pnlFilter.setPreferredSize(new Dimension(450, 300));
                pnlFilter.setLayout(null);

                //---- cbSelectColumn ----
                cbSelectColumn.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Hotel ID",
                    "Hotel Name",
                    "Zip Code",
                    "Phone ",
                    "E-Mail",
                    "Street",
                    "No"
                }));
                cbSelectColumn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbSelectColumn);
                cbSelectColumn.setBounds(100, 15, 120, 45);

                //---- cbFilterOption ----
                cbFilterOption.setModel(new DefaultComboBoxModel<>(new String[] {
                    "None",
                    "==",
                    "!=",
                    "<",
                    ">",
                    "<=",
                    ">=",
                    "between",
                    "contains"
                }));
                cbFilterOption.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(cbFilterOption);
                cbFilterOption.setBounds(225, 15, 120, 45);

                //---- tfFilterValue ----
                tfFilterValue.setToolTipText("Filter Input");
                pnlFilter.add(tfFilterValue);
                tfFilterValue.setBounds(105, 90, 235, 40);

                //---- label7 ----
                label7.setText("Filter Value:");
                pnlFilter.add(label7);
                label7.setBounds(110, 65, 225, 30);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlFilter.add(btnApply);
                btnApply.setBounds(105, 130, 235, 60);

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlHotels;
    private JTable tblHotels;
    private JPanel pnlControl;
    private JPanel pnlSelection;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField tfZipCode;
    private JTextField tfPhoneNo;
    private JTextField tfEmail;
    private JTextField tfStreet;
    private JTextField tfHotelName;
    private JLabel lblZipcode;
    private JLabel lblHotelName;
    private JLabel lblPhoneNo;
    private JLabel lblEmail;
    private JLabel lblStreet;
    private JTextField tfNo;
    private JLabel lblNo;
    private JPanel pnlFilter;
    private JComboBox<String> cbSelectColumn;
    private JComboBox<String> cbFilterOption;
    private JTextField tfFilterValue;
    private JLabel label7;
    private JButton btnApply;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
