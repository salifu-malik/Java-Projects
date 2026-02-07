

import java.sql.*;

public class StudentRead {

    public static void main(String[] args) {
        readStudent();
    }

    static void readStudent() {
        try (Connection conn = MyJDBC.getConnection()) {

            String sql = "SELECT * FROM login_details";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\nID | Username | Password");

            while (rs.next()) {
                int id = rs.getInt("id");
                String uname = rs.getString("username");
                String pass = rs.getString("password");

                System.out.printf("%d | %s | %s\n", id, uname, pass);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
