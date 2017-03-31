package model;

import java.util.ArrayList;

public class FinancialStatement
{
	private Profession _profession;
	
	private int _cashBalance;
	
	// Income
	private int _income; // needs getter and incrementer
	private int _salary;
	private int _REcashFlow;	// needs getter and incrementer
	
	// Expenses
	private int _expenses;	// needs getter and incrementer
	private int _taxes;
	private int _homeMortgagePayment;
	private int _schoolLoanPayment;
	private int _carLoanPayment;
	private int _creditCardPayment;
	private int _otherExpenses;
	private int _perChildExpense;
	private int _numChildren;	// needs getter and incrementer
	
	// Assets
	private int _assets;
	private int _savings;
	private Stock _stock;
	private ArrayList<OwnedRealEstate> _realEstate;
	
	// Liabilities
	private int _liabilities;
	private int _homeMortgage;
	private int _schoolLoans;
	private int _carLoans;
	private int _creditCardDebt;
	
	// Cash flows (top right of actual financial statement)
	private int _monthlySalary;
	private int _passiveIncome;
	private int _totalIncome;
	private int _totalExpenses;
	private int _monthlyCashFlow;
	private boolean _hasWon;
	
	
	
	public FinancialStatement(Profession p)
	{
		_profession = p;
		
		// Income
		_income = 0;
		_salary = p.getSalary();
		_REcashFlow = 0;
		
		// Expenses
		_expenses = 0;	
		_taxes = p.getTaxes();
		_homeMortgagePayment = p.getMortgagePay();
		_schoolLoanPayment = p.getSchoolLoanPay();
		_carLoanPayment = p.getCarLoanPay();
		_creditCardPayment = p.getCreditCardPay();
		_otherExpenses = p.getOtherExp();
		_perChildExpense = p.getChildExpPer();
		_numChildren = 0;
		
		// Assets
		_assets = 0;
		_savings = p.getSavings();
		_stock = null;
		_realEstate = new ArrayList<OwnedRealEstate>();
		
		// Liabilities
		_liabilities = 0;
		_homeMortgage = p.getMortgage(); 
		_schoolLoans = p.getSchoolLoans();
		_carLoans = p.getCarLoans();
		_creditCardDebt = p.getCreditCardDebt();
		
		// Cash flows
		_monthlySalary = _salary;
		_passiveIncome = 0;
		_totalIncome = 0;
		_totalExpenses = 0;
		_monthlyCashFlow = 0;
		_hasWon = false;
		
		update();
	}
	
	private void update()
	{
		_income = _salary + _REcashFlow;
		_expenses = _taxes + _homeMortgagePayment + _schoolLoanPayment + _carLoanPayment + _creditCardPayment + _otherExpenses + (_perChildExpense * _numChildren);
		_assets = getOwnedREValue() + getStockValue() + _savings;
		_liabilities = _homeMortgage + _schoolLoans + _carLoans + _creditCardDebt;
		
		_passiveIncome = getPassiveIncome();
		_totalIncome = _monthlySalary + _passiveIncome;
		_totalExpenses = _expenses;
		_monthlyCashFlow = _totalIncome - _totalExpenses;
		_hasWon = _passiveIncome > _totalExpenses;
	}
	
	private int getPassiveIncome()
	{
		int passiveInc = 0;
		for(OwnedRealEstate re : _realEstate)
		{
			passiveInc += re.getCashFlow();
		}
		return passiveInc;
	}
	
	public int getStockValue()
	{
		if(_stock == null) {
			return 0;
		}
		else {
			return _stock.getNumShares() * _stock.getSharePrice();
		}
	}

	public int getOwnedREValue()
	{
		int reValue = 0;
		for(OwnedRealEstate re : _realEstate)
		{
			reValue += re.getPrice();
		}
		return reValue;
	}
	
	public boolean canBuy(int price)
	{
		return price < _cashBalance;
	}
	
	public boolean hasStock()
	{
		return _stock != null;
	}
	
	public void buyProperty(OwnedRealEstate newProperty)
	{
		_cashBalance -= newProperty.getDownPayment();
		_realEstate.add(newProperty);
		update();
	}
	
	public void buyStock(int numShares, int sharePrice)
	{
		_stock = new Stock(numShares, sharePrice);
		int cashOut = _stock.getCashOut();
		_cashBalance += cashOut;	// getCashOut() will negate the value automatically so we will add not subtract
		update();
	}
	
	public void sellStock()
	{
		_cashBalance += _stock.getSharePrice() * _stock.getNumShares();
		_stock = null;
		update();
	}
	
	public void addChild()
	{
		// People can only have a max of 3 children
		if(_numChildren < 3)
		{
			_numChildren++;
		}
		update();
	}
	
	public int getCashBalance()
	{
		return _cashBalance;
	}

	public void increaseCashBalance(int cashIncrease)
	{
		this._cashBalance =+ cashIncrease;
		update();
	}

	public Profession getProfession()
	{
		return _profession;
	}
}





