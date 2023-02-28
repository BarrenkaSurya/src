package oops;
import java.util.*;
public class New_admission {
    public static void main(String[] args){

        Student2 s1 = new Student2();

        //s1.name = " surya";
        s1.rollNo = 23;
        s1.schoolName = "newtonSchool";
        s1.admissionId = 2093;
        s1.address = "Hyderabad";

        //calling setters & getters functions
        s1.setName("newton");
        s1.getName();

        s1.printDetails();


    }
}
