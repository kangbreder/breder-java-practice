import java.util.Scanner;
public class product{
  public static int product(int... numbers){
      int product=1;
      for(int p:numbers){
          product*=p;
    }
          return product;
      }

 public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      int d1=10;
      int d2=11;
      int d3=12;
      int d4=5;
      int d5=6;

    System.out.printf("d1=%d\nd2=%d\nd3=%d\nd4=%d\nd5=%d\n",d1,d2,d3,d4,d5);
    System.out.printf("the product of d1 and d2 is:%d\n",product(d1,d2));
System.out.printf("the product of d1,d2,d3 and d4 is:%d\n",product(d1,d2,d3,d4));


    }




}