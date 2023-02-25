package Object_Oriented_Programming;

class Students{
    String name;
    int rollNo;
    double percentage;
    int admissionId;

     Students(String name1, int rollNo1, double percentage1, int admissionId1){
        name = name1;
        rollNo = rollNo1;
        percentage = percentage1;
        admissionId = admissionId1;

    }

    void eat(){
        System.out.println(name  + " is eating ");
    }

}

public class New_Student {
    public static void main(String[] args){
        //constructor are used to initialize variables...
        Students s1 = new Students("avatar",45,98.4,1345);
        /*s1.name = "avatar";
        s1.rollNo = 45;
        s1.percentage = 98.4;
        s1.admissionId = 1345;
        s1.eat();*/

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percentage);
        System.out.println(s1.admissionId);

        Students s2 = new Students("ironman", 65, 87.40, 2034);
        /*s2.name = "ironman";
        s2.rollNo = 65;
        s2.percentage = 87.40;
        s2.admissionId = 2034;
        s2.eat();*/

        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s2.percentage);
        System.out.println(s2.admissionId);


    }
}
