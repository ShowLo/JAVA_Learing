package problem1;

public class TestThread1 extends Thread
{
	private int tick=1;
	private int num;
	public TestThread1(int i)
	{
		this.num=i;
	}
	public void run()
	{
		while(tick<400000)
		{
			tick++;
			if((tick%50000)==0)
			{
				System.out.println(("Thread#"+num+",tick="+tick));
				//yield();
			}
		}
	}
}
