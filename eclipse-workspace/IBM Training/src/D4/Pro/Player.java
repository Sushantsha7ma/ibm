package D4.Pro;

public interface Player 
{
	int minPow = 0;
	int maxPow = 100;
	int eat(int e);
	int getHit(int h);
	int damage(int d);
	void run();
}
