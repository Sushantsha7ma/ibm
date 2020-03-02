package D2;

class Employe
{ 
	private String Name;
	private int YearOfJoining;
	private int salary;
	private String Address;
	private EmpDept dName;
	private int bonus;

	public Employe()
	{
		
	}
	public Employe(String Name, int YearOfJoining, int salary,EmpDept dName) 
	{
		this(Name,YearOfJoining,salary,"NULL",dName);	
	}
	
	public Employe(String Name,	int YearOfJoining,	int salary,	String Address,EmpDept dName)
	{
		this.Name=Name;
		this.YearOfJoining=YearOfJoining;
		this.salary=salary;
		this.Address=Address;
		this.dName=dName;
		
		//System.out.println(Name+"\t"  +YearOfJoining+"\t"+salary+"\t"+Address);
	}
	
	public void empBonus()
	{
		
		if(this.Name.equals("IT"))
		{
			this.bonus=this.salary*(5/100);
		}
		else
		{
			System.out.println("dfgfdg");
		}
	}
	
	@Override
	public String toString() 
	{
		return (Name+"\t"  +YearOfJoining+"\t"+salary+"\t"+Address+"\t"+bonus);
	}
}


class EmpDept
{
	String dName;
	
	public EmpDept(String dName)
	{
		this.dName = dName;
	}
}


public class Emp 
{
	
	public static char[] classE1;

	public static void main(String[] args) 
	{
		System.out.println("Name\t YearOfJoing\tSalary\tAddress\tBonus");
		System.out.println("----------------------------------------");
		
		Employe E1 = new Employe("Mahendra", 2020, 100, "India",new EmpDept("IT"));
		Employe E2 = new Employe("Ramananda", 2016, 15000, "USA",new EmpDept("IT"));
		Employe E3 = new Employe("Abcdaedf", 2010, 32000,new EmpDept("HR"));
		
		E1.empBonus();
		System.out.println(E1);
		
		
		
		
	}
}
