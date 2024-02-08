/******************************************************************************

Chance Pickett
2/7/24
Homework 2

*******************************************************************************/
//Import Scanner and Random
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        //Create Scanner and Random objects
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        //Crop names
        final String CORN = "Corn";
        final String TOMATO = "Tomato";
        final String SPINACH = "Spinach";
        final String BROCCOLI = "Broccoli";
        
        //Sell price
        double cornSellPrice = 4.00;
        double tomatoSellPrice = 2.00;
        double spinachSellPrice = 2.50;
        double broccoliSellPrice = 6.00;
        
        //Cost to buy
        double cornBuyPrice = 2.00;
        double tomatoBuyPrice = 0.50;
        double spinachBuyPrice = 1.50;
        double broccoliBuyPrice = 2.50;
        
        //Crop sell price menu
        //-10s means a left-justified string of width 10 characters
        System.out.println("Current Selling Prices");
        System.out.printf("  %-10s $%.2f\n", CORN, cornSellPrice);
        System.out.printf("  %-10s $%.2f\n", TOMATO, tomatoSellPrice);
        System.out.printf("  %-10s $%.2f\n", SPINACH, spinachSellPrice);
        System.out.printf("  %-10s $%.2f\n", BROCCOLI, broccoliSellPrice);
        
        //Crop cost to buy menu and ask user to choose crop
        System.out.println("Please choose a vegetable and note cost to buy:");
        System.out.printf("  1. %-10s $%.2f\n", CORN, cornBuyPrice);
        System.out.printf("  2. %-10s $%.2f\n", TOMATO, tomatoBuyPrice);
        System.out.printf("  3. %-10s $%.2f\n", SPINACH, spinachBuyPrice);
        System.out.printf("  4. %-10s $%.2f\n", BROCCOLI, broccoliBuyPrice);
        
        int chosenCrop = scanner.nextInt();
        
        //Track selected crop name, sell/buy prices and exits if incorrect value
        String chosenCropName = "";
        double chosenSellPrice = 0;
        double chosenBuyPrice = 0;
        
        switch (chosenCrop) {
            case 1:
                chosenCropName = CORN;
                chosenSellPrice = cornSellPrice;
                chosenBuyPrice = cornBuyPrice;
                break;
            case 2:
                chosenCropName = TOMATO;
                chosenSellPrice = tomatoSellPrice;
                chosenBuyPrice = tomatoBuyPrice;
                break;
            case 3:
                chosenCropName = SPINACH;
                chosenSellPrice = spinachSellPrice;
                chosenBuyPrice = spinachBuyPrice;
                break;
            case 4:
                chosenCropName = BROCCOLI;
                chosenSellPrice = broccoliSellPrice;
                chosenBuyPrice = broccoliBuyPrice;
                break;
            default:
            System.out.println("That is not a valid choice. Exiting now.");
            System.exit(0);
                break;
        }
        
        //Ask user number of crops to buy
        System.out.println("How many plants of " + chosenCropName + " are you going to purchase?");
        int numChosenCrop = scanner.nextInt();
        
        //Calculate total price of chosen crop
        double totalBuyCost = numChosenCrop * chosenBuyPrice;
        
        if (numChosenCrop >=1){
            System.out.printf("You spent $%,.2f purchasing %d plant(s) of %s.", totalBuyCost, numChosenCrop, chosenCropName);
        } else{
            System.out.println("You can't buy fewer than 1 plant. Setting you number of plants to 1.");
            numChosenCrop = 1;
            totalBuyCost = numChosenCrop * chosenBuyPrice;
            System.out.printf("You spent $%,.2f purchasing 1 plant of %s.", totalBuyCost, chosenCropName);
        }
        
        //Weather
        int numPlantsDestroyed = rand.nextInt(numChosenCrop);
        String weather = "";
        if (numPlantsDestroyed == 0){
            weather = "good";
            System.out.printf("\nThe weather was fantastic this year and all of your plants survived the season.");
        }else if(numPlantsDestroyed >= numChosenCrop/2){
            weather = "bad";
            System.out.printf("\nOh No! Extreme weather conditions have destroyed %d %s plant(s).", numPlantsDestroyed, chosenCropName);
        }else{
            weather = "ok";
            System.out.printf("\nMediocre weather conditions have destroyed %d %s plant(s).", numPlantsDestroyed, chosenCropName);
        }

        //Profit/Loss/Break even
        int numSurvivedPlants = numChosenCrop - numPlantsDestroyed;
        double totalSellCost = numSurvivedPlants * chosenSellPrice;
        double revenue = totalSellCost - totalBuyCost;
        if (revenue == 0){
            System.out.printf("\nAfter selling your remaining %d plant(s) for $%,.2f, you barely broke even for the year.", numSurvivedPlants, totalSellCost);

        }else if(revenue < 0){
            System.out.printf("\nAfter selling your remaining %d plant(s) for $%,.2f, you incurred a loss of $%,.2f.", numSurvivedPlants, totalSellCost, Math.abs(revenue));
        }else if(revenue > 0 && weather == "bad"){
            System.out.printf("\nAfter selling your remaining %d plant(s) for $%,.2f, you made a profit of $%,.2f!\nYou made a profit, but you lost a good percentage of the plants you worked hard to plant.", numSurvivedPlants, totalSellCost, revenue);
        }else{
            System.out.printf("\nAfter selling your remaining %d plant(s) for $%,.2f, you made a profit of $%,.2f!", numSurvivedPlants, totalSellCost, revenue);
        }
        
    }
}

