package week7_Homework;

import java.util.Scanner;

public class Task6 {
/*
        6.  WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
            HRA = basic salary 10%
            DA = Basic salary 8%
            TA = Basic salary 9%
            PF= Basic salary 20%
            Gross salary = basic salary + HRA + TA + DA –PF
 */

    //input Anish Vekaria for name and a two-digit number for ID for perfect alignment of layout pattern

    //declare static void
    static void paySlip() {
        double sal, hra, da, ta, pf, gross; //declare local variables

        Scanner input1 = new Scanner(System.in);  //create scanner object
        System.out.print("Input Employee ID: "); //print out statement
        int empID = input1.nextInt();  //read user input

        Scanner input2 = new Scanner(System.in);  //create scanner object
        System.out.print("Input Employee Name: "); //print out statement
        String empName = input2.nextLine();  //read user input

        Scanner input3 = new Scanner(System.in);  //create scanner object
        System.out.print("Input Basic Salary: "); //print out statement
        sal = input3.nextDouble();  //read user input

        //calculations for payslip breakdown
        hra = sal * 0.1; //10% of basic salary
        da = sal * 0.08; //8% of basic salary
        ta = sal * 0.09; //9% of basic salary
        pf = sal * 0.2; //20% of basic salary
        gross = (sal + hra + da + ta) - pf; //gross salary

        System.out.println(" __________________________________");
        System.out.println("|            SALARY SLIP           |");
        System.out.println("|----------------------------------|");
        System.out.println("|  EMPLOYEE ID    : " + empID + "             |");
        System.out.println("|  EMPLOYEE NAME  : " + empName + "  |");
        System.out.println("|----------------------------------|");
        System.out.println("|  BASIC SALARY   : " + sal + "        |");
        System.out.println("|  HRA 10%        : " + hra + "         |");
        System.out.println("|  TA 8%          : " + ta + "         |");
        System.out.println("|  DA 9%          : " + da + "         |");
        System.out.println("|  PF -20%        : " + pf + "         |");
        System.out.println("|----------------------------------|");
        System.out.println("|  GROSS SALARY   : " + gross + "        |");
        System.out.println("|==================================|");
    }

    //Main method
    public static void main(String[] args) {
        paySlip(); //call method
    }
}
