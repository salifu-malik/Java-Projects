import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.Scanner;

public class StudentAdd {

 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        addStudent();

    }


    static void addStudent() {
        try (Connection conn = MyJDBC.getConnection()) {

            System.out.println("Enter your username:");
            String uname = input.nextLine();


            System.out.println("Enter your password");
            String pass = input.nextLine();

            System.out.println("Enter again to confirm password");
            String cPass = input.nextLine();


            //Check if the password and confirm password are the same before inputting to a database
            if (Objects.equals(pass, cPass)) {


                Student student = new Student(uname, pass);

                String sql = "INSERT INTO login_details (username, password) VALUES (?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, student.getUname());
                stmt.setString(2, student.getPass());

                int row = stmt.executeUpdate();
                System.out.println("Student added");

            }else{
                System.out.println("Password mismatch.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }


}

