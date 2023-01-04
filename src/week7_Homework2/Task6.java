package week7_Homework2;

import java.util.Scanner;

public class Task6 {
/*
        6.  A school has the following rules for grading system:
            a. Below 25 - F
            b. 25 to 45 - E
            c. 45 to 50 - D
            d. 50 to 60 - C
            e. 60 to 80 - B
            f. Above 80 - A
            Ask user to enter marks and print the corresponding grade.
 */

    void gradingSystem() {
        Scanner input = new Scanner(System.in); //create scanner object
        System.out.print("Enter Marks: "); //print statement
        int val = input.nextInt(); //read user input

        System.out.print("\n"); //skips a line

        if (val >= 80 && val <= 100) {
            System.out.println("Grade: A"); //print statement if greater than 80
        } else if (val >= 60 && val < 80) {
            System.out.println("Grade: B"); //print statement if between 60 and 80
        } else if (val >= 50 && val < 60) {
            System.out.println("Grade: C"); //print statement if between 50 and 60
        } else if (val >= 45 && val < 50) {
            System.out.println("Grade: D"); //print statement if between 45 and 50
        } else if (val >= 25 && val < 45) {
            System.out.println("Grade: E"); //print statement if between 25 and 45
        } else if (val >= 0 && val < 25) {
            System.out.println("Grade: F"); //print statement if less than 25
        } else {
            System.out.println("INVALID ENTRY!"); //print statement if less than 0 or more than 100
        }
    }

    //Main method
    public static void main(String[] args) {
        Task6 myObj = new Task6(); //create object
        myObj.gradingSystem(); //call method
    }
}
