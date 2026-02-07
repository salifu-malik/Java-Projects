import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
    final float costOfAdultMeal = 4.35f;
    final float costOfChildMeal = 3.10f;
    final float adultMealPrice = 7.00f;
    final float childMealPrice = 4.00f;
    float totalAdultMealPrice, numberAdultMeal,numberOfChildMeal,totalCost, totalChildMealPrice, totalAdultMealProfit, totalChildMealProfit, totalProfit, totalCostOfAdultMeal, totalCostOfChildrenMeal;

    Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number of adult meal:");
        numberAdultMeal = inputDevice.nextFloat();

        System.out.println("Enter number of children meal:");
        numberOfChildMeal = inputDevice.nextFloat();

        totalAdultMealPrice = numberAdultMeal * adultMealPrice;
        totalCostOfAdultMeal = costOfAdultMeal * numberAdultMeal;

        totalAdultMealProfit = totalAdultMealPrice - totalCostOfAdultMeal;
        totalCostOfChildrenMeal = costOfChildMeal * numberOfChildMeal;
        totalCost = totalCostOfAdultMeal + totalCostOfChildrenMeal;

        totalChildMealPrice = numberOfChildMeal *childMealPrice;
        totalChildMealProfit = totalChildMealPrice - totalCostOfChildrenMeal;

        totalProfit = (totalAdultMealProfit + totalChildMealProfit);

        System.out.println("The cost of producing " + numberAdultMeal+ " adult meals and " + numberOfChildMeal+ " children meals are $"+totalCostOfAdultMeal+ "and $"+ totalCostOfChildrenMeal+" respectively, making a total cost of $" +totalCost);
        System.out.println("The profit made from producing " + numberAdultMeal+ " adult meals and "+numberOfChildMeal+ " children meals are $"+totalAdultMealProfit+ " and $"+ totalChildMealProfit+ " respectively, making a tota; profit of $"+totalProfit);

    }
}
