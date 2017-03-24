package model;

public class MarketCard extends Card
{
	private String _description;
	private String _type;
	private int _value;
	private String _addit;
	
	public MarketCard(String title, String description, String type, int value, String addit)
	{
		super(title);
		_description = description;
		_type = type;
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

	
	public int getValue()
	{
		return _value;
	}	
	public String getAddit()
	{
		return _addit;
	}
	public void display(){
		//display cards in a pretty gui
	}


}
