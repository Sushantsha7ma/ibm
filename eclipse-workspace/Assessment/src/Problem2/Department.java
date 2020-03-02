package Problem2;

import java.util.Arrays;

public class Department 
{
	String name;
	Employee empl[];
	
	
	public Department(String name, Employee[] empl) 
	{
		this.name = name;
		this.empl = empl;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee[] getEmpl() {
		return empl;
	}
	public void setEmpl(Employee[] empl) {
		this.empl = empl;
	}
	@Override
	public String toString() {
		return "Department name=" + name + ", empl=" + Arrays.toString(empl) + "]";
	}
}
