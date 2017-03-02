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
	private String _type; // you dont have to use this but i added it because theres so many different types of market cards i need something to keep track of which is which
	private Boolean _effect; //True if it effects all players
	private int _value; // Any integer value that can be attached to the card. If card needs no value, put 0


	
	public Market_Card(String title, String type, Boolean effect, int value){
		_title = title;
		_type = type;
		_effect = effect;
		_value = value;
	}
	


	public String getTitle()
	{
		return _title;
	}
	
	public String getType()
	{
		return _type;
	}
	public int getValue(){
		return _value;
	}

	
	
}
