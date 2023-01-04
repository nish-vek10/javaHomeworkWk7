package week7_Homework2;

import java.util.Scanner;

public class Task5 {
/*
        5. Take two int values from user and print greatest among them.
 */

    //Main method
    public static void main(String[] args) {
        greaterAmongst(); //call static method
    }

    static void greaterAmongst() {
        Scanner sc = new Scanner(System.in); //create scanner object

        System.out.print("Enter First Integer Value: "); //print statement
        int val1 = sc.nextInt(); //read user input

        System.out.print("Enter Second Integer Value: "); //print statement
        int val2 = sc.nextInt(); //read user input

        System.out.print("\n"); //skips a line

        if (val1 > val2) {
            System.out.println("The greatest value between the two is " + val1); //print if val1 greater than val2
        } else if (val1 < val2) {
            System.out.println("The greatest value between the two is " + val2); //print if val2 greater than val1
        } else {
            System.out.println("BOTH VALUES ARE EQUAL!"); //print if val2 greater than val1
        }
    }
}
