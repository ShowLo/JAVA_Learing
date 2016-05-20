package problem1;

public class Test 
{
	public static void main(String[] args)
	{
		TestThread thread=new TestThread();
		Thread runnable=new Thread(new TestRunnable());
		
		runnable.setPriority(8);
		
		thread.start();
		runnable.start();
	}
}
