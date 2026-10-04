import java.util.Scanner;

class Divisibility {
    int number;

    void check() {
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println(number + " is divisible by both 3 and 5.");
        else
            System.out.println(number + " is not divisible by both 3 and 5.");
    }
}

public class Q7_DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Divisibility obj = new Divisibility();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}