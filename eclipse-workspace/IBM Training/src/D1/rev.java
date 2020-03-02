package D1;

public class rev 
{
	public static void main(String[] args) 
	{
		int a=3456;
		int r=0;
		int s=0;
		while(a>0)
		{
			r=a%10;
			s=(s+r)*10;
			a=a/10;	
		}
		System.out.println(s/10);
		
	}

}
