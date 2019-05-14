import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 mo = new Exercise1();
        Scanner so = new Scanner(System.in);
        System.out.print("Number of throws:");
        int times = so.nextInt();
        while (times <= 0) {
            System.out.println("Value must be positive! Please, try again:");
            times = so.nextInt();
        }
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < times; i++) {
            if (mo.headOrTail()) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Times: " + times + "\n" + "Heads: " + heads + "\n" + "Tails: " + tails);
    }

    public boolean headOrTail() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
