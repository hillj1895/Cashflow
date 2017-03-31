package model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SmallDealStack extends CardStack
{
	private static final long serialVersionUID = 1L;
	
	private static DealCard SD01 = new DealCard("Stock - ON2U Entertainment Co.",
									"Box office hit by children's division causes record share price. "
									+ "Historic Trading Range: $10 - 30",
									40, 0, 0, 0);
	private static DealCard SD02 = new DealCard("Stock - ON2U Entertainment Co.",
									"Strong demand for company's library of old movies leads to good share price. "
									+ "Historic Trading Range: $10 - 30",
									30, 0, 0, 0);
	private static DealCard SD03 = new DealCard("Stock - ON2U Entertainment Co.",
									"New director of movie acquisitions brings revived prospects for share price. "
									+ "Historic Trading Range: $10 - 30",
									20, 0, 0, 0);
	private static DealCard SD04 = new DealCard("Stock - ON2U Entertainment Co.",
									"Movie buyer fired after third mega-flop! Share sink. Chairman's bonus cancelled."
									+ "Historic Trading Range: $10 - 30",
									10, 0, 0, 0);
	private static DealCard SD05 = new DealCard("Stock - ON2U Entertainment Co.",
									"Newest theme park is a huge flop, reports record losses. Share price hits all-time low."
									+ "Historic Trading Range: $10 - 30",
									5, 0, 0, 0);
	private static DealCard SD06 = new DealCard("Condo for Sale - 2Br/1Ba",
									"Parents selling 2/1 condo used by their child in college town. "
									+ "Lots of demand for rentals in this area.",
									40000, 4000, 36000, 140);
	private static DealCard SD07 = new DealCard("Condo for Sale - 2Br/1Ba",
									"Older 2/1 condo offered by young couple who want to move up to a 3/2 house "
									+ "due to grouwing family. Available soon.",
									55000, 5000, 50000, 160);
	private static DealCard SD08 = new DealCard("Condo for Sale - 2Br/1Ba",
									"Excellent 2/1 condo with many extras. Onwer wants to relocate for dream job FAST!"
									+ "She's moving up- you can too! No Cash Flow, but a possible capital gains opportunity.",
									40000, 1000, 39000, 0);
	private static DealCard SD09 = new DealCard("Condo for Sale - 2Br/1Ba",
									"Bank foreclosure! 2/1 condo in a desireable neighborhood. Close to jobs and stores."
									+ "Make offer, favorable financing by bank.",
									40000, 5000, 35000, 220);
	private static DealCard SD10 = new DealCard("House for Sale - 2Br/1Ba",
									"Nice 2/1 house aailable in a depressed market due to layoffs. Would make a good"
									+ "investment property for the right buyer.",
									50000, 4000, 46000, 200);
	private static DealCard SD11 = new DealCard("House for Sale - 2Br/1Ba",
									"Nice 2/1 rental house suddenly available due to estate closing. Well-maintained older "
									+ "property with existing tenant.",
									65000, 5000, 60000, 160);
	private static DealCard SD12 = new DealCard("House for Sale - 2Br/1Ba",
									"Low down payment to pick up with 2/1 house. Owner/seller unexpectedly moving out of town."
									+ " Right person will do well.",
									50000, 3000, 47000, 100);
	private static DealCard SD13 = new DealCard("House for Sale - 2Br/1Ba",
									"2/1 house in an older area offered by the Highway Department. The market has crashed and the "
									+ "city MUST sell. No Cash Flow but a possible capital gains opportunity.",
									30000, 1000, 29000, 0);
	private static DealCard SD14 = new DealCard("House for Sale - 2Br/1Ba",
									"Not lived in for six months, this bank-foreclosed house just reduced. Loan includes "
									+ "estimated repair costs.",
									50000, 2000, 48000, 200);
	private static DealCard SD15 = new DealCard("You Find a Great Deal!",
									"Older 2/1 house, reposses by government agency. Ready to go with government financing "
									+ "and a tenant. Take out a loan if you must, but BUY THIS!",
									35000, 2000, 33000, 220);
	private static DealCard SD16 = new DealCard("You Find a Great Deal!",
									"Company bought transferred-manager's 2/1 house. No current tenant, it has been on the market"
									+ "six months and it has just been reduced. Take out a loan if you must, but BUY THIS!",
									45000, 2000, 43000, 250);
//	private static DealCard SD17 = new DealCard("",
//									"",
//									, , , ); 
	//SD17 for incase we decided to add more or something.
	private Stack<DealCard> _bigDealStack;		
	
	public SmallDealStack()
	{
		DealCard[] sdCardArray = {SD01, SD02, SD03, SD04, SD05, SD06, SD07, SD08, SD09, SD10, 
				  				  SD11, SD12, SD13, SD14, SD15, SD16};
		super.randomizeCards(sdCardArray);
		List<DealCard> list = Arrays.asList(sdCardArray);
		Stack<DealCard> SDCardStack = new Stack<DealCard>();
		SDCardStack.addAll(list);
		_bigDealStack = SDCardStack;
	}

	
}

