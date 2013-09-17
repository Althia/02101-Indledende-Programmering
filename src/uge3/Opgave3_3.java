package uge3;

import java.util.Scanner;

public class Opgave3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printNumbers(scanner.nextInt());
		scanner.close();
		
	}
	public static void printNumbers(int max) {
		for(int i = 1; i <= max; i++) {
			System.out.print("[" + i + "]");
		}
	}
}
