package D8Threads.D8DeadLock;

import java.util.ArrayList;
import java.util.List;

public class DeadLock 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		
		Thread t1 = new Thread(new Admin(list));
		Thread t2 = new Thread(new Customer(list));
		t1.start();
		t2.start();
		
	}

}
