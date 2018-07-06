public class Employee{
   private String FirstName;
   private String LastName;
    private double MonthlySalary;
 public Employee(String F,String L,double S){
     FirstName=F;
     LastName=L;
     MonthlySalary=S;
     }
    public void setFirstName(String F){
         FirstName=F;

    }
    public String getFirstName(){
        return FirstName;
    }
    public void setLastName(String L){
        LastName=L;
    }
    public String getLastName(){
        return LastName;
    }
    public void setMonthlySalary(double S){
      if(S<0.0){
        MonthlySalary=0.0;  
      }
          if(S>0.0)  { 
        MonthlySalary=S;
          }  
    }
    
    public double getMonthlySalary(){
        return MonthlySalary;
    
    }
}
    
