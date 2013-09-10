// Signe Colding-Jørgensen
// s031854
// 02101 Indledende programmering
// Opgave 1.7

package uge1;

public class Opgave1_7 {
	public static void main(String[] args)
	{
		beskedFar();
		beskedSteffen();
		beskedArya();
	}
	public static void hilsen()
	{
		System.out.println("Hilsen Signe");
	}
	public static void beskedFar()
	{
		System.out.println("Vil du købe en cola?");
		hilsen();
		System.out.println();
	}
	public static void beskedSteffen()
	{
		System.out.println("Jeg kommer sent hjem");
		hilsen();
		System.out.println();
	}
	public static void beskedArya()
	{
		System.out.println("Nej det er MIN iPad!");
		hilsen();
		System.out.println();
	}
}
