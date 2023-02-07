import java.text.DecimalFormat;

/**
 * @file Rectangle.java
 * @date 2/2/2023
 * @author Dylan Nguyen
 *
 * @description Creates a rectangle with a width and height or a square with a side length
 * The user can also calculate the perimeter and area of the rectangle and print the information
 * about the Rectangle.
 */
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)

    /**
     * @description Default constructor that creates a square with width 1 and height 1
     */
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //overloaded constructor (with parameters)

    /**
     * Creates a Rectangle object with width and height
     * @param w width of the rectangle
     * @param h height of the rectangle
     */
    public Rectangle(double w, double h){
        if (w > 0){
            width = w;
        }

        else{
            width = 1.0;
        }

        height = h;
    }

    public Rectangle(double width){
        this.width = width;
    }


    //accessors

    /**
     *
     * @return the width of the rectangle
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return the height of the rectangle
     */
    public double getHeight(){
        return height;
    }

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    //mutators

    /**
     * Allows the user to change the width of the rectangle.
     *
     * @param newWidth desired width
     */
    public void setWidth(double newWidth){
        width = newWidth;
    }

    /**
     * Modifies the height of the rectangle
     * @param newHeight
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }

    //other methods

    /**
     * Calculates the area of the rectangle
     * @return area of the rectangle
     */
    public void calculateArea(){
        area = height*width;
    }

    public void calculatePerimeter(){
        perimeter =  2*height + 2*width;
    }


    //toString method
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with 2 decimal places
        return "The height of the rectangle is " + df.format(height) +
                " and the width is " + df.format(width) + ".";
    }


}