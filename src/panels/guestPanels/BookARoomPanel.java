/*
 * Created by JFormDesigner on Wed Dec 11 17:10:20 TRT 2024
 */

package panels.guestPanels;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class BookARoomPanel extends JPanel {
    public BookARoomPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlReservableHotels = new JScrollPane();
        tblData = new JTable();
        pnlControl = new JPanel();
        pnlDate = new JPanel();
        tfCheckInDate = new JTextField();
        tfCheckOutDate = new JTextField();
        btnShowRooms = new JButton();
        lblCheckInDate = new JLabel();
        lblCheckOutDate = new JLabel();
        textArea1 = new JTextArea();
        pnlReservationInfo = new JPanel();
        tfHotelName = new JTextField();
        lblHotelName = new JLabel();
        tfRoomType = new JTextField();
        lblRoomType = new JLabel();
        tfCity = new JTextField();
        lblCity = new JLabel();
        tfNumberOfPeople = new JTextField();
        lblNumberOfPeople = new JLabel();
        btnApply = new JButton();
        pnlCommand = new JPanel();
        btnResetFilters = new JButton();
        btnBook = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
        EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing
        .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))
        throw new RuntimeException();}});
        setLayout(new BorderLayout());

        //======== pnlReservableHotels ========
        {

            //---- tblData ----
            tblData.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null},
                    {null, null, null, null},
                },
                new String[] {
                    "Hotel Name", "Zip Code", "Room Type", "Room Capacity"
                }
            ));
            pnlReservableHotels.setViewportView(tblData);
        }
        add(pnlReservableHotels, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== pnlDate ========
            {
                pnlDate.setPreferredSize(new Dimension(300, 0));
                pnlDate.setLayout(null);
                pnlDate.add(tfCheckInDate);
                tfCheckInDate.setBounds(35, 80, 100, 50);
                pnlDate.add(tfCheckOutDate);
                tfCheckOutDate.setBounds(155, 80, 100, 50);

                //---- btnShowRooms ----
                btnShowRooms.setText("Show Rooms");
                pnlDate.add(btnShowRooms);
                btnShowRooms.setBounds(45, 150, 200, 40);

                //---- lblCheckInDate ----
                lblCheckInDate.setText("Check-in Date");
                pnlDate.add(lblCheckInDate);
                lblCheckInDate.setBounds(35, 55, 100, 30);

                //---- lblCheckOutDate ----
                lblCheckOutDate.setText("Check-out Date");
                pnlDate.add(lblCheckOutDate);
                lblCheckOutDate.setBounds(155, 55, 100, 30);

                //---- textArea1 ----
                textArea1.setText("Please Select a Check-in and Check-out Date to Start!");
                textArea1.setOpaque(false);
                textArea1.setWrapStyleWord(true);
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                pnlDate.add(textArea1);
                textArea1.setBounds(30, 5, 230, 55);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlDate.getComponentCount(); i++) {
                        Rectangle bounds = pnlDate.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlDate.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlDate.setMinimumSize(preferredSize);
                    pnlDate.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlDate);

            //======== pnlReservationInfo ========
            {
                pnlReservationInfo.setPreferredSize(new Dimension(300, 0));
                pnlReservationInfo.setLayout(null);
                pnlReservationInfo.add(tfHotelName);
                tfHotelName.setBounds(45, 35, 80, 40);

                //---- lblHotelName ----
                lblHotelName.setText("Hotel Name");
                pnlReservationInfo.add(lblHotelName);
                lblHotelName.setBounds(45, 20, 80, lblHotelName.getPreferredSize().height);
                pnlReservationInfo.add(tfRoomType);
                tfRoomType.setBounds(175, 35, 80, 40);

                //---- lblRoomType ----
                lblRoomType.setText("Room Type");
                pnlReservationInfo.add(lblRoomType);
                lblRoomType.setBounds(175, 20, 80, 17);
                pnlReservationInfo.add(tfCity);
                tfCity.setBounds(45, 100, 80, 40);

                //---- lblCity ----
                lblCity.setText("City");
                pnlReservationInfo.add(lblCity);
                lblCity.setBounds(45, 85, 80, 17);
                pnlReservationInfo.add(tfNumberOfPeople);
                tfNumberOfPeople.setBounds(175, 100, 80, 40);

                //---- lblNumberOfPeople ----
                lblNumberOfPeople.setText("#People");
                pnlReservationInfo.add(lblNumberOfPeople);
                lblNumberOfPeople.setBounds(175, 85, 80, 17);

                //---- btnApply ----
                btnApply.setText("Apply");
                pnlReservationInfo.add(btnApply);
                btnApply.setBounds(50, 160, 200, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlReservationInfo.getComponentCount(); i++) {
                        Rectangle bounds = pnlReservationInfo.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlReservationInfo.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlReservationInfo.setMinimumSize(preferredSize);
                    pnlReservationInfo.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlReservationInfo);

            //======== pnlCommand ========
            {
                pnlCommand.setPreferredSize(new Dimension(300, 0));
                pnlCommand.setLayout(null);

                //---- btnResetFilters ----
                btnResetFilters.setText("Reset Filters");
                pnlCommand.add(btnResetFilters);
                btnResetFilters.setBounds(50, 45, 200, 40);

                //---- btnBook ----
                btnBook.setText("Book");
                pnlCommand.add(btnBook);
                btnBook.setBounds(50, 100, 200, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlCommand.getComponentCount(); i++) {
                        Rectangle bounds = pnlCommand.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlCommand.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlCommand.setMinimumSize(preferredSize);
                    pnlCommand.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(pnlCommand);
        }
        add(pnlControl, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlReservableHotels;
    private JTable tblData;
    private JPanel pnlControl;
    private JPanel pnlDate;
    private JTextField tfCheckInDate;
    private JTextField tfCheckOutDate;
    private JButton btnShowRooms;
    private JLabel lblCheckInDate;
    private JLabel lblCheckOutDate;
    private JTextArea textArea1;
    private JPanel pnlReservationInfo;
    private JTextField tfHotelName;
    private JLabel lblHotelName;
    private JTextField tfRoomType;
    private JLabel lblRoomType;
    private JTextField tfCity;
    private JLabel lblCity;
    private JTextField tfNumberOfPeople;
    private JLabel lblNumberOfPeople;
    private JButton btnApply;
    private JPanel pnlCommand;
    private JButton btnResetFilters;
    private JButton btnBook;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
