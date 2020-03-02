package Problem2;

public class Manager 
{
	public void bonus(Department D) 
	{
		for(int i=0;i<2;i++)
		{
			long bonus=0;
			if(D.empl[i].getAddress().getCountry().equals("India"))
			{
				if(D.getName().equals("IT"))
				{
					bonus = bonus+D.empl[i].getSalary()*2/100;
					
				}
				if(D.getName().equals("Security"))
				{
					bonus = bonus+D.empl[i].getSalary()*2/100;
				}
				if(D.empl[i].getGender().equals("Male") && (2020-D.empl[i].getDateOfJoin()>5))
				{
					bonus=bonus+D.empl[i].getSalary()*10/100;
				}
				else if(D.empl[i].getGender().equals("Female") && (2020-D.empl[i].getDateOfJoin()>5))
				{
					bonus=bonus+D.empl[i].getSalary()*12/100;
				}
				else
				{
					bonus=bonus+D.empl[i].getSalary()*12/100;
				}
				System.out.println(D.empl[i].getName()+" bonus is "+bonus);
			}
			else
			{
				System.out.println("No bonus will be distributed");
			}
			
		}
}
}
