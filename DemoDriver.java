public class DemoDriver {

    public static void main(String[] args) {
        //Department, instructor or student objects
        Department ComputerScience=new Department("Computer Science");
        Instructor ProfessorAhmed =new Instructor("Prof.Ahmed" , "ahmed@example@edu");

        Student st1 = new Student(" Ali" , "ali@example.edu" , 001);
        Student st2 = new Student("Fatima" , "fatima@example.edu", 002);
        //Undergraduate and graduate objects

        UndergraduateCourse introPragramming = new UndergraduateCourse("Intro to Programming", "CSC101" , ComputerScience, ProfessorAhmed, 3);
        GraduateCourse AdvancedAI = new GraduateCourse("AdvancedAI" , "CS107" , ComputerScience , ProfessorAhmed ,3);

        //enroll Students in the course
            introPragramming.enrollStudent(st1);
            introPragramming.enrollStudent(st2);
           // AdvancedAI.enrollStudent();
        //Printing
        //System.out.println("Undergraduate Course: " + introP

    }
}
