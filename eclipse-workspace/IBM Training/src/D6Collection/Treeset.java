package D6Collection;

import java.util.*;

public class Treeset 
{
	public static void main(String[] args) 
	{
		Set set = new TreeSet(new NameCompare());
		
		set.add(new Student("Mahendra",21));
		set.add(new Student("Naik",20));
		set.add(new Student("Abc",23));
		set.add(new Student("Mark",22));
		
		System.out.println(set);
		
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(55);
		System.out.println(a);
		
	}

}
