package problem4;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Random;

public class RandomGenerator 
{
	public static void main(String args[])
	{
		Random randomInt=new Random();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<80;++i)
		{
			ts.add(randomInt.nextInt(100)+1);
		}
		
		System.out.println("一共生成了"+ts.size()+"个不同的数");
		System.out.println("生成的数为：");
		
		Iterator<Integer> iter=ts.iterator();
		for(int num=0;iter.hasNext();)
		{
			System.out.print(iter.next()+"\t");
			++num;
			if(num%10==0)
				System.out.println("");
		}
	}
	
}
