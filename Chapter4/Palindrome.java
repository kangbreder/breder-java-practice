import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int palindrome;
        int number;
        int reverse=0;
        int remainder;
        System.out.println("Please enter a five digit number:");
        number=input.nextInt();
        palindrome=number;

        while(palindrome!=0){
            remainder = palindrome%10;
            reverse= reverse*10 + remainder;
            palindrome= palindrome/10;
        }
        if(number==reverse){
            System.out.println("The number is a palindrome");
        
        }
       else{
          System.out.println("The number is not a palindrome"); 
       }
    }
}