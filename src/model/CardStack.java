package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 * This class extends Java's linked list but had added methods to make interacting with the card stack much easier
 * @author Joe
 */
public class CardStack extends LinkedList<Card>
{
	private static final long serialVersionUID = 1L;
	private int _size;
	
	public CardStack()
	{
		super();
		_size = 0;
	}
	
	@Override
	public void push(Card c)
	{
		_size++;
		super.addFirst(c);
	}
	
	@Override
	public Card pop()
	{
		Card c = super.removeFirst();
		_size--;
		super.addLast(c);
		return c;
	}
	
	public Card pickCard()
	{
		return this.pop();
	}
	
	public int getSize()
	{
		return _size;
	}

	// Randomizes the stack with the cards in the array argument
	public void randomizeCards(Card[] cardArray)
	{
		// CardStack cardStack = new CardStack();
		ArrayList<Card> cardList = new ArrayList<Card>();
		Random r = new Random();
		
		// Add all array contents to list
		for(Card c : cardArray)
		{
			cardList.add(c);
		}
		
		// Pushes a card at a random index in the card list
		int initialLength = cardList.size();
		for(int i=0; i < initialLength; i++)
		{
			push(cardList.remove(r.nextInt(cardList.size())));
		}
		
	}

}
