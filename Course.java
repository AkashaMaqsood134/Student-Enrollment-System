public class Course {

    private String Course_name;

    private String CourseCode;

    Department d1=new Department();

    Instructor ins2=new Instructor();
    public  Student st1[];
    //Instructor i1=new Instructor(String name,String a);

   public Course(){

   }
    public Course(String course_name, String courseCode, Department d1, Instructor ins2, Student[] st1) {
        Course_name = course_name;
        CourseCode = courseCode;
        this.d1 = d1;
        this.ins2 = ins2;
        this.st1 = st1;
    }

    public Course(String course_name, String courseCode, Department d1, Instructor ins2) {
        Course_name = course_name;
        CourseCode = courseCode;
        this.d1 = d1;
        this.ins2 = ins2;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public Department getD1() {
        return d1;
    }

    public void setD1(Department d1) {
        this.d1 = d1;
    }

    public Instructor getIns2() {
        return ins2;
    }

    public void setIns2(Instructor ins2) {
        this.ins2 = ins2;
    }

    public Student[] getSt1() {
        return st1;
    }

    public void setSt1(Student[] st1) {
        this.st1 = st1;
    }
    public void enrollStudent(Student Student){



    }
}
