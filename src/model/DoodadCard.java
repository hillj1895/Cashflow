package model;

public class DoodadCard extends Card
{
	private int _value;
	
	public DoodadCard(String title, int value)
	{
		super(title);
		_value = value;
	}
	
	public int getValue()
	{
		return _value;
	}	
}
