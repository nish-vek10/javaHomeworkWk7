package week7_Homework;

import java.util.Scanner;

public class Task14 {
/*
        14. Write a program that tells us input value is number or an alphabet or symbol.
 */

/*
    NOTES:
    The Best possible way is to use in-built ASCII code.
    ASCII stands for American Standard Code for Information Interchange. ASCII is a standard data-transmission
    code that is used by the computer for representing both the textual data and control characters.

    ASCII is a 7-bit character set having 128 characters, i.e., from 0 to 127.
    ASCII represents a numeric value for each character, such as 65 is a value of A.
 */

    //Main method
    public static void main(String[] args) {
        charInput(); //call static method
    }

    //declare static method
    static void charInput() {
        Scanner newChar = new Scanner(System.in); //create scanner object
        System.out.print("Input a Single Character: "); //print out statement
        char c = newChar.next().charAt(0);  //read user input

        //checking for alphabets
        //ASCII codes 65 to 90 are for uppercase alphabets
        //ASCII codes 97 to 122 are for uppercase alphabets
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            System.out.println("The Character \"" + c + "\" is an ALPHABET."); //print statement
        }
        //checking for numeric value
        //ASCII codes 48 to 57 are for digits
        else if (c >= 48 && c <= 57) {
            System.out.println("The Character \"" + c + "\" is NUMERIC."); //print statement
        }
        //checking for special character
        else {
            System.out.println("The Character \"" + c + "\" is a SPECIAL CHARACTER."); //print statement
        }
    }
}
