package model;

import java.util.LinkedList;
import java.util.Queue;
import model.TileCircularLinkedList.Node;

public class GameBoard
{
	private Professions _profs;
	
	private TileCircularLinkedList _tiles;
	
	private static Tile t1 = new DealTile("Deal Tile", 0);
	private static Tile t2 = new DealTile("Doodad", 1);
	private static Tile t3 = new DealTile("Deal", 2);
	private static Tile t4 = new DealTile("Charity", 3);
	
	
	public GameBoard(Player... players)
	{
		_profs = new Professions();
		_tiles = new TileCircularLinkedList();
		_tiles.addTiles(t1, t2, t3, t4);
		t1.addPlayers(players);
	}
	
	
	// TODO This method will move the player and returns the number of pay days they passed along the way.
	// It also removes the player from the _players ArrayList of their initial tile and adds them to the 
	// arraylist of the tile they land on.
	public int movePlayer(Player p, int distance)
	{
		int currentLocation = p.getLocation();
		Node currentNode = _tiles.get(currentLocation);
		Tile currentTile = _tiles.elementAt(currentLocation);
		currentTile.removePlayer(p);
		int passedPaydays = 0;
		for(int i=0; i<distance; i++)
		{
			Node nextNode = currentNode.getNext();
			if(nextNode.getData().getName().equals("Payday"))
			{
				passedPaydays++;
			}
			currentNode = nextNode;
		}
		currentNode.getData().addPlayers(p);
		p.setLocation(currentNode.getData().getBoardIndex());
		return passedPaydays;
	}
	
	public void getProfessions()
	{
		return _profs;
	}
	
}
