package myaccount.model;

public class Bank extends Person
{
	protected String homepage;
	
	public Bank()
	{
		super();
		homepage=null;
	}
	public String getHomepage()
	{
		return homepage;
	}
	public void setHomepage(String homepage)
	{
		this.homepage=homepage;
	}
}
