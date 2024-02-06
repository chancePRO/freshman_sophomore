/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
 public static void main (String[]args)
 {
    Scanner scnr = new Scanner (System.in);
    // Input values
    float n1, n2, n3, n4;
    System.out.print("Enter four numbers:");
    n1 = scnr.nextFloat();
    n2 = scnr.nextFloat();
    n3 = scnr.nextFloat();
    n4 = scnr.nextFloat();
     // Calculate mean of 4 values
     float mean = (n1 + n2 + n3 + n4) / 4;
     // Calculate variance of 4 values
     float variance = (((n1 - mean) * (n1 - mean)) + ((n2 - mean) * (n2 - mean))
     + ((n3 - mean) * (n3 - mean)) + ((n4 - mean) * (n4 - mean))) / 4;
     // Print the output
     System.out.println("mean = " + mean);
     System.out.println("variance = " + variance);
 }
}
