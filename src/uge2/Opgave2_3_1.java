package uge2;

public class Opgave2_3_1 {
	public static void main(String[] args){
		final int REPEATNUM = 3;
		final int NUMROWS = 3;
		for(int i = 0; i < NUMROWS; i++) {
			for(int j = 0; j < 10; j++) {
				printNumbers(j, REPEATNUM);
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
