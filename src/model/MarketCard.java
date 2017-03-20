package model;

public class MarketCard extends Card
{
	private String _description;
	private String _type;
	private boolean _affectAll;
	private int _value;
	
	public MarketCard(String title, String description, String type, boolean affectAll, int value, String addit)
	{
		super(title);
		_description = description;
		_type = type;
		_affectAll = affectAll;
		_value = value;
		_addit = addit; //additional info
	}
	
	public String getDescription()
	{
		return _description;
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
	public String getAddit()
	{
		return _addit;
	}


}
