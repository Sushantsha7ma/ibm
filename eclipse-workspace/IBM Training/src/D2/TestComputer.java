package D2;

public class TestComputer 
{
	public static void main(String[] args) 
	{
		
		Computer c1 =new Computer(2);
		Computer c2 =new Computer("Linux",4);
		Computer c3 = new Computer(4,"Windows");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
