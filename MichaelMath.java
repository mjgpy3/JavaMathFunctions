package com.michael.math;

import java.util.HashMap;

public class MichaelMath 
{
	public int Pow(int base, int exponent)
	{
		int returnValue = 1;
		for (int i = 0; i < exponent; i++)
			returnValue *= base;
		return returnValue;
	}
	
	public int RecPow(int base, int exponent)
	{
		if (exponent == 1)
			return base;
		else
			return base * RecPow(base, exponent - 1);
	}
	
	public int RecNthFib(int n)
	{
		if (n <= 1)
			return 1;
		else
			return RecNthFib(n - 2) + RecNthFib(n - 1);
	}
	
	public int RecFactorial(int x)
	{
		if (x <= 1)
			return 1;
		else
			return x * RecFactorial(x - 1);
	}
	
	public Object FindModeOfArray(Object[] values)
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
}
