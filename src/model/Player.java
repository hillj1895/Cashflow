package model;

public class Player
{
	public FinacialStatement _fs; //financial statement of user
	//idNumber?
//	public boolean _charity;
	private int _CharityCount; //charity counter
	private int _DownsizeCount; //downsize counter
	private int _location;
	private boolean _winner = false;
	
	public boolean hasWon() {
		return _winner;
	}
	
	//needs to roll dice
	public void pickCard() {
		
	}
	
	public boolean donateCharity() { 
		//
		return false;
	}
	
	public void setLocation() {
		
	}
	
	public int getLocation() {
		return this._location;
	}
	
	public Player() { //constructer 
		
	}
	
	
}
