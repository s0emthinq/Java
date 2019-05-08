import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input radius of the bigger circle(R1):");
        Scanner so = new Scanner(System.in);
        double r1 = so.nextDouble();
        Circle circle1 = new Circle(r1);
        System.out.print("Input radius of the smaller circle(R2):");
        double r2 = so.nextDouble();
        Circle circle2 = new Circle(r2);
        double s = circle1.getSquare(circle1.getR()) - circle2.getSquare(circle2.getR());
        System.out.println("The square of the ring is: " + s);
    }
}
