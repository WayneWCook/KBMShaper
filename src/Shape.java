/* Shape.java
 * Wayne Cook
 * 25 March 2020
 * This is an abstract class that forces all children to define the getArea() and getPerimeter) methods
 * It also suplies the addArea() and addPerimeter() methods that can be used by any child.
 * 16 April 2020 - Wayne Cook
 *      Modified this class to track the number of objects that are in use that are subclasses of Shape.
 */
//package Shape-RCC;

public abstract class Shape {
    // Attributes - Put any needed variables here and there with any default value.
    static int count = 0;
    // Constructors and destruct - for creating and destroying an instance of the class, if needed.
    // None needed for an abstract class
    Shape() {count++;}
    // There is no real destructor in Java. .finalize() is called at some point, but not necessarily immediately.

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
    int getcount() { return count;}
    // Allow the count to be decremated before destroying th object.
    void decCount() {count--;}
}
