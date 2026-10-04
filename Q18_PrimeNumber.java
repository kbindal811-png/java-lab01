import java.util.Scanner;

class Prime {
    int number;

    void check() {
        boolean prime = true;

        if (number <= 1)
            prime = false;
        else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}

public class Q18_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Prime obj = new Prime();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}
