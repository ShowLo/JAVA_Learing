package problem4;

public class InputOutOfRangeException extends Exception
{
	public InputOutOfRangeException()
	{
		super("The input is out of range!");
	}
	public InputOutOfRangeException(String expression)
	{
		super(expression);
	}
}
