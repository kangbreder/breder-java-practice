import java.util.Scanner;
public class divisiontest{
   
   public static void main(String arg[]){
    int num1,num2;
    Scanner input=new Scanner(System.in);
 division division=new division();

    System.out.println("please enter two numbers num1 and num2");
    num1=input.nextInt();
    num2=input.nextInt();
     division.quotient(num1,num2);
     division.remainder(num1,num2);

   }


}