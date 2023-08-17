public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Phani",2);
        String studentDetails=s1.studentDetails();
        System.out.println(studentDetails);

        Student s2=new Student("John",3);
        System.out.println(s2.studentDetails());

        ResearchStudent rs1=new ResearchStudent("Amar",1,"AI & ML");
        System.out.println(rs1.studentDetails());
        PHDStudent phd1=new PHDStudent("Mandeep singh",1,"Data Analytics","Assistant Professor",50000);
        System.out.println(phd1.studentDetails());
//

    }
}

class Student {
    private  String name;
    private int year;

    public String studentDetails(){
        return "Name :"+this.name+"\n"+"Year :"+this.year+"\nStudent fee: "+this.studentFees();
    }
    public int studentFees(){
        return annualFee*this.year;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static final int annualFee=10000;

    public Student(){

    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

}

/*class ResearchStudent {
    private  String name;
    private int year;
    private String researchArea;

    public String studentDetails(){
        return "Name :"+this.name+"\n"+"Year :"+this.year+"\n"
                +"Student fee: "+this.studentFees()+"\nResearch Area :"+this.researchArea;
    }
    public int studentFees(){
        return annualFee*this.year;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public static final int annualFee=15000;

    public ResearchStudent(){

    }

    public ResearchStudent(String name, int year, String researchArea) {
        this.name = name;
        this.year = year;
        this.researchArea=researchArea;
    }

}*/

class ResearchStudent extends Student{
    private String researchArea;
    public String studentDetails(){
        return super.studentDetails()+"\nResearch Area :"+this.researchArea;
    }
    public ResearchStudent(String name, int year, String researchArea){
        super(name, year);
        this.researchArea=researchArea;
    }

}

class PHDStudent extends ResearchStudent{
    private String jobRole;
    private int salary;


    public PHDStudent(String name, int year, String researchArea,String jobRole,int salary) {
        super(name, year, researchArea);
        this.jobRole=jobRole;
        this.salary=salary;
    }
    public String studentDetails(){
        return super.studentDetails()+"\nJobRole :"+this.jobRole+"\nsalary :"+this.salary;
    }
}