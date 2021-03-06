package TestCalculator;

import org.junit.*;

import Calculator.Calculator;

public class Testing 
{
	@Test
	public void test1() 
	{
		Calculator c = new Calculator();
		c.division(5,1);
		Assert.assertTrue(true);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test2()throws ArithmeticException
	{
		Calculator c = new Calculator();
		c.division(5,0);
	}
	@Test
	public void test3() 
	{
		Calculator c = new Calculator();
		c.multiplication(5,1);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4()
	{
		Calculator c = new Calculator();
		c.multiplication(5,0);
	}
	@Test
	public void test5() 
	{
		Calculator c = new Calculator();
		c.substraction(5,1);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test6()
	{
		Calculator c = new Calculator();
		c.addition(5,0);
	}
}
