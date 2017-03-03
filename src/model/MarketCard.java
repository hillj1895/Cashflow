package model;

public class MarketCard extends Card
{
	private String _type;
	private boolean _affectAll;
	
	public MarketCard(String title, String type, boolean affectAll, int value)
	{
		super(title, value);
		_type = type;
		_affectAll = affectAll;
	}

	public String getType()
	{
		return _type;
	}

	public boolean doesAffectAll()
	{
		return _affectAll;
	}


}
