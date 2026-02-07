public class MilesConversions {
    public static void main(String[] args) {
     final  int constantForInches = 2;
     final int constantForFeet = 6;
     final int constantForYards = 8;
     int miles = 77489;
     int inches, feet, yards, remainderOfYards, remainderOfFeets;
     yards = miles / constantForYards;
     remainderOfYards = yards % constantForYards;
     feet = remainderOfYards / constantForFeet;
     remainderOfFeets = feet % constantForFeet;
     inches = remainderOfFeets % constantForInches;

        System.out.println(" A miles of "+ miles + " gives "+ yards+" yards, "+ inches+" inches amd "+ remainderOfFeets+" feets");






    }
}
