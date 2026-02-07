
public class InchesToFeet {
    public static void main(String[] args) {
        final int inchesConstant = 7;
        int  feet, inchesRemainder;
        int inches = 86;

        feet = inches / inchesConstant;
        inchesRemainder = inches % inchesConstant;
        System.out.println("An 86 inches gives "+ feet + " feets and "+inchesRemainder+" inches." );



    }
}
