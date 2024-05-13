class ComputerProfessional
{
    String EName, Prospect;
    float DutyHour;
    ComputerProfessional(String n, String p, float d)
    {
        EName = n;
        Prospect = p;
        DutyHour = d;
    }
    void display() {
        System.out.println("Employee Name: " + EName);
        System.out.println("Prospect: " + Prospect);
        System.out.println("Duty Hour: " + DutyHour);
    }
}

class Developer extends ComputerProfessional {
    float StudyHour;

    Developer(String n, String p, float d, float s) {
        super(n, p, d);
        StudyHour = s;
    }

    void displaydata() {
        //System.out.println("\nDeveloper: ");
        display();
        System.out.println("Study Hour: " + StudyHour);
    }
}

class NetworkAdmin extends ComputerProfessional {
    float PracticeHour;

    NetworkAdmin(String n, String p, float d, float ph) {
        super(n, p, d);
        PracticeHour = ph;
    }

    void displaydata() {
        System.out.println("\nNetwork Admin: ");
        display();
        System.out.println("Practice Hour: " + PracticeHour);
    }
}

class DataOperator extends ComputerProfessional {
    float TypingSpeed;

    DataOperator(String n, String p, float d, float s) {
        super(n, p, d);
        TypingSpeed = s;
    }

    void displaydata() {
        System.out.println("\nData Operator: ");
        display();
        System.out.println("Typing Speed: " + TypingSpeed);
    }
}

class JavaProfessional extends Developer {
    String ProficiencyLevel;

    JavaProfessional(String n, String p, float d, float s, String pl) {
        super(n, p, d, s);
        ProficiencyLevel = pl;
    }

    void displaydata() {
        System.out.println("\nJava Professional: ");
        super.displaydata();
        System.out.println("Proficiency Level: " + ProficiencyLevel);
    }
}

class PythonProfessional extends Developer {
    String ProficiencyLevel;

    PythonProfessional(String n, String p, float d, float s, String pl) {
        super(n, p, d, s);
        ProficiencyLevel = pl;
    }

    void displaydata() {
        System.out.println("\nPython Professional: ");
        super.displaydata();
        System.out.println("Proficiency Level: " + ProficiencyLevel);
    }
}

public class computer {
    public static void main(String[] args) {
        JavaProfessional ob1 = new JavaProfessional("Srajan", "Excellent", 5, 10, "Pro");
        ob1.displaydata();
        PythonProfessional ob2 = new PythonProfessional("Srajan", "Excellent", 5, 10, "Pro");
        ob2.displaydata();
        NetworkAdmin ob3 = new NetworkAdmin("SM", "Excellent", 5, 6);
        ob3.displaydata();
        DataOperator ob4 = new DataOperator("SM", "Excellent", 5, 6);
        ob4.displaydata();
    }
}