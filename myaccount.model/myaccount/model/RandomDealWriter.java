package myaccount.model;

import java.util.Date;
import java.util.Random;
import java.io.*;

public class RandomDealWriter 
{
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		Random randomType=new Random();
		Random randomDate=new Random();
		Random randomAmount=new Random();
		
		Deal[] arrayDeal=new Deal[10];
		for(int i=0;i<10;++i)
		{
			switch(randomType.nextInt(3))                //随机生成种类
			{
			case 0:arrayDeal[i]=new NormalDeal();break;
			case 1:arrayDeal[i]=new StockDeal();break;
			case 2:arrayDeal[i]=new TransferDeal();break;
			}
			Date today=new Date();
			long timescaleLimit=12L*30*24*60*60*1000;    //时间间隔为一年
			Date dealDate=new Date(today.getTime()-(long)(randomDate.nextDouble()*timescaleLimit));
			arrayDeal[i].setDealDate(dealDate);          //随机生成日期
			
			double amount=randomAmount.nextDouble()*3333;//随机生成数额
		    arrayDeal[i].setAmount(Double.toString(amount));
		}
		
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Deal.dat")));
		for(int i=0;i<10;++i)
		{
			oos.writeObject(arrayDeal[i]);
		}
		oos.flush();
		oos.close();
	}
}
