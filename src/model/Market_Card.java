/* 
 * hello
 */
public class Market_Card
{
	private String _title;
	private String _type; // repercent, refixed, expense, stock, gold, profit, aoffer, hoffer
	private Boolean _effect; //True if it effects all players
	private int _money; //If card type is expense or profit or gold
	private int _fixedpayment; //For cards of type refixed with a sell price in addition to initial purchase OR for an offer amount (apartment offer - per unit, house offer - whole house)
	private int _percentpayment; // percent + 100 for repercent with percentage payment
	
	// When implemented there needs to be a way to check whether the player has the necessary things or not
	
	public Market_Card(String title, String type, Boolean effect, int money, int fixedpayment, int percentpayment){
		_title = title;
		_type = type;
		_effect = effect;
		_money = money;
		_fixedpayment = fixedpayment;
		_percentpayment = percentpayment;
	}
	


	public String getTitle()
	{
		return _title;
	}
	
	public String getType()
	{
		return _type;
	}
	public int getCost(){
		return _money;
	}
	public int getFixed(){
		return _fixedpayment;
	}
	public int getPercent(){
		return _percentpayment;
	}
	
	
}
