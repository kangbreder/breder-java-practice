import java.util.Scanner;
public class Decimal{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int binary,remainder,n;
        double decimal=0;
        int iter=0;
        System.out.println("Please enter the number of binary digits");
        n=input.nextInt();
        System.out.println("Please enter the binary number");
        binary=input.nextInt();

        while(iter<n){
            remainder=binary%10;
            decimal=decimal + remainder*Math.pow(2,(double)iter);
            binary = binary/10;
            iter++;
        }
        System.out.printf("The decimal number is: %f" , decimal);
    }
}

