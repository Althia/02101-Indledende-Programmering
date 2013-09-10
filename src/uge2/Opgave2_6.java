// Signe Colding-Jørgensen
// s031854
// 02101 Indledende programmering

package uge2;

public class Opgave2_6 {
	
	public static final int NUM_MEN = 7;
	
	public static void main(String[] args) {
		for(int i = 0; i < NUM_MEN; i++) {
			startSpace(i);
			head();
			endSpace(i);
			endLine();
			startSpace(i);
			arms();
			endSpace(i);
			endLine();
			startSpace(i);
			legs();
			endSpace(i);
			endLine();
		}
		for(int i = 0; i < NUM_MEN * 5 + 7; i++) {
			System.out.print("*");
		}
	}
	public static void startSpace(int i) {
		for(int j = 0; j < 5 * (NUM_MEN - i - 1); j++) {
			System.out.print(" ");
		}
	}
	public static void endLine() {
		System.out.println("*");
	}
	public static void endSpace(int i) {
		for(int j = 0; j < 5 * i; j++) {
			System.out.print(" ");
		}
	}
	public static void head() {
		System.out.print("  o  ");
		for(int i = 0; i < 6; i++) {
			System.out.print("*");
		}
	}
	public static void arms() {
		System.out.print(" /|\\ ");
		FigureSpaces();
	}
	public static void FigureSpaces() {
		System.out.print("*");
		for(int i = 0; i < 5; i++) {
			System.out.print(" ");
		}
	}
	public static void legs() {
		 System.out.print(" / \\ ");
		 FigureSpaces();
	}
}
