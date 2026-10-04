import java.util.Scanner;

class EvenOdd {
    int number;

    void check() {
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
    }
}

public class Q3_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EvenOdd obj = new EvenOdd();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.check();

        sc.close();
    }
}