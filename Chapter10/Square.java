public class Square extends twoDimensionalShape{
private double area;

 public Shape(double len,double wid){
   super(len,wid);

 }
 public double getArea(){
    area= super.getLength()*super.getWidth();
    return area;


 }
 String toString{
String.format("%s:%s","the area is",getArea());
 }

}



