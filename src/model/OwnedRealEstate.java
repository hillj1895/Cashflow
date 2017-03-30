package model;

public class OwnedRealEstate
{
	private String _name;
	private int _price;
	private int _downPayment;
	private int _cashFlow;
	
	public OwnedRealEstate(String name, int price, int downPayment, int cashFlow)
	{
		_name = name;
		_price = price;
		_downPayment = downPayment;
		set_cashFlow(cashFlow);
	}

	public String getName() {
		return _name;
	}

	public int getPrice() {
		return _price;
	}

	/**
	 * 
	 * @return Returns a positive value for down payment!!
	 */
	public int getDownPayment() {
		return _downPayment;
	}

	public int getCashFlow() {
		return _cashFlow;
	}



	
	
	
	
}
