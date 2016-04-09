package myaccount.model;

import java.util.Random;
import java.util.Arrays;
import java.util.Date;

public class TestDeal 
{
	public static void main(String[] args)
	{
		Random randomType=new Random();
		Random randomDate=new Random();
		Random randomAmount=new Random();
		
		Deal[] arrayDeal=new Deal[10];
		for(int i=0;i<10;++i)
		{
			switch(randomType.nextInt(3))                //�����������
			{
			case 0:arrayDeal[i]=new NormalDeal();break;
			case 1:arrayDeal[i]=new StockDeal();break;
			case 2:arrayDeal[i]=new TransferDeal();break;
			}
			Date today=new Date();
			long timescaleLimit=12L*30*24*60*60*1000;    //ʱ����Ϊһ��
			Date dealDate=new Date(today.getTime()-(long)(randomDate.nextDouble()*timescaleLimit));
			arrayDeal[i].setDealDate(dealDate);          //�����������
			
			double amount=randomAmount.nextDouble()*3333;//�����������
		    arrayDeal[i].setAmount(Double.toString(amount));
		}
		System.out.println("������ӡ�������飺");
		for(int i=0;i<10;++i)
		{
			System.out.println(arrayDeal[i].toPlainText());
		}
		System.out.println("ʹ���������򷽰�����������:");
		Arrays.sort(arrayDeal);
		for(int i=0;i<10;++i)
		{
			System.out.println(arrayDeal[i].toPlainText());
		}
		System.out.println("ʹ�ð�������򷽰�����������:");
		Arrays.sort(arrayDeal,new DealAmountComparator());
		for(int i=0;i<10;++i)
		{
			System.out.println(arrayDeal[i].toPlainText());
		}
	}
}