public enum Light{
//declare constants of enum types
RED("90 seconds"),
YELLOW("20 seconds"),
GREEN("110 seconds");

private final String duration;

Light(String time){
duration=time;

}
 public String getDuration(){
     return duration;
 }

// end enum book



}