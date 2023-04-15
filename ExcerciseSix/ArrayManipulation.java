package ExcerciseSix;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		insertionSort(arr);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		double average = (double) sum / n;

		System.out.println("Sorted array: " + Arrays.toString(arr));
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average value of array elements: " + average);
	}
}
