package Problem2;

public class Test 
{
	
	public static void main(String[] args) 
	{
		Manager m =new Manager();
		
		Department D1 = new Department("IT",new Employee[2]);
		//D1.setEmpl(new Employee[2]);
		//D1.setName("IT");
		D1.getEmpl()[0]= new Employee("Ram",31,"Male",1200000,new Address("Delhi","Delhi","India"),2013);
		D1.getEmpl()[1]= new Employee("Mark",25,"Male",800000,new Address("Tokyo","Tokyo","Japan"),2015);
		
		Department D2 = new Department("Security",new Employee[2]);
//		D2.setEmpl(new Employee[2]);
//		D2.setName("Security");
		D2.getEmpl()[0]= new Employee("Mike",28,"Male", 700000,new Address("Pune","Maharashtra","India"), 2017);
		D2.getEmpl()[1]= new Employee("Miley",31,"Female",1300000,new Address("Bangalore","Karnataka", "India"), 2014);
		
		Department D3 = new Department("HR",new Employee[2]);
		//D3.setEmpl(new Employee[2]);
		//D3.setName("HR");
		D3.getEmpl()[0]= new Employee("Carl",27,"Male", 1100000,new Address("Kanpur","UP","India"), 2018);
		D3.getEmpl()[1]= new Employee("Eva",35,"Female", 900000,new Address("Bangalore","Karnataka","India"), 2011);
		
		m.bonus(D1);
		m.bonus(D2);
		m.bonus(D3);
	}

}
