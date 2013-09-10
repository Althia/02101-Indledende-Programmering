package uge2;

public class Opgave2_4 {
		public static void main(String[] args) {
			long lastNum = 1, lastNum2 = 1;
			for(int i = 0; i < 12; i++) {
				if(i < 2) {
					System.out.print(lastNum + " ");
				}
				else {
					long currentNum = lastNum + lastNum2;
					System.out.print(currentNum + " ");
					lastNum2 = lastNum;
					lastNum = currentNum;
				}
			}
		}

}
