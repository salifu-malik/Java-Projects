/**
 a. Create a class named Student that has fields for an ID number, number
 of credit hours earned, and number of points earned. (For example,
 many schools compute grade point averages based on a scale of 4, so a
 three-credit-hour class in which a student earns an A is worth 12 points.)
 Include methods to assign values to all fields. A Student also has a field for
 grade point average. Include a method to compute the grade point average
 field by dividing points by credit hours earned. Write methods to display the
 values in each Student field. Save this class as Student.java.

 b. Write a class named ShowStudent that instantiates a Student object from the
 class you created and assign values to its fields. Compute the Student grade
 point average, and then display all the values associated with the Student

 c. Create a constructor for the Student class you created. The constructor should
 initialize each Student’s ID number to 9999, his or her points earned to 12, and
 credit hours to 3 (resulting in a grade point average of 4.0). Write a program
 that demonstrates that the constructor works by instantiating an object and
 displaying the initial values


 */

public class Student {
    //Fields
  private  int id;
  private int nCreditHours;
  private int nPointsEarned;
  private  double gradePointAverage;


  //Constructor
    public Student(){
        id = 1298;
        nPointsEarned = 12;
        nCreditHours = 3;
        computeGradePointAverage();
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNCreditHours(int nCreditHours){
        this.nCreditHours = nCreditHours;
    }

    public int getNCreditHours() {
        return nCreditHours;
    }

    public void setNPointsEarned(int nPointsEarned){
        this.nPointsEarned = nPointsEarned;

    }

    public int getNPointsEarned() {
        return nPointsEarned;
    }

    public void setGradePointAverage(double gradePointAverage){
        this.gradePointAverage = gradePointAverage;
    }
public void  computeGradePointAverage(){
        if (nCreditHours != 0){
            gradePointAverage = (double) nPointsEarned / nCreditHours;
        }else{
            gradePointAverage = 0.00;
        }

}

public void dispalyInfo(){
    System.out.println("Your student ID is "+ getId());
    System.out.println("Your number of hours is "+ getNCreditHours());
    System.out.println("Your number of points earned is "+ getNPointsEarned());
    System.out.println("Your grade point average is "+ gradePointAverage);

}

}
