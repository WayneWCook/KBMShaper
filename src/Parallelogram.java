public class Parallelogram extends Rectangle {
    //attributes
    double radians;
    //constructor
    Parallelogram(double width, double height, double angle) {
        super(width, height);
        this.radians = Math.toRadians(angle);
    }
    //Methods
    double getArea() {
        double op = super.height * Math.sin(radians);
        return op * this.width;
    }
}
