import java.util.Scanner;

class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void setElement(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int getElement(int row, int col) {
        return matrix[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            System.out.println("Matrices cannot be multiplied ");
            return null;
        }

        Matrix result = new Matrix(a.getRows(), b.getCols());

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                int sum = 0;
                for (int k = 0; k < a.getCols(); k++) {
                    sum += a.getElement(i, k) * b.getElement(k, j);
                }
                result.setElement(i, j, sum);
            }
        }

        return result;
    }
}

public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions of the first matrix (rows columns):");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        Matrix matrix1 = new Matrix(rows1, cols1);

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1.setElement(i, j, scanner.nextInt());
            }
        }

        System.out.println("Enter dimensions of the second matrix (rows columns):");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        Matrix matrix2 = new Matrix(rows2, cols2);

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2.setElement(i, j, scanner.nextInt());
            }
        }

        Matrix result = Matrix.multiply(matrix1, matrix2);

        if (result != null) {
            System.out.println("Resultant Matrix after multiplication:");
            for (int i = 0; i < result.getRows(); i++) {
                for (int j = 0; j < result.getCols(); j++) {
                    System.out.print(result.getElement(i, j) + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}

