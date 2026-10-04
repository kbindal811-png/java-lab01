import java.util.Scanner;

class NumberCheck {
    int number;

    void check() {
        if (number > 0)
            System.out.println("The number is positive.");
        else if (number < 0)
            System.out.println("The number is negative.");
        else
            System.out.println("The number is zero.");
    }
}

public class Q13_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberCheck obj = new NumberCheck();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}