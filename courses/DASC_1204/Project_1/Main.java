/******************************************************************************
Chance Pickett
1/30/24
Homework 1
*******************************************************************************/
//import scanner
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Hawkins Palace Arcade!");
		
		//Ask players for quarter amounts and game cost using Scanner object
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many quarters did Dustin bring with him? >>");
		int numDustinQuarters = scanner.nextInt();
		System.out.println("How many quarters do the games Dustin prefer cost? >>");
		int dustinGameCost = scanner.nextInt();
		System.out.println("How many quarters did Lucas bring with him? >>");
		int numLucasQuarters = scanner.nextInt();
		System.out.println("How many quarters do the games Lucas prefer cost? >>");
		int lucasGameCost = scanner.nextInt();
		System.out.println("How many quarters did Mike bring with him? >>");
		int numMikeQuarters = scanner.nextInt();
		System.out.println("How many quarters do the games Mike prefer cost? >>");
		int mikeGameCost = scanner.nextInt();
		System.out.println("How many quarters did Max bring with him? >>");
		int numMaxQuarters = scanner.nextInt();
		System.out.println("How many quarters do the games Max prefer cost? >>");
		int maxGameCost = scanner.nextInt();
		
		//Calculate the amount of games each player can play and how many quarters they have left
		int dustinGames = numDustinQuarters / dustinGameCost;
		int dustinRemainder = numDustinQuarters % dustinGameCost;
		int lucasGames = numLucasQuarters / lucasGameCost;
		int lucasRemainder = numLucasQuarters % lucasGameCost;
		int mikeGames = numMikeQuarters / mikeGameCost;
		int mikeRemainder = numMikeQuarters % mikeGameCost;
		int maxGames = numMaxQuarters / maxGameCost;
		int maxRemainder = numMaxQuarters % maxGameCost;
		
		//Print amount of games they can play and the remainders
		System.out.println("Dustin will be able to play " + dustinGames + " games that cost " + dustinGameCost + " quarter(s), and will have " + dustinRemainder + " quarters remaining.");
		System.out.println("Lucas will be able to play " + lucasGames + " games that cost " + lucasGameCost + " quarter(s), and will have " + lucasRemainder + " quarters remaining.");
		System.out.println("Mike will be able to play " + mikeGames + " games that cost " + mikeGameCost + " quarter(s), and will have " + mikeRemainder + " quarters remaining.");
		System.out.println("Max will be able to play " + maxGames + " games that cost " + maxGameCost + " quarter(s), and will have " + maxRemainder + " quarters remaining.\n\n");
		
		//Calculate Profit
		System.out.println("On an average night, how much money does The Palace make? >>");
		double dailyProfit = scanner.nextDouble();
		double weeklyProfit = dailyProfit * 6;
		double monthlyProfit = weeklyProfit * 4 ;
		double yearlyProfit = weeklyProfit * 52;
		
		//Print Profit
		System.out.printf("The Palace weekly profit: $%,.02f%n", weeklyProfit);
		System.out.printf("The Palace monthy profit: $%,.02f%n", monthlyProfit);
		System.out.printf("The Palace yearly profit: $%,.02f%n", yearlyProfit);
	}
}
