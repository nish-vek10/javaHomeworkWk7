package week7_Homework2;

import java.util.Scanner;

public class Task4 {
/*
        4. Take values of length and breadth of a rectangle from user and check if it is square or not.
 */

    void recOrSqr() {
        Scanner sc = new Scanner(System.in); //create scanner object

        System.out.print("Enter the length: "); //print statement
        int length = sc.nextInt(); //read user input

        System.out.print("Enter the breadth: "); //print statement
        int breadth = sc.nextInt(); //read user input

        System.out.print("\n"); //skips a line

        if (length == breadth) {
            System.out.println("The Quadrilateral is a SQUARE."); //print if condition true
        } else {
            System.out.println("The Quadrilateral is a RECTANGLE."); //print if condition false
        }
    }

    //Main method
    public static void main(String[] args) {
        Task4 myObj = new Task4(); //create object
        myObj.recOrSqr(); //call instance method
    }
}
