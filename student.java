import java.util.ArrayList;
import java.util.Scanner;

public class student {
    Integer rollno;
    String admnno,name,college;

    public student(Integer rollno, String admnno, String name, String college) {
        this.rollno = rollno;
        this.admnno = admnno;
        this.name = name;
        this.college = college;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getAdmnno() {
        return admnno;
    }

    public void setAdmnno(String admnno) {
        this.admnno = admnno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String[] args) {
        int rollno, choice, n, i;
        String admnno, name, college;
        Scanner sc = new Scanner(System.in);
        ArrayList<student> arr = new ArrayList<student>();
        System.out.println("Enter 1-Add student details\n 2-View student details\n3-Search student details\n4-Delete student details\n5-Exit\nEnter your choice: ");
        choice = sc.nextInt();

    }
}
