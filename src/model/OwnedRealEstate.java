package model;

public class OwnedRealEstate
{
	private String _name;
	private int _price;
	private int _downPayment;
	
	public OwnedRealEstate(String name, int price, int downPayment)
	{
		_name = name;
		_price = price;
		_downPayment = downPayment;
	}

	public String getName() {
		return _name;
	}

	public int getPrice() {
		return _price;
	}

	public int getDownPayment() {
		return _downPayment;
	}


	
	
	
	
}
