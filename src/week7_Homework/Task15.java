package week7_Homework;

import java.util.Scanner;

public class Task15 {
/*
        15. Write a Java program which input any number between 1 and 7; and it print out The Days
            name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
            NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

    //declare static method
    void daysOfWeek() {
        Scanner myInput = new Scanner(System.in);  //create a Scanner object
        System.out.print("Input a number between 1 and 7: "); //print out statement

        int day = myInput.nextInt();  //read user input

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }

    //Main method
    public static void main(String[] args) {
        Task15 myObj = new Task15(); //create object
        myObj.daysOfWeek(); //call method
    }
}
