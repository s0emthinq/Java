import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number:");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Input mus be > 0. Try again:");
            number = scanner.nextInt();
        }
        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        if (number == sumOfDividers) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }
}
