package Object_Oriented_Programming;


 class Student {
    String name;
    int rollNo;
    String address;
    double percentage;


    /*public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.rollNo);
        System.out.println(this.percentage);


    }*/
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "surya";
        s1.address = "turkyamjal";
        s1.rollNo =23;
        s1.percentage = 98.8;

        //s1.printDetails();



        
    }
}
