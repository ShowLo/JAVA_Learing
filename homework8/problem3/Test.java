package problem3;

public class Test 
{
	public static void main(String[] args)
	{
		Data d=new Data(20);
		Thread t1=new Thread(new Producer(d));
		Thread t2=new Thread(new Consumer(d,10),"1");
		Thread t3=new Thread(new Consumer(d,10),"2");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
