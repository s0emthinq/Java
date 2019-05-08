public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double getDistance(Point point1, Point point2) {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double distance = 0;
        double temp1 = Math.pow((x1 - x2), 2); /* (x1 - x2)² */
        double temp2 = Math.pow((y1 - y2), 2); /* (y1 - y2)² */
        distance = Math.pow((temp1 + temp2), 1.0 / 2.0); /* Формула нахождения расстояния между двумя точкам: √((x1 - x2)² + (y1 - y2)²) */
        return distance;
    }
}
