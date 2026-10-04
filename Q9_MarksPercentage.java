import java.util.Scanner;

class StudentMarks {
    float subject1, subject2, subject3;

    void calculate() {
        float total = subject1 + subject2 + subject3;
        float percentage = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (subject1 >= 40 && subject2 >= 40 && subject3 >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

public class Q9_MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentMarks obj = new StudentMarks();

        System.out.print("Enter marks of Subject 1: ");
        obj.subject1 = sc.nextFloat();

        System.out.print("Enter marks of Subject 2: ");
        obj.subject2 = sc.nextFloat();

        System.out.print("Enter marks of Subject 3: ");
        obj.subject3 = sc.nextFloat();

        obj.calculate();

        sc.close();
    }
}