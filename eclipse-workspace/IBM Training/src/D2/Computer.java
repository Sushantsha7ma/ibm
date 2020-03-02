package D2;

public class Computer 
{
	private int ram;
	private String os;
	private int cpu;

	public Computer()
	{
		
	}
	
	public Computer(String os, int cpu) 
	{
		this(2,os,cpu);
	}

	
	public Computer(int cpu) 
	{
		this("Dos",cpu);
	}
	
	
	public Computer(int ram, String os) 
	{
		this(ram,os,4);
	}
	
	
	public Computer(int ram, String os, int cpu) 
	{
		this.ram = ram;
		this.os = os;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computer : ram=" + ram + ", os=" + os + ", cpu=" + cpu ;
	}
	
	
	
}
