package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Multiple {
	 public static int Checkcal(int a,int b)
	    {
	    	int mul=a*b;
	    	return mul;
	    }
	    
	    @Test
	    public void testmul() {
	    	
	    	assertEquals(4,Multiple.Checkcal(2,2),0);
	    }
	    
	}


