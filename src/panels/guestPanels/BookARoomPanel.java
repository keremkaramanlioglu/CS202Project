/*
 * Created by JFormDesigner on Wed Dec 11 17:10:20 TRT 2024
 */

package panels.guestPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class BookARoomPanel extends Panel {
    public BookARoomPanel() {
        initComponents();
    }

    @Override
    public void addButtonListener(ActionListener al) {
        // TODO add button listeners to components
        btnApply.addActionListener(al);
        btnBook.addActionListener(al);
        btnShowRooms.addActionListener(al);
        btnResetFilters.addActionListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {
        tfCheckInDate.addMouseListener(ml);
        tfCheckOutDate.addMouseListener(ml);
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
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
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
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
        swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
        . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
        ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) , getBorder
        ( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
        .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
        ( ); }} );
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

                //---- tfCheckInDate ----
                tfCheckInDate.setName("dateChooser");
                tfCheckInDate.setEditable(false);
                tfCheckInDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfCheckInDate.setText("Choose a Date!");
                pnlDate.add(tfCheckInDate);
                tfCheckInDate.setBounds(35, 80, 100, 40);

                //---- tfCheckOutDate ----
                tfCheckOutDate.setName("dateChooser");
                tfCheckOutDate.setEditable(false);
                tfCheckOutDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfCheckOutDate.setText("Choose a Date!");
                pnlDate.add(tfCheckOutDate);
                tfCheckOutDate.setBounds(155, 80, 100, 40);

                //---- btnShowRooms ----
                btnShowRooms.setText("Show Rooms");
                btnShowRooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlDate.add(btnShowRooms);
                btnShowRooms.setBounds(40, 160, 215, 60);

                //---- lblCheckInDate ----
                lblCheckInDate.setText("Check-in Date:");
                pnlDate.add(lblCheckInDate);
                lblCheckInDate.setBounds(35, 55, 100, 30);

                //---- lblCheckOutDate ----
                lblCheckOutDate.setText("Check-out Date:");
                pnlDate.add(lblCheckOutDate);
                lblCheckOutDate.setBounds(155, 55, 100, 30);

                //---- textArea1 ----
                textArea1.setText("Please Select a Check-in and Check-out Date to Start!");
                textArea1.setOpaque(false);
                textArea1.setWrapStyleWord(true);
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                textArea1.setEnabled(false);
                textArea1.setSelectionColor(Color.black);
                textArea1.setDisabledTextColor(Color.black);
                pnlDate.add(textArea1);
                textArea1.setBounds(30, 20, 230, 55);

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
                tfHotelName.setBounds(45, 35, 100, 40);

                //---- lblHotelName ----
                lblHotelName.setText("Hotel Name:");
                pnlReservationInfo.add(lblHotelName);
                lblHotelName.setBounds(45, 20, 100, lblHotelName.getPreferredSize().height);
                pnlReservationInfo.add(tfRoomType);
                tfRoomType.setBounds(175, 35, 100, 40);

                //---- lblRoomType ----
                lblRoomType.setText("Room Type:");
                pnlReservationInfo.add(lblRoomType);
                lblRoomType.setBounds(175, 20, 100, 17);
                pnlReservationInfo.add(tfCity);
                tfCity.setBounds(45, 100, 100, 40);

                //---- lblCity ----
                lblCity.setText("City:");
                pnlReservationInfo.add(lblCity);
                lblCity.setBounds(45, 85, 100, 17);
                pnlReservationInfo.add(tfNumberOfPeople);
                tfNumberOfPeople.setBounds(175, 100, 100, 40);

                //---- lblNumberOfPeople ----
                lblNumberOfPeople.setText("Number of People:");
                pnlReservationInfo.add(lblNumberOfPeople);
                lblNumberOfPeople.setBounds(175, 85, 100, 17);

                //---- btnApply ----
                btnApply.setText("Apply");
                btnApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlReservationInfo.add(btnApply);
                btnApply.setBounds(45, 160, 215, 60);

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
                btnResetFilters.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlCommand.add(btnResetFilters);
                btnResetFilters.setBounds(50, 45, 200, 60);

                //---- btnBook ----
                btnBook.setText("Book");
                btnBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                pnlCommand.add(btnBook);
                btnBook.setBounds(50, 115, 200, 60);

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
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
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
