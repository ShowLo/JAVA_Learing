package myaccount.model;

import java.util.Comparator;

public class DealAmountComparator implements Comparator<Deal>
{
	//ʵ��Comparator�ӿڶ����compare����
	public int compare(Deal deal1,Deal deal2)
	{
		return -Double.valueOf(deal1.amount).compareTo(Double.valueOf(deal2.amount));
	}
}
