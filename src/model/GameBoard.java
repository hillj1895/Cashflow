package model;

import java.util.LinkedList;
import java.util.Queue;

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
	
}
