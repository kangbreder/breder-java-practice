import java.util.Scanner;
public class ReverseTest{

    public static void main(String args[]){
    int num;
    Scanner input=new Scanner(System.in);

    Reverse Reverse = new Reverse();
    System.out.println("please enter number to get the reverse");
    num=input.nextInt();
    Reverse.reverse(num);

    }

}