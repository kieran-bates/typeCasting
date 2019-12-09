/*
 * Kieran Bates
 * December 9, 2019
 * This program prompts a user to input various data types and converts the user input into other data types
 */

package typecasting;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("***TYPE CASTING***");
        System.out.print("\nEnter an integer -->");
        int numberOne = input.nextInt();
        System.out.print("\n\nEnter a double -->");
        double numberTwo = input.nextDouble();
        System.out.print("\n\nEnter a single character -->");
        char charOne = (input.next()).charAt(0);
        System.out.print("\n\nEnter your name -->");
        String stringOne = input.next();
        System.out.print("\n\nEnter a number without a decimal-->");
        String stringTwo = String.valueOf(input.nextInt());
        System.out.print("\n\nEnter a number with a decimal-->");
        String stringThree = String.valueOf(input.nextDouble());
        
        System.out.println("\n");
        System.out.println("Int to double " +(double)numberOne);
        System.out.println("Double to int " +(int)numberTwo);
        System.out.println("Char to string " +String.valueOf(charOne));
        System.out.println("String to char " +stringOne.charAt(0));
        System.out.println("Double to int " +Integer.parseInt(stringTwo));
        System.out.println("Int to double " +Double.parseDouble(stringThree));
    }
    
}
