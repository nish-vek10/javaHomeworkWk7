package week7_Homework;

import java.util.Scanner;

public class Task12 {
/*
        12. Write a java program to input any two number and ask user to enter their symbol (+, -,
            /, *) find addition, Subtraction, multiplication and division according to their symbol
            (using if else)
 */

    //declare static method
    static void m1() {
        Scanner sc = new Scanner(System.in);  //create scanner object

        System.out.print("Enter First Integer Value: "); //print out statement
        int num1 = sc.nextInt();  //read user input

        System.out.print("Enter Second Integer Value: "); //print out statement
        int num2 = sc.nextInt();  //read user input

        System.out.print("Enter Operation (+,-,*,/): "); //print out statement
        char c = sc.next().charAt(0);  //read user input

        if (c == '+') { //condition if operation is addition
            int ans = num1 + num2; // declare local variable
            System.out.println("Output: " + num1 + " " + c + " " + num2 + " = " + ans); //print statement and result
        } else if (c == '-') { //condition if operation is subtraction
            int ans = num1 - num2; // declare local variable
            System.out.println("Output: " + num1 + " " + c + " " + num2 + " = " + ans); //print statement and result
        } else if (c == '*') { //condition if operation is multiplication
            int ans = num1 * num2; // declare local variable
            System.out.println("Output: " + num1 + " " + c + " " + num2 + " = " + ans); //print statement and result
        } else if (c == '/') { //condition if operation is division
            double ans = (double) num1 / (double) num2; // declare local variable
            //print statement and result to two decimal places
            System.out.println("Output: " + num1 + " " + c + " " + num2 + " = " + String.format("%.2f", ans));
        }
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}
