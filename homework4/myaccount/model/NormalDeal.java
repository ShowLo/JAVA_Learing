package myaccount.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class NormalDeal extends Deal
{
	public NormalDeal()
	{
		super();
	}
	public NormalDeal(Date dealDate,String amount,String description)
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
		return "<Normal>\t"+date.format(this.getDealDate())+"\t"+"￥"+df.format((Double.valueOf(this.getAmount())))+"\t"+this.getDescription();
	}
}
