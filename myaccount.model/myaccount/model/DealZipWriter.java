package myaccount.model;

import java.io.*;
import java.util.zip.*;

public class DealZipWriter 
{
	public static void main(String args[]) throws IOException
	{
		String[] fileName={"Deal.dat","dealreport.txt"};
		ZipOutputStream out=new ZipOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("deal.zip")));
		for(int i=0;i<fileName.length;++i)
		{
			byte[] b=new byte[1024];
			BufferedInputStream in=new BufferedInputStream(new FileInputStream(fileName[i]));
			out.putNextEntry(new ZipEntry(fileName[i]));
			int length;
			while((length=in.read(b))>0)
			{
				out.write(b,0,length);
			}
			in.close();
			out.closeEntry();
		}
		out.flush();
		out.close();
	}
}
