package com.xml.mavenwithproject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringTest {
    public static boolean checkString(String s)
    {
    	String str="Maitrai";
    	if(str.contains(s))
    	{
    		return true;
    	}
    	return false;
    }
    
    @Test
    public void testCheckStr() {
    	
    	assertEquals(true,checkString("Maitrai"));
    }
    
}
