package week7_Homework;

public class Task4 {
/*
        4. Write if else condition and print your group name in console else
           others group name.
 */

    //declare static method
    static void m1() {

        //declare local variables
        int x = 15;
        int y = 30;
        int ans = y / x;

        if (ans == 2) { //if statement
            System.out.println("JAVA"); //print if true
        } else {
            //print otherwise
            System.out.println("SELENIUM, POSTMAN, REST ASSURED");
        }
    }

    //Main method
    public static void main(String[] args) {
        m1(); //call static method
    }
}
