import java.util.Scanner;


public class InchConversion {

    public static void inchesToFeet(int inches, int ConstantInches, int Feet){
        System.out.println("The inches " + inches + " into feet is:");
        System.out.println(inches/ConstantInches);

    }

    public static void main(String[] args) {
       final  int ConstantInches = 12;
      final int Feet = 3;
        int  inches;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter  the  number of inches:");
        inches = inputDevice.nextInt();

        inchesToFeet(inches, ConstantInches, Feet);
        inchesToYards(inches, ConstantInches, Feet);

    }

    public  static void inchesToYards(int inches, int ConstantInches, int Feet){
        System.out.println("The inches " + inches + " into yard is:");
        System.out.println(inches/ (ConstantInches * Feet));


    }
}
