package NewtonSchool;
class Student{
    static String name;
    static int rollNo;   
}
public class NewSchool {
    public static void main(String[] args){
        Student.name ="newtonSchool";
        Student.rollNo = 23;
        System.out.println(Student.name);
        System.out.println(Student.rollNo);

    }
}


