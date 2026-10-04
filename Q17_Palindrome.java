import java.util.Scanner;

class Palindrome {
    int number;

    void check() {
        int original = number;
        int reverse = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}

public class Q17_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Palindrome obj = new Palindrome();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}