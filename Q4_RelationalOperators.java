import java.util.Scanner;

class Relational {
    int a, b;

    void compare() {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}

public class Q4_RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Relational obj = new Relational();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.compare();

        sc.close();
    }
}