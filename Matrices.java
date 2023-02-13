package matrix_andrijasevic;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] firstArray = new int[M][N];
        int[][] secondArray = new int[N][M];

        // Generate random numbers for first array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                firstArray[i][j] = (int) (Math.random() * 10);
            }
        }

        // Transpose the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                secondArray[j][i] = firstArray[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(firstArray[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}