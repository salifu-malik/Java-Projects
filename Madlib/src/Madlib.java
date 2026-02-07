import java.util.Scanner;
public class Madlib {
    public static void main(String[] args) {
        String firstNoun, secondNoun, adjective, pastTenseVerb;

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter the first noun:");
        firstNoun = inputDevice.nextLine();

        System.out.println("Enter the second noun:");
        secondNoun = inputDevice.nextLine();

        System.out.println("Enter the adjective:");
        adjective = inputDevice.nextLine();

        System.out.println("Enter the past-tense verb noun:");
        pastTenseVerb = inputDevice.nextLine();


        System.out.println("Mary had a little "+firstNoun);
        System.out.println("Is book was silly as" + secondNoun);
        System.out.println("And everywhere that Mary "+adjective);
        System.out.println("The "+firstNoun+" was sure to go");

    }
}
