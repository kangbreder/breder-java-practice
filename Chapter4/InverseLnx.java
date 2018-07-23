import java.util.Scanner;
public class InverseLnx{

     public static void main(String[] args) {
           Scanner input=new Scanner(System.in);

        int A, B;
        double E,D;
        double X,Y;
        System.out.println("please enter the value of X");
            X=input.nextInt();
        A=1;
        E=0;
        while(A<=100){
            D=1;
            B=1;
            while(B<=A){
                D=D*B;
                B++;
            }
            Y=Math.pow(X,(double)A);
            E=E+Y/D;
            A++;
        }
        System.out.printf("The estimated value of e is %f :",E+1);
     }
}