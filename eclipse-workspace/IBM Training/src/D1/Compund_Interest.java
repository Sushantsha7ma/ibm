package D1;

public class Compund_Interest 
{
	public static void main(String[] args) 
	{
		int p=10000;
		int t=2;
		double r=1;
		int n=2;
		double ci = (p*(Math.pow((double)(1+(r/n)),(double)(n*t))));
		System.out.println(ci);
		
	}

}
