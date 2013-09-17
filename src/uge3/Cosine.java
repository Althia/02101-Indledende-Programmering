package uge3;

public class Cosine {
	public static void main(String[] args) {
	}
	public static double cosine(double x, int k) {
		double cos = 1;
		for(int i = 1; i <= k; i++) {
			cos = cos + (pow(-1, i)*pow(x,2*i))/factorial(2*i);
		}
		return cos;
	}
	public static double pow(double number, int pow) {
		double num = number;
		for(int i = 1 ; i < pow; i++) {
			num *= number;
		}
		return num;
	}
	public static int factorial(int n) {
		int factor = 1;
		for(int i = 1; i <= n; i++) {
			factor = factor * i;
		}
		return factor;
	}
}
