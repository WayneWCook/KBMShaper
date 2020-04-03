/* Shape.java
 * Wayne Cook
 * 25 March 2020
 * This is an abstract class that forces all children to define the getArea() and getPerimeter) methods
 * It also suplies the addArea() and addPerimeter() methods that can be used by any child.
 */
//package Shape-RCC;

public abstract class Shape {
    // Force children to implement the following methods.
    abstract double getArea();
    abstract double getPerimeter();
    //Provide the following methods for each child.
    double addArea(Shape other) {
        return (this.getArea() + other.getArea());
    }
    double addPerimeter(Shape other) {
        return (this.getPerimeter() + other.getPerimeter());
    }
}
