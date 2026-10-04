import java.util.Scanner;

class GreatestTwo {
    int a, b;

    void findGreatest() {
        if (a > b)
            System.out.println(a + " is the greatest number.");
        else if (b > a)
            System.out.println(b + " is the greatest number.");
        else
            System.out.println("Both numbers are equal.");
    }
}

public class Q10_GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GreatestTwo obj = new GreatestTwo();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.findGreatest();

        sc.close();
    }
}