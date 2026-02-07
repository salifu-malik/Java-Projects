import java.util.Scanner;
public class CarlysEventPrice {
    public static void main(String[] args) {
        int nOfGuests, totalPrice;
        final int pricePerPerson = 35;
        boolean largeOrSmallEvent;

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter the number  of guests here:");
        nOfGuests = inputDevice.nextInt();

        totalPrice = nOfGuests * pricePerPerson;
        System.out.println("**Carly's Event And Catering");

        if (nOfGuests < 50){
             largeOrSmallEvent = true;

            System.out.println("The number of guests present is " + nOfGuests + " and the price per guest is $" + pricePerPerson + ", the total price is $" + totalPrice + ". Since the number of guests is less than 50, then it is false that it is a large event.");

        }else{
             largeOrSmallEvent = false;

             System.out.println("The number of guests present is " + nOfGuests + " and the price per guest is $" + pricePerPerson + ", the total price is $" + totalPrice + ". Since the number of guests is greater than 50, then it is true that it is a large event.");


         }

//        if (largeOrSmallEvent) {
//            System.out.println("The number of guests present is " + nOfGuests + " and the price per guest is $" + pricePerPerson + ", the total price is $" + totalPrice + ". Since the number of guests is less than 50, then it is " + largeOrSmallEvent + " that it is a small event.");
//        }
//        if (!largeOrSmallEvent){
//            System.out.println("The number of guests present is " + nOfGuests + " and the price per guest is $" + pricePerPerson + ", the total price is $" + totalPrice + ". Since the number of guests is greater than 50, then it is " + largeOrSmallEvent + " that it is a large event.");
//
//        }

    }
}
