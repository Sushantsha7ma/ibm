package D1;

public class calcu 
{
	public static void main(String[] args) 
	{
		int a=35;
		int b=45;
		
		int c=1;
		
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
		
		switch(c)
		{

		case 1 : System.out.println(a+b);
		break;
		
		case 2 : System.out.println(a-b);
		break;
		
		case 3 : System.out.println(a*b);
		break;
		
		case 4 : System.out.println(a/b);
		break;
		
		default : System.out.println("Wrong Option");
		break;
		
		}
		
		
	}

}
