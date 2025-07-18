public class GraduateCourse extends Course{

   private int no;

   public GraduateCourse(int no) {
      this.no = no;
   }

   public GraduateCourse(String course_name, String courseCode, Department d1, Instructor ins2, Student[] st1, int no) {
      super(course_name, courseCode, d1, ins2, st1);
      this.no = no;
   }

   public GraduateCourse(String course_name, String courseCode, Department d1, Instructor ins2, int no) {
      super(course_name, courseCode, d1, ins2);
      this.no = no;
   }

   public int getNo() {
      return no;
   }

   public void setNo(int no) {
      this.no = no;
   }
   public void enrollStudent(Student Student){
      System.out.println("Graduate Course");


   }
}
