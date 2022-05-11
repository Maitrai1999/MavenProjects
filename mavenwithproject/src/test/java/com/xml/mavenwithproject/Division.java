package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Division {
	 public static int Checkcal(int a,int b)
	    {
	    	int div=a/b;
	    	return div;
	    }
	    
	    @Test
	    public void testdiv() {
	    	
	    	assertEquals(4,Division.Checkcal(8,2),0);
	    }
	    
}
