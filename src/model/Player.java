package model;

public class Player
{
	private FinancialStatement _fs; //financial statement of user
	//idNumber?
//	public boolean _charity;
	private int _CharityCount; //charity counter
	private int _DownsizeCount; //downsize counter
	private int _location;
	private boolean _winner = false;
	
	public Player() { //constructor 
		// TODO: Pick profession
		_location = 0;
	}

	
	public boolean hasWon() {
		return _winner;
	}
	
	//needs to roll dice
	public void pickCard() {
		
	}
	
	public FinancialStatement getFinancialStatement()
	{
		return _fs;
	}
	
	public boolean donateCharity() { 
		//
		return false;
	}
	
	public void setLocation(int i) {
		_location = i;
	}
	
	public int getLocation() {
		return this._location;
	}
	

	
	
}
