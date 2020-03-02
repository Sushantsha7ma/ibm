package D3.Name;

public class Child extends Parent
{
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Child()
	{
		this.firstName = firstName;
		this.middleName=super.getFirstName();
	}
	@Override
	public String toString() {
		return "Child [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
	
	
}
