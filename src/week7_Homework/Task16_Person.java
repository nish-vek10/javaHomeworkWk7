package week7_Homework;

public class Task16_Person {
    //declare instance variables
    String firstName, lastName;
    int age;

    //declare instance method without parameter
    public String getFirstName() {
        return firstName; //return variable
    }

    //declare instance method without parameter
    public String getLastName() {
        return lastName; //return variable
    }

    //declare instance method without parameter
    public int getAge() {
        return age; //return variable
    }

    //declare instance method with parameter
    public void setFirstName(String fName) {
        this.firstName = fName; //set value of firstName field
    }

    //declare instance method with parameter
    public void setLastName(String lName) {
        this.lastName = lName; //set value of lastName field
    }

    //declare instance method with parameter
    public void setAge(int sAge) {
        if (sAge < 0 || sAge > 100) {
            age = 0; //if age is less than 0 or greater than 100, then set age to 0
        } else {
            this.age = sAge; //otherwise set value of age field
        }
    }

    //declare instance method without parameter
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true; //return true if condition true
        } else {
            return false; //return false if condition false
        }
    }

    //declare instance method without parameter
    public String getFullName() {
        String fullName = firstName + " " + lastName; //string concatenation
        if (firstName.isEmpty()) {
            return lastName; //return only lastName if firstName field is empty
        }
        if (lastName.isEmpty()) {
            return firstName; //return only firstName if lastName field is empty
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " "; //if both firstName and lastName fields are empty, then return an empty string
        } else {
            return fullName; //otherwise return fullName
        }
    }

    //Main method
    public static void main(String[] args) {
        Task16_Person person = new Task16_Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is setto Smith
        System.out.println("fullName= " + person.getFullName());
    }
}