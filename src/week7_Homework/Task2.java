package week7_Homework;

public class Task2 {
/*
        2. Declare array and store any 5 countries and print them in console.
 */

    //Main method
    public static void main(String[] args) {
        String[] str = {"India", "Mongolia", "Seychelles", "Brazil", "Hawaii"}; //declare string array

        for (int i = 0; i < str.length; i++) { //for loop
            System.out.print(str[i] + ", "); //print statement
        }
    }
}
