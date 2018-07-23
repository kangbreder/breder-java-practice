import java.util.Scanner;
public class factorial{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int factorial=1;
        int iter=1;
        System.out.println("please enter the number:");
        number=input.nextInt();

        while(iter<=number){
            factorial=factorial*iter;
            iter++;
        }
        System.out.printf("The factorial of the number is:%d",factorial);
    }
}