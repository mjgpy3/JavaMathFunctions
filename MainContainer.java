package com.michael.math;

public class MainContainer 
{

	public static void main(String args[]) 
	{
		MichaelMath m = new MichaelMath();

		System.out.println(m.pow(3, 3));
		System.out.println(m.recPow(5, 3));
		System.out.println(m.recNthFib(3));
		System.out.println(m.recFactorial(4));
		
		System.out.println(m.findModeOfArray(new String[] {"Michael", "Abbey", "Michael", "Five", "Abbey", "Michael", "Abbey", "Seven", "Abbey", "Car"}));
		
		int[] numbers = { 1, 2, 3, 4, 5, 34, 23, 34, 43, 23, 43213, 123 };

		for (int b : numbers) 
		{
			if (b > 10)
				System.out.println(b);
		}
	}

}
