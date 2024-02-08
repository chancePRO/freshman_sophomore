import java.util.Scanner;
public class Grade
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        // Read test score
        System.out.print("Enter test score >> ");
        float score = input.nextFloat();
        
        // Check test score
        if (score >= 100)
            System.out.println("Your grade is A+\n");
        else if (score >= 90)
            System.out.println("Your grade is A\n");
        else if (score >=80)
            System.out.println("Your grade is B\n");
        else if (score >=70)
            System.out.println("Your grade is C\n");
        else if (score >=60)
            System.out.println("Your grade is D\n");
        else
            System.out.println("Your grade is F\n");
     }
}
