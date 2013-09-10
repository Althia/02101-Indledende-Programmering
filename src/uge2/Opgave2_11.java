package uge2;

public class Opgave2_11 {
	public static void main(String[] args) {
		badExample();
	}
	public static void badExample() {
		System.out.println("Write some numbers ...");
		for(int i = 11; i <= 29; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println("\n... and backwards.");
		for(int i = 29; i >= 11; i -= 3) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
