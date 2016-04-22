package myaccount.model;

import java.io.*;
import java.util.Date;

public class TestNormalDeal 
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
		Date dealDate=new Date();
		String amount="333333";
		String description="VIP";
		NormalDeal nd=new NormalDeal(dealDate,amount,description);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/JAVA/File/Normal.dat"));
		oos.writeObject(nd);
		oos.close();
		nd=null;
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/JAVA/File/Normal.dat"));
		nd=(NormalDeal)ois.readObject();
		ois.close();
		System.out.println(nd.toPlainText());
	}
}
