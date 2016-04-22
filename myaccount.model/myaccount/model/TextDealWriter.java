package myaccount.model;

import java.io.*;

public class TextDealWriter 
{
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("Deal.dat")));
		Deal []arrayDeal = new Deal[10];
		for(int i=0;i<10;++i)
		{
			arrayDeal[i]=(Deal)ois.readObject();
		}
		ois.close();
	
		String fileName="dealreport.txt";
		BufferedWriter out=new BufferedWriter(new FileWriter(fileName));
		for(int i=0;i<10;++i)
		{
			System.out.println(arrayDeal[i].toPlainText());
			out.write(arrayDeal[i].toPlainText());
			out.newLine();
		}
		out.flush();
		out.close();
	}
}