package controller;

import view.*;
import model.*;

public class Cashflow
{

	
	private GameBoard _board;
	private Player[] _players;
	private CardStack[] _cards;
	
	public static void main(String[] args)
	{
		/*
		 * Just testing stuff in here for now. Main method will call the go() method when game is built
		 */
		MarketStack ms = new MarketStack();
		int initialSize = ms.getSize();
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + ((MarketCard) ms.pop()).getTitle()); //Always going to need this cast when getting description unfortunately
		}
	}
	
	public void go()
	{
		// Joe
		// Initialize game board
		// Initialize GUI
		// Initialize players (pick professions)
		// Initialize cards
		
		
		/*
		 * Start game:
		 * calls play function that has a
		 * while loop that repeats until either a player wins or
		 * someone elects to quit
		 */

	}
	
	public void play()
	{
		while(!isWinner())
		{
			// Check down sized (check if player's downsize counter is 0)
			// Check charity (Check if charity counter is 0)
			// Roll dice
			// Move player
			// Get card from tile ()
			// 
		}
	}
	
	public boolean isWinner()
	{
		for(Player p : _players)
		{
			if(p.hasWon())
			{
				return true;
				break;
			}
			else
				return false;
		}
	}
	
	
}
