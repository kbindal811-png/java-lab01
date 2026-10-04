import java.util.Scanner;

class ASCIIValue {
    char character;

    void displayASCII() {
        int ascii = (int) character;

        System.out.println("Character: " + character);
        System.out.println("ASCII value: " + ascii);
    }
}

public class Q6_ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ASCIIValue obj = new ASCIIValue();

        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);

        obj.displayASCII();

        sc.close();
    }
}