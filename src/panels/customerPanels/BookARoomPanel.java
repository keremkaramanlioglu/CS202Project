/*
 * Created by JFormDesigner on Wed Dec 11 17:10:20 TRT 2024
 */

package panels.customerPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.Date;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author kerem
 */
public class BookARoomPanel extends Panel {
    
    private DefaultTableModel tableModel;
    
    public BookARoomPanel() {
        initComponents();

        initTable();
    }
    // TODO write a hotelDao function that takes these filters
    public String[] getFilters() {
        return new String[]{String.valueOf(tfCheckInDate.getText()), String.valueOf(tfCheckOutDate.getText()), String.valueOf(tfHotelName.getText()),
        String.valueOf(tfZipcode.getText()), String.valueOf(tfRoomType.getText()), String.valueOf(tfNumberOfPeople.getText())};
    }

    public String getPanelName() {
        return "CustomerPanel";
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null},
                },
                new String[] {
                        "hotel_name", "zip_code", "room_type", "room_size", "room_price", "room_capacity"
                }
        ) {
            Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class, Double.class, Double.class, String.class
            };
            boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnEditable[columnIndex];
            }
        };
        tblData.setModel(tableModel);
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object[] fields = new Object[tblData.getColumnCount()];
                int selectedRow = tblData.getSelectedRow();

                if (selectedRow != -1) {
                    for (int i = 0; i < fields.length; i++) {
                        fields[i] = tblData.getValueAt(selectedRow, i);
                    }
                }
                setFields(fields);
            }
        });
        super.table = tblData;
        super.model = tableModel;
    }

    @Override
    public void addButtonListener(ActionListener al) {
        // TODO add button listeners to components
        btnBook.addActionListener(al);
        btnShowRooms.addActionListener(al);
        btnResetFilters.addActionListener(al);
    }

    public Date getStartDate(){
        return Date.valueOf(tfCheckInDate.getText());
    }
    public Date getEndDate(){
        return Date.valueOf(tfCheckOutDate.getText());
    }

    @Override
    public boolean tfCheck() {
        return false;
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
        // Generated using JFormDesigner Evaluation license - Kutay Mumcu
        pnlReservableHotels = new JScrollPane();
        tblData = new JTable();
        pnlControl = new JPanel();
        panel1 = new JPanel();
        textArea1 = new JTextArea();
        lblCheckInDate = new JLabel();
        lblCheckOutDate = new JLabel();
        tfCheckInDate = new JTextField();
        tfCheckOutDate = new JTextField();
        tfHotelName = new JTextField();
        lblHotelName = new JLabel();
        lblRoomType = new JLabel();
        tfRoomType = new JTextField();
        tfZipcode = new JTextField();
        lblZipcode = new JLabel();
        tfNumberOfPeople = new JTextField();
        lblNumberOfPeople = new JLabel();
        btnShowRooms = new JButton();
        pnlCommand = new JPanel();
        btnResetFilters = new JButton();
        btnBook = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
        javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
        . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
        .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans.
        PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
        equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());

        //======== pnlReservableHotels ========
        {
            pnlReservableHotels.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- tblData ----
            tblData.setAutoCreateRowSorter(true);
            pnlReservableHotels.setViewportView(tblData);
        }
        add(pnlReservableHotels, BorderLayout.CENTER);

        //======== pnlControl ========
        {
            pnlControl.setPreferredSize(new Dimension(0, 250));
            pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- textArea1 ----
                textArea1.setText("Please Select a Check-in and Check-out Date to Start!");
                textArea1.setOpaque(false);
                textArea1.setWrapStyleWord(true);
                textArea1.setLineWrap(true);
                textArea1.setEditable(false);
                textArea1.setEnabled(false);
                textArea1.setSelectionColor(Color.black);
                textArea1.setDisabledTextColor(Color.black);
                panel1.add(textArea1);
                textArea1.setBounds(15, 10, 230, 55);

                //---- lblCheckInDate ----
                lblCheckInDate.setText("Check-in Date:");
                panel1.add(lblCheckInDate);
                lblCheckInDate.setBounds(15, 65, 100, 30);

                //---- lblCheckOutDate ----
                lblCheckOutDate.setText("Check-out Date:");
                panel1.add(lblCheckOutDate);
                lblCheckOutDate.setBounds(125, 65, 100, 30);

                //---- tfCheckInDate ----
                tfCheckInDate.setName("dateChooser");
                tfCheckInDate.setEditable(false);
                tfCheckInDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfCheckInDate.setText("Choose a Date!");
                panel1.add(tfCheckInDate);
                tfCheckInDate.setBounds(10, 90, 100, 40);

                //---- tfCheckOutDate ----
                tfCheckOutDate.setName("dateChooser");
                tfCheckOutDate.setEditable(false);
                tfCheckOutDate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                tfCheckOutDate.setText("Choose a Date!");
                panel1.add(tfCheckOutDate);
                tfCheckOutDate.setBounds(120, 90, 100, 40);
                panel1.add(tfHotelName);
                tfHotelName.setBounds(260, 50, 100, 40);

                //---- lblHotelName ----
                lblHotelName.setText("Hotel Name:");
                panel1.add(lblHotelName);
                lblHotelName.setBounds(265, 35, 100, lblHotelName.getPreferredSize().height);

                //---- lblRoomType ----
                lblRoomType.setText("Room Type:");
                panel1.add(lblRoomType);
                lblRoomType.setBounds(370, 35, 100, 17);
                panel1.add(tfRoomType);
                tfRoomType.setBounds(375, 50, 100, 40);
                panel1.add(tfZipcode);
                tfZipcode.setBounds(260, 110, 100, 40);

                //---- lblZipcode ----
                lblZipcode.setText("Zipcode:");
                panel1.add(lblZipcode);
                lblZipcode.setBounds(260, 95, 100, 17);
                panel1.add(tfNumberOfPeople);
                tfNumberOfPeople.setBounds(375, 110, 100, 40);

                //---- lblNumberOfPeople ----
                lblNumberOfPeople.setText("Number of People:");
                panel1.add(lblNumberOfPeople);
                lblNumberOfPeople.setBounds(375, 90, 100, 17);

                //---- btnShowRooms ----
                btnShowRooms.setText("Show Rooms");
                btnShowRooms.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnShowRooms.setActionCommand("Book a room");
                btnShowRooms.setName("show rooms");
                panel1.add(btnShowRooms);
                btnShowRooms.setBounds(30, 155, 215, 60);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            pnlControl.add(panel1);

            //======== pnlCommand ========
            {
                pnlCommand.setPreferredSize(new Dimension(300, 0));
                pnlCommand.setLayout(null);

                //---- btnResetFilters ----
                btnResetFilters.setText("Reset Filters");
                btnResetFilters.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnResetFilters.setName("reset filters");
                btnResetFilters.setActionCommand("Book a room");
                pnlCommand.add(btnResetFilters);
                btnResetFilters.setBounds(50, 45, 200, 60);

                //---- btnBook ----
                btnBook.setText("Book");
                btnBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnBook.setActionCommand("Book a room");
                btnBook.setName("book");
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
    // Generated using JFormDesigner Evaluation license - Kutay Mumcu
    private JScrollPane pnlReservableHotels;
    private JTable tblData;
    private JPanel pnlControl;
    private JPanel panel1;
    private JTextArea textArea1;
    private JLabel lblCheckInDate;
    private JLabel lblCheckOutDate;
    private JTextField tfCheckInDate;
    private JTextField tfCheckOutDate;
    private JTextField tfHotelName;
    private JLabel lblHotelName;
    private JLabel lblRoomType;
    private JTextField tfRoomType;
    private JTextField tfZipcode;
    private JLabel lblZipcode;
    private JTextField tfNumberOfPeople;
    private JLabel lblNumberOfPeople;
    private JButton btnShowRooms;
    private JPanel pnlCommand;
    private JButton btnResetFilters;
    private JButton btnBook;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
