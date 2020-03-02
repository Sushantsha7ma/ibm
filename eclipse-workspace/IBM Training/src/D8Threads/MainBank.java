package D8Threads;

class Bank implements Runnable
{
	static int count;

	@Override
	public void run() 
	{
		for(int i=1;i<=100;i++)
		{
			count=count+1;
			//System.out.println(count);
		}
		
	}
}

public class MainBank
{
	public static void main(String[] args) throws InterruptedException 
	{
		Bank.count=0;
		Thread t1 = new Thread(new Bank());
		Thread t2 = new Thread(new Bank());
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Bank.count);
		
	}
}
