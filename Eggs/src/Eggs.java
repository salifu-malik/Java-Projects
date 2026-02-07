import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {
        float dozenPrice =3.25f;
        float oneEggPrice = 0.45f;
        int oneDozen = 12;
        float total;
        int numberOfEggs, numberOfDozens,remainderEggs;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of eggs:");
        numberOfEggs = inputDevice.nextInt();
        numberOfDozens = numberOfEggs / oneDozen;
        remainderEggs = numberOfEggs % oneDozen;
        total = numberOfDozens * dozenPrice + oneEggPrice * remainderEggs;
        System.out.println("You ordered for "+numberOfEggs+ ".That's " + numberOfDozens + " dozen at $3.35 per dozen and " +remainderEggs +" loose eggs at 45 cents each fo a total of $" + total);
    }
}
