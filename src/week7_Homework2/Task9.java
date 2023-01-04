package week7_Homework2;

import java.util.Scanner;

public class Task9 {
/*
        9.  Modify the above question to allow student to sit if he/she has medical cause. Ask
            user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
 */

    //declare instance method
    void attendance() {
        Scanner sc = new Scanner(System.in); //create scanner object

        System.out.print("Number of classes held: "); //print statement
        double cHeld = sc.nextDouble(); //read user input

        System.out.print("Number of classes attended: "); //print statement
        double cAttend = sc.nextDouble(); //read user input

        System.out.print("Do they have a medical cause? (Y/N): "); //print statement
        char medCause = sc.next().charAt(0); //read user input

        System.out.print("\n"); //skips a line

        if (cAttend < cHeld) {
            double cPerc = (cAttend / cHeld) * 100; //declare local variable
            System.out.println("Percentage of class attended: " + String.format("%.2f", cPerc) + "%."); //print statement
            System.out.println(); //skip a line
            double passMark = 75.0;
            System.out.print("Is student cleared on their attendance record? "); //print statement
            if (cPerc < passMark) {
                System.out.print("NO."); //not allowed if less than 75
                System.out.println(); //skip to a new line
                System.out.print("Is student cleared on their medical status? "); //print statement
                if (medCause == 'Y') {
                    System.out.print("NO."); //not allowed if they have a medical problem
                } else if (medCause == 'N') {
                    System.out.print("YES."); //otherwise allowed
                }
                System.out.println("\n"); //skip a line
                if (cPerc > passMark && medCause == 'N') {
                    System.out.print("Is student allowed to sit the exam? YES"); //allowed for exam if both cleared
                } else {
                    //not allowed for exam if both not cleared
                    System.out.print("Is student allowed to sit the exam? NO");
                }
            } else {
                System.out.print("YES."); //otherwise allowed
                System.out.println(); //skip to a new line
                System.out.print("Is student cleared on their medical status? "); //print statement
                if (medCause == 'Y') {
                    System.out.print("NO."); //not allowed if they have a medical problem
                } else if (medCause == 'N') {
                    System.out.print("YES."); //otherwise allowed
                }
                System.out.println("\n"); //skip a line
                if (cPerc > passMark && medCause == 'N') {
                    System.out.println("Is student allowed to sit the exam? YES"); //allowed for exam if both cleared
                } else {
                    //not allowed for exam if both not cleared
                    System.out.println("Is student allowed to sit the exam? NO");
                }
            }
        } else {
            System.out.println("INVALID ENTRY!");
        }
    }

    //Main method
    public static void main(String[] args) {
        Task9 myObj = new Task9(); //create object
        myObj.attendance(); //call instance method
    }
}
