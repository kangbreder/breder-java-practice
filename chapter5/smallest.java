import java.util.Scanner;
public class smallest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int initialValue=0;
        int counter;
        int number;
        
        System.out.println("Please enter the first interger:");
        initialValue=input.nextInt();
        int smallest=initialValue;
        for(counter=1;counter<=initialValue-1;counter++){
          System.out.println("Please enter the next interger:");
          number=input.nextInt();
             if(number<smallest){
                 smallest=number;
             }
             System.out.printf("The smallest is:%d", smallest);
            

        }
    }
}