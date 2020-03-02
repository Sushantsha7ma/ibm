package D3.UI;

public class DataBase extends BLogic
{
	public void isAuthorisedUser()
	{
		if(getPassword().equals(getUserid()))
		{
			System.out.println("Wellcome");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
