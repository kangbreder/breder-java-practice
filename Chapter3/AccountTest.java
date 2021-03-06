// Fig. 3.14: AccountTest.java
 // Inputting and outputting floating-point numbers with Account objects.
 import java.util.Scanner;

 public class AccountTest
 {
 // main method begins execution of Java application
 public static void main( String args[] ) 
 {
 Account account1 = new Account( 50.00);// create Account object
 Account account2 = new Account( -7.53); // create Account object

 // display initial balance of each object
 System.out.printf( "account1 balance: $%f \n",
 account1.getBalance() );
 System.out.printf( "account2 balance: $%f \n\n",
 account2.getBalance() );

 // create Scanner to obtain input from command window
 Scanner input = new Scanner( System.in );
double depositAmount;
 double withdrawalAmount;

 System.out.print( "Enter deposit amount for account1: " ); // prompt
    depositAmount=input.nextDouble();
 System.out.printf( "\nadding  to account1 balance %f\n\n",
depositAmount );
 account1.credit(depositAmount);// add to account1 balance

 // display balances
 System.out.printf( "account1 balance: $%f \n",
 account1.getBalance() );
 System.out.printf( "account2 balance: $%f \n\n",
 account2.getBalance() );
 

 System.out.print( "Enter deposit amount for account2: "); // prompt
   depositAmount=input.nextDouble();
 System.out.printf( "\nadding  to account2 balance %f\n\n",
 depositAmount );
 account2.credit( depositAmount ); // add to account2 balance

// display balances
 System.out.printf("account1 balance: $%f \n",
 account1.getBalance() );
 System.out.printf( "account2 balance: $%f \n",
 account2.getBalance() );
 //debit method test
 System.out.print( "Enter withdrawal amount for account1: "); // prompt
 withdrawalAmount=input.nextDouble();

 System.out.printf( "\nsubstracting from account1 balance %f\n\n",withdrawalAmount);
 account1.debit(withdrawalAmount);
 // display balances
 System.out.printf("account1 balance: $%f\n",
 account1.getBalance() );
 System.out.printf( "account2 balance: $%f \n",
 account2.getBalance() );

 System.out.print( "Enter withdrawal amount for account2: "); // prompt
 withdrawalAmount=input.nextDouble();

 System.out.printf( "\nsubstracting from account2 balance %f\n\n",withdrawalAmount);
 account2.debit(withdrawalAmount);
  System.out.printf("account1 balance: $%f \n",
 account1.getBalance() );
 System.out.printf( "account2 balance: $%f \n",
 account2.getBalance() );



 } // end main

 } // end class AccountTest