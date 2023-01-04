package week7_Homework2;

public class Task2 {
/*
        2. Print multiplication table of 24, 50 and 29 using loop.
 */

    //declare static method
    static void table24() {
        int x = 24; //declare local variable
        System.out.println("Multiplication Table of " + x + ":"); //print statement
        for (int i = 1; i <= 12; i++) { //for loop
            int result = x * i; //declare local variable
            System.out.println(x + " x " + i + " = " + result); //print result
        }
        System.out.print("\n"); //skip a line
    }

    //declare static method
    static void table50() {
        int y = 50; //declare local variable
        System.out.println("Multiplication Table of " + y + ":"); //print statement
        for (int i = 1; i <= 12; i++) { //for loop
            int result = y * i; //declare local variable
            System.out.println(y + " x " + i + " = " + result); //print result
        }
        System.out.print("\n"); //skip a line
    }

    //declare static method
    static void table29() {
        int z = 29; //declare local variable
        System.out.println("Multiplication Table of " + z + ":"); //print statement
        for (int i = 1; i <= 12; i++) { //for loop
            int result = z * i; //declare local variable
            System.out.println(z + " x " + i + " = " + result); //print result
        }
        System.out.print("\n"); //skip a line
    }

    //Main method
    public static void main(String[] args) {
        //call methods
        table24();
        table29();
        table50();
    }
}
