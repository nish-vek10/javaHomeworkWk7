package week7_Homework;

import java.util.Scanner;

public class Task18 {
/*
        18. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
            “ZERO”
 */

    //declare instance method
    void intCheck() {
        Scanner sc = new Scanner(System.in);  //create scanner object
        System.out.print("Input Any Integer: "); //print out statement
        int num = sc.nextInt();  //read user input

        if (num < 0) { //if condition
            System.out.println("Given number " + num + " is NEGATIVE."); //print if true
        } else if (num > 0) { //else if condition
            System.out.println("Given number " + num + " is POSITIVE."); //print if first false and second true
        } else { //else condition
            System.out.println("Given number " + num + " is ZERO."); //print if both of the above are false
        }
    }

    //Main method
    public static void main(String[] args) {
        Task18 myObj = new Task18(); //create object
        myObj.intCheck(); //call instance method
    }
}
