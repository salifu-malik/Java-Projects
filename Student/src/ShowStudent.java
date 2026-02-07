/**
 b. Write a class named ShowStudent that instantiates a Student object from the
 class you created and assign values to its fields. Compute the Student grade
 point average, and then display all the values associated with the Student
 */



public class ShowStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.computeGradePointAverage();

        student.dispalyInfo();
    }
}
