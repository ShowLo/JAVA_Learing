package problem3;

public class Producer extends Thread
{
	Data d=null;
	
	public Producer(Data d)
	{
		this.d=d;
	}
	
	public void run()
	{
		/*while(d.order<=d.size) 
		用于指定完成生产任务后停止进程*/
		while(d.number<d.size)                           //用于消费完成后终止进程
		{
			synchronized(d)                              //申请对象d的锁旗标
			{
				if(d.totalConsumeNum<d.size)             //用于消费完成后终止进程
				{
					++d.number;                          //生产之后增加实际数据量
					d.arrayList.add(" data"+(d.order++));//加入容器之中
					System.out.println("Producer puts "+d.arrayList.get(d.number-1));
				}
			}                                            //释放对象d的锁旗标
		}
	}

}