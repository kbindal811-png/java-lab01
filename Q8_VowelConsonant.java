import java.util.Scanner;

class VowelConsonant {
    char character;

    void check() {
        char ch = Character.toLowerCase(character);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(character + " is a vowel.");
        else
            System.out.println(character + " is a consonant.");
    }
}

public class Q8_VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VowelConsonant obj = new VowelConsonant();

        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);

        obj.check();

        sc.close();
    }
}