package myaccount.model;

import java.util.Date;

public abstract class Deal implements Comparable<Deal> 
{
	protected Date dealDate;
	protected String dealType;
	protected Person person;
	protected String accountName;
	protected String amount;
	protected String category;
	protected String description;
	
	public Deal()
	{
		dealDate=new Date();
		dealType="";
		person=null;
		accountName="";
		amount="";
		category="";
		description="";
	}
	public Deal(Date dealDate,String amount,String description)
	{
		this.dealDate=dealDate;
		dealType="";
		person=null;
		accountName="";
		this.amount=amount;
		category="";
		this.description=description;
	}
	public abstract Deal parseString(String dealString);
	public abstract String toPlainText();
	public String getAccountName()
	{
		return accountName;
	}
	public void setAccountName(String accountName)
	{
		this.accountName=accountName;
	}
	public String getAmount()
	{
		return amount;
	}
	public void setAmount(String amount)
	{
		this.amount=amount;
	}
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public Date getDealDate()
	{
		return dealDate;
	}
	public void setDealDate(Date dealDate)
	{
		this.dealDate=dealDate;
	}
	public String getDealType()
	{
		return dealType;
	}
	public void setDealType(String dealType)
	{
		this.dealType=dealType;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person person)
	{
		this.person=person;
	}
	//实现Comparable接口定义的compareTo方法
	public int compareTo(Deal deal)
	{
		return this.dealDate.compareTo(deal.dealDate);
	}
}
