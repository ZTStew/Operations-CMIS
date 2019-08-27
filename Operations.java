/*
 * Prompts the user for two values and returns the sum, difference, product and quotient
 *
 * @author Stewart
 * @version JAVA 8, 6/27/2019
 */

import java.lang.Math;
import java.util.Scanner;


public class Operations{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Boolean flag = true;
        Integer x = 0;
        Integer y = 0;

        /* Propts user for first value */
        /* While loop ensures user inputs a valid value */
        while(flag){
            System.out.print("Enter the first value: ");
            /* Use 'scan.nextLine()' to ovoid the "Scanner Bug" */
            String num = scan.nextLine();
            try {
                x = Integer.parseInt(num);
                flag = false;
            } catch(Exception e){
                System.out.println("ERROR: Invalid Input. Please Enter A New Value.");

            }
        }

        /* Propts user for second value */
        flag = true;
        while(flag){
            System.out.print("Enter the second value: ");
            String num = scan.nextLine();
            try {
                y = Integer.parseInt(num);
                flag = false;
            } catch(Exception e){
                System.out.println("ERROR: Invalid Input. Please Enter A New Value");
            }

        }


        System.out.println("\n# ----- # ------- ### ------- # ----- #\n");

        /* Prints the values entered for the user */
        System.out.print("Integer #1: " + x + "\n");
        System.out.print("Integer #2: " + y + "\n\n");

        /* Prints the outcome of each opperation for the user */
        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        /* Check to prevent the computer from dividing by 0 */
        if(y == 0){
            System.out.printf("%d / %d = N/A", x, y);
        } else {
            System.out.printf("%d / %d = %,.4f\n", x, y, (float)x/y);
        }
        scan.close();
    }
}
