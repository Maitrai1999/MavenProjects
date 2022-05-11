package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinNum {
		public static int CheckMin(int[] arr)
		{
		int min=1;
		for(int num:arr) {
			if(min>num)
				min=num;
		}
		return min;
		}
		@Test
		 public void testMin() {
			assertEquals(1,MinNum.CheckMin(new int [] {1,2,3,4}));
		}
}
