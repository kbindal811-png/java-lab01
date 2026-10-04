import java.util.Scanner;

class Calculator {
    double a, b;
    char operator;

    void calculate() {
        if (operator == '+')
            System.out.println("Result: " + (a + b));
        else if (operator == '-')
            System.out.println("Result: " + (a - b));
        else if (operator == '*')
            System.out.println("Result: " + (a * b));
        else if (operator == '/') {
            if (b != 0)
                System.out.println("Result: " + (a / b));
            else
                System.out.println("Division by zero is not allowed.");
        } else
            System.out.println("Invalid operator.");
    }
}

public class Q19_OperatorCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        System.out.print("Enter first number: ");
        obj.a = sc.nextDouble();

        System.out.print("Enter second number: ");
        obj.b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        obj.operator = sc.next().charAt(0);

        obj.calculate();

        sc.close();
    }
}