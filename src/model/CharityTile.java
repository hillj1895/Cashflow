package model;

public class CharityTile extends Tile
{

	public CharityTile(String type, int boardIndex)
	{
		super(type, boardIndex);
		
	}
	
	@Override
	public void getLandedOn(Player p)
	{
		// TODO
		// Ask players if they want to donate to charity (returns boolean)
		// If true:
		// 		Set players charity coutner to 3
		//		Take money from them (check board for deets)
		// else:
		// 		Nothin
	}
	
}
