import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a;
        float b;
        float c;
        Scanner so = new Scanner(System.in);

        System.out.print("a:");
        a = so.nextFloat();
        System.out.print("b:");
        b = so.nextFloat();
        System.out.print("c:");
        c = so.nextFloat();

        if ((a == b) && (b == c)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
