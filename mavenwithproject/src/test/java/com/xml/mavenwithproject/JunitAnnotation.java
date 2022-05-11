package com.xml.mavenwithproject;

import org.junit.*;

public class JunitAnnotation {
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	@Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runbeforeTestMethod");
    }
	@BeforeClass
    public static void runOnceBeforeclass() {
        System.out.println("@BeforeClass - runoncebeforeclass");
    }
	@AfterClass
    public static void runOnceAfterclass() {
        System.out.println("@AfterClass - runonceafterclass");
    }
    @Ignore
    public void Ignore() {
    	System.out.println("@Ignore-Ignoring statement");
    }
		
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
            }
    @Test(timeout=200)
    public void TestTimeOut() {
    	System.out.println("@Test(timeout=200)-set the time");
    }
    
    
    
    
    
    
    

}
