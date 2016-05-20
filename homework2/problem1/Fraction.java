package problem1;

public class Fraction 
{
	private int numerator;      //分子
	private int denominator;    //分母
	
	//构造方法
	public Fraction(int numerator,int denominator)
	{
		if(denominator==0)
		{
			System.err.println("分母不能为0！");
			System.exit(-1);
		}
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public Fraction()
	{
		this.numerator=0;
		this.denominator=1;
	}
	
	//修改属性的方法
	public void setNumerator(int numerator)
	{
		this.numerator=numerator;
	}
	
	public void setDenominator(int denominator)
	{
		if(denominator==0)
		{
			System.err.println("分母不能为0！");
			System.exit(-1);
		}
		this.denominator=denominator;
	}
	
	//读取属性的函数
	public int getNumerator()
	{
		return this.numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	//化简函数
	private void simplify()
	{
		int a=this.numerator;
		int b=this.denominator;
		if(a%b==0)               //可以直接表示为整数
		{
			this.numerator=a/b;
			this.denominator=1;
			return;
		}
		int r=0;
		//利用辗转相除法求最大公因子
		for(int i=0;i==0||r!=0;++i)
		{
			r=b%a;
			b=a;
			a=r;
		}
		this.numerator=this.numerator/b;
		this.denominator=this.denominator/b;
	}
	
	//重载toString函数
	public String toString()
	{
		simplify();
		if(this.denominator==1)
			return (this.numerator+" ");
		else
			if(this.denominator<0)
			{
				this.numerator=-this.numerator;
				this.denominator=-this.denominator;
			}
			return (this.numerator+"/"+this.denominator);
	}
	
	//加减乘除运算的定义，对当前对象执行加减乘除操作
	public void add(Fraction a)
	{
		this.numerator=this.numerator*a.getDenominator()+this.denominator*a.getNumerator();
		this.denominator=this.denominator*a.getDenominator();
	}
	
	public void substract(Fraction a)
	{
		this.numerator=this.numerator*a.getDenominator()-this.denominator*a.getNumerator();
		this.denominator=this.denominator*a.getDenominator();
	}
	
	public void multiply(Fraction a)
	{
		this.numerator=this.numerator*a.getNumerator();
		this.denominator=this.denominator*a.getDenominator();
	}
	
	public void divide(Fraction a)
	{
		if(a.getNumerator()==0)
		{
			System.err.println("被除数不能为0！");
			System.exit(-1);
		}
		this.numerator=this.numerator*a.getDenominator();
		this.denominator=this.denominator*a.getNumerator();
	}
	
	//加减乘除运算的定义，返回一个新的分数，当前分数不变
	public static Fraction add(Fraction a,Fraction b)
	{
		int num=a.getNumerator()*b.getDenominator()+a.getDenominator()*b.getNumerator();
		int deno=a.getDenominator()*b.getDenominator();
		return new Fraction(num,deno);
	}
	
	public static Fraction substract(Fraction a,Fraction b)
	{
		int num=a.getNumerator()*b.getDenominator()-a.getDenominator()*b.getNumerator();
		int deno=a.getDenominator()*b.getDenominator();
		return new Fraction(num,deno);
	}
	
	public static Fraction multiply(Fraction a,Fraction b)
	{
		int num=a.getNumerator()*b.getNumerator();
		int deno=a.getDenominator()*b.getDenominator();
		return new Fraction(num,deno);
	}
	
	public static Fraction divide(Fraction a,Fraction b)
	{
		if(b.getNumerator()==0)
		{
			System.err.println("被除数不能为0！");
			System.exit(-1);
		}
		int num=a.getNumerator()*b.getDenominator();
		int deno=a.getDenominator()*b.getNumerator();
		return new Fraction(num,deno);
	}
}
