package D1;

public class ternary_larg 
{
	public static void main(String[] args) 
	{
		int a=19;
		int b=14;
		int c=3;
		int n = ((a>b) && (a>c)) ? a: ((b>a) && (b>c) ? b : c);
		System.out.println(n);
		
	}

}
