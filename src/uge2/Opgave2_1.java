package uge2;

public class Opgave2_1 {
	public static void main(String[] args) {
		int lastNum = 0;
		for(int i = 1; i <= 6; i++) {
			int currentNum = lastNum + i + (i-1);
			System.out.println(currentNum);
			lastNum = currentNum;
		}
	}
}
