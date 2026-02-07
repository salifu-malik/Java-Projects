import java.sql.*;
import java.util.*;



public class StudentUpdate {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        studentUpdate();

    }

    static void studentUpdate(){
        try(Connection conn = MyJDBC.getConnection()){
            System.out.println("Enter your username to update:");
            String uname = input.nextLine();


            System.out.println("Enter password to update");
            String pass = input.nextLine();


            Student student = new Student(uname, pass);

                String sql = "UPDATE login_details SET username = ?, password = ? WHERE id = 1";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, student.getUname());
                stmt.setString(2, student.getPass());


                int row = stmt.executeUpdate();
            System.out.println("Student Updated successfully");
        }catch (SQLException e){
            e.printStackTrace();

        }
    }
}
