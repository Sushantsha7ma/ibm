package Calculator;

public class Calculator 
{
	public int addition(int... a)
	{
		int sum=0;
		for(int n:a)
		{
			sum=sum+n;
		}
		return sum;
	}
	public int substraction(int... b)
	{
		int sub=0;
		for(int n:b)
		{
			sub=sub-n;
		}
		return sub;
	}
	public int multiplication(int... c)
	{
		int multi=1;
		for(int n:c)
		{
			multi=multi*n;
		}
		return multi;
	}
	public int division(int d, int e)
	{
		return d/e;
	}

}
