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
        switch (choice) {
            case 1:
                System.out.println("Enter Number of Students: ");
                n = sc.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println("Enter the following details \n Admission number: \nRoll number: \nName: \nCollege: ");
                    admnno = sc.next();
                    rollno = sc.nextInt();
                    name = sc.next();
                    college = sc.next();
                }
                student obj=new student(Integer rollno, String admnno, String name, String college);
                arr.add(obj);
                break;
            case 2:
                System.out.println("Displasy student details:");
                for (student stud : arr)
                {
                    System.out.println(stud.admnno);
                    System.out.println(stud.rollno);
                    System.out.println(stud.name);
                    System.out.println(stud.college);
                }
                break;
            case 3:
                System.out.println("Enter student admission no: ");
                String studadno=sc.next();
                for (student stud : arr)
                {
                    if (studadno==stud.admnno)
                    {
                        System.out.println("Details of student are:");
                        System.out.println(stud.admnno);
                        System.out.println(stud.rollno);
                        System.out.println(stud.name);
                        System.out.println(stud.college);
                        break;;
                    }
                    else System.out.println("Student details not found");
                }
                break;;
            case 4:
                System.out.println("Enter student admission no: ");
                studadno =sc.next();
                for (student s1 : arr)
                {
                    if (studadno== s1.getAdmnno())
                    {
                        arr.remove(s1);
                        break;
                    }
                }
            case 5:System.exit(0);
        }
    }
}
