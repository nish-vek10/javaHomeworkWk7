package week7_Homework2;

import java.util.Scanner;

public class Task8 {
/*
        8.  A student will not be allowed to sit in exam if his/her attendence is less than 75%.
            Take following input from user
            Number of classes held
            Number of classes attended.
            And print
            percentage of class attended
            Is student is allowed to sit in exam or not.
 */

    //declare instance method
    void attendance() {
        Scanner sc = new Scanner(System.in); //create scanner object

        System.out.print("Number of classes held: "); //print statement
        double cHeld = sc.nextDouble(); //read user input

        System.out.print("Number of classes attended: "); //print statement
        double cAttend = sc.nextDouble(); //read user input

        System.out.print("\n"); //skips a line

        if (cAttend < cHeld) {
            double cPerc = (cAttend / cHeld) * 100; //declare local variable
            System.out.println("Percentage of class attended: " + String.format("%.2f", cPerc) + "%."); //print statement
            double passMark = 75.0;
            System.out.print("Is student allowed to sit in exam? "); //print statement
            if (cPerc < passMark) {
                System.out.print("NO."); //not allowed if less than 75
            } else {
                System.out.print("YES."); //otherwise allowed
            }
        } else {
            System.out.println("INVALID ENTRY!");
        }
    }

    //Main method
    public static void main(String[] args) {
        Task8 myObj = new Task8(); //create object
        myObj.attendance(); //call instance method
    }
}
