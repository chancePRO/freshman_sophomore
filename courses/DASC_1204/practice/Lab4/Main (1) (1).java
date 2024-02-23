/******************************************************************************

Chance Pickett
Lab 4
2/22/24
*******************************************************************************/
import java.util.Scanner;

public class Main{
    public static char getConcert()
    {
        // Print menu
        System.out.println("The following concerts are available:");
        System.out.println(" B for Beyonce");
        System.out.println(" L for Lady Gaga");
        System.out.println(" T for Taylor Swift");
        System.out.print("Enter the concert you want >> ");
         
        // Read user input
        Scanner scnr = new Scanner(System.in);
        char concert = scnr.nextLine().charAt(0);
        concert = Character.toUpperCase(concert);
        return concert;
    }
        
    public static int getNumTickets()
    {
        // Read user input
        System.out.print("Enter number of tickets >> ");
        Scanner scnr = new Scanner(System.in);
        int numTickets = scnr.nextInt();
         
        // Loop until user input is valid
        while ((numTickets < 0) || (numTickets > 10))
        {
            if (numTickets < 0)
                System.out.println("Error: number must be > 0");
            else if (numTickets > 10)
                System.out.println("Error: number must be <= 10");
                System.out.println("Enter number of tickets:");
                numTickets = scnr.nextInt();
        }
        
    return numTickets;
        
        
    }
    
    public static double getCost(char concert, int numTickets)
    {
        double cost = 0;
        // Beyonce tickets are $35 each
        if(concert == 'B'){
            cost = 35 * numTickets;
        }else if(concert == 'L'){
            cost = 45 * numTickets;
        }else{
            cost = 40 * numTickets;
        }
        
        if(numTickets >4){
            cost = cost - (cost * 0.1);
        }
        // Lady Gaga tickets are $45 each
        // Taylor Swift tickets are $40 each
        // Cost is price * NumTickets
        // Give 10% discount on 5 or more tickets
        return cost;
    }
     
    public static void main(String[] args) 
    {
        // Declare variables
        char concert = ' ';
        int numTickets = 0;
        double cost = 0.0;
        // Call function to find out the concert they want to attend
        
        while((concert != 'B') && (concert != 'L') && (concert != 'T')){
            concert = getConcert();
        }
        
        numTickets = getNumTickets();
        cost = getCost(concert, numTickets);
        // Call function to find out how many tickets they want
        // Call function to calculate total cost
        // Print out the information you have collected.
        System.out.println("The customer wants the following:");
        System.out.println("Concert: " + concert);
        System.out.println("Number of Tickets: " + numTickets);
        System.out.printf("Total Cost: $%.2f\n", cost);
    }
}
