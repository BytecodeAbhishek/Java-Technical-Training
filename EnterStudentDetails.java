import java.util.Scanner;

class Student {
    private int rollNo;
    private String Name;
    private int MarksOfSubject1;
    private int MarksOfSubject2;
    private int MarksOfSubject3;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getMarksOfSubject1() {
        return MarksOfSubject1;
    }
    public void setMarksOfSubject1(int marksOfSubject1) {
        MarksOfSubject1 = marksOfSubject1;
    }
    public int getMarksOfSubject2() {
        return MarksOfSubject2;
    }
    public void setMarksOfSubject2(int marksOfSubject2) {
        MarksOfSubject2 = marksOfSubject2;
    }
    public int getMarksOfSubject3() {
        return MarksOfSubject3;
    }
    public void setMarksOfSubject3(int marksOfSubject3) {
        MarksOfSubject3 = marksOfSubject3;
    }
    // constructor 
    public Student(int rollNo , String Name , int MarksOfSubject1 , int MarksOfSubject2 ,
    int MarksOfSubject3){
        if(ValidData(rollNo, Name, MarksOfSubject1, MarksOfSubject2, MarksOfSubject3)){
            this.rollNo = rollNo;
            this.Name = Name;
            this.MarksOfSubject1 = MarksOfSubject1;
            this.MarksOfSubject2 = MarksOfSubject2;
            this.MarksOfSubject3 = MarksOfSubject3;
        }
        else{
            System.out.println("Please Enter the Valid Data");
        }
    }
    public void PrintData (){
        System.out.println("Roll NO : "+this.rollNo);
        System.out.println("Name : "+this.Name);
        System.out.println("Marks \nSubject 1 : "+this.MarksOfSubject1+"\nSubject 2 : "+this.MarksOfSubject2+
       "\nSubject 3 : "+this.MarksOfSubject3);
        int TotalMarks = this.MarksOfSubject1 + this.MarksOfSubject2  +this.MarksOfSubject3;
        System.out.println("Total Marks : "+TotalMarks);
        double percentage = (TotalMarks/300.0)*100;
        System.out.println("Percetntage : "+percentage+"%");
        if(percentage >= 90){
            System.out.println("A Grade");
        }
        else if(percentage >= 80 && percentage <90){
            System.out.println("B Grade");
        }
        else if(percentage >= 70 && percentage < 80){
            System.out.println("C Grade");
        }
        else if(percentage >= 60 && percentage < 70){
            System.out.println("D Grade");
        }
        else if(percentage >= 50 && percentage < 60){
            System.out.println("E Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }
    private boolean ValidData(int rollNo , String Name , int MarksOfSubject1 , int MarksOfSubject2 ,
    int MarksOfSubject3){
        return rollNo >=1 && Name != null && MarksOfSubject1 >=0 && MarksOfSubject1 <=100 && 
        MarksOfSubject2 >=0 && MarksOfSubject2 <=100 && MarksOfSubject3 >=0 && MarksOfSubject3 <=100;
    }
}
class EnterStudentDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll NO : ");
        int rollNo = sc.nextInt();
        System.out.println("Enter the Name of Student : ");
        sc.nextLine(); // to eat up the enter 
        String Name = sc.nextLine();
        System.out.println("Enter Marks of Subject 1 : ");
        int MarksOfSubject1 = sc.nextInt();
        System.out.println("Enter Marks of Subject 2 : ");
        int MarksOfSubject2 = sc.nextInt();
        System.out.println("Enter Marks of Subject 3 : ");
        int MarksOfSubject3 = sc.nextInt();
        Student ob = new Student(rollNo, Name, MarksOfSubject1, MarksOfSubject2, MarksOfSubject3);
        ob.PrintData();
        sc.close();
    }
}
