package week7_Homework;

public class Task17_Wall {

    double width, height; //declare instance variables

    //declare constructor without parameter
    public Task17_Wall() {
    }

    //declare constructor with parameters
    public void Wall(double width, double height) {
        if (width < 0 && height > 0) {
            this.width = 0.0; //if width less than 0, then set width field to 0
            this.height = height; //if height greater than 0, then set height to the input value
        } else if (width > 0 && height < 0) {
            this.width = width; //if width greater than 0, then set width to the input value
            this.height = 0.0; //if height less than 0, then set height field to 0
        } else if (width < 0 && height < 0) { //if both height and width less than 0, set fields to 0
            this.width = 0.0;
            this.height = 0.0;
        } else { //if both height and width greater than 0, set fields to given values
            this.width = width;
            this.height = height;
        }
    }

    //declare instance method without parameter
    public double getWidth() {
        return width; //return the value of width field
    }

    //declare instance method without parameter
    public double getHeight() {
        return height; //return the value of height field
    }

    //declare instance method with parameter
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0; //if width less than 0, then set width field to 0
        } else {
            this.width = width; //otherwise set to given value
        }
    }

    //declare instance method with parameter
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0; //if height less than 0, then set height field to 0
        } else {
            this.height = height; //otherwise set to given value
        }
    }

    //declare instance method without parameter
    public double getArea() {
        double area = this.width * this.height;
        return area; //return area
    }

    public static void main(String[] args) {
        Task17_Wall wall = new Task17_Wall(); //create object
        wall.Wall(5, 4); //call constructor via object
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
