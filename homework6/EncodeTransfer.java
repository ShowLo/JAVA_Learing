package problem6;

import java.io.*;
//转码，从GBK编码转为UTF-8编码格式
public class EncodeTransfer 
{
	public static void main(String args[]) throws IOException
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("GBK.txt"));
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("UTF-8.txt"),"UTF-8");
		byte[] input=new byte[512];
		int length;
		while((length=bis.read(input))>0)
		{
			String instr=new String(input,0,length,"GBK");
			String outstr=new String(instr.getBytes("UTF-8"),"UTF-8");
			out.write(outstr);
		}
		out.flush();
		out.close();
		bis.close();
	}
}
