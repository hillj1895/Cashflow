package model;

import java.util.LinkedList;
import java.util.Queue;
import model.TileCircularLinkedList.Node;

public class GameBoard
{
	private TileCircularLinkedList _tiles;
	
	private static Tile t1 = new DealTile("Deal Tile", 0);
	private static Tile t2 = new DoodadTile("Doodad", 1);
	private static Tile t3 = new DealTile("Deal", 2);
	private static Tile t4 = new CharityTile("Charity", 3);

	
	
	public GameBoard()
	{
		_tiles = new TileCircularLinkedList();
		_tiles.addTiles(t1, t2, t3, t4);
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
		currentNode.getData().addPlayer(p);
		p.setLocation(currentNode.getData().getBoardIndex());
		return passedPaydays;
	}
	
	
}
