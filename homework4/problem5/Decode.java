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
		decodeList[0]='i';         //�ո��Ӧ���ַ�
		decodeList[1]=' ';         //��1��26�ֱ�Ϊa��z����Ӧ���ַ�
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
		for(int i=0;i<length;++i)   //�����ַ���
		{
			if(input[i]==' ')       //�ո�
				output+=decodeList[0];
			else if(input[i]=='_')  //��дI��Ӧ�Ŀո�
				output+=decodeList[27];
			else if(input[i]>='A'&&input[i]<='Z')
			{                       //��д��ĸ
				int index=(int)(input[i]-64);
				char letter=(char)(decodeList[index]-32);
				output+=letter;
			}
			else                    //Сд��ĸ
			{
				int index=(int)(input[i]-96);
				char letter=(char)(decodeList[index]);
				output+=letter;
			}
		}
		return output;
	}
	
    public String result1_decode(String input)          //��һ�ֽ��ܷ�ʽ
	{
		return decode_transfer(input);
	}
	
	public String result2_decode(String input,long key) //�ڶ��ֽ��ܷ�ʽ
	{
		String decode_string="";
		Random random=new Random(key);                  //����������Ϊ�������������
		for(int i=0;i<input.length();++i)
		{
			int randomNumber=random.nextInt(64)+1;
			if(input.charAt(i)==' ')                    //�ո񲻱�
				decode_string+=' ';
			else                                        //�����������������ԭΪԭ�ȵ��ַ�
			{
				char letter=(char)(input.charAt(i)+randomNumber);
				decode_string+=letter;
			}
		}
		return decode_string;
	}
}
