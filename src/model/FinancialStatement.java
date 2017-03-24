package model;

public class FinancialStatement
{
	private double salary;
	private double interest;
	private double[] realEstate;
	private String career;
	private double expenses;
	private double assets;
	private double liabilities;
	private double income;
	
	public FinancialStatement(Profession p)
	{
		salary = p.getSalary();
		
	}
	
	public void setChildExp(int i) // One fo these for each of the little line items that actually change
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
}
