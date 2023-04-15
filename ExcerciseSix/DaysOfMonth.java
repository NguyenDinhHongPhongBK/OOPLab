package ExcerciseSix;

import java.util.Scanner;

public class DaysOfMonth {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int month, year;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		month = scanner.nextInt();
		System.out.print("Enter year: ");
		year = scanner.nextInt();
		if (month < 1 || month > 12 || year < 1) {
			System.out.println("Invalid input. Please enter valid month and year.");
			return;
		}
		int numDays;
		switch (month) {
		case 2:
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				numDays = 29;
			} else {
				numDays = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		default:
			numDays = 31;
		}
		System.out.println("Number of days in month " + month + " of year " + year + " is " + numDays);
	}
}
