import java.util.Random;
public class rollDieTest{

public static void main(String args[]){
   Random randomNumbers = new Random(); 
rollDie rollDie=new rollDie();

    int frequency[]=new int[13];
    for(int roll=1;roll<=36000;roll++){
      ++frequency[rollDie.Sum()];
    }
      System.out.printf("%s%10s\n","face","frequency");
    

    for(int face=1;face<frequency.length;face++){
     System.out.printf("%4d%10d\n",face,frequency[face]);

    }
 }
 }