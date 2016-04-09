package problem3;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Compute 
{
	public static void main(String[] args)
	{
		System.out.println("��������ʽ��");
		Scanner scanner=new Scanner(System.in);
		String expression=scanner.nextLine();
		scanner.close();
		StringTokenizer str=new StringTokenizer(expression,";");
		int i=0;
		double result;
		double num[]=new double[4];
		for(;str.hasMoreTokens();++i)
		{
			if(i<4)
			{
				try
				{   //��������ַ���תΪdouble��
					num[i]=Double.parseDouble(str.nextToken());
				}
				catch(NumberFormatException e)
			    {   //����Ĳ�������
					System.out.println("Invalid Input "+expression);
					System.exit(-1);
			    }
			}
			if(i==5)
				break;
		}
		if(i!=4)    //����Ĳ����ĸ�����
		{
			System.out.println("Invalid Input "+expression);
			System.exit(-1);
		}
		Date printTime=new Date();
		//���ø�ʽ
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd h:mm:ss");
		System.out.println(time.format(printTime));
		result=Math.sin(num[0])*Math.cos(num[1])*Math.sqrt(Math.pow(num[2],num[3]));
		int output=(new Double(result)).intValue();
		//����������ӽ�������
		if(result-output>=0.5)
			++output;
		System.out.println("result="+output);
	}
}
