package week7_Homework2;

import java.util.Scanner;

public class Task11 {
/*
        11. Write a program to print a string entered by user.
 */

    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner object
        System.out.println("Enter A String: "); //print statement
        String str = input.nextLine(); //read user input
        System.out.print("\n"); //skips a line
        System.out.println("Output:");
        System.out.println(str); //print output
    }
}
