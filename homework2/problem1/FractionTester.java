package problem1;

public class FractionTester 
{
	public static void main(String[] args) 
	{
		Fraction a=new Fraction(-8,10);
		Fraction b=new Fraction(9,-6);
		Fraction addResult=new Fraction();
		Fraction subResult=new Fraction();
		Fraction mulResult=new Fraction();
		Fraction divResult=new Fraction();
		System.out.println("a="+a+"          b="+b);
		addResult=addResult.add(a,b);
		System.out.println("a+b="+addResult);
		subResult=subResult.substract(a, b);
		System.out.println("a-b="+subResult);
		mulResult=mulResult.multiply(a, b);
		System.out.println("a*b="+mulResult);
		a.divide(b);
		System.out.println("a/b="+a);
	}
}