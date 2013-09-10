package uge2;

public class Opgave2_3_3 {
	public static void main(String[] args){
		final int NUMROWS = 4;
		for(int i = 0; i < NUMROWS; i++) {
			for(int j = 9; j > 0; j--) {
				printNumbers(j, j);
			}
			System.out.println();
		}
	}
	public static void printNumbers(int num, int times) {
		for(int i = 0; i < times; i++) {
			System.out.print(num);
		}
	}
}
