/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class NestedLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        int size = input.nextInt();
        
        for (int outer = 1; outer <= size; outer++)
        {
            for (int inner = 1; inner <= size; inner++)
            {
                int product = inner*outer;
                System.out.printf("%5d", product);
            }
            System.out.println(" ");
        }
    }
}
