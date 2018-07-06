public class Invoice{
   private String PartNumber;
   private String  PartDescription;
    private int Quantity;
    private double Price;
    

 public Invoice(String Pn,String Pd ,int Qty,double Prc){
      PartNumber=Pn;
      PartDescription=Pd;
      Quantity=Qty;
      Price=Prc;
 }

  public void setPartNumber(String Pn){
      PartNumber=Pn;
  }
  public String getPartNumber(){
      return PartNumber;
  }

public void setPartDescription(String Pd){
      PartDescription=Pd;
  }
  public String getPartDescription(){
      return PartDescription;
  }

  public void setQuantity(int Qty){
      Quantity=Qty;
      if(Quantity<0){
          Quantity=0;
      }
  }
  public int getQuantity(){
      return Quantity;
  }
  public void setPrice(double Prc){
      Price=Prc;
      if(Price<0.0){
          Price=0.0;
      }
  }
  public double getPrice(){
      return Price;
  }
  public double getInvoiceAmount(){
       double InvoiceAmount;
      InvoiceAmount=getPrice()*getQuantity();
      return InvoiceAmount;
  }
}

