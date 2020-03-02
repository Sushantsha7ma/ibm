package D4;

public class AbcPhone extends SmartPhone
{

	@Override
	void recordVideoCall() 
	{
		this.videoCall();
		System.out.println("Record");
	}
}
