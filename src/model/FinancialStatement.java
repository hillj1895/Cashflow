package model;

import java.util.ArrayList;


public class FinancialStatement
{
	private int _cashBalance;
	private double salary;
	private double interest;
	private double[] realEstate;
	private String career;
	private double expenses;
	public static double assets; //sorry i had to make this change to use w/ cards if i messed something up just change it im sorry!!
	private double liabilities;
	private double income;
	private Stock _stock;
	private ArrayList<OwnedRealEstate> _realEstate = new ArrayList<OwnedRealEstate>();
	
	public FinancialStatement(Profession p)
	{
		// TODO Set each major line item to the sum of the smaller ones
		salary = p.getSalary();
		
	}
	
	public void setChildExp(int i) // One of these for each of the little line items that actually change
	{
		//childExp = i;
		update();
	}
	
	
	private void update()
	{
		//expenses = asdf +asdf_A+sdf+ASDf
		//income = blah+ blah
		//cashflow = bluh + bluh
		
		
	}

	public void buyStock(int numShares, int sharePrice)
	{
		_stock = new Stock(numShares, sharePrice);
		int cashOut = _stock.getCashOut();
		_cashBalance += cashOut;	// getCashOut() will negate the value automatically so we will add not subtract
	}
	
	public void sellStock()
	{
		_cashBalance += _stock.getSharePrice() * _stock.getNumShares();
		_stock = null;
	}
	
	Profession p = new Profession("Teacher", 3300, 500, 500, 100, 100, 200, 700, 0, 0, 
			200, 400, 50000, 12000, 5000, 4000);
	
	public double expenses()
	{
		expenses = p.getTaxes() + p.getMortgagePay() + p.getSchoolLoanPay() + p.getCarLoanPay()
					+ p.getCreditCardPay() + p.getOtherExp() + p.getBankLoanPay() + p.getChildExp();
		return expenses;
	}
	
	public double assets()
	{
		assets = p.getSavings();
		
		return assets;
	}
	
	public double liabilities()
	{
		liabilities = p.getMortgage() + p.getSchoolLoans() + p.getCarLoans() + p.getCreditCardDebt();
		return liabilities;
	}
	
	public double income()
	{
		income = p.getSalary();
		return income;
	}

	public void display()
	{
		
	}

	public int getCashBalance() {
		return _cashBalance;
	}

	public void increaseCashBalance(int cashIncrease) {
		this._cashBalance =+ cashIncrease;
	}
}
