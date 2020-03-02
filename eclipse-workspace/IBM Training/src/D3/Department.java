package D3;

import java.util.Arrays;

public class Department 
{
	String deptname;
	Employee empl[];
	
	public String getDeptname() 
	{
		return deptname;
	}
	
	public void setDeptname(String deptname)
	{
		this.deptname = deptname;
	}
	
	public Employee[] getEmpl() 
	{
		return empl;
	}
	
	public void setEmpl(Employee[] empl) 
	{
		this.empl = empl;
	}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", Empl=" + Arrays.toString(empl) + "]";
	}

	
	
	
}
