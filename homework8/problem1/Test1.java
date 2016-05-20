package problem1;

public class Test1 
{
	public static void main(String args[])
	{
		TestThread1[] runners=new TestThread1[2];
		for(int i=0;i<2;++i)
			runners[i]=new TestThread1(i);
		runners[0].setPriority(7);
		runners[1].setPriority(1);
		for(int i=0;i<2;++i)
		{
			runners[i].start();
		}
	}
}
