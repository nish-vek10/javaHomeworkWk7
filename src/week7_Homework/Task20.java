package week7_Homework;

public class Task20 {
/*
        20. Write a Java program to sum values of an array.
 */

    //declare instance method
    static void sumArray() {
        int[] numbers = {16, 22, 87, 1, 6}; //declare array

        //calculate sum of all array elements
        int sum = 0; //initialise starting value
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; //add each value in array during each loop
        }
        System.out.println("Sum value of the array elements is : " + sum); //print statement
    }

    //Main method
    public static void main(String[] args) {
        sumArray(); //call method
    }
}
