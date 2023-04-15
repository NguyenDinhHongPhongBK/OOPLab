package ExcerciseSix;

import java.util.Scanner;

public class InputFromKeyboard {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		String nameString = sc.nextLine();
		System.out.println("How old are you ?");
		int age = sc.nextInt();
		System.out.println("How weight are you ?");
		double weight = sc.nextDouble();
		System.out.println(nameString + ", " + age + " years old, " + weight + " kg" );
	}
}
