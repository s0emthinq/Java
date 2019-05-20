public class Test {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        float[][] testMatrix = {{2, 1, 4, 3}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("-===============TEST===============-");
        System.out.print("Initial test matrix: ");
        task3.showArr(testMatrix);
        System.out.println("\nMax element: " + task3.getMaxElement(testMatrix));
        System.out.println("Min element: " + task3.getMinElement(testMatrix));
        System.out.println("Arithmetic mean: " + task3.getAvgArith(testMatrix));
        System.out.println("Geometric mean: " + task3.getAvgGeom(testMatrix));
        int i = task3.getIndexOfFirstLocalMin(testMatrix)[0];
        int j = task3.getIndexOfFirstLocalMin(testMatrix)[1];
        System.out.println("Position of first local minimum: [" + i + "]" + "[" + j + "]");
        i = task3.getIndexOfFirstLocalMax(testMatrix)[0];
        j = task3.getIndexOfFirstLocalMax(testMatrix)[1];
        System.out.print("Position of first local maximum: [" + i + "]" + "[" + j + "]" + "\n");
        System.out.print("Transposed matrix:");
        task3.showArr(task3.transposeMatrix(testMatrix));
        System.out.println("\n-===============TESTING COMPLETED===============-");
    }
}
