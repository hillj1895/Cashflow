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

	//private String _type; // you dont have to use this but i added it because theres so many different types of market cards i need something to keep track of which is which

	//private Boolean _effect; //True if it effects all players

	private int _value; // Any integer value that can be attached to the card. If card needs no value, put 0. Value of cost for deal cards.
	
	//private int _value2;  //value of Down Payment
	
	//private int _value3;  //value of Mortgage
	
	//private int _value4; //value of Cash Flow



	public  Card(String title, int value){

		_title = title;

		_value = value;
		
	}
	
	public String getTitle()
	{
		return _title;
	}

	public int getValue(){
		return _value;
	}
	
	/**
	public int getValue2(){
		return _value2;
	}
	public int getValue3(){
		return _value3;
	}
	public int getValue4(){
		return _value4;
	}
	*/



	
}
