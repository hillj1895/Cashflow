package model;

public class Player
{
	private FinancialStatement _fs; 
	private int _charityCount; //charity counter
	private int _downsizeCount; //down size counter
	private int _location;
	private boolean _hasWon;
	
	public Player()
	{
		Professions p = new Professions();
		_fs = new FinancialStatement(p.getProfession());
		_charityCount = 0;
		_downsizeCount = 0;
		_location = 0;
		_hasWon = false;
	}

	
	public boolean hasWon()
	{
		return _hasWon;
	}
	
	public FinancialStatement getFinancialStatement()
	{
		return _fs;
	}
	
	public boolean donateCharity()
	{
		//
		return false;
	}
	
	public void setLocation(int i)
	{
		_location = i;
	}
	
	public int getLocation()
	{
		return this._location;
	}


	public int getCharityCount()
	{
		return _charityCount;
	}


	public void decrementCharityCount()
	{
		_charityCount--;
	}


	public int getDownsizeCount()
	{
		return _downsizeCount;
	}


	public void decrememntDownsizeCount()
	{
		_downsizeCount--;
	}
	

	
	
}
