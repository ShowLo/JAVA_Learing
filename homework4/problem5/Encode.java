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
		encodeList[0]='a';         //�ո��Ӧ���ַ�
		encodeList[1]='v';         //��1��26�ֱ�Ϊa��z����Ӧ���ַ�
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
		encodeList[27]='_';        //��д��I��Ӧ�Ŀո���Сд�����ֿ�
	}
	private String encode_transfer(String inputString)
	{
		String encodeList_string="";
		int length=inputString.length();
		char input[]=new char[length];
		input=inputString.toCharArray();
		for(int i=0;i<length;++i)  //�����ַ���
		{
			if(input[i]==' ')      //�ո�
				encodeList_string+=encodeList[0];
			else if(input[i]>='A'&&input[i]<='Z')
			{                      //��д��ĸ
				if(input[i]=='I')  //��дI��Ӧ�����
				{
					encodeList_string+=encodeList[27];
					continue;
				}
				int index=(int)(input[i]-64);
				char letter;
				if(index!=9)
					letter=(char)(encodeList[index]-32);
				else               //��Ӧ�ļ����ַ�Ϊ�ո�
					letter=(char)(encodeList[index]);
				encodeList_string+=letter;
			}
			else                   //Сд��ĸ
			{
				int index=(int)(input[i]-96);
				char letter=(char)(encodeList[index]);
				encodeList_string+=letter;
			}
		}
		return encodeList_string;
	}
	public String result1_encode(String input)          //��һ�ּ��ܷ�ʽ
	{
		return encode_transfer(input);
	}
	
	public String result2_encode(String input,long key) //�ڶ��ּ��ܷ�ʽ
	{
		String encode_string="";
		Random random=new Random(key);                  //����������Ϊ�������������
		for(int i=0;i<input.length();++i)
		{
			int randomNumber=random.nextInt(64)+1;      //����0��64�������
			if(input.charAt(i)==' ')                    //�ո񲻱�
				encode_string+=' ';
			else                                        //�����ĸ������ɵ�����������Ϊ�����ַ�
			{
				char letter=(char)(input.charAt(i)-randomNumber);
				encode_string+=letter;
			}
		}
		return encode_string;
	}
	
}
