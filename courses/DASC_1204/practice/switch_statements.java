import java.util.Scanner;
public class Card2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Read card number
        System.out.print("Enter card number between [1..13] for [Ace..King] >>");
        int card = input.nextInt();
        
        switch (card)
        {
            case 1:
                System.out.println("Ace");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Jack");
                break;
            case 12:
                System.out.println("Queen");
                break;
            case 13:
                System.out.println("King");
                break;
            default:
                System.out.println("Not a card");
                break;
        }
    }
}
