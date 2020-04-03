/* Rectangle.java
 * Wayne Cook
 * 25 March 2020
 * Create the Rectangle class based on the Shape class.
 */
//package Shape-RCC;

public class Rectangle extends Shape {
    // Allow childred classes to access these two variables.
    protected double width, height;
    // Mrthods
    Rectangle(double myWidth, double myHeight ) {
        width = myWidth;
        height = myHeight;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return (2 * width + 2 * height);
    }
}
