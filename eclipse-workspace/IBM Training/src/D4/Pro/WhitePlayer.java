package D4.Pro;

public class WhitePlayer implements Player
{
	int power= 100;
	
	@Override
	public int eat(int e) 
	{
		if(getPower()<=maxPow)
		{
			setPower(getPower()+e);
			if(getPower()<maxPow)
			{
				setPower(maxPow);
			}
		}
		else
		{
			System.out.println("Power is Full");
		}
		System.out.println("White Player Power " + getPower());
		
		return 0;
	}

	@Override
	public int getHit(int h)
	{
		setPower(getPower()-h);
		if(getPower()<=minPow)
		{
			System.out.println("Game Over");
		}
		System.out.println("White Player Power " + getPower());
		return 0;
	}

	@Override
	public int damage(int d) 
	{
		return (new BlackPower().getHit(d));
	}

	@Override
	public void run()
	{
		System.out.println("white player power "+getPower());
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}


}
