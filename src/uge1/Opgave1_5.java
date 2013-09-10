// Signe Colding-Jørgensen
// s031854
// 02101 Indledende programmering
// Opgave 1.5

package uge1;

public class Opgave1_5 {
	private static final int ROCKETS = 2;
	public static void main(String[] args)
	{
		top();
		box();
		dtuBox();
		box();
		top();
	}
	
	public static void top()
	{
		for(int i = 0; i < ROCKETS; i++){
			top1();
		}
		System.out.println();
		for(int i = 0; i < ROCKETS; i++){
			top2();
		}
		System.out.println();
		for(int i = 0; i < ROCKETS; i++){
			top3();
		}
		System.out.println();
	}
	public static void top1()
	{
		System.out.print("   /\\       ");
	}
	public static void top2()
	{
		System.out.print("  /  \\      ");
	}
	public static void top3()
	{
		System.out.print(" /    \\     ");
	}
	public static void box()
	{
		plusLines();
		spaceLines();
		spaceLines();
		plusLines();
	}
	public static void spaceLines()
	{
		for(int j = 0; j < ROCKETS; j++)
		{
			spaceLine();
		}	
		System.out.println();
	}
	public static void plusLines()
	{
		for(int i = 0; i < ROCKETS; i++)
		{
			plusLine();
		}
		System.out.println();
	}
	public static void plusLine()
	{
		System.out.print("+------+    ");
	}
	public static void spaceLine()
	{
		System.out.print("|      |    ");
	}
	public static void dtuLine()
	{
		System.out.print("| D T U|    ");
	}
	public static void lyngbyLine()
	{
		System.out.print("|Lyngby|    ");
	}
	public static void dtuLines()
	{
		for(int i = 0; i < ROCKETS; i++)
		{
			dtuLine();
		}
		System.out.println();
	}
	public static void lyngbyLines()
	{
		for(int i = 0; i < ROCKETS; i++)
		{
			lyngbyLine();
		}
		System.out.println();
	}
	public static void dtuBox()
	{
		dtuLines();
		lyngbyLines();
	}
}

