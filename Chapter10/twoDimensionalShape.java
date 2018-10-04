public abstract class twoDimensionalShape extends Shape{
private double length;
private double width;


public twoDimensionalShape(double len,double wid){
length=len;
width=wid;
}
public double getLength(){
  return length;

}
public double getWidth(){

    return width;
}


public abstract double getArea();




}