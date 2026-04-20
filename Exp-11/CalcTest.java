package calculatorexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testAdd() 
	{
		Calc calc = new Calc();
		assertEquals(6, calc.add(3, 3));	
	}
	
	@Test
	void testSubtract()
	{
		Calc calc = new Calc();
		assertEquals(4, calc.subtract(7, 3));
	}
	
	@Test
	void testMultiply()
	{
		Calc calc = new Calc();
		assertEquals(8, calc.multiply(4,2));
	}
	
	@Test
	void testDivide()
	{
		Calc calc = new Calc();
		assertEquals(5, calc.divide(10,2));
	}
}
