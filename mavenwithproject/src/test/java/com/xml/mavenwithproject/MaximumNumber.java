package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MaximumNumber {
	public static int CheckMax(int arr[])
	{
	int max=4;
	for(int i=1;i<arr.length;i++) {
		if(max<arr[i])
			max=arr[i];
	}
	return max;
	}
	@Test
	 public void testMax() {
		assertEquals(2,MaximumNumber.CheckMax(new int[] {1,2,3,4}));
	}
	
}
