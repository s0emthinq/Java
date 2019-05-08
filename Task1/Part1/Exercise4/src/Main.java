import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input a four digit number:");
        int number = so.nextInt();
        int ones = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int thousands = number % 10;
        if ((thousands < hundreds) && (hundreds < tens) && (tens < ones)) {
            System.out.println("Increasing");
        }
        else {
            System.out.println("Not increasing");
        }
    }

}
