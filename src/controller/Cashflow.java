package controller;

import view.*;
import model.*;

public class Cashflow
{

	
	private GameBoard _board;
	private Player[] _players;
	//private CardStack[] _cards;
	
	public static void main(String[] args)
	{
		/*
		 * Just testing stuff in here for now. Main method will call the go() method when game is built
		 */
		
		testCards();
		
		
	}


	public void go()
	{
		// Joe
		// Initialize game board
		// Initialize GUI
		// Initialize players (pick professions)
		
		
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
			// TODO Play method
			// Get player whose turn it is
			// Check down sized (check if player's downsize counter is 0)
			// Check charity (Check if charity counter is 0)
			// Roll dice
			// Move player (Have to wrap tiles to next tile after last tile is the beginning)
			// Call tile's getLandedOn method
			// Update current/all players' financials
			// Increment player array (Also needs to wrap like tiles array)
		}
	}
	
	public boolean isWinner()
	{
		for(Player p : _players)
		{
			if(p.hasWon())
			{
				return true;
			}
			else
				return false;
		}
		//needs a return statement (when opened on the lab PC's showed an error
	}
	
	public static void testCards()
	{
		BigDealStack ms = new BigDealStack();
		int initialSize = ms.getSize();
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + (ms.get(i).getTitle())); //Always going to need this cast when getting description unfortunately
		}
		
		
		System.out.println("Just popped: " + ms.pop().getTitle());
		
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + (ms.get(i).getTitle())); //Always going to need this cast when getting description unfortunately
		}
		
		
	}

}
















