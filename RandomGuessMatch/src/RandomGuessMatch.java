/**
  Write a program that selects a random number between 1 and 5 and asks
  the user to guess the number. Display a message that indicates the difference
  between the random number and the user’s guess. Display another message that
  displays the random number and the Boolean value true or false depending
  on whether the user’s guess equals the random number. Save the file as
  RandomGuessMatch.java.
 */

void main() {
    int random, userEntry;
    boolean results;

    Scanner inputDevice = new Scanner(System.in);
    IO.println("Enter any any number between 1 and 5 inclusive:");
    userEntry = inputDevice.nextInt();

    random = 1 + (int) (Math.random() * 5);
    results = random == userEntry;

    IO.println(" You entered " + userEntry + " and  its " + results + " because the random number chosen is " + random);

}
