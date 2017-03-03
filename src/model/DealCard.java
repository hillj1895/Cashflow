package model;

public class DealCard extends Card
{
	private String _description;
	private int _cost;
	private int _downPayment;
	private int _mortgage;
	private int _cashFlowChange;
	
	
	
	public DealCard(String title, String description, int cost, int downPayment, int mortgage, int cashFlowChange)
	{
		super(title);
		_cost = cost;
		_downPayment = downPayment;
		_mortgage = mortgage;
		_cashFlowChange = cashFlowChange;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public int getCost()
	{
		return _cost;
	}
	
	public int getDownPayment()
	{
		return _downPayment;
	}
	
	public int getMortgage()
	{
		return _mortgage;
	}
	
	public int getCashFlowChange()
	{
		return _cashFlowChange;
	}

}
