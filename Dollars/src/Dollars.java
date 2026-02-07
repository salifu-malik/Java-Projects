import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        int numberOfDollars,division_20, division_10, division_5, division_1;
        final  int division20 = 20;
        final int division10 = 10;
        final int division5 = 5;
        final int  division1 = 1;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of dollars:");
        numberOfDollars = inputDevice.nextInt();
        division_20 = numberOfDollars / division20;
        division_10 = numberOfDollars / division10;
        division_5 =  numberOfDollars / division5;
        division_1 = numberOfDollars / division1;
        System.out.println("You  can have "+ division_20 +" 20s, " + division_10 + " 10s, " + division_5 + " 5s and " + division_1 + " 1s in $" +numberOfDollars);

    }
}
