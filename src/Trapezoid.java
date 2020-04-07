/* Trapezoid.java
 * Wayne Cook
 * 25 March 2020
 * Create the Trapazoid class based on the Shape class.
 */

public class Trapezoid extends Shape {

    private double topWidth, bottomWidth, side;

    Trapezoid(double topWidth, double bottomWidth, double side) {
        // Make sure the larger width is on the bottom. If hey are the same, then it is a rectangle.
        if (bottomWidth >topWidth) {
            this.topWidth = topWidth;
            this.bottomWidth = bottomWidth;
        } else {
            this.topWidth = bottomWidth;
            this.bottomWidth = topWidth;
        }
        this.side = side;
    }

    double getArea() {
        double half = bottomWidth -topWidth;
        double base = topWidth + 0.5 * half;
        double height = Math.sqrt((side* side - half * half));
        return height * base;
    }

    double getPerimeter() {
        return (2 * side + topWidth + bottomWidth);
    }
}
