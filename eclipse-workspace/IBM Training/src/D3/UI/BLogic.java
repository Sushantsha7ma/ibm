package D3.UI;

public class BLogic extends UserInterface
{

	public void BLogic() 
	{		
		if(super.getPassword().length()>8 && super.getUserid().length()>0)
		{
			isAuthorisedUser();
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
	
}
