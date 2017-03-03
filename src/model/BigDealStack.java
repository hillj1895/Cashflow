package model;

public class BigDealStack extends CardStack
{
	private static DealCard BD1= new DealCard("Limited Partner Wanted",
								"Successful pizza chain expanding into production  of frozen pizzas for grocery stores. Owner needs capital for equipment.",
								20000, 20000, 0, 1200);
	private static DealCard BD2 = new DealCard("Car Wash for Sale",
								"Family car wash in a prime location is for sale. Family feud forces sale as they want out ASAP.",
								350000, 50000, 300000, 2500);
	private static DealCard BD3 = new DealCard("Apartment House for Sale",
								"60-Unit complex available from pension fund that foreclosed on builder/owner. On-site management in place.",
								1200000, 200000, 1000000, 11000);
	private static DealCard BD4 = new DealCard("4-plex for Sale", 
								"4-plex for sale in rehabilitating neighborhood. Owner being forced out by income tax liens.",
								370000, 10000, 360000,900);
	private static DealCard BD5 = new DealCard("Duplex for Sale",
								"Owner is moving out of this duplex due to growing family. Tenant in other unit remains and new tenant waiting to move into this well-maintained property.",
								250000, 16000, 234000, 900);
	private static DealCard BD6 = new DealCard("Apartment House for Sale",
								"Two buildings totaling 24 units for sale. Owner managed with on-site assistant. Retirement prompts sale. Big Opportunity.",
								575000, 75000, 500000, 3600);
	private static DealCard BD7 = new DealCard("Automated Business",
								"Successful 4-bay, coin-operated auto wash near busy intersection. Seller is moving to retirement community out of state.",
								125000, 25000, 100000, 1800);
	private static DealCard BD8 = new DealCard("4-Plex for Sale",
								"Nice, well-maintained 4-plex in good neighborhood. Stable tenants, positive cash flow, minor repairs.",
								225000, 15000, 210000, 700);
	private static DealCard BD9 = new DealCard("House for Sale-3Br/2Ba",
								"Businessman needs cash to save his business and is liquidating this 3/2 house. It is currently occupied by a happy tenant.", 
								225000, 14000, 21000, 750);
	private static DealCard BD10 = new DealCard("Limited Partner Wanted", 
								"Sandwich shop is doubling the number of locations. Owner needs an investor to get started.",
								30000, 30000, 9, 1700);
	private static DealCard BD11 = new DealCard("House for Sale-3Br/2Ba", 
								"Split level 3/2 house on out out-of-way golf course offered by heirs of owner. Golf membership is included.",
								275000, 15000, 260000, 800);
	private static DealCard BD12 = new DealCard("4-plex for Sale",
								"4-plex for sale by owner, moving to another state. Full records, fully rented, low occupant turnover in good neighborhood.",
								340000, 32000, 308000, 1400);
	private static DealCard BD13 = new DealCard("8-plex for Sale",
								"Professional person urgently needs cash to save partnership. 8-plex is being sold to raise capital. Great opportunity for the right person.",
								360000, 32000, 328000, 1800);
	private static DealCard BD14 = new DealCard("House for Sale-3Br/2Ba",
								"3/2 house near this airport. Low cost and lots of cash flow potential, if you can stand the noise.", 
								275000, 16000, 259000, 750);
	private static DealCard BD15 = new DealCard("House for Sale-3Br/2Ba",
								"Downsized manager cannot afford payments on new salary and must sell this 3/2 house. The surrounding area is in transition.", 
								270000, 15000, 255000, 800);
	private static DealCard BD16 = new DealCard("Automated Business for Sale",
								"Vintage arcade with 30 pinball machines and loyal clientele. Owner has become overextended and is desperate to liquidate.",
								180000, 20000, 160000, 1600);
	private static DealCard BD17 = new DealCard("Duplex for Sale",
								"This duplex  is the best in neighborhood! Proud owner retiring to another state to be near grandchild.",
								170000, 18000, 152000, 900);
	private static DealCard BD18 = new DealCard("4-Plex for Sale",
								"4-plex next to new highway for sale. Owner/ occupant moving to quieter area. Priced for quick sale.",
								290000, 15000, 275000, 800);
	private static DealCard BD19 = new DealCard("4-Plex for Sale",
								"Older 4-plex available- forced sale. Out-of-state, financially-distressed owner years behind on taxes. Some records available.",
								280000, 16000, 264000, 1000);
	private static DealCard BD20 = new DealCard("Pizza franchise for Sale",
								"Healthy pizza company franchise. Trend in high-end fastfood is booming. High traffic location next to college campus.",
								500000, 100000, 400000, 5000);
	private static DealCard BD21 = new DealCard("Duplex for Sale",
								"Tenants in place at this investment duplex! Owner has income tax problems and needs to sell quickly.",
								245000, 12000, 233000, 800);
	private static DealCard BD22 = new DealCard("8-Plex for Sale",
								"Owner offers his 8-plex at the current, appraised value. It has all the amenities renters look for. Fully rented at market rent with excellent records.", 
								240000, 40000, 200000, 1800);
	private static DealCard BD23 = new DealCard("Limited Partner Wanted", 
								"Auto Dealer wants to expand into leasing 2 and 3 year old cars. Needs capital as car maker's finance company is not interested.",
								30000, 30000, 0, 15000);
	private static DealCard BD24 = new DealCard("Apartment House for Sale",
								"12-unit apartment house offered by out-of-state heirs of handyman/owner. Highly desirable location with a long waiting list for apartment unites at this property.", 
								350000, 50000, 300000, 3000);
	private static DealCard BD25 = new DealCard("8-Plex for Sale",
								"Owner's legal troubles lead to forced sale of this 8-plex. Jump on this deal before someone else does.", 
								250000, 40000, 210000, 2000);
	private static DealCard BD26 = new DealCard("House for Sale - 3Br/2Ba",
								"Divorce leads to sale of this 3/2 house in an area full of owner-occupied homes. It has been on the market for five months.",
								350000, 20000, 330000, 1000);
	private static DealCard BD27 = new DealCard("Duplex for Sale",
								"Duplex owner must sell to pay hospital bills. Two tenants are in place at this well-maintained property and it is a good investment opportunity.",
								260000, 12000, 248000, 600);
	private static DealCard BD28 = new DealCard("Apartment House for Sale",
								"Owner is retiring and this older 24-unit property is fully rented with great cash flow. Great location near a community college.",
								550000, 50000, 500000, 2400);
	private static DealCard BD29 = new DealCard("8-Plex for Sale",
								"Reinvesting owner offers 8-plex for sale at reasonable price. Financing already in place. All it needs is your down payment.",
								320000, 40000, 280000, 1700);
	private static DealCard BD30 = new DealCard("House for Sale - 3Br/2Ba",
								"3/2 house in rough neighborhood. Positive cash flow even though rents are weak.",
								300000, 12000, 288000, 800);
	private static DealCard BD31 = new DealCard("4-Plex for Sale",
								"4-plex in recovering neighborhood. Fully rented, repairs kept up. Needs your down payment and patience.",
								300000, 20000, 280000, 1100);
	private static DealCard BD32 = new DealCard("Duplex for Sale",
								"Well-maintained duplex in desirable area available to transfer of owner. Excellent investment opportunity for the right buyer.", 
								260000, 10000, 250000, 1100);
	private static DealCard BD33 = new DealCard("Automated Business for Sale",
								"Personal bankruptcy forces sale of busy, successful laundromat on busy highway. Growth in local area is expected to skyrocket.",
								150000, 30000, 120000, 2500);
	private static DealCard BD34 = new DealCard("Limited Partner Wanted",
								"Successful doctor expanding office and clinic. Needs partner to fund equity portion of construction costs.",
								25000, 25000, 0, 1300);
	private static DealCard BD35 = new DealCard("House for Sale - 3Br/2Ba",
								"Nice 3/2 house with inground pool and all appliances available in upper-middle-class area. Good schools.",
								300000, 20000, 280000, 1000);
	private static DealCard BD36 = new DealCard("House for Sale - 3Br/2Ba", 
								"Skilled Tradesman kept this 3/2 house in excellent condition, so it commands top-dollar rent in older neighborhood",
								325000, 18000, 307000, 900);
			
	public BigDealStack()
	{
		DealCard[] bdCardArray = {BD1, BD2, BD3, BD4, BD5, BD6, BD7, BD8, BD9, BD10, 
								  BD11, BD12, BD13, BD14, BD15, BD16, BD17, BD18, BD19, BD20,
								  BD21, BD22, BD23, BD24, BD25, BD26, BD27, BD28, BD29, BD30,
								  BD31, BD32, BD33, BD34, BD35, BD36};
		super.randomizeCards(bdCardArray);
	}
			
	
}

























