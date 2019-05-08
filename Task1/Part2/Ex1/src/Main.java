import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);

        System.out.print("Input x1:");
        double x1 = so.nextDouble();
        System.out.print("Input y1:");
        double y1 = so.nextDouble();

        System.out.print("Input x2:");
        double x2 = so.nextDouble();
        System.out.print("Input y2:");
        double y2 = so.nextDouble();

        System.out.print("Input x3:");
        double x3 = so.nextDouble();
        System.out.print("Input y3:");
        double y3 = so.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);

        double a = Point.getDistance(point1, point2);
        double b = Point.getDistance(point2, point3);
        double c = Point.getDistance(point3, point1);

        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    System.out.println("It's a triangle");
                    if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                        System.out.println("This triangle is rectangular!");
                    }
                }
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}
