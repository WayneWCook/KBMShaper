/*
* Matthew Love
* 4/15/20
* This class finds the area and perimeter of any regular polygon given the number of sides and side length
 */

public class RegularPolygon extends Shape{
    private double sideLength;
    private double sideNumber;
    RegularPolygon (double length, int num) {
        sideLength = length;
        sideNumber = num;
    }
    double getArea() {
        double apothem;
        double answer;
       apothem = ((sideLength/2)/(Math.tan(Math.PI/(sideNumber))));
       answer = apothem * sideLength * (sideNumber/2);
       answer = (int)(answer * 100);
       answer = answer/100;
       return answer;
    }
    double getPerimeter() {return sideLength * sideNumber;}
}
