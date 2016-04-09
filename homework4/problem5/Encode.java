package problem5;

import java.util.Random;

public class Encode
{
	private char encodeList[];
	
	public Encode()
	{
		setEncodeList();
	}
	private void setEncodeList()
	{
		encodeList=new char[28];
		encodeList[0]='a';         //空格对应的字符
		encodeList[1]='v';         //从1到26分别为a到z所对应的字符
		encodeList[2]='e';
		encodeList[3]='k';
		encodeList[4]='n';
		encodeList[5]='o';
		encodeList[6]='h';
		encodeList[7]='z';
		encodeList[8]='f';
		encodeList[9]=' ';
		encodeList[10]='i';
		encodeList[11]='l';
		encodeList[12]='j';
		encodeList[13]='x';
		encodeList[14]='d';
		encodeList[15]='m';
		encodeList[16]='y';
		encodeList[17]='g';
		encodeList[18]='b';
		encodeList[19]='r';
		encodeList[20]='c';
		encodeList[21]='s';
		encodeList[22]='w';
		encodeList[23]='q';
		encodeList[24]='u';
		encodeList[25]='p';
		encodeList[26]='t';
		encodeList[27]='_';        //大写的I对应的空格，与小写的区分开
	}
	private String encode_transfer(String inputString)
	{
		String encodeList_string="";
		int length=inputString.length();
		char input[]=new char[length];
		input=inputString.toCharArray();
		for(int i=0;i<length;++i)  //加密字符串
		{
			if(input[i]==' ')      //空格
				encodeList_string+=encodeList[0];
			else if(input[i]>='A'&&input[i]<='Z')
			{                      //大写字母
				if(input[i]=='I')  //大写I对应的情况
				{
					encodeList_string+=encodeList[27];
					continue;
				}
				int index=(int)(input[i]-64);
				char letter;
				if(index!=9)
					letter=(char)(encodeList[index]-32);
				else               //对应的加密字符为空格
					letter=(char)(encodeList[index]);
				encodeList_string+=letter;
			}
			else                   //小写字母
			{
				int index=(int)(input[i]-96);
				char letter=(char)(encodeList[index]);
				encodeList_string+=letter;
			}
		}
		return encodeList_string;
	}
	public String result1_encode(String input)          //第一种加密方式
	{
		return encode_transfer(input);
	}
	
	public String result2_encode(String input,long key) //第二种加密方式
	{
		String encode_string="";
		Random random=new Random(key);                  //利用密码作为种子生成随机数
		for(int i=0;i<input.length();++i)
		{
			int randomNumber=random.nextInt(64)+1;      //生成0到64的随机数
			if(input.charAt(i)==' ')                    //空格不变
				encode_string+=' ';
			else                                        //其他的根据生成的随机数随机变为其他字符
			{
				char letter=(char)(input.charAt(i)-randomNumber);
				encode_string+=letter;
			}
		}
		return encode_string;
	}
	
}
