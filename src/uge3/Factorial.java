package uge3;

public class Factorial {
	public static void main(String[] args) {
		
	}
	public static int factorial(int n) {
		int factor = 1;
		for(int i = 1; i <= n; i++) {
			factor = factor * i;
		}
		return factor;
	}
}
