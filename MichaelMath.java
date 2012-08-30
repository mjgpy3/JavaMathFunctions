package com.michael.math;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class MichaelMath 
{
	/// Returns some integer base to the power of an integer exponent
	public static int pow(int base, int exponent)
	{
		int returnValue = 1;
		for (int i = 0; i < exponent; i++)
			returnValue *= base;
		return returnValue;
	}
	
	/// Returns some integer base to the power of an integer exponent, recursively
	public static int recPow(int base, int exponent)
	{
		if (exponent == 1)
			return base;
		else
			return base * recPow(base, exponent - 1);
	}
	
	/// Finds the Nth fibonacci number
	public static int recNthFib(int n)
	{
		if (n <= 1)
			return 1;
		else
			return recNthFib(n - 2) + recNthFib(n - 1);
	}
	
	/// Performs the factorial operation recursively
	public static int recFactorial(int x)
	{
		if (x <= 1)
			return 1;
		else
			return x * recFactorial(x - 1);
	}
	
	/// Finds the most occurring object from a passed array of objects.
	/// The array must have elements, and if there are multiple modes
	/// then the first one is returned. e.g. findModeOfArray([1,2,1,2])
	/// returns 1 since from the left to the right 1 is found as the mode
	/// first.
	public static Object findModeOfArray(Object[] values)
	{
		HashMap<Object, Integer> valueToOccur = new HashMap<Object, Integer>();
		Object currentMode = new Object();
		
		try
		{
			currentMode = values[0];
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IllegalArgumentException("Cannot find the mode of an empty array");
		}
		
		for (Object value : values)
		{
			if (!valueToOccur.containsKey(value))
				valueToOccur.put(value, 1);
			else
				valueToOccur.put(value, valueToOccur.get(value) + 1);
			
			if (valueToOccur.get(value) > valueToOccur.get(currentMode))
				currentMode = value;
		}
		return currentMode;
	}
	
	/// Returns true if the passed number is a prime, false otherwise.
	public static boolean isPrime(int number)
	{
		if (number <= 3)
			return true;
		if (number % 2 == 0)
			return false;
		for (int i = 3; i < Math.sqrt(number) + 1; i+=2)
			if (number % i == 0)
				return false;
		return true;
	}
	
	/// Returns the absolute value of a passed number.
	public static int abs(int number)
	{
		return (number < 0) ? number * -1 : number;
	}
	
	/// Returns a randomized version of the passed array.
	public static Object[] cloneShuffle(Object[] array)
	{
		Object[] sorted = new Object[array.length];
		Random generator = new Random();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		
		for (Object element : array)
			arrayList.add(element);

		for (int i = array.length - 1; i >= 0; i--)
			sorted[i] = arrayList.remove(generator.nextInt(arrayList.size()));
		
		return sorted;
	}
	
	public static double findRoot(double base, double nthRoot)
	{
		return _findRoot(base, nthRoot, base, 0.0);
	}
	
	private static double _findRoot(double base, double nthRoot, double top, double bottom)
	{
		double half = (top + bottom) / 2.0;
		
		if (Math.pow(half, nthRoot) == base || half == top || half == bottom)
			return half;
		else if (Math.pow(half, nthRoot) > base)
			return _findRoot(base, nthRoot, half, bottom);
		else
			return _findRoot(base, nthRoot, top, half);
	}
}
