import java.util.Scanner;

public class assignment11 {
    private int id;
    private String enrollmentNo;
    private String name;

    public assignment11(int id, String enrollmentNo, String name) {
        this.id = id;
        this.enrollmentNo = enrollmentNo;
        this.name = name;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Enrollment No: ");
        this.enrollmentNo = sc.nextLine();
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Enrollment No: " + this.enrollmentNo);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        assignment11[] admins = new assignment11[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Admin " + (i + 1) + ":");
            System.out.println("--------------------------");
            admins[i] = new assignment11(0, "", "");
            admins[i].input();
        }

        System.out.println("\nDetails of all Admins:");
        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Admin " + (i + 1) + ":");
            admins[i].display();
            System.out.println();
        }
    }
}
