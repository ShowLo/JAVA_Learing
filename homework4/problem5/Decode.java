package problem5;

import java.util.Random;

public class Decode 
{
	private char decodeList[];
	
	public Decode()
	{
		setDecodeList();
	}
	private void setDecodeList()
	{
		decodeList=new char[28];
		decodeList[0]='i';         //空格对应的字符
		decodeList[1]=' ';         //从1到26分别为a到z所对应的字符
		decodeList[2]='r';
		decodeList[3]='t';
		decodeList[4]='n';
		decodeList[5]='b';
		decodeList[6]='h';
		decodeList[7]='q';
		decodeList[8]='f';
		decodeList[9]='j';
		decodeList[10]='l';
		decodeList[11]='c';
		decodeList[12]='k';
		decodeList[13]='o';
		decodeList[14]='d';
		decodeList[15]='e';
		decodeList[16]='y';
		decodeList[17]='w';
		decodeList[18]='s';
		decodeList[19]='u';
		decodeList[20]='z';
		decodeList[21]='x';
		decodeList[22]='a';
		decodeList[23]='v';
		decodeList[24]='m';
		decodeList[25]='p';
		decodeList[26]='g';
		decodeList[27]='I';
	}
	private String decode_transfer(String inputString)
	{
		String output="";
		int length=inputString.length();
		char input[]=new char[length];
		input=inputString.toCharArray();
		for(int i=0;i<length;++i)   //解密字符串
		{
			if(input[i]==' ')       //空格
				output+=decodeList[0];
			else if(input[i]=='_')  //大写I对应的空格
				output+=decodeList[27];
			else if(input[i]>='A'&&input[i]<='Z')
			{                       //大写字母
				int index=(int)(input[i]-64);
				char letter=(char)(decodeList[index]-32);
				output+=letter;
			}
			else                    //小写字母
			{
				int index=(int)(input[i]-96);
				char letter=(char)(decodeList[index]);
				output+=letter;
			}
		}
		return output;
	}
	
    public String result1_decode(String input)          //第一种解密方式
	{
		return decode_transfer(input);
	}
	
	public String result2_decode(String input,long key) //第二种解密方式
	{
		String decode_string="";
		Random random=new Random(key);                  //利用密码作为种子生成随机数
		for(int i=0;i<input.length();++i)
		{
			int randomNumber=random.nextInt(64)+1;
			if(input.charAt(i)==' ')                    //空格不变
				decode_string+=' ';
			else                                        //其他的利用随机数还原为原先的字符
			{
				char letter=(char)(input.charAt(i)+randomNumber);
				decode_string+=letter;
			}
		}
		return decode_string;
	}
}
