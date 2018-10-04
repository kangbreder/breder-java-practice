import java.util.Math;

public class Sphere extends threeDimensionalShape{

private double radius;
private double area;
private double volume;


public Sphere(double rad){
radius =rad;
}

public double getArea(){
area= 4*Math.PI*radius*radius;
return area;

}
public double getVolume(){
volume=4*Math.PI*radius*radius*radius;
return volume;

}
String toString{
String.format("%s:%s\n %s:%s","the area is",getArea(),"the volume is",getVolume() );
 }









}