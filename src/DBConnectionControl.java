import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class DBConnectionControl {
    String hostName;
    String dbName;
    Connection con;



    public void testConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
