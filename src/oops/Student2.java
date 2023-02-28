package oops;
import java.util.*;
public class Student2 {
    private String name;
    String address;
    int rollNo;
    String schoolName;
    int admissionId;


    void setName(String s){
        this.name = s;

    }

    void getName(){
        System.out.println(this.name);
    }

    //function call
    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.rollNo);
        System.out.println(this.schoolName);
        System.out.println(this.admissionId);

    }

}
