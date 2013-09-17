package uge3;

public class Opgave3_9 {
	public static void main(String[] args) {
		double initialAmount = 1000;
		double interest = 0.065;
		int years = 25;
		int yearlyDeposit = 100;
		double balance = initialAmount;
		
		System.out.println("Year\tCurrent balance\tInterst\tNew deposit\tNew balance");
		System.out.println(0 + "\t\t" + initialAmount + "\t\t\t 0\t\t" + yearlyDeposit + "\t\t\t" + (initialAmount + yearlyDeposit));
		balance = balance*(1+interest);
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + "\t\t" + balance);
			double lastBalance = balance;
			balance = (initialAmount+yearlyDeposit)*Math.pow(interest+1, i);
			System.out.println("\t\t\t" + (balance - lastBalance) + "\t\t" + yearlyDeposit + "\t\t\t" + balance);
		}
	}
}
