package org.example;
/*
Exercise 4.4: Rectangle
Create a Rectangle class with width and height.
Add methods for area (width * height) and perimeter (2 * (width + height)).
Create two objects with different dimensions and display the results
 */
public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    private void calculateArea(){
        area = width * height;
    }

    private void calculatePerimeter(){
        perimeter = (2 * (width + height));
    }

    public void displayAreaAndPerimeter(){
        calculateArea();
        calculatePerimeter();
        System.out.println("\n\nRectangle's Dimensions:::");
        System.out.println("\nFrom a width and height of "+width+" and "+height+" respectively:");
        System.out.println("\nRectangle Area: "+area);
        System.out.println("\nRectangle Perimeter: "+perimeter);
    }
}
