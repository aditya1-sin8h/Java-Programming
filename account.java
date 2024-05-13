//import java.util.*;

class Account {
    private String Acc_No;
    private String C_name;
    private String Contact_No;

    Account(String AccNo, String Name, String Contact_No){
        Acc_No = AccNo;
        C_name = Name;
        this.Contact_No = Contact_No;
    }

    void show(){
        System.out.println("Account No:- " + Acc_No + "\n" + "Name:- " + C_name + "\n" + "Contact No:- " + Contact_No);
    }
}

class Savings_Ac extends Account {
    private double ROI;
    private double Acc_Balance;

    Savings_Ac(String AccNo, String Name, String Contact_No, double ROI, double Acc_Balance){
        super(AccNo, Name, Contact_No);
        this.ROI = ROI;
        this.Acc_Balance = Acc_Balance;
    }

    void showdata(){
        System.out.println("Rate of Interest:- " + ROI + "\n" + "Account Balance:- " + Acc_Balance);
    }

    void compute(){
        Acc_Balance = Acc_Balance + (ROI/100)*Acc_Balance;
    }
}

class Current_Ac extends Account {
    private double Acc_Balance;
    private double Min_Balance;

    Current_Ac(String AccNo, String Name, String Contact_No, double Acc_Balance, double Min_Balance){
        super(AccNo, Name, Contact_No);
        this.Acc_Balance = Acc_Balance;
        this.Min_Balance = Min_Balance;
    }
    void showdata(){
        System.out.println("Account Balance:- " + Acc_Balance + "\n" + "Minimum Balance:- " + Min_Balance);
    }
}

class TD_Ac extends Account {
    private double Principal;
    private double Term;
    private double ROI;
    private double Maturity_Balance;

    TD_Ac(String AccNo, String Name, String Contact_No, double Principal, double Term, double ROI, double Maturity_Balance){
        super(AccNo, Name, Contact_No);
        this.Principal = Principal;
        this.Term = Term;
        this.ROI = ROI;
        this.Maturity_Balance = Maturity_Balance;
    }
    void showdata(){
        System.out.print("Principal:- "+Principal+"\n"+"Term:- "+Term+"\n"+"ROI:- "+ROI+"\n"+"Maturiy Balance:- "+Maturity_Balance);
    }
    void compute(){
        Maturity_Balance = Principal * Math.pow(1+ROI/100,Term*4);
    }
}

public class account{
    public static void main(String[] args) {
        Savings_Ac ob1 = new Savings_Ac("134567", "Aditya", "6356550967",7,9000);
        Current_Ac ob2 = new Current_Ac("12345","Harry","998876542", 8000, 2000);
        TD_Ac ob3 = new TD_Ac("234123","Hermione","88666543",10000,2,7,0);

        ob1.show();
        ob1.compute();
        ob1.showdata();
        System.out.println();

        ob2.show();
        ob2.showdata();
        System.out.println();
        
        ob3.show();
        ob3.compute();
        ob3.showdata();
    }
}