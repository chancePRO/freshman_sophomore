/******************************************************************************
Chance Pickett
Lab3a
2/12/24
*******************************************************************************/
import java.util.Scanner;
public class Loops
{
     public static void main(String[] args)
     {
         // Get number from user
         Scanner input = new Scanner(System.in);
         int userNumber = 0;
         System.out.print("Enter a number >> ");
         userNumber = input.nextInt();
         
         // Print numbers from [1..input]
         for (int num = 1; num <= userNumber; num++)
            System.out.print(num + " ");
            System.out.println();
         
         // Print EVEN numbers from [0..input-1] (TBA)
         for (int num = 0; num <= userNumber; num=num+2)
            System.out.print(num + " ");
            System.out.println();
         
         // Print ODD numbers from [input..1] (TBA)
         if(userNumber%2 == 0)
         {
            for (int num=userNumber-1; num>=0; num=num-2)
                System.out.print(num + " ");
                System.out.println();
         }else
         {
            for (int num=userNumber; num>=0; num=num-2)
                System.out.print(num + " ");
                System.out.println();
         }
     }
}
