import java.sql.*;

public class DBConnectionControl {
    String hostName;
    String dbName;
    String userName;
    String password;
    String port;
    public DBConnectionControl(String hostName, String dbName, String userName, String password, String port) throws SQLException {
        this.hostName = hostName;
        this.dbName = dbName;
        this.userName = userName;
        this.password = password;
        this.port = port;
        try {
            createConnection();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createConnection() throws SQLException {
        String url = "jdbc:mysql://" + hostName + ":" + port + "/" + dbName;
        Connection conn = DriverManager.getConnection(url, userName, password);
        if (conn != null && conn.isValid(0)) {
            System.out.println("Database " + dbName + " is connected successfully.");
        }
    }
}
