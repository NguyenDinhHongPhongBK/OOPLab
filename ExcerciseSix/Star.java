package ExcerciseSix;

import java.util.Scanner;

public class Star {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of triangle : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j < n - (i - 1) || j > n + (i - 1))
					System.out.print("  ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
