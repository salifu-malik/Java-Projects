import java.sql.*;
import java.util.*;


public class StudentDelete {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        studentDelete();

    }

    static void studentDelete(){

        try(Connection conn = MyJDBC.getConnection()){

            System.out.println("Enter your id:");
            String id = input.nextLine();

            String sql = "DELETE FROM login_details WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);

            int row = stmt.executeUpdate();
            if(row > 0){
                System.out.println("Student deleted successfully.");
            }else{
                System.out.println("Student not found.");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
