/**
 a. Create a class named Sandwich. Data fields include a String for the main
 ingredient (such as tuna), a String for bread type (such as wheat), and a
 double for price (such as 4.99). Include methods to get and set values for
 each of these fields. Save the class as Sandwich.java.
 b. Create an application named TestSandwich that instantiates one Sandwich
 object and demonstrates the use of the set and get methods.

 */

public class Sandwich {

    String mainIngredient;
    String breadType;
    double price;


    public void setMainIngredient(String mainIngredient){
        this.mainIngredient = mainIngredient;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }


    public void setBreadType(String breadType){
        this.breadType = breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
