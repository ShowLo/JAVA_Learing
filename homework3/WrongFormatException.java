package problem4;

public class WrongFormatException extends Exception
{
	public WrongFormatException()
	{
		super("Wrong Format!");
	}
	public WrongFormatException(String expression)
	{
		super(expression);
	}
}
