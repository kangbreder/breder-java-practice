public class Date{
   private int Day;
   private int Month;
    private int Year;
 public Date(int d,int m,int y){
      Day=d;
      Month=m;
      Year=y;
 }
    public void setDay(int d){
         Day=d;

    }
    public int getDay(){
        return Day;
    }
    public void setMonth(int m){
        Month=m;
    }
    public int getMonth(){
        return Month;
    }
    public void setYear(int y){
        Year=y;
    }
    public int getYear(){
        return Year;
    }
    public void displayDate(){
        System.out.printf("The Date is:%d/%d/%d",getDay(),getMonth(),getYear());
    }

}