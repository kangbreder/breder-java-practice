import java.util.Math;
public class Circle extends twoDimensionalShape{
private double area;
private double radius;

public Circle( double rad)[
    radius=rad;

]
public double getArea(){
    area=Math.PI*radius;
    return area;
}
 String toString{
String.format("%s:%s","the area is",getArea());
 }
}