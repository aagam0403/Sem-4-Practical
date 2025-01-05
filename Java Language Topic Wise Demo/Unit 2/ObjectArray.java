import java.util.*;
class student {
    int id;
    String name;
    static int eventid = 0;

    student() {
        id = 1;
        name = "abc";
    }
    student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void displayDetails() {
        System.out.println(" the id is : " + id);
        System.out.println(" the name is : " + name);
        System.out.println(" event id is : " + eventid);
    }
}

public class ObjectArray {
    public static void main(String args[]) {
        student s[] = new student[2];
        s[0] = new student();
        System.out.println(" details of student 1 ");
        s[0].displayDetails();
        s[1] = new student(23,"PQR");
        System.out.println(" details of student 2 ");
        s[1].displayDetails();
    }
}