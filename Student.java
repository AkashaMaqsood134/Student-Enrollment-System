public class Student {

    private String St_name;
    private String email;
    private int roll_no;


    public Student(){

    }
    public Student(String st_name, String email, int roll_no) {
        St_name = st_name;
        this.email = email;
        this.roll_no = roll_no;
    }

    public String getSt_name() {
        return St_name;
    }

    public void setSt_name(String st_name) {
        St_name = st_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
