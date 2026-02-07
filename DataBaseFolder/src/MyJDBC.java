import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_dbname"; // Change DB name
        String user = "root";
        String password = "my_dbpassword";
        return DriverManager.getConnection(url, user, password);
    }
}

