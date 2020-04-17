/* Rhombus.java
 * Wayne Cook
 * 25 March 2020
 * Create the Rhombus class based on the Square class, it uses all the parent defined methods.
 * However, becuase the area is calculated in a different way in overloads teh fetArea() method.
 */
//package Shape-RCC;

public class Rhombus extends Square {
    private double radians;

    // Dedine the Constructor
    Rhombus(double side, double angle) {
        super(side);
        if (angle < 0) angle = 0;
        else if (angle > 90) angle = 90;
        this.radians = Math.toRadians(angle);
    }

    // Cannot use the rectangle version, so defines its own getArea()
    double getArea() {
        return Math.sin(radians) * this.height * this.width;

    }
}
