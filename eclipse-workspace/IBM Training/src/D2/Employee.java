package D2;

public class Employee 
{
	private String name;
	private int age;
	private long salary;

	protected void update()
	{
		String name="Mahendra";
		int age=22;
		long salary=100000;
			
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(this);
	}
	
	@Override
	public String toString() 
	{
		return "Name = " + name + ", Age = " + age + ", Salary = " + salary;
	}
	

}
