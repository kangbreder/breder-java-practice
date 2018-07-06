// Fig. 3.10: GradeBook.java
 // GradeBook class with a constructor to initialize the course name.

 public class GradeBook{
 private String courseName; // course name for this GradeBook
 private String courseInstructor;
// method to set the course name15 public voidsetCourseName( String name )
public GradeBook(String name,String instructor)
 {
 courseName = name;// store the course name
 courseInstructor=instructor;
 } 
 public void setCourseName(String name){
     courseName=name;
 }
 // method to retrieve the course name
 public String getCourseName()
 {
  return courseName;
 } // end method getCourseName
 public void setInstructorName(String instructor){
     courseInstructor=instructor;
 }
public String getInstructorName()
 {
  return courseInstructor;
 } // end method
 // display a welcome message to the GradeBook user
 public void displayMessage()
 {
 // this statement calls getCourseName to get the 
 // name of the course this GradeBook represents
 System.out.printf( "Welcome to the grade book for\n%s!\n",
 getCourseName() );
 System.out.printf("This course is presented by:%s", getInstructorName());
} // end method displayMessage

 } // end class GradeBook