package model;

public class DoodadTile extends Tile
{
	private static DoodadStack _doodadStack;
	
	
	public DoodadTile(String name, int boardIndex)
	{
		super(name, boardIndex);
		_doodadStack = new DoodadStack();
	}
	
	@Override
	public void getLandedOn(Player p)
	{
		// Pop next card
		// Get cash out from card
		// Check if player has enough money to pay in full
		// If yes: Take cash from player
		// Otherwise set players cash balance to 0
	}
}
