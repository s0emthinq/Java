import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Input a:");
        int a = so.nextInt();
        System.out.print("Input b:");
        int b = so.nextInt();
        System.out.println("Before changing: a = " + a + ", b = " + b);
        a = a + b ;
        b = a - b;
        a = a - b;
        System.out.println("After changing: a = " + a + ", b = " + b);
    }
}
