package D3.Name;

public class Parent extends GrandParent
{
	private String firstName;
	private String middleName;
	private String lastName;
	
	

	public Parent(String firstName) 
	{
		super(firstName,getFirstName(),"Naik");
		this.firstName = firstName;
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
