import java.util.Scanner;
public class DateTest{
    public static void main(String[] args){
        Date mydate = new Date(1,6,2018);
    Scanner input = new Scanner(System.in);
     
       int day;
        int month;
        int year;
    System.out.printf("The date of creation was: %d/%d/%d", mydate.getDay(),mydate.getMonth(),mydate.getYear());
    System.out.println("");

    System.out.println("Please enter the day of today");
    day=input.nextInt();
    mydate.setDay(day);
    
    System.out.println("Please enter the Month");
    month=input.nextInt();
    mydate.setMonth(month);

    System.out.println("Please enter the Year");
    year=input.nextInt();
    mydate.setYear(year);

    System.out.printf("The new date is:%d/%d/%d", mydate.getDay(), mydate.getMonth(), mydate.getYear());
    
    

    }
}