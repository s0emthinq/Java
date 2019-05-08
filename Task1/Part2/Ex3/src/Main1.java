import java.util.Scanner;

public class Main1 {

    public static final String VOWELS = "AEIOUYaeiouy";
    public static final String LOWER_VOWELS = "aeiouy";
    public static final String UPPER_VOWELS = "AEIOUY";
    public static final String YES_MESSAGE = "A vowel";
    public static final String NO_MESSAGE = "Not a vowel";


    public static boolean isVovelThroughContainsAll(String symbol) {
        if (VOWELS.contains(symbol)) {
            System.out.println(YES_MESSAGE);
            return true;
        } else {
            System.out.println(NO_MESSAGE);
            return false;
        }
    }

    public static boolean isVovelThroughContainsUpperCase(String symbol) {
        if (UPPER_VOWELS.contains(symbol.toUpperCase())) {
            System.out.println(YES_MESSAGE);
            return true;
        } else {
            System.out.println(NO_MESSAGE);
            return false;
        }
    }

    public static boolean isVovelThroughContainsLowerCase(String symbol) {
        if (LOWER_VOWELS.contains(symbol.toLowerCase())) {
            System.out.println(YES_MESSAGE);
            return true;
        } else {
            System.out.println(NO_MESSAGE);
            return false;
        }
    }

    public static boolean isVovelThroughLastIndexOf(String symbol) {
        if (VOWELS.lastIndexOf(symbol) >= 0) {
            System.out.println(YES_MESSAGE);
            return true;
        } else {
            System.out.println(NO_MESSAGE);
            return false;
        }
    }

    public static boolean isVovelThroughAscii(char symbol) {
        int asciiCode = (int) symbol;
        if ((asciiCode == 65) || (asciiCode == 97)
                || (asciiCode == 69) || (asciiCode == 101) /* Ascii код символов 'a' и 'A' */
                || (asciiCode == 73) || (asciiCode == 105)
                || (asciiCode == 79) || (asciiCode == 111)
                || (asciiCode == 85) || (asciiCode == 117)
                || (asciiCode == 89) || (asciiCode == 121)) { /* Ascii код символов 'y' и 'Y' */
            System.out.println(YES_MESSAGE);
            return true;
        } else {
            System.out.println(NO_MESSAGE);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input the character:");
        String input = so.next();
        isVovelThroughContainsLowerCase(input);
        isVovelThroughContainsUpperCase(input);
        isVovelThroughContainsAll(input);
        isVovelThroughLastIndexOf(input);

        char inputAsChar = input.charAt(0);
        isVovelThroughAscii(inputAsChar);


    }
}
