package D3;

public class Adress 
{
	String city;
	String country;
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", country=" + country + "]";
	}
	
	

}