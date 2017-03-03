package model;

/* 
 * this is a very broad object class
 * i know we said all the card stacks would be in here but like
 * would it make more sense for them to be in the individual card classes?
 * - jackie
 *
 */

public class Card
{
	private String _title;
	//private int _value; // Any integer value that can be attached to the card. If card needs no value, put 0. Value of cost for deal cards.

	public  Card(String title)
	{
		_title = title;
	}
	
	public String getTitle()
	{
		return _title;
	}
	
}
