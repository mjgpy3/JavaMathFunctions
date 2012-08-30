package com.michael.math;

public class MainContainer 
{

	public static void main(String args[]) 
	{
		Integer[] arrayOfSequentialNumbers = {1,2,3,4,5,6,7,8,9,10,11};
		
		System.out.println(MichaelMath.pow(3, 3));
		System.out.println(MichaelMath.recPow(5, 3));
		System.out.println(MichaelMath.recNthFib(3));
		System.out.println(MichaelMath.recFactorial(4));
		
		System.out.println(MichaelMath.findModeOfArray(new String[] {"Michael", "Abbey", "Michael", "Five", "Abbey", "Michael", "Abbey", "Seven", "Abbey", "Car"}));
		System.out.println(MichaelMath.findModeOfArray(new Object[] {(int) 5, "Money", "Car", 5, "Money", "Money"}));
		System.out.println(MichaelMath.isPrime(2) + ": 2");
		System.out.println(MichaelMath.isPrime(3) + ": 3");
		System.out.println(MichaelMath.isPrime(4) + ": 4");
		System.out.println(MichaelMath.isPrime(234) + ": 234");
		System.out.println(MichaelMath.isPrime(243) + ": 243");
		System.out.println(MichaelMath.isPrime(97) + ": 97");
		System.out.println(MichaelMath.abs(95) + " = |95|");
		System.out.println(MichaelMath.abs(0) + " = |0|");
		System.out.println(MichaelMath.abs(-95) + " = |-95|");
		
		int[] numbers = { 1, 2, 3, 4, 5, 34, 23, 34, 43, 23, 43213, 123 };

		for (int b : numbers) 
		{
			if (b > 10)
				System.out.println(b);
		}
		
		for (Object o : MichaelMath.cloneShuffle(arrayOfSequentialNumbers))
		    System.out.print(o + ", ");
		System.out.println();
	}

}
