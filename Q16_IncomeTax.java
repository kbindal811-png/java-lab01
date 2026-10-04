import java.util.Scanner;

class IncomeTax {
    double income;
    double tax;

    void calculateTax() {
        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = income * 0.05;
        else if (income <= 1000000)
            tax = income * 0.20;
        else
            tax = income * 0.30;

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
    }
}

public class Q16_IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IncomeTax obj = new IncomeTax();

        System.out.print("Enter annual income: ");
        obj.income = sc.nextDouble();

        obj.calculateTax();

        sc.close();
    }
}