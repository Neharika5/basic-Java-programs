import java.util.Scanner;

public class MatrixMultiplicationExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the matrices from the user
        System.out.println("Enter the dimensions of the matrices (rows x columns):");
        System.out.print("Rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Columns for Matrix A / Rows for Matrix B: ");
        int columnsRows = scanner.nextInt();
        System.out.print("Columns for Matrix B: ");
        int columnsB = scanner.nextInt();

        // Check if matrix multiplication is possible with the provided dimensions
        if (rowsA <= 0 || columnsRows <= 0 || columnsB <= 0 || columnsRows != columnsB) {
            System.out.println("Matrix multiplication is not possible with the provided dimensions.");
            return;
        }

        // Create matrices based on user input
        int[][] matrixA = new int[rowsA][columnsRows];
        int[][] matrixB = new int[columnsRows][columnsB];

        // Get elements for Matrix A
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsRows; j++) {
                System.out.printf("Enter element A[%d][%d]: ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Get elements for Matrix B
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < columnsRows; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.printf("Enter element B[%d][%d]: ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication and display the result
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the resulting matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsA = firstMatrix.length;
        int columnsRows = secondMatrix.length;
        int columnsB = secondMatrix[0].length;

        int[][] resultMatrix = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsRows; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultMatrix;
    }
}
