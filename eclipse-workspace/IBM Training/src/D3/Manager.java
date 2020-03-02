package D3;

public class Manager 
{
	public static void main(String[] args) 
	{
		Department D1 = new Department();
		
		D1.setDeptname("IT");
		D1.setEmpl(new Employee[5]);
		D1.getEmpl()[0] = new Employee("Mahendra",22,new Adress("Chandigarh","INDIA"),200200);
		
		
		
	}
}
