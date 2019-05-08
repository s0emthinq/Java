import java.util.Scanner;

public class Main {
    public static final int START_HEADS_NUMBER = 3;
    public static final int FIRST_INTERVAL_YEARS = 200; /* От рождения до 200 лет включительно, т. е. возраст [0, 200] */
    public static final int SECOND_INTERVAL_YEARS = 100; /* От 200 лет до 300 лет включительно, т. е. возраст (200, 300] */

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input the age of a dragon:");
        int heads = START_HEADS_NUMBER;
        int age = so.nextInt();

        if (age >= 0 && age <= 200) {
            heads += age * 3;
        }
        if (age > 200 && age <= 300) {
            heads += FIRST_INTERVAL_YEARS * 3 + (age - 200) * 2;
        }
        if (age > 300) {
            heads += FIRST_INTERVAL_YEARS * 3 + SECOND_INTERVAL_YEARS * 2
                    + (age - (FIRST_INTERVAL_YEARS + SECOND_INTERVAL_YEARS));
        }

        System.out.print("Dragon has " + heads + " heads ");
        int eyes = heads * 2;
        System.out.println("and " + eyes + " eyes");

    }
}
