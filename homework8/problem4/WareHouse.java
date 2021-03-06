package problem4;

import java.util.Vector;

public class WareHouse 
{
	private static final long DELAY=100;
	private Vector storage=new Vector();
	
	public int size()
	{
		working();
		return storage.size();
	}
	
	public String getCargo(int i)
	{
		working();
		return storage.get(i).toString();
	}
	
	public void addCargo(String cargo)
	{
		working();
		storage.add(cargo);
	}
	
	public void removeCargo(int i)
	{
		working();
		storage.remove(i);
	}
	
	public void working()
	{
		try
		{
			Thread.sleep(DELAY);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
