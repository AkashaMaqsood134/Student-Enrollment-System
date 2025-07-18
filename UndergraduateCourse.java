public class UndergraduateCourse extends Course{

       private int st_no;

       public UndergraduateCourse()
       {

       }

    public UndergraduateCourse(int st_no) {
        this.st_no = st_no;
    }

    public UndergraduateCourse(String course_name, String courseCode, Department d1, Instructor ins2, int st_no) {
        super(course_name, courseCode, d1, ins2);
        this.st_no = st_no;
    }

    public int getSt_no() {
        return st_no;
    }


    public void setSt_no(int st_no) {
        this.st_no = st_no;
    }

    public void enrollStudent(Student Student){
        System.out.println("Undergraduate Course");


    }
}
