package myaccount.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class TransferDeal extends Deal
{
	protected Account inputAccount;
	protected Account outputAccount;
	
	public TransferDeal()
	{
		super();
	}
	public TransferDeal(Date dealDate,String amount,String description)
	{
		super(dealDate,amount,description);
	}
	public Deal parseString(String dealString)
	{
		return null;
	}
	public String toPlainText()
	{
		SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df=new DecimalFormat("0.000");
		return "<Transfer>\t"+date.format(this.getDealDate())+"\t"+"￥"+df.format((Double.valueOf(this.getAmount())))+"\t"+this.getDescription();
	}
	public Account getInputAccount()
	{
		return inputAccount;
	}
	public void setInputAccount(Account inputAccount)
	{
		this.inputAccount=inputAccount;
	}
	public Account getOutputAccount()
	{
		return outputAccount;
	}
	public void setOutputAccount(Account outputAccount)
	{
		this.outputAccount=outputAccount;
	}
}
