package com.xml.mavenwithproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	 public static int add(int a,int b)
	    {
	    	int add=a+b;
	    	return add;
	    }
	 public static int sub(int a,int b)
	    {
	    	int sub=a-b;
	    	return sub;
	    }
	 public static int mul(int a,int b)
	    {
	    	int mul=a*b;
	    	return mul;
	    }	 public static int div(int a,int b)
	    {
	    	int div=a/b;
	    	return div;
	    }
	    
	    @Test
	    public void testadd() {
	    	
	    	assertEquals(4,Addition.add(2,2),0);
	    }
	    @Test
	    public void testsub() {
	    	
	    	assertEquals(0,Addition.sub(2,2),0);
	    }
	    @Test
	    public void testmul() {
	    	
	    	assertEquals(4,Addition.mul(2,2),0);
	    }
	    @Test
	    public void testdiv() {
	    	
	    	assertEquals(4,Addition.div(8,2),0);
	    }
	    
}
