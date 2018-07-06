public class Account{ 
// constructor 
private double balance;
 public Account(double initialBalance)
 {
 // validate that initialBalance is greater than 0.0; 
 // if it is not, balance is initialized to the default value 0.0
   if( initialBalance > 0.0) 
 balance = initialBalance; 
 } // end Account constructors
// credit (add) an amount to the account
 public void credit(double depositAmount)
 { 
balance = balance + depositAmount; // add amount to balance 
 } // end method credit

 // return the account balance
 public double getBalance()
 {
   return balance; // gives the value of balance to the calling method 
   }

 public void debit(double withdrawalAmount)
 {
    balance=getBalance();
    if(withdrawalAmount>balance){
        System.out.println("Debit amount exceeded account balance");
    }
    if(withdrawalAmount<balance){
        balance = balance - withdrawalAmount;
    }
    
 }
 
 
 }



 
