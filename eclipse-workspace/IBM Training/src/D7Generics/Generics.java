package D7Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics 
{

	static void show(List list)
	{
		list.add("XYZ");
		list.add(new Float(90.2));
		list.add(new Integer(10));
		System.out.println("List of value "+list);
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(55);
		list.add(100);
		//list.add("dsd");
		show(list);
	}
	
}
