package JunitTest;

import org.junit.Test;

import Junit.Greeting;
import org.junit.*;

public class Testi 
{
	@Test
	public void testGreet()
	{
		Greeting g = new Greeting();
		String s = "Mahendra";
		String result = g.name(s);
		System.out.println(result);
		Assert.assertEquals("Welcome Mahendra",result);
	}
	@Test
	public void testBlock() 
	{
		Greeting g2 =new Greeting();
		String a = " mahendra";
		String r = g2.name(a);
		System.out.println(r.substring(0, 1).toUpperCase() + r.substring(1));
	}
}
