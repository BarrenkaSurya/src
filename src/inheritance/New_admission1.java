package inheritance;

public class New_admission1 {
    public static void main(String[] args){
     //   Student3 s1 = new Student3();
          newtonSchool s1 = new newtonSchool();  // both objects are same
          Placement s2 = new Placement();

          s1.name = "Avatar";
          s1.address = "hyderabad";
          s1.dob = "9/11/2001";
          s1.batchName = "FSD-NOV";
          s2.placementId = "22098";

        s1.newStudent();
        s1.printDetails();  //function call
        s2.placementsDetails();

    }
}
