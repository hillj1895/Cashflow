package model;

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
	
	public int getSize()
	{
		return _size;
	}
}
