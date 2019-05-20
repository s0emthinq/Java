import java.util.Random;

public class Task3 {

    public float[][] fillInArrayRandomly(float[][] arr, float lowerBorder, float upperBorder) {
        final int ROWS = arr.length;
        final int COLS = arr[0].length;
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                arr[i][j] = (random.nextFloat() * (upperBorder - lowerBorder)) + lowerBorder;
            }
        }
        return arr;
    }

    public void showArr(float[][] arr) {
        for (float[] row :
                arr) {
            System.out.println();
            for (float element :
                    row) {
                System.out.printf("%10.3f", element);
            }
        }
    }

    public float getMinElement(float[][] arr) {
        float minElement = arr[0][0];
        for (float[] row : arr) {
            for (float element : row) {
                if (element < minElement) {
                    minElement = element;
                }
            }
        }
        return minElement;
    }

    public float getMaxElement(float[][] arr) {
        float maxElement = arr[0][0];
        for (float[] row : arr) {
            for (float element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }

    public double getAvgArith(float[][] arr) {
        double sum = 0d;
        int elementsAmount = 0;
        for (float[] row :
                arr) {
            for (float element :
                    row) {
                sum += element;
                elementsAmount++;
            }
        }
        double avgArithm = sum / elementsAmount;
        return avgArithm;
    }

    public double getAvgGeom(float[][] arr) {
        double mul = 1d;
        int elementsAmount = 0;
        for (float[] row :
                arr) {
            for (float element :
                    row) {
                mul *= element;
                elementsAmount++;
            }
        }
        if (mul < 0) {
            return -1;
        }
        double avgGeom = (float) Math.pow(mul, 1.0 / elementsAmount);
        return avgGeom;
    }

    public int[] getIndexOfFirstLocalMin(float[][] arr) {
        final int ROWS = arr.length;
        final int COLS = arr[0].length;
        int position[] = {-1, -1};
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (j != 0 && j != COLS - 1) { /* Условие для того, чтобы крайние элементы не брались(у них есть только оодин сосед)*/
                    if ((arr[i][j] < arr[i][j - 1]) && (arr[i][j] < arr[i][j + 1])) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
            }

        }
        return position;
    }

    public int[] getIndexOfFirstLocalMax(float[][] arr) {
        final int ROWS = arr.length;
        final int COLS = arr[0].length;
        int position[] = {-1, -1};
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (j != 0 && j != COLS - 1) {
                    if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) { /* Условие для того, чтобы крайние элементы не брались(у них есть только оодин сосед)*/
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
            }

        }
        return position;
    }

    public float[][] transposeMatrix(float arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == cols) {
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < cols; j++) {
                    float temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            return arr;
        } else {
            float[][] newArr = new float[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newArr[j][i] = arr[i][j];
                }
            }
            return newArr;
        }
    }

}
