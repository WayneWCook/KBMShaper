/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 *      Create the main class to test the rectangle, swuare, circle and shombus classes.
 *      Force a commit
 *  16 April 2020
 *      Add way to track the number of items that are open and then destroyed.
 */
//package Shape-RCC;

public class FindShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,10);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        Square square = new Square(7);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        Circle circle = new Circle(3);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        Rhombus rhombus = new Rhombus(5, 0.5);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        RegularPolygon hexagon = new RegularPolygon(7, 6);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        RegularPolygon pentagon = new RegularPolygon(7,5);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        Trapezoid trapezoid = new Trapezoid(5,7,3);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        System.out.println("Rectangle are is: " + rec1.getArea());
        System.out.println("Square area is: "+ square.getArea());
        System.out.println("Pentagon area is: " + pentagon.getArea());
        System.out.println("Hexagon area is: " + hexagon.getArea()) ;
        System.out.println("Trapezoid are is: " + trapezoid.getArea());
        System.out.println("Hexagon perimeter is: " + hexagon.getPerimeter());
        System.out.println("Pentagon perimeter is: " + pentagon.getPerimeter());
        System.out.println("The sum can go in either direction!");
        System.out.println("The sum of the rectanglel and square areas is: " + rec1.addArea(square));
        System.out.println("The sum of the square and rectangle areas is: " + square.addArea(rec1));
        System.out.println("The Circle area is: " + circle.getArea());
        System.out.println("The Rhombus area is: " + rhombus.getArea());
        System.out.println("The circle and rectangle areas add to: " + circle.addArea(rec1));
        System.out.println("The Rhombus and Square areas add to: " + rhombus.addArea(square));
        System.out.println("The Rhombus and Circle areas add to: " + rhombus.addArea(circle));
        System.out.println("The Hexagon and rectangle areas add to: " + hexagon.addArea(rec1));
        System.out.println("The Pentagon and Circle areas add to: " + pentagon.addArea(circle));
        System.out.println("The Hexagon and Circle perimeters add to: " + hexagon.addPerimeter(circle));
        System.out.println("The Pentagon and rectangle perimeters add to: " + pentagon.addPerimeter(rec1));
        // Now start the process of removing the objects from heap memory.
        System.out.println(" The end has come. There are now " + hexagon.getcount() + " shape<");
        square.decCount();
        square = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        circle.decCount();
        circle = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        rec1.decCount();
        rec1 = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        pentagon.decCount();
        square = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        rhombus.decCount();
        rhombus = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        trapezoid.decCount();
        trapezoid = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        pentagon.decCount();
        pentagon = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + hexagon.getcount() + " shapes");
        hexagon.decCount();
        hexagon = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        try {
            System.out.println("There are now " + hexagon.getcount() + " shape<");
            hexagon.decCount();
            hexagon = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        } catch (Exception e) {
            System.out.println("Second destruction of hexagon did not work. Already destroyed.");
        }
    }
}

