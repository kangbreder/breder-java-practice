import java.util.Scanner;
public class barCharts{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,d,e;
        int iter;
         System.out.println("Please enter 5 numbers between 1 and 30");
         a=input.nextInt();
         b=input.nextInt();
         c=input.nextInt();
         d=input.nextInt();
         e=input.nextInt();
         for(iter=1;iter<=a;iter++){
             System.out.print("*");
         }
                System.out.println("");
         for(iter=1;iter<=b;iter++){
             System.out.print("*");
         }
         System.out.println("");
         for(iter=1;iter<=c;iter++){
             System.out.print("*");
         }
         System.out.println("");
         for(iter=1;iter<=d;iter++){
             System.out.print("*");
         }
         System.out.println("");
         for(iter=1;iter<=e;iter++){
             System.out.print("*");
         }
    }
}
         
         
