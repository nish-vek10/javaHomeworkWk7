package week7_Homework;

import java.util.Scanner;

public class Task7 {
/*
        7. Write a java program to input any number and find out if it’s odd or even.
 */

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }

    //declare static method
    static void m1() {
        Scanner myInput = new Scanner(System.in);  //create a Scanner object
        System.out.print("Enter a number: "); //print out statement

        int num = myInput.nextInt();  //read user input

        int i = num % 2; //declare local variable
        if (i == 0) { //condition
            System.out.println("The number " + num + " is EVEN.");  //print out result if true
        } else {
            System.out.println("The number " + num + " is ODD.");  //print out result if false
        }
    }
}
