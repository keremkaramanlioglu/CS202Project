import entities.*;
import panels.adminPanels.EmployeesPanel;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Hotel hotel = new Hotel();
        //HotelView view = new HotelView();
        //new HotelManager(hotel, view);
        try {
            String tableName = "Rooms";
            String sql = "select * from " + tableName;
            String url = "jdbc:mysql://localhost:3306/myDB";
            String userName = "root";
            String password = "kerem1453";


            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                if (rs.isClosed()) break;
                Room r = new Room(rs);
                System.out.println(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}