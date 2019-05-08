public class Circle {
    public static final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getSquare(double r) {
        return PI * r * r;
    }

}
