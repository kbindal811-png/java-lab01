import java.util.Scanner;

class CharacterCheck {
    char character;

    void check() {
        if (Character.isDigit(character))
            System.out.println("It is a digit.");
        else if (Character.isUpperCase(character))
            System.out.println("It is an uppercase letter.");
        else if (Character.isLowerCase(character))
            System.out.println("It is a lowercase letter.");
        else
            System.out.println("It is a special character.");
    }
}

public class Q14_CharacterClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CharacterCheck obj = new CharacterCheck();

        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);

        obj.check();

        sc.close();
    }
}