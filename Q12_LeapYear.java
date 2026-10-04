import java.util.Scanner;

class LeapYear {
    int year;

    void check() {
        if (year % 400 == 0)
            System.out.println(year + " is a leap year.");
        else if (year % 100 == 0)
            System.out.println(year + " is not a leap year.");
        else if (year % 4 == 0)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

public class Q12_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LeapYear obj = new LeapYear();

        System.out.print("Enter a year: ");
        obj.year = sc.nextInt();

        obj.check();

        sc.close();
    }
}