package week7_Homework;

public class Task21 {
/*
        21. Write a Java program to calculate the average value of array elements.
 */

    //declare instance method
    void avgArray() {
        int[] numbers = new int[]{15, 46, 12, 4, 89}; //declare array

        //calculate sum of all array elements
        double sum = 0; //initialise starting value
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; //add each value in array during each loop
        }
        float average = (float) (sum / numbers.length); //calculate average value
        //print ans to 2 decimal places
        System.out.print("Average value of the array elements is : " + String.format("%.2f", average));
    }

    //Main method
    public static void main(String[] args) {
        Task21 myObj = new Task21(); //create object
        myObj.avgArray(); //call method
    }
}
