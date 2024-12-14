import entities.*;
import panels.adminPanels.EmployeesPanel;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Hotel hotel = new Hotel();
        //HotelView view = new HotelView();
        //new HotelManager(view);
//        try {
//            String tableName = "Rooms";
//            String sql = "select * from " + tableName;
//            String userName;
//            String password;
//            String port;
//            String hostName;
//            String dbName;
//
//            Scanner s = new Scanner(System.in);
//            System.out.print("Enter the username: ");
//            userName = s.nextLine();
//            System.out.print("Enter the password: ");
//            password = s.nextLine();
//            System.out.print("Enter the port: ");
//            port = s.nextLine();
//            System.out.print("Enter the hostname: ");
//            hostName = s.nextLine();
//            System.out.print("Enter the db name: ");
//            dbName = s.nextLine();
//            System.out.println("Connecting to database...");
//
//            String url = "jdbc:mysql://" + hostName + ":" + port + "/" + dbName;
//
//            Connection conn = DriverManager.getConnection(url, userName, password);
//
//            if (conn != null && conn.isValid(0)) {
//                System.out.println("Database " + dbName + " is connected successfully.");
//            }
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()) {
//                if (rs.isClosed()) break;
//                Room r = new Room(rs);
//                System.out.println(r);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

        new DBConnectionTestFrame();
    }
}

//