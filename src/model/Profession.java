package model;


public class Profession
{
	private String _name;
	private int _salary;
	private int _taxes;
	private int _mortgagePay;
	private int _schoolLoanPay;
	private int _carLoanPay;
	private int _creditCardPay;
	private int _otherExp;
	private int _bankLoanPay;
	private int _childExp;
	private int _childExpPer;
	private int _savings;
	private int _mortgage;
	private int _schoolLoans;
	private int _carLoans;
	private int _creditCardDebt;
	
	public Profession(String name, int salary, int taxes, int mortgagePay, int schoolLoanPay, 
			int carLoanPay, int creditCardPay, int otherExp, int bankLoanPay, int childExp, int childExpPer, 
			int savings, int mortgage, int schoolLoans, int carLoans, int creditCardDebt)
	{
		_name = name;
		_salary = salary;
		_taxes = taxes;
		_mortgagePay = mortgagePay;
		_schoolLoanPay = schoolLoanPay;
		_carLoanPay = carLoanPay;
		_creditCardPay = creditCardPay;
		_otherExp = otherExp;
		_bankLoanPay = bankLoanPay;
		_childExp = childExp;
		_childExpPer = childExpPer;
		_savings = savings;
		_mortgage = mortgage;
		_schoolLoans = schoolLoans;
		_carLoans = carLoans;
		_creditCardDebt = creditCardDebt;
		
	}
	
	public String getName()
	{
		return _name;
	}
	
	public int getSalary()
	{
		return _salary;
	}
	
	public int getTaxes()
	{
		return _taxes;
	}
	
	public int getMortgagePay()
	{
		return _mortgagePay;
	}
	
	public int getSchoolLoanPay()
	{
		return _schoolLoanPay;
	}
	
	public int getCarLoanPay()
	{
		return _carLoanPay;
	}
	
	public int getCreditCardPay()
	{
		return _creditCardPay;
	}
	
	public int getOtherExp()
	{
		return _otherExp;
	}
	
	public int getBankLoanPay()
	{
		return _bankLoanPay;
	}
	
	public int getChildExp()
	{
		return _childExp;
	}
	
	public int getChildExpPer()
	{
		return _childExpPer;
	}
	
	public int getSavings()
	{
		return _savings;
	}
	
	public int getMortgage()
	{
		return _mortgage;
	}

	public int getSchoolLoans()
	{
		return _schoolLoans;
	}

	public int getCarLoans()
	{
		return _carLoans;
	}

	public int getCreditCardDebt()
	{
		return _creditCardDebt;
	}
}
