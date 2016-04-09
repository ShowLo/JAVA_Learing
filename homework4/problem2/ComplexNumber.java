package problem2;

public class ComplexNumber
{
	double real=0;
	double imagine=0;
	
	public ComplexNumber(double real,double imagine)
	{
		this.real=real;
		this.imagine=imagine;
	}
	
	public ComplexNumber minus(ComplexNumber operand)
	{
		return new ComplexNumber(this.real-operand.real,this.imagine-operand.imagine);
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof ComplexNumber))
			return false;
		if(obj==this)
			return true;
		ComplexNumber c=(ComplexNumber) obj;
		if(Math.abs(this.real-c.real)<1e-5&&Math.abs(this.imagine-c.imagine)<1e-5)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		ComplexNumber complex1=new ComplexNumber(2.02d,3.1d);
		ComplexNumber complex2=new ComplexNumber(2d,3d);
		ComplexNumber complex3=complex2;
		ComplexNumber complex4=new ComplexNumber(2d,3d);
		ComplexNumber complex5=new ComplexNumber(0.02d,0.1d);
		ComplexNumber complex6=complex1.minus(complex2);
		
		System.out.println(complex2==complex3);
		System.out.println(complex2.equals(complex3));
		System.out.println(complex2.equals(complex4));
		System.out.println(complex6.equals(complex5));
		System.out.println(complex1.equals(null));
		System.out.println(complex1.equals(new String("abc")));
	}

}
