package week7_Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
/*
        1. Take 10 integers from keyboard using loop and print their average value on the screen.
 */

    //declare static method
    static void avgValue() {
        int n = 10; //declare local variable

        Scanner sc = new Scanner(System.in); //create scanner object
        int[] array = new int[10]; //creates an array in the memory of length 10
        System.out.println("Enter 10 integers of the array: ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); //reading array elements from the user
        }

        System.out.println("Stored Array of Input: " + Arrays.toString(array)); //print out the input array
        System.out.println(); //skip a line

        //calculate sum of all array elements
        double sum = 0; //initialise starting value
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; //add each value in array during each loop
        }
        //calculate average value
        float average = (float) (sum / array.length);
        //print ans to 2 decimal places
        System.out.print("Average value of the array elements is : " + String.format("%.2f", average));
    }

    //Main method
    public static void main(String[] args) {
        avgValue(); //call static method
    }
}



/*
System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
 */