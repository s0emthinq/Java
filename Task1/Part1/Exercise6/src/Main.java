import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input number:");
        String numberAsString = so.next();
        StringBuilder stringBuilder = new StringBuilder(numberAsString);
        int reversedNumber = Integer.parseInt(stringBuilder.reverse().toString());
        System.out.println("Reversed number: " + reversedNumber);
    }
}
