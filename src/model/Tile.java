package model;

public class Tile
{
	private String _name;
	private int _boardIndex;
	private Player[] _players;
	
	public Tile(String name, int boardIndex)
	{
		_name = name;
		_boardIndex = boardIndex;
	}
	
	public int getBoardIndex()
	{
		return _boardIndex;
	}

	public String getName()
	{
		return _name;
	}
	
	
}
