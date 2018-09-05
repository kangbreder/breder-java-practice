import java.util.Scanner;
public class sum{
  Scanner input=new Scanner(System.in);
  public static void main(String args[]){
    
     double sum=0.0;
     for(String s:args){
          double d=Double.parseDouble(s);
         sum+=d;
     }
     System.out.printf("the sum is :%f",sum);


  }








}