import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input a six digit number:");
        int number = so.nextInt();
        int digit1 = number % 10; /* Первая цифра числа справа налево*/
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        number /= 10;
        int digit5 = number % 10;
        number /= 10;
        int digit6 = number % 10; /* Шестая цифра числа справа налево*/

        double avgArithm = (double) (digit1 + digit2 + digit3 + digit4 + digit5 + digit6) / 6;
        double avgGeom = Math.pow((digit1 + digit2 + digit3 + digit4 + digit5 + digit6), (double) 1/6);

        System.out.println("Average arithmetic: " + avgArithm);
        System.out.println("Average geometric: " + avgGeom);

    }
}
