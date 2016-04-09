package myaccount.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class StockDeal extends Deal
{
	private boolean isBuy=true;
	private String stockNumber="";
	private String stockName="";
	
	public StockDeal()
	{
		super();
	}
	public StockDeal(Date dealDate,String amount,String description,boolean isBuy,String stockNumber,String stockName)
	{
		super(dealDate,amount,description);
		this.isBuy=isBuy;
		this.stockNumber=stockNumber;
		this.stockName=stockName;
	}
	public boolean isBuy()
	{
		return isBuy;
	}
	public void setBuy(boolean isBuy)
	{
		this.isBuy=isBuy;
	}
	public String getStockName()
	{
		return stockName;
	}
	public void setStockName(String stockName)
	{
		this.stockName=stockName;
	}
	public String getStockNumber()
	{
		return stockNumber;
	}
	public void setStockNumber(String stockNumber)
	{
		this.stockNumber=stockNumber;
	}
	public Deal parseString(String dealString)
	{
		return null;
	}
	public String toPlainText()
	{
		SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df=new DecimalFormat("0.000");
		return "<Stock>\t\t"+date.format(this.getDealDate())+"\t"+"￥"+df.format((Double.valueOf(this.getAmount())))+"\t"+this.getDescription();
	}
}
