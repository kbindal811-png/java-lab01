import java.util.Scanner;

class Arithmetic {
    int a, b;

    void calculate() {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}

public class Q2_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arithmetic obj = new Arithmetic();

        System.out.print("Enter first integer: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second integer: ");
        obj.b = sc.nextInt();

        obj.calculate();

        sc.close();
    }
}