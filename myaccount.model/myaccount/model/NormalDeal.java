package myaccount.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import java.text.DecimalFormat;

public class NormalDeal extends Deal implements Serializable,Externalizable
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
	//实现Externalizable接口的writeExternal()方法
	public void writeExternal(ObjectOutput out)throws IOException
	{
		out.writeObject(dealDate);
		out.writeObject(amount);
		out.writeObject(description);
	}
	//实现Externalizable接口的readExternal()方法
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
	{
		dealDate=(Date)in.readObject();
		amount=(String)in.readObject();
		description=(String)in.readObject();
	}
}
