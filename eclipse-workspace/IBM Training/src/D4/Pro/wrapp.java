package D4.Pro;


public class wrapp 
{
	public void name(Integer a, Double b)
	{
		System.err.println("1:"+(a+b));
	}
	public void name(double c,int d) 
	{
		System.err.println("2:"+(c+d));
	}
	public static void main(String[] args) 
	{
		wrapp w =new wrapp();
		w.name(20,20);
		
	}
}
