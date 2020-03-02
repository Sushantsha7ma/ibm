package D4;

public abstract class SmartPhone extends BasicPhone
{
	@Override
	void videoCall() 
	{
		this.call();
		System.out.println("Video");
	}	
	
	abstract void recordVideoCall();
}
