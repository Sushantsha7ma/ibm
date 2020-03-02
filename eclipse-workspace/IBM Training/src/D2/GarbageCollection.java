package D2;

public class GarbageCollection 
{
	public static void main(String[] args)
	{
		String s=new String("Hel");
		
		for(int i=1;i<10000000;i++)
		{
			s=s+i;			
		}
	}
}
