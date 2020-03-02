package D1;

public class leaf_year 
{
	public static void main(String[] args) 
	{
		int n=2004;
		
		if(n%4 == 0)
		{
			if(n%100 == 0)
			{
				if(n%400 == 0)
				{
					System.out.println("Leaf Year");
				}
				else
				{
					System.out.println("Not a Leaf Year");
				}
			}
			else
			{
				System.out.println("Leaf Year");
			}
		}
		else
		{
			System.out.println("Not a Leaf Year");
		}
	}

}
