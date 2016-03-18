package problem4;

import java.util.Scanner;

public class ChangeCalculator 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		for(;true;)
		{
			double input=scanner.nextDouble();
			input=input*100;
			try
			{
				if(input==0)
				{
					return;
				}
				if(input<0||input>500)
				{
					throw new InputOutOfRangeException();
				}
				if(Math.abs(input%1)<1e-7||Math.abs(input%1-1)<1e-7)
				{
					int price=500-(int)input;
					int twoYuan,oneYuan;
					int fiftyCents,twentyCents,tenCents;
					int fiveCents,twoCents,oneCent;
					if(input==500)
					{
						System.out.println("��������");
						continue;
					}
					twoYuan=(int)(price/200);
					price=price-200*twoYuan;
					oneYuan=(int)(price/100);
					price=price-100*oneYuan;
					fiftyCents=(int)(price/50);
					price=price-50*fiftyCents;
					twentyCents=(int)(price/20);
					price=price-20*twentyCents;
					tenCents=(int)(price/10);
					price=price-10*tenCents;
					fiveCents=(int)(price/5);
					price=price-5*fiveCents;
					twoCents=(int)(price/2);
					price=price-2*twoCents;
					oneCent=price;
					if(twoYuan!=0)
						System.out.print("2Ԫ"+twoYuan+"��  ");
					if(oneYuan!=0)
						System.out.print("1Ԫ"+oneYuan+"��  ");
					if(fiftyCents!=0)
						System.out.print("5��"+fiftyCents+"��  ");
					if(twentyCents!=0)
						System.out.print("2��"+twentyCents+"��  ");
					if(tenCents!=0)
						System.out.print("1��"+tenCents+"��  ");
					if(fiveCents!=0)
						System.out.print("5��"+fiveCents+"��  ");
					if(twoCents!=0)
						System.out.print("2��"+twoCents+"��  ");
					if(oneCent!=0)
						System.out.print("1��"+oneCent+"��  ");
				}
				else
				{
					throw new WrongFormatException();
				}
			}
			catch(WrongFormatException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(InputOutOfRangeException ex)
			{
				System.out.println(ex.getMessage());
				System.exit(-1);
			}
		}
		
	}
}
