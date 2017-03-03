package model;
/* 
 * hi im very forgetful so my code is usually full of comments when its not finished sorry
 * 
 */
public class MarketStack extends CardStack
{
	//Not sure how we're working in the descriptions as it's a more graphical concept but for now I'm going to type them out
	private static MarketCard Profit1 = new MarketCard("Small Business Boom!", "profit", true, 250);
	//The downtown economy has exploded! EVERYONE is affected! ALL businesses with a cash flow of $1000 or less have their cash flow increased by $250
	private static MarketCard Profit2 = new MarketCard("New Management System", "profit", false, 400);
	// A new management system creates new efficiencies and lowers costs. Only the person who drew this MarketCard is affected.
	//gold MarketCard - value is $ per coin
	private static MarketCard Gold1 = new MarketCard("Price of Gold Soars", "gold", true, 2000);
	// The Central Bank is printing money in an attempt to boost the economy causing massive inflation. The price of gold skyrockets. Buyer offers $2000 for each gold coin. Everyone may sell any number of coins at this price.
	private static MarketCard Gold2 = new MarketCard("Collector wants Gold Coins", "gold", true, 1000);
	//Wealthy collector is looking for gold coins. Cash offer of $1000 for each coin. Everyone may sell any number of coins at this price.
	private static MarketCard Gold3 = new MarketCard("Price of Gold Soars", "gold", true, 1000);
	//Rioting Overseas. Oil prices threatened. Price of gold skyrockets. Buyer offers $1000 cash for each gold coin. Everyone may sell any number of coins at this price.
	private static MarketCard Gold4 = new MarketCard("Collector wants Gold Coins", "gold", true, 500);
	//Wealthy collector is looking for gold coins. Cash offer of $500 for each coin. Everyone may sell any number of coins at this price.
	//expense MarketCard - quite obviously the value is how much this expense costs
	private static MarketCard Expense1 = new MarketCard("Sewer Line Breaks", "expense", false, 1000);
	//Water is everywhere at your property! Pay $1000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.
	private static MarketCard Expense2 = new MarketCard("Sewer Line Breaks", "expense", false, 2000);
	//Water is everywhere at your property! Pay $2000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.
	private static MarketCard Expense3 = new MarketCard("Tenant Damages Your Property", "expense", false, 500);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.
	private static MarketCard Expense4 = new MarketCard("Tenant Damages Your Property", "expense", false, 500);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.
	private static MarketCard Expense5 = new MarketCard("Tenant Damages Your Property", "expense", false, 1000);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $1000(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.
	//stock MarketCard - no value necessary
	private static MarketCard Stock1 = new MarketCard("Stock - MYT4U Electronics Co.","stock",true,0);
	//MYT4U takes a gamble on new home entertainment tech. Will it hit big or be the next Beta-Max? MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns MYT4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns MYT4U loses half their shares.
	private static MarketCard Stock2 = new MarketCard("Stock - GRO4US Fund","stock",true,0);
	//The market is in flux and there will be monumental market swings over the next few months. How will mutual funds fair in this time of change? MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns GRO4US DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns GRO4US loses half their shares.	
	private static MarketCard Stock3 = new MarketCard("Stock - ON2U Entertainment Co.","stock",true,0);
	//Studio backs fresh director for its summer blockbuster. Groundbreaking production could be too ambitious. MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns ON2U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns ON2U loses half their shares.
	private static MarketCard Stock4 = new MarketCard("Stock - OK4U Drug Co.","stock",true,0);
	//OK4U begins trial on possible life-saving drug. Side effects are untested. Could change the world... if it works. MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns OK4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns OK4U loses half their shares.
	//repercent - how much percentage selling your property would yield you (aka if it's current cost + 10%, you'd yield 110% of the original cost in the sale minus what you owe
	private static MarketCard REPercent1 = new MarketCard("House Buyer - 3BR/2BA","repercent",true,110);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent2 = new MarketCard("House Buyer - 2BR/1BA","repercent",true,110);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent3 = new MarketCard("House Buyer - 3BR/2BA","repercent",true,120);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent4 = new MarketCard("House Buyer - 2BR/1BA","repercent",true,120);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent5 = new MarketCard("House Buyer - 3BR/2BA","repercent",true,115);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent6 = new MarketCard("Plex Buyer","repercent",true,110);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent7 = new MarketCard("Plex Buyer","repercent",true,105);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 5%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent8 = new MarketCard("Plex Buyer","repercent",true,115);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REPercent9 = new MarketCard("Plex Buyer","repercent",true,120);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//refixed - value is the amount of money you get for selling property
	private static MarketCard REFixed1 = new MarketCard("House Buyer - 3BR/2BA","refixed",true,15000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed2 = new MarketCard("House Buyer - 3BR/2BA","refixed",true,1000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed3 = new MarketCard("House Buyer - 3BR/2BA","refixed",true,20000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed4 = new MarketCard("House Buyer - 3BR/2BA","refixed",true,5000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed5 = new MarketCard("Plex Buyer","refixed",true,1000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed6 = new MarketCard("Plex Buyer","refixed",true,30000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $30,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed7 = new MarketCard("Plex Buyer","refixed",true,15000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed8 = new MarketCard("Plex Buyer","refixed",true,5000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed9 = new MarketCard("Plex Buyer","refixed",true,1000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed10 = new MarketCard("Plex Buyer","refixed",true,20000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REFixed11 = new MarketCard("Plex Buyer","refixed",true,10000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//aoffer - value is amount of money you get for selling each unit
	private static MarketCard REHOffer1 = new MarketCard("House or Condo Buyer - 2BR/1BA","hoffer",true,45000);
	//You are offered $45,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REHOffer2 = new MarketCard("House or Condo Buyer - 2BR/1BA","hoffer",true,65000);
	//You are offered $65,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REAOffer1 = new MarketCard("Apartment House Buyer","aoffer",true,25000);
	//Buyer offers $25,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REAOffer2 = new MarketCard("Apartment House Buyer","aoffer",true,45000);
	//Buyer offers $45,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REAOffer3 = new MarketCard("Apartment House Buyer","aoffer",true,30000);
	//REIT offers $30,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	private static MarketCard REAOffer4 = new MarketCard("Apartment House Buyer","aoffer",true,40000);
	//REIT offers $40,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	
	public MarketStack()
	{
		MarketCard[] MarketCardArray = {Profit1, Profit2, 
										Gold1, Gold2, Gold3, Gold4, 
										Expense1, Expense2, Expense3, Expense4, Expense5,
										Stock1, Stock2, Stock3, Stock4,
										REPercent1, REPercent2, REPercent3, REPercent4, REPercent5, REPercent6, REPercent7, REPercent8, REPercent9,
										REFixed1, REFixed2, REFixed3, REFixed4, REFixed5, REFixed6, REFixed7, REFixed8, REFixed9, REFixed10, REFixed11,
										REHOffer1, REHOffer2,
										REAOffer1, REAOffer2, REAOffer3, REAOffer4};
		super.randomizeCards(MarketCardArray);
	}

	//profit MarketCard - value is how much $ is added

	/* 
	 * Write a method below that evaluates what the MarketCard type is + who it effects and performs operations based on that and yeah stuff
	 * Then put them all into a stack so they can be used in game!
	 */
	
	/* Need a decision function
	 *Need separate functionalities (if statements) based on MarketCard type
	 * Need a way that every player who is affected gets the decision option
	 * Do we check if they have the proper real estate needed? Or do we assume the player knows and obviously make it so they can't sell something they don't have
	*/

	
}

