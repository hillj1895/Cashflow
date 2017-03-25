package model;

public class Stock
{
	private static int _sharePrice;
	private int _numShares;
	
	public Stock(int sharePrice,  int numShares)
	{
		_sharePrice = sharePrice;
		_numShares = numShares;
	}
	
	public void setSharePrice(int newPrice)
	{
		_sharePrice = newPrice;
	}
	
	public int getSharePrice()
	{
		return _sharePrice;
	}
	
	/**
	 * 
	 * @return returns NEGATED version of the cash outlay for a stock
	 */
	public int getCashOut()
	{
		return -1 * _sharePrice * _numShares;
	}

	public int getNumShares()
	{
		return _numShares;
	}
	
}