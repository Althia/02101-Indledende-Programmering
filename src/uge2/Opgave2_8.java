package uge2;

public class Opgave2_8 {
	public static void main(String[] args) {
		int a = 0;
		
		for(int i = 0; i < 21; i++) {
			for(int j = 0; j <= 16; j++) {
				for(int k = 0; k < 4; k++) {
					a++;
				}
			}
		}
		System.out.println("Final value of a is " + a);
	}
}
