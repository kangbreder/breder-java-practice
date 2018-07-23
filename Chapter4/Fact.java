/*import java.util.Scanner;
public class Fact{
    
    public int ComputeFactorial(int n){
    if(n==0 || n==1)
    return 1;
    else
    return n*ComputeFactorial(n-1);

}
}
*/
import java.util.Scanner;
public class Fact{

     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
    int A,B,D;
    B=1;
    D=1;
    System.out.println("please enter the interger whose factorial we want to compute");
   A=input.nextInt();
   while(B<=A){
       D=D*B;
       B++;
   }
   System.out.printf("The factorial is:%d", D);

}
}