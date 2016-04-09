package myaccount.model;

import java.util.Date;

public class Person 
{
	protected String name;
	protected String type;
	protected String telephone;
	protected Date birthday;
	protected String description;
	
	public Person()
	{
		name=null;
		type=null;
		telephone=null;
		description=null;
		birthday=new Date();
	}
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday=birthday;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getTelephone()
	{
		return telephone;
	}
	public void setTelephone(String telephone)
	{
		this.telephone=telephone;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
}
