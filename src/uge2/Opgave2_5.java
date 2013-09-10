package uge2;

public class Opgave2_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			printChar('-', 6-i);
			printNumber(i + (i-1), i + (i-1));
			printChar('-', 6-i);
			System.out.println();
		}
	}
	public static void printChar(char character, int repeat) {
		for(int i = 0; i < repeat; i++) {
			System.out.print(character);
		}
	}
	public static void printNumber(int num, int repeat) {
		for(int i = 0; i < repeat; i++) {
			System.out.print(num);
		}
	}
	
}
