package problem1;

public class TestRunnable implements Runnable
{
	public void run()
	{
		for(int i=1;i<=1000;++i)
			{
				System.out.print(Thread.currentThread().getName()+"  "+i+"  ");
				if(i%10==0)
					System.out.println();
			}
	}
}
