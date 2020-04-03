/* Square.java
 * Wayne Cook
 * 25 March 2020
 * Creates a square based on the retangle class
 * Because of inheritance, no methods or attributes need to be defined here.
 * Square uses all the methods defined in Rectangle and Shape
 */
// Have Square use all of Rectangles methods
//package Shape-RCC;

public class Square extends Rectangle{
    Square(double side) {
        // Parent class is always referenced as super.
        super(side,side);
    }
}
