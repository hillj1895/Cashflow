package model;

public class DealTile extends Tile
{
	private static SmallDealStack _smallDealStack;
	private static BigDealStack _bigDealStack;
	private static int _stockPrice;
	
	public DealTile(String type, int boardIndex)
	{
		super(type, boardIndex);
		_smallDealStack = new SmallDealStack();
		_bigDealStack = new BigDealStack();
	}
	
	@Override
	public void getLandedOn()
	{
		// TODO
		// Ask user to decide big/small deal:
		// Pick card from big/small deal stack:
		// If stock, update price, then ask user if they want to buy and ask everyone if they want to sell:
		// If property, ask user if they want to do it:
		// If yes, call ButIncomeProperty method:
		// Else, do nothing:
	}
	
	public void buyIncomeProperty(Player p, DealCard d)
	{
		FinancialStatement f = p.getFinancialStatement();
		
		f.increaseCashBalance(-d.getDownPayment());					// Watch out for negatives
		f.increasePassiveIncome(d.getCashFlowChange());
		
		OwnedRealEstate newProperty = new OwnedRealEstate(d.getTitle(), d.getCost(), d.getDownPayment());
		f.addProperty(newProperty);
	}
	
	public void updateStockPrice(DealCard d)
	{
		_stockPrice = d.getCost();
	}
	
	public void buyStock(Player p)
	{
		
	}
	
	
	
}
