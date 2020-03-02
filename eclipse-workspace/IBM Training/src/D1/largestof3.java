package D1;

public class largestof3 
{
	public static void main(String[] args) 
	{
		int a=19;
		int b=14;
		int c=3;
		
		if((a>b) && (a>c))
		{
			System.out.println("Largest "+ a);
		}
		else if((b>a) && (b>c))
		{
			System.out.println("Largest "+ b);
		}
		else
		{
			System.out.println("Largest "+ c);
		}
		
	}

}
