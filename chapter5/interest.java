
// Fig. 5.6: Interest.java
 // Compound-interest calculations with for.

 public class interest 
 {
 public static void main( String args[] )
 {
   double amount; // amount on deposit at end of each year
   double principal = 1000.0; // initial amount before interest
   double rate; // interest rate
for(rate=0.05;rate<=0.1;rate = rate + 0.01){
    
    System.out.printf("for rate:%f \n",rate);
        System.out.printf("%s\t%s \n","Year", "Amount on deposit");
    //calculate amount on deposit for each of ten years 
    for( int year = 1; year <= 3; year++ ) 
   { 

// calculate new amount for specified year 
amount = principal * Math.pow(1.0+ rate, year );
// display the year and the amount 
System.out.printf( "%4d\t%20.2f\n", year, amount );
   }
}
 }
 }