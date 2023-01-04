package week7_Homework;

import java.util.Scanner;

public class Task10 {
/*
        10. Input any alphabet from "A" to "F" and print their city name accordingly (use if else), if
            any other alphabet should be invalid entry
 */

    //declare instance method
    void m1() {
        Scanner myInput = new Scanner(System.in);  //create scanner object
        System.out.print("Choose an alphabet from A to F: "); //print out statement
        char c = myInput.next().charAt(0);  //read user input
        char upperCase = Character.toUpperCase(c); //change to uppercase in case user inputs lowercase

        if (upperCase == 'A') { //if condition
            System.out.println("City: AGRA"); //print statement if true
        } else if (upperCase == 'B') {
            System.out.println("City: BERLIN"); //print statement if true
        } else if (upperCase == 'C') {
            System.out.println("City: CHENNAI"); //print statement if true
        } else if (upperCase == 'D') {
            System.out.println("City: DALLAS"); //print statement if true
        } else if (upperCase == 'E') {
            System.out.println("City: EDINBURGH"); //print statement if true
        } else if (upperCase == 'F') {
            System.out.println("City: FRANKFURT"); //print statement if true
        } else {
            System.out.println("INVALID ENTRY"); //print if input character is out of range
        }
    }

    //Main method
    public static void main(String[] args) {
        Task10 myObj = new Task10(); //create object
        myObj.m1(); //call method
    }
}
