import java.util.Scanner;
public class EmployeeTest{
    public static void main(String[] args){

        Employee Employee1= new Employee("Kang","Breder",20000.0);
        Employee Employee2= new Employee("Tchoumta","Barbara",10000.0);

    Scanner input = new Scanner(System.in);
     
       String FirstName;
        String LastName;
        double MonthlySalary;
        double YearlySalary;
        
//Employee2
        System.out.printf("The current salary for Employee1 is:%f",Employee1.getMonthlySalary());
       System.out.println("");

      System.out.println("Please enter first name for Employee1");
       FirstName=input.nextLine();
       Employee1.setFirstName(FirstName);

       System.out.println("Please enter last name for Employee1");
       LastName=input.nextLine();
       Employee1.setLastName(LastName);

       System.out.println("Please enter monthly salary for Employee1");
       MonthlySalary=input.nextDouble();
       YearlySalary= MonthlySalary*12;
       Employee1.setMonthlySalary(YearlySalary);
       
       System.out.println("FirstName\tLastName\tYearlySalary");
       System.out.printf("%s\t%s\t%f",Employee1.getFirstName(),Employee1.getLastName(),Employee1.getMonthlySalary());
        System.out.println("");
        YearlySalary=YearlySalary*(10/100);
       Employee1.setMonthlySalary(YearlySalary);
       System.out.printf("The Total Yearly Salary for employee1 is:%f",Employee1.getMonthlySalary());
       System.out.println("");




//Employee2
        System.out.printf("The current salary for Employee2 is:%f",Employee2.getMonthlySalary());
         System.out.println("");

      System.out.println("Please enter first name for Employee2");
       FirstName=input.nextLine();
       Employee2.setFirstName(FirstName);

       System.out.println("Please enter last name for Employee2");
       LastName=input.nextLine();
       Employee2.setLastName(LastName);

       System.out.println("Please enter monthly salary for Employee2");
       MonthlySalary=input.nextDouble();
       YearlySalary= MonthlySalary*12;
       Employee2.setMonthlySalary(YearlySalary);
       
       System.out.println("FirstName\tLastName\tYearlySalary\tTotalSalary");
       System.out.printf("%s\t%s\t%f",Employee2.getFirstName(),Employee2.getLastName(),Employee2.getMonthlySalary());
        
       YearlySalary=YearlySalary*(10/100);
       Employee2.setMonthlySalary(YearlySalary);
       System.out.printf("The Total Yearly Salary for employee1 is:%f" ,Employee2.getMonthlySalary());
    }
}


       
      