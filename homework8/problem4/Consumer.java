package problem4;

public class Consumer extends Thread
{
	Data d=null;
	int i=0;
	int consumeNum;
	
	public Consumer(Data d,int consumeNum)
	{
		this.d=d;
		this.consumeNum=consumeNum;
	}
	
	public void run()
	{
		while(i<this.consumeNum)
		{
			synchronized(d)                //申请对象d的锁旗标
			{
				/*if(d.arrayList.size()!=0&&d.order<d.size)
				  用于指定完成生产任务后终止进程                    */
				if(d.arrayList.size()!=0)  //用于消费完成后终止进程
				{
					System.out.println("Consumer"+Thread.currentThread().getName()+" consumes "+d.arrayList.getCargo(0));
					d.arrayList.removeCargo(0); //消费之后删除数据
					--d.number;
					++i;
					++d.totalConsumeNum;
				}
			}                              //释放对象d的锁旗标
		}     
	}
}
