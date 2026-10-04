import java.util.Scanner;

class TypeCasting {
    float number;

    void convert() {
        int converted = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("Converted integer value: " + converted);
    }
}

public class Q5_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TypeCasting obj = new TypeCasting();

        System.out.print("Enter a floating-point number: ");
        obj.number = sc.nextFloat();

        obj.convert();

        sc.close();
    }
}