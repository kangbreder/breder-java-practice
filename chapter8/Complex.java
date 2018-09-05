public class Complex{
private double realPart;
private double imaginaryPart;
private double sum;
public Complex(double a,double b){

realPart=a;
imaginaryPart=b;


}
public Complex(){
    realPart=0.0;
    imaginaryPart=0.0;
}
 
public double getReal(){
   return realPart;

}
public double getImaginary(){
    return imaginaryPart;
}
//adding the two complex numbers
public void addComplex(double real,double ima){
  double  sumReal=getReal()+real;
   double sumIma=getImaginary()+ima;
    System.out.printf("the sum is:%f,%f i\n",sumReal,sumIma);
}
//substraction
public void substractComplex(double real,double ima){
double subsReal=getReal()-real;
 double subsIma=getImaginary()-ima;
System.out.printf("the difference is:%f,%f i",subsReal,subsIma);
}
 










}