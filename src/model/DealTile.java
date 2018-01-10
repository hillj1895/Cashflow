package model;

import java.util.Scanner;

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
	public void getLandedOn(Player p)
	{
		// TODO
		// For now, using a scanner to interact with user until GUI is ready:
		// Ask user to decide big/small deal:
		Scanner s = new Scanner(System.in);
		System.out.println("You landed on a deal tile. Enter 0 for small deal or 1 for big deal");
		String input = s.next();

		// Pick card from big/small deal stack:
		Card c;
		if(input.equals("1"))
		{
			c = _smallDealStack.pickCard()
		}
		else 
		{
			c = _smallDealStack.pickCard();
		}
		
		// If stock, update price, then ask user if they want to buy and ask everyone if they want to sell:
		if(c.getTitle().equals(anObject))
		// If property, ask user if they want to do it (and check if they can afford the down payment):
		// If yes, call ButIncomeProperty method:
		// Else, do nothing:
	}
	
	public void buyIncomeProperty(Player p, DealCard d)
	{
		FinancialStatement f = p.getFinancialStatement();
		OwnedRealEstate newProperty = new OwnedRealEstate(d.getTitle(), d.getCost(), d.getDownPayment(), d.getCashFlowChange());
		f.buyProperty(newProperty);
		
	}
	
	public void updateStockPrice(DealCard d)
	{
		_stockPrice = d.getCost();
	}
	
	public void buyStock(Player p)
	{
		
	}
	
}
