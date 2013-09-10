// Signe Colding-Jørgensen
// s031854
// 02101 Indledende programmering
// Opgave 1.5
// Opgave 1.6

package uge1;

public class Opgave1_6 {
		public static void main(String[] args)
		{
			stars20();
			stars20();
			stars20();
			stars20();
			stars20();
		}
		public static void stars()
		{
			System.out.println("**********");
		}
		public static void stars2()
		{
			stars();
			stars();
		}
		public static void stars3()
		{
			stars2();
			stars();
		}
		public static void stars5()
		{
			stars2();
			stars3();
		}
		public static void stars10()
		{
			stars5();
			stars5();
		}
		public static void stars20()
		{
			stars10();
			stars10();
		}

}
