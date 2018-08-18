import java.util.Scanner;
public class Reverse 
{
    public void reverse(int number){
    
        int num=number;
        int reverse1=0;
        int remainder;

        while(num!=0){
            remainder = num%10;
            reverse1= reverse1*10 + remainder;
            num= num/10;
        }
        System.out.printf("The reverse of the number is:%d",reverse1);
    }
}