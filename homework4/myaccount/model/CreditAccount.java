package myaccount.model;

import java.util.Date;

public class CreditAccount extends Account
{
	private int loanLimit=0;
	
	public int getLoanLimit()
	{
		return loanLimit;
	}
	public void setLoanLimit(int loanLimit)
	{
		this.loanLimit=loanLimit;
	}
	public String getReport(Date start,Date end,int reportType)
	{
		return null;
	}
}
