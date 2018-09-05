public class Rectangle{
 private double length;
 private double width;
 private double area;
 private double perimeter;

 public Rectangle(){
     length=1.0;
     width=1.0;

 }
 public double getWidth(){
   return width;

 }

 public void setWidth(double number){
if(number>0.0 && number<20.0){
     
width=number;

}

}

 
 public double getLength(){
return length;

 }
 public void setLength(double number){
if(number>0.0 && number<20.0){
     
length=number;

}
 }


public void calculateArea(){

area=getLength()*getWidth();
System.out.printf("The area is: %f\n",area);
}
public void calculatePerimeter(){
perimeter=(getLength()+ getWidth())/2;
System.out.printf("The perimeter is: %f\n",perimeter);
}


}







