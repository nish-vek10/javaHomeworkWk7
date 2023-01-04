package week7_Homework;

import java.util.Scanner;

public class Task5 {
/*
        5.  Write a java program to input student Name, roll No, and three subjects Math, Science and
            English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
            Input, Marks should between 0 and 100”) and find out total, percentage and result.
            If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
            %> = 60 A, %> = 50 B, %> = 35 C and print Mark Sheet in following format
 */

    //input Anish Vekaria for name and a two-digit number for roll number for perfect alignment of layout pattern

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }

    //declare static void
    static void m1() {
        int mathM, sciM, engM; //declare local variables

        Scanner sc = new Scanner(System.in);  //create scanner object

        System.out.print("Input Student Name: "); //print out statement
        String name = sc.nextLine();  //read user input

        System.out.print("Input Student Roll Number: "); //print out statement
        int roll = sc.nextInt();  //read user input

        System.out.print("Input marks for Mathematics: "); //print out statement
        mathM = sc.nextInt();  //read user input

        System.out.print("Input marks for Science: "); //print out statement
        sciM = sc.nextInt();  //read user input

        System.out.print("Input marks for English: "); //print out statement
        engM = sc.nextInt();  //read user input

        //declare local variables
        int sum = mathM + sciM + engM;
        double perc = sum / 3;
        String res;
        String grade;

        //declare range for PASS or FAIL
        if (perc >= 35) {
            res = "Pass";
        } else {
            res = "Fail";
        }

        //declare range for each grades
        if (perc >= 80) {
            grade = "A+";
        } else if (perc >= 60) {
            grade = "A ";
        } else if (perc >= 50) {
            grade = "B ";
        } else if (perc >= 35) {
            grade = "C ";
        } else {
            grade = "D ";
        }

        if (mathM < 0 || sciM < 0 || engM < 0 || mathM > 100 || sciM > 100 || engM > 100) {
            System.out.println("Invalid Input, Marks should between 0 and 100"); //print if invalid scores are inputted
        } else {
            System.out.println("_________________________________");
            System.out.println("|                               |");
            System.out.println("|           MARK SHEET          |");
            System.out.println("|   NAME       : " + name + "  |");
            System.out.println("|   ROLL NO.   :   " + roll + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   SUBJECTS   :   MARKS        |");
            System.out.println("|-------------------------------|");
            System.out.println("|   MATHS      :   " + mathM + "           |");
            System.out.println("|   SCIENCE    :   " + sciM + "           |");
            System.out.println("|   ENGLISH    :   " + engM + "           |");
            System.out.println("|-------------------------------|");
            System.out.println("|   TOTAL      :   " + sum + "          |");
            System.out.println("|-------------------------------|");
            System.out.println("|   PERCENTAGE :   " + String.format("%.1f", perc) + "         |");
            System.out.println("|   RESULT     :   " + res + "         |");
            System.out.println("|   GRADE      :   " + grade + "           |");
            System.out.println("|_______________________________|");
        }
    }
}