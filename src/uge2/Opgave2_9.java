package uge2;

public class Opgave2_9 {
	public static final int BOUND = 1000;
	public static void main(String[] args) {
		loop1();
		loop2();
	}
	public static void loop1(){
		int j = 0;
		for(int i = 0; j < BOUND; i++) {
			j = j + 7;
		}
		System.out.println("Loop1 value of j = " + j);
	}
	public static void loop2(){
		int j = 0;
		for(int i = 0; j != BOUND; i++) {
			j = j + 19;
		}
		System.out.print("Loop2 value of j = " + j);
	}
}
