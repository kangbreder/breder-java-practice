import java.util.Random;

 public class rollDie
 {
 // create random number generator for use in method rollDice
 private Random randomNumbers = new Random(); 
public int Sum()
 {
 // pick random die values
   int die1 = 1+ randomNumbers.nextInt( 6);// first die roll
   int die2 = 1+ randomNumbers.nextInt( 6); // second die roll

   int sum = die1 + die2; // sum of die values

// display results of this roll
 
return sum; 
 }
 }




    






 
 











 