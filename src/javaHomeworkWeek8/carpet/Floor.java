package javaHomeworkWeek8.carpet;

/**
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */
public class Floor {
    //declaring variables double.
    double width, length;

    //Constructor
    public Floor(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.length = height < 0 ? 0 : height;
    }

    public double getArea() {
        return this.length * this.width;
    }

}
