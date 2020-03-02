package Problem2;


public class Employee 
{
	String name;
	int age;
	String gender;
	long salary;
	Address address;
	int dateOfJoin;
	

	
	public Employee(String name, int age, String gender, long salary, Address address, int dateOfJoin) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
		this.dateOfJoin = dateOfJoin;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(int dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + ", dateOfJoin=" + dateOfJoin ;
	}
	

}
