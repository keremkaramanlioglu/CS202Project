import entities.Hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DBConnectionControl {
    String hostName;
    String dbName;
    String userName;
    String password;
    String port;
    Connection con;
    DBConnectionTestFrame dbConnectionTestFrame;

    public DBConnectionControl() throws SQLException {
        this.dbConnectionTestFrame = new DBConnectionTestFrame();
        dbConnectionTestFrame.addButtonListener(new ButtonListener());
    }

    public void createConnection() throws SQLException {
        String url = "jdbc:mysql://";
        hostName = dbConnectionTestFrame.getHostName();
        dbName = dbConnectionTestFrame.getDatabaseName();
        userName = dbConnectionTestFrame.getUsername();
        password = String.valueOf(dbConnectionTestFrame.getPassword());
        port = dbConnectionTestFrame.getPort();
        url += hostName + ":" + port + "/" + dbName;
        con = DriverManager.getConnection(url, userName, password);
        Hotel hotel = new Hotel("Mars Hotel", "054394943940", "mars.hotel@gmail.com", 4.5, "Strike", "321", "99929");
        HotelDao hotelDao = new HotelDao(con);
        hotelDao.insertHotel(hotel);
        JOptionPane.showMessageDialog(null, "Connection Established!");
    }

    public Connection getConnection() {
        return this.con;
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "Test Connection":
                    try {
                        createConnection();
                    } catch (SQLException e1) {
                        JOptionPane.showMessageDialog(dbConnectionTestFrame, e1.getMessage(), "Connection Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "OK":
                    dbConnectionTestFrame.dispose();
                    dbConnectionTestFrame.setVisible(false);
            }
        }
    }
}
