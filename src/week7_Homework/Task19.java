package week7_Homework;

import java.util.Arrays;

public class Task19 {
/*
            19. Write a Java program to sort a numeric array and a string array.
 */

    //Main method
    public static void main(String[] args) {
        sortArrays(); //call method
    }

    //declare static method
    static void sortArrays() {

        //declare local arrays
        int[] numArray = {165, 2, 94, 88, 777, 654, 1203, 88};
        String[] strArray = {"Smirnoff", "Glenfiddich-18", "Jack Daniel's", "Altos", "Glenfiddich-15", "Kraken"};

        System.out.println("Original Numeric Array : " + Arrays.toString(numArray)); //print original
        Arrays.sort(numArray); //sort numeric array into ascending order
        System.out.println("Sorted Numeric Array : " + Arrays.toString(numArray)); //print sorted
        System.out.print("\n"); //skip a line
        System.out.println("Original String Array : " + Arrays.toString(strArray)); //print original
        Arrays.sort(strArray); //sort string array into ascending order
        System.out.println("Sorted String Array : " + Arrays.toString(strArray)); //print sorted
    }
}
