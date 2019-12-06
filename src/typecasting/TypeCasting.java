/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.print("\n\nEnter a number with a decimal");
        String stringThree = String.valueOf(input.nextDouble());
        
    }
    
}
