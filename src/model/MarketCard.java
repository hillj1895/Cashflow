package model;

public class MarketCard extends Card
{
	private String _type;
	private boolean _affectAll;
	private int _value;
	
	public MarketCard(String title, String type, boolean affectAll, int value)
	{
		super(title);
		_type = type;
		_affectAll = affectAll;
		_value = value;
	}

	public String getType()
	{
		return _type;
	}

	public boolean doesAffectAll()
	{
		return _affectAll;
	}
	
	public int getValue()
	{
		return _value;
	}	


}
