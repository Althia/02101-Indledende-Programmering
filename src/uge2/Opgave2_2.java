package uge2;

public class Opgave2_2 {
	public static void main(String[] args) {
		int lastNum = 0;
		for(int i = 1; i <= 10; i++) {
			int currentNum = lastNum + i + (i-1);
			System.out.print(currentNum + " ");
			lastNum = currentNum;
		}
	}
}
