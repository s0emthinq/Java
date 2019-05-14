import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input start:");
        int start = scanner.nextInt();
        while (start <= 0) {
            System.out.println("Value must be > 0. Try again:");
            start = scanner.nextInt();
        }
        System.out.println("Input end:");
        int end = scanner.nextInt();
        while (end <= 0 || end <= start) {
            System.out.println("Incorrect input. Try again:");
            end = scanner.nextInt();
        }


        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                if ((j != i) && (getSumOfDividers(i) == j) && (getSumOfDividers(j) == i)) {
                    System.out.println(i + " and " + j);
                }
            }
        }
    }


    public static int getSumOfDividers(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers;
    }
}
