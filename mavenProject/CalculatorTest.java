package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@DisplayName("Testing Calculator Class")
class CalculatorTest {
	Calculator cal;
	
	@BeforeAll
	static void beforeAllinit()
	{
		System.out.println("Before All: This will execute before all test cases.");
	}
	
	
	@AfterAll
	static void afterAllinit()
	{
		System.out.println("After All: This will execute after all test cases.");
	}
	
	// before each is used which is executed before every method
	@BeforeEach
	void init()
	{
		cal = new Calculator();
	}
	
	// after each - this method runs after every method
	@AfterEach
	void cleanUp() 
	{
		cal = null;
		System.out.println("Clean Up..");
	}
	

	@Test
	@DisplayName("Testing Addition Method")
	@EnabledOnOs(value= {OS.LINUX,OS.WINDOWS})
	void testAddition()
	{
		//Calculator cal = new Calculator();
		boolean f=true;
		assumeTrue(f);
		 //we are assuming f has to be true, then test will run else abort
		assertEquals(10, cal.addition(5, 5),
				"This test method is to test additon of two int values");
	}
	
	@Test
	@DisplayName("Testing Multiplication Method")
	void testMul()
	{
		//Calculator cal = new Calculator();
		//assertEquals(10, cal.multiplication(5, 2),
				//"This test method is to test multiplication of two int values");
	assertAll(
			()->assertEquals(4,cal.multiplication(2,2)),
			()->assertEquals(0,cal.multiplication(2,0)),
			()->assertEquals(1,cal.multiplication(2,-1))
			
			);
	}
	
	
	@Test
	@DisplayName("Testing Substraction Method")
	void testSubstraction()
	{
		//Calculator cal = new Calculator();
		assertEquals(2, cal.substraction(8, 10),
				"This test method is to test substraction of two int values");
	}
	
	@Test
	@DisplayName("Testing Division Method")
	void testDivision()
	{
		//Calculator cal = new Calculator();
		assertEquals(5, cal.division(25, 5),
				"This test method is to test division of two int values");
	}
	
	@Test
	@DisplayName("Testing Factorial Method")
	@DisabledOnOs(value= {OS.MAC})
	@EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_17)
	@DisabledOnJre(value= {JRE.JAVA_18})
	void testFactorial()
	{
		//Calculator cal = new Calculator();
		System.setProperty("Job", "Dev");
		//assumeTrue("Dev".equals(System.getProperty("Job")));
		assumeFalse("eng".equals(System.getProperty("Job")));
		// since we have assumed it to be false the test will abort
		assertEquals(120, cal.factorial(5),
				"This test method is to test factorial of int value");
	}
	@Nested
	@DisplayName("This the class for Testing Addition")
	class Addition{
	@Test
	@DisplayName("Add two Negetive Number")
	void testtwoNegetiveNum()
	{
		assertEquals(10,cal.twoNegetiveNum(-50, -100));
	}
	@Test
	@DisplayName("Add two Positive Number")
	void testtwoPositiveNum()
	{
		assertEquals(150,cal.twoPositiveNumber(50, 100));
	}
	@Test
	@DisplayName("Testing with Exception")
	@EnabledOnJre(value= {JRE.JAVA_8,JRE.JAVA_17})
	void testAdditionWithException()
	{
		assertThrows(ArithmeticException.class, 
				()-> cal.additionWithException(10, 0));
	}
	}//end of nested class
	@Test
	@DisplayName("Disable method")
	@Disabled
	void testDisabled()
	{
		fail("This test should be disabled.");
	}

}