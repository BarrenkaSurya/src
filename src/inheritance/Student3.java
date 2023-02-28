package inheritance;

public class Student3 {
    String name;
    String dob;
    String address;

    public void newStudent(){
        System.out.println("this is the student information :-> ");
    }


}
class newtonSchool  extends Student3{  // single-level inheritance
    String batchName;


    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.dob);
        System.out.println(this.address);
        System.out.println(this.batchName);
    }
}

class Placement extends newtonSchool{   //multi-level inheritance
    String placementId;

    void placementsDetails(){
        System.out.println("this is for placements");
    }
}



