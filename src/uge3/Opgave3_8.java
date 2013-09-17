package uge3;

import java.util.Scanner;

public class Opgave3_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your full name:");
		String firstName = scanner.next();
		String lastName = scanner.next();
		scanner.close();
		System.out.println("\nYour name in reverse order is " + lastName + ", " + firstName);
	}
}
