import java.util.Scanner;
public class InverseLn{

     public static void main(String[] args) {

        int A,B;
        double E,D;
        A=1;
        E=0;
        while(A<=15){
            D=1;
            B=1;
            while(B<=A){
                D=D*B;
                B++;
            }
            E=E+1/D;
            A++;
        }
        System.out.printf("The estimated value of e is %f :",E+1);
     }
}