//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating an instance of the Sandwich Class
        Sandwich TestSandwich = new Sandwich();
        TestSandwich.setMainIngredient("Tuna");
        TestSandwich.setBreadType("Wheat");
        TestSandwich.setPrice(4.99);

        System.out.println(TestSandwich.getMainIngredient());
        System.out.println(TestSandwich.getBreadType());
        System.out.println(TestSandwich.getPrice());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}