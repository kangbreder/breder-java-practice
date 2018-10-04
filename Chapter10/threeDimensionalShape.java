public abstract class threeDimensionalShape extends Shape{

private double radius;
private double area;
private double volume;
public threeDimensionalShape(int rad){
radius=rad;


}
public abstract double getArea();
public abstract double getVolume();





}