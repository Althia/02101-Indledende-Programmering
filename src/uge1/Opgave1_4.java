// Signe Colding-Jørgensen
// s031854
// 02101 Indledende programmering
// Opgave 1.4

package uge1;

public class Opgave1_4 {
	public static void main (String[] args)
	{
		slashes();
		for(int i = 0; i < 5; i++)
		{
		victoryLine();
		}
		
		
	}
	public static void victoryLine()
	{
		System.out.println();
		lines();
		System.out.print(" Victory is mine! ");
		lines();
		System.out.println();
		backslashes();
	}
	public static void slashes ()
	{
		for(int i = 0; i < 22; i++)
		{
		System.out.print("/");
		}
	}
	public static void lines ()
	{
		System.out.print("||");
	}
	public static void backslashes ()
	{
		for(int i = 0; i < 22; i++)
		{
		System.out.print("\\");
		}
	}
}

