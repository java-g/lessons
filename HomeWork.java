/**
	Java. Level 1. Lesson 1. HomeWork
	
	@author Artem Valeev
	@version Aug 11, 2018
*/
public class HomeWork
{
	public static void main(String[] args)
	{
		byte a = 127; //example byte
		short b = 32767; //example short
		int c = 2147483647; //example int
		long d = 9223372036854775807L; //example long
		float e = 3.14159265359f; //example float
		double f = 2.71828182846; //example double
		boolean g = true; //example boolean
		char h = 65; //example char "A"
		
		System.out.println(calculateExp(2, 8, 16, 2));
		System.out.println(inRange(8, 1));
		identifyDigit(0);
		System.out.println(isNegative(-8));
		printHello("Артем");
		isLeapYear(2100);
	}
	
	static int calculateExp(int a, int b, int c, int d)
	{
		return a * (b + (c / d));
	}
	
	static boolean inRange(int a, int b)
	{
		if ((a + b) >= 10 && (a + b) <= 20)	
			return true;
		else
			return false;
	}
	
	static void identifyDigit(int a)
	{
		String t;
		if (a >= 0)	
			t = " положительное";	
		else
			t = " отрицательное";
		System.out.println("Число " + a + t);
	}
	
	static boolean isNegative(int a)
	{
		if (a < 0) 
			return true;
		else
			return false;
	}
	
	static void printHello(String a)
	{
		System.out.println("Привет, " + a + "!");
	}
	
	static void isLeapYear(int a)
	{
		String t = "не";
		if (a % 4 == 0 && a % 400 == 0)	t = "";
		System.out.println(a + " год "+ t +" является високосным");
	}

}