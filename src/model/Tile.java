package model;

import java.util.ArrayList;

public class Tile
{
	private String _name;
	private int _boardIndex;
	private ArrayList<Player> _players;
	
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
	
	public void getLandedOn()
	{
		
	}
	
	public void addPlayer(Player p)
	{
		_players.add(p);
	}
	
	public void removePlayer(Player p)
	{
		_players.remove(p);
	}
	
}
