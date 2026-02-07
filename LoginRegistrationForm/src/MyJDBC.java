import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class MyJDBC {


      private static final String url = "jdbc:mysql://127.0.0.1:3306/java_login_form";
      private static final  String user = "root";
      private static final  String pass = "";

        public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(url, user,pass);
        }





}
