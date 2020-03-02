package D6Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Friends 
{
	private ArrayList<String> partyList = new ArrayList<String>(3);
	
	public void add(String name)
	{
		partyList.add(name);
	}
	
	public void remove(String name)
	{
		partyList.remove(name);
	}
	
	public void sort()
	{
		Collections.sort(partyList);
	}
	
	public void showPartyList()
	{
		System.out.println(partyList);
	}
	
	public boolean search(String name)
	{
		if(partyList.contains(name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
