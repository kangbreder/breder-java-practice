 //Fig. 3.11: GradeBookTest.java
 // GradeBook constructor used to specify the course name at the 
// time each GradeBook object is created.
import java.util.Scanner;
  public class GradeBookTest
 {
 // main method begins program execution
 public static void main( String args[] )
 { 
 // create GradeBook object
// display initial value of courseName for each GradeBook
   Scanner input= new Scanner(System.in);
   String name;
   String instructor;
   GradeBook GradeBook1=new GradeBook("Machines lab","Mr Tounsi" );

 System.out.printf( "gradeBook1 course name is: %s\n",
 GradeBook1.getCourseName() );

 System.out.printf("This course is presented by:%s\n",GradeBook1.getInstructorName());

 System.out.println("Please enter a new course name:");
 name=input.nextLine();
 GradeBook1.setCourseName(name);
 
 System.out.println("Please enter a new course instructor's name:");
 instructor=input.nextLine();
 GradeBook1.setInstructorName(instructor);

GradeBook1.displayMessage();
 
 }// end main

 } // end class GradeBookTest