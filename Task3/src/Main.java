import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows:");
        int rows = scanner.nextInt();
        while (rows <= 0) {
            System.out.println("Value must be a natural number! Please, try again:");
            rows = scanner.nextInt();
        }
        System.out.println("Columns:");
        int cols = scanner.nextInt();
        while (cols <= 0) {
            System.out.println("Value must be a natural number! Please, try again:");
            cols = scanner.nextInt();
        }
        Task3 to = new Task3();
        float[][] arr = new float[rows][cols];
        System.out.println("Input lower border of matrix elements range:");
        float lower = scanner.nextFloat();
        System.out.println("Input upper border of matrix elements range:");
        float upper = scanner.nextFloat();
        arr = to.fillInArrayRandomly(arr, lower, upper);

        System.out.println("-===============RESULTS===============-");
        System.out.print("Initial matrix: ");
        to.showArr(arr);
        System.out.println("\nMax element: " + to.getMaxElement(arr));
        System.out.println("Min element: " + to.getMinElement(arr));
        System.out.println("Arithmetic mean: " + to.getAvgArith(arr));
        System.out.println("Geometric mean: " + to.getAvgGeom(arr));
        int i = to.getIndexOfFirstLocalMin(arr)[0];
        int j = to.getIndexOfFirstLocalMin(arr)[1];
        System.out.println("Position of first local minimum: [" + i + "]" + "[" + j + "]");
        i = to.getIndexOfFirstLocalMax(arr)[0];
        j = to.getIndexOfFirstLocalMax(arr)[1];
        System.out.print("Position of first local maximum: [" + i + "]" + "[" + j + "]" + "\n");
        System.out.print("Transposed matrix:");
        to.showArr(to.transposeMatrix(arr));
        System.out.println("\n-===============RESULTS===============-");


    }
}
