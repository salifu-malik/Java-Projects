public class QuartsToGallons {
    public static void main(String[] args) {
        final int numberOfQuartsPerGallon = 4;
        int numberOfQuarts = 18;
        int remainderOfQuarts, numberOfGallons;
        numberOfGallons = numberOfQuarts / numberOfQuartsPerGallon;
        remainderOfQuarts = numberOfQuarts % numberOfQuartsPerGallon;
        System.out.println("A job that needs "+numberOfQuarts+ " quarts requires "+ numberOfGallons+ " gallons"+ " plus "+ remainderOfQuarts+ " quarts.");



    }
}
