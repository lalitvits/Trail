package com.tcs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 
	@Test
	public void aIsPositive()
	{
		int a=5;
		int b=-3;
		int expected=2;
		
		int result = AddNo.add(a, b);
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void BIsPositive()
	{
		int a=-5;
		int b=3;
		int expected=-2;
		
		int result = AddNo.add(a, b);
		
		assertEquals(expected, result);
		
		
	}
	
	@Test
	public void bothNegetive()
	{
		int a=-5;
		int b=-3;
		int expected=-8;
		
		int result = AddNo.add(a, b);
		
		assertEquals(expected, result);
		
		
		
		
	}
	
}
