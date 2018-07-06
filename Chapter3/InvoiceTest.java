import java.util.Scanner;
public class InvoiceTest{
    public static void main(String[] args){
      Invoice Invoice1= new Invoice("none","none",0,0.0);
      Scanner input=new Scanner(System.in);
      String Pn;
      String Pd;
      int Qty;
      double Prc;
      

       System.out.print("Enter part number:");
       Pn=input.nextLine();
       Invoice1.setPartNumber(Pn);

       System.out.print("Enter part description:");
       Pd=input.nextLine();
       Invoice1.setPartDescription(Pd);

       System.out.print("Enter Quantity:");
       Qty=input.nextInt();
       Invoice1.setQuantity(Qty);

       System.out.print("Enter Price:");
       Prc=input.nextDouble();
       Invoice1.setPrice(Prc);

       System.out.printf("The invoice Amount is:%f",Invoice1.getInvoiceAmount());

    }
}
       
       
