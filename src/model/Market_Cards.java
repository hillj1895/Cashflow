/* 
 * this is just a marketcard class
 * i haven't added the method or the stack yet
 * not much to see here
 * carry on
 */
public class Market_Cards extends Market_Card {
	private static final Boolean True = null;
	private static final Boolean False = null;
	//profit card - value is how much $ is added
	//Not sure how we're working in the descriptions as it's a more graphical concept but for now I'm going to type them out
	Market_Card Profit1 = new Market_Card("Small Business Boom!", "profit", True, 250);
	//The downtown economy has exploded! EVERYONE is affected! ALL businesses with a cash flow of $1000 or less have their cash flow increased by $250
	Market_Card Profit2 = new Market_Card("New Management System", "profit", False, 400);
	// A new management system creates new efficiencies and lowers costs. Only the person who drew this card is affected.
	//gold card - value is $ per coin
	Market_Card Gold1 = new Market_Card("Price of Gold Soars", "gold", True, 2000);
	// The Central Bank is printing money in an attempt to boost the economy causing massive inflation. The price of gold skyrockets. Buyer offers $2000 for each gold coin. Everyone may sell any number of coins at this price.
	Market_Card Gold2 = new Market_Card("Collector wants Gold Coins", "gold", True, 1000);
	//Wealthy collector is looking for gold coins. Cash offer of $1000 for each coin. Everyone may sell any number of coins at this price.
	Market_Card Gold3 = new Market_Card("Price of Gold Soars", "gold", True, 1000);
	//Rioting Overseas. Oil prices threatened. Price of gold skyrockets. Buyer offers $1000 cash for each gold coin. Everyone may sell any number of coins at this price.
	Market_Card Gold4 = new Market_Card("Collector wants Gold Coins", "gold", True, 500);
	//Wealthy collector is looking for gold coins. Cash offer of $500 for each coin. Everyone may sell any number of coins at this price.
	//expense card - quite obviously the value is how much this expense costs
	Market_Card Expense1 = new Market_Card("Sewer Line Breaks", "expense", False, 1000);
	//Water is everywhere at your property! Pay $1000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Market_Card Expense2 = new Market_Card("Sewer Line Breaks", "expense", False, 2000);
	//Water is everywhere at your property! Pay $2000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Market_Card Expense3 = new Market_Card("Tenant Damages Your Property", "expense", False, 500);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Market_Card Expense4 = new Market_Card("Tenant Damages Your Property", "expense", False, 500);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Market_Card Expense5 = new Market_Card("Tenant Damages Your Property", "expense", False, 1000;
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $1000(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	//stock card - no value necessary
	Market_Card Stock1 = new Market_Card("Stock - MYT4U Electronics Co.","stock",True,0);
	//MYT4U takes a gamble on new home entertainment tech. Will it hit big or be the next Beta-Max? Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns MYT4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns MYT4U loses half their shares.
	Market_Card Stock2 = new Market_Card("Stock - GRO4US Fund","stock",True,0);
	//The market is in flux and there will be monumental market swings over the next few months. How will mutual funds fair in this time of change? Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns GRO4US DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns GRO4US loses half their shares.	
	Market_Card Stock3 = new Market_Card("Stock - ON2U Entertainment Co.","stock",True,0);
	//Studio backs fresh director for its summer blockbuster. Groundbreaking production could be too ambitious. Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns ON2U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns ON2U loses half their shares.
	Market_Card Stock4 = new Market_Card("Stock - OK4U Drug Co.","stock",True,0);
	//OK4U begins trial on possible life-saving drug. Side effects are untested. Could change the world... if it works. Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns OK4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns OK4U loses half their shares.
	//repercent - how much percentage selling your property would yield you (aka if it's current cost + 10%, you'd yield 110% of the original cost in the sale minus what you owe
	Market_Card REPercent1 = new Market_Card("House Buyer - 3BR/2BA","repercent",True,110);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent2 = new Market_Card("House Buyer - 2BR/1BA","repercent",True,110);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent3 = new Market_Card("House Buyer - 3BR/2BA","repercent",True,120);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent4 = new Market_Card("House Buyer - 2BR/1BA","repercent",True,120);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent5 = new Market_Card("House Buyer - 3BR/2BA","repercent",True,115);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent6 = new Market_Card("Plex Buyer","repercent",True,110);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent7 = new Market_Card("Plex Buyer","repercent",True,105);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 5%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent8 = new Market_Card("Plex Buyer","repercent",True,115);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REPercent9 = new Market_Card("Plex Buyer","repercent",True,120);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//refixed - value is the amount of money you get for selling property
	Market_Card REFixed1 = new Market_Card("House Buyer - 3BR/2BA","refixed",True,15000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed2 = new Market_Card("House Buyer - 3BR/2BA","refixed",True,1000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed3 = new Market_Card("House Buyer - 3BR/2BA","refixed",True,20000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed4 = new Market_Card("House Buyer - 3BR/2BA","refixed",True,5000);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REHOffer1 = new Market_Card("House or Condo Buyer - 2BR/1BA","hoffer",True,45000);
	//You are offered $45,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REHOffer2 = new Market_Card("House or Condo Buyer - 2BR/1BA","hoffer",True,65000);
	//You are offered $65,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed5 = new Market_Card("Plex Buyer","refixed",True,1000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed6 = new Market_Card("Plex Buyer","refixed",True,30000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $30,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed7 = new Market_Card("Plex Buyer","refixed",True,15000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed8 = new Market_Card("Plex Buyer","refixed",True,5000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed9 = new Market_Card("Plex Buyer","refixed",True,1000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed10 = new Market_Card("Plex Buyer","refixed",True,20000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REFixed11 = new Market_Card("Plex Buyer","refixed",True,10000);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//aoffer - value is amount of money you get for selling each unit
	Market_Card REAOffer1 = new Market_Card("Apartment House Buyer","aoffer",True,25000);
	//Buyer offers $25,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REAOffer2 = new Market_Card("Apartment House Buyer","aoffer",True,45000);
	//Buyer offers $45,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REAOffer3 = new Market_Card("Apartment House Buyer","aoffer",True,30000);
	//REIT offers $30,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Market_Card REAOffer4 = new Market_Card("Apartment House Buyer","aoffer",True,40000);
	//REIT offers $40,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	
	/* 
	 * Write a method below that evaluates what the card type is + who it effects and performs operations based on that and yeah stuff
	 * Then put them all into a stack so they can be used in game!
	 * 
	 */
	public static void main(String[] args) {
	
	}
	
}

