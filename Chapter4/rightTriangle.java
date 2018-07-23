import java.util.Scanner;
public class rightTriangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A,B,C,sum1,sum2,sum3;
        System.out.println("Please enter 3 intergers");
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        sum1=A*A + B*B;
        sum2=A*A + C*C;
        sum3= B*B + C*C;
        if (A*A==sum3 || B*B==sum2 || C*C==sum1){
            System.out.println("The intergers can form a right triangle");
        }
        else{
           System.out.println("The intergers cannot form a right triangle"); 
        }
    }
}