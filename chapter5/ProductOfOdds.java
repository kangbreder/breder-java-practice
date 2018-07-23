import java.util.Scanner;
public class ProductOfOdds{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int iter=1;
        int product=1;
        while(iter<=15){
            product=product*iter;
            iter=iter+2;
        }
        System.out.printf("The product is:%d",product);
    }
}
    