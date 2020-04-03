/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the Circle class that inherits from the abstract class Shape
 */
//package Shape-RCC;

public class Circle extends Shape {
    // Attributes
    private double radius;
    // Construct a Circle to save radius and calculate areas.
    Circle(double radius) {
        this.radius = radius;
    }
    // Shape forces this class to define these two methods with the exact signiture.
    double getArea() {
        return (radius * radius * Math.PI);
    }
    double getPerimeter() {
        return (2 * radius * Math.PI);
    }
}
