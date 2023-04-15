package ExcerciseSix;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();
		int[][] matrix1 = new int[rows][columns];
		int[][] matrix2 = new int[rows][columns];
		System.out.println("Enter the values for matrix 1:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the values for matrix 2:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
		int[][] result = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println("Matrix 1:");
		printMatrix(matrix1);
		System.out.println("Matrix 2:");
		printMatrix(matrix2);
		System.out.println("Result:");
		printMatrix(result);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
