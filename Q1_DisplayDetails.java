import java.util.Scanner;

class StudentDetails {
    String name;
    int age;
    String college;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Q1_DisplayDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentDetails student = new StudentDetails();

        System.out.print("Enter your name: ");
        student.name = sc.nextLine();

        System.out.print("Enter your age: ");
        student.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your college name: ");
        student.college = sc.nextLine();

        student.displayDetails();

        sc.close();
    }
}
