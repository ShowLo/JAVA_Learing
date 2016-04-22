package myaccount.model;

import java.util.List;
import java.util.Date;

public abstract class Account 
{
	protected String name;
	protected String type;
	protected String accountNumber;
	protected String description;
	protected Person belongto;
	protected String currency;
	protected List dealList;
	
	public abstract String getReport(Date start,Date end,int reportType);
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public Person getBelongto()
	{
		return belongto;
	}
	public void setBelongto(Person belongto)
	{
		this.belongto=belongto;
	}
	public String getCurrency()
	{
		return currency;
	}
	public void setCurrency(String currency)
	{
		this.currency=currency;
	}
	public List getDealList()
	{
		return dealList;
	}
	public void setDealList(List dealList)
	{
		this.dealList=dealList;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
}
