import java.util.Scanner;

class Armstrong {
    int number;

    void check() {
        int original = number;
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp = temp / 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}

public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Armstrong obj = new Armstrong();

        System.out.print("Enter a 3-digit number: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}