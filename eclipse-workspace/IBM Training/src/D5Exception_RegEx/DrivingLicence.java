package D5Exception_RegEx;

public class DrivingLicence 
{
	public static void main(String[] args) 
	{
		int age=15;
		try
		{
			if(age<18)
			{
				throw new Exception("Age is under 18");
			}
			else 
			{
				System.out.println("Valid");
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
