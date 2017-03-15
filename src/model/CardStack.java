package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 * Made this class just to add functionality to a general stack to keep track of its size
 * @author Joe
 *
 */
public class CardStack extends Stack<Card>
{
	private static final long serialVersionUID = 1L;
	private int _size;
	
	public CardStack()
	{
		super();
		_size = 0;
	}
	
	@Override
	public Card push(Card c)
	{
		_size++;
		return super.push(c);
	}
	
	@Override
	public Card pop()
	{
		_size--;
		return super.pop();
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
