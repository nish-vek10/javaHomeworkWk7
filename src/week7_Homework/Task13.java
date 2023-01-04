package week7_Homework;

public class Task13 {
/*
        13. Write a java program to print the numbers between 1 and 100 which can be divided by 3
            and 5 separately.
 */

    //declare instance method
    void m1() {
        System.out.println("Numbers divisible by 3: "); //print statement
        for (int i = 1; i <= 100; i++) { //loop for numbers 1 to 100
            if (i % 3 == 0) //condition if numbers are divisible by 3
                System.out.print(i + ", "); //print out result
        }

        System.out.println("\n"); //skips a line

        System.out.println("Numbers divisible by 5: "); //print statement
        for (int i = 1; i <= 100; i++) { //loop for numbers 1 to 100
            if (i % 5 == 0) //condition if numbers are divisible by 5
                System.out.print(i + ", "); //print out result
        }
    }

    //Main method
    public static void main(String[] args) {
        Task13 myObj = new Task13(); //create object
        myObj.m1(); //call instance method
    }
}
