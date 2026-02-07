/**
 To encourage good grades, Hermosa High School has decided to award each
 student a bookstore credit that is 10 times the student’s grade point average. In
 other words, a student with a 3.2 grade point average receives a $32 credit. Create
 a class that prompts a student for a name and grade point average, and then
 passes the values to a method that displays a descriptive message. The message
 uses the student’s name, echoes the grade point average, and computes and
 displays the credit. Save the application as BookstoreCredit.java.
 */


import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        final int CONSTANT = 10;
        String name;
        double gpa;


        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = inputDevice.nextLine();

        System.out.println("Enter your grade point average(gpa):");
        gpa = inputDevice.nextDouble();

        displayCredit(name, gpa, CONSTANT);


    }

    public static void displayCredit(String name, double gpa, int CONSTANT){
       double  creditScore = gpa * CONSTANT;
        System.out.println("Your name is "+ name);
        System.out.println("Your grade point average is " + gpa);
        System.out.println("Your credit score is $" + creditScore);

    }
}
