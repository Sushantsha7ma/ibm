package D5Exception_RegEx;

public class PhoneNumber 
{
	public static void main(String[] args) 
	{
		String phoneNum [] = {"123-45-6789","9876-5-4321","987-65-4321"," 987-65-4321","192-93-7465","965-47-8524 "};
	
		for(int i=0;i<phoneNum.length;i++)
		{
			if(phoneNum[i].matches("^[1-9]{1}[0-9]{2}(-)[0-9]{2}(-)[0-9]{4}$"))
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("invalid");
			}
		}
	
		String s[] = {"asf@gmail.com","abc@gmail.in","sfvsvds@daff.f"};
		for(int i=0;i<s.length;i++)
		{
			if(s[i].matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"))
			{
				System.out.println("valid");
			}	
			else
			{
				System.out.println("invalid");
			}	
		}	
	}
}
