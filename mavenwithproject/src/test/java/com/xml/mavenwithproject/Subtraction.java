package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Subtraction {
	 public static int Checkcal(int a,int b)
	    {
	    	int sub=a-b;
	    	return sub;
	    }
	    
	    @Test
	    public void testsub() {
	    	
	    	assertEquals(4,Subtraction.Checkcal(6,2),0);
	    }
	    
}
