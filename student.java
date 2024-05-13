//import java.util.*;

class Student {
    private String RollNo;
    private String Name;
    private String Batch;

    Student(String RollNo, String Name, String Batch){
        this.RollNo = RollNo;
        this.Name = Name;
        this.Batch = Batch;
    }
    
    void show(){
        System.out.println("Roll NO:- "+RollNo+"\n"+"Name:- "+Name+"\n"+"Batch:- "+Batch);
    }
}

class Result extends Student {
    private double m1;
    private double m2;
    private double m3;
    private double percentage;
    private String grade;

    Result(String RollNo, String Name, String Batch, double m1, double m2, double m3, double percentage, String grade){
        super(RollNo, Name, Batch);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.percentage = percentage;
        this.grade = grade;
    }

    void cal_result(){
        percentage = (m1+m2+m3)*100/300;
        if(percentage>90){
            grade = "O";
        } else if(percentage>80 && percentage<=90){
            grade = "E";
        } else if(percentage>70 && percentage<=80){
            grade = "A";
        } else if (percentage>60 && percentage<=70){
            grade = "B";
        } else {
            grade = "C";
        }
    }
    void display(){
        System.out.println("Percentage:- "+ percentage + "\n" + "Grade:- "+grade);
    }

}

public class student {
    public static void main(String[] args) {
        Result ob = new Result("63", "Aditya", "CSE", 78, 90, 79, 0,"");
        ob.show();
        ob.cal_result();
        ob.display();
    }
}