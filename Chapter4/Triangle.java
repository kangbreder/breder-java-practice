import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A,B,C;
        System.out.println("Please enter 3 intergers");
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        if(A>(B+C)||B>(A+C)||C>(A+B)){

            System.out.println("The sides can form and triangle");
        }
        else{
            System.out.println("They cannot form a triangle");
        }
        
}
}