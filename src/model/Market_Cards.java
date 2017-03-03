package model;
/* 
 * hi im very forgetful so my code is usually full of comments when its not finished sorry
 * 
 */
public class MarketCardStack extends Card {

	public Market_Cards(String title, String type, Boolean effect, int value, int value2, int value3, int value4) {
		super(title, type, effect, value, value2, value3, value4);
		// TODO Auto-generated constructor stub
	}

	//profit card - value is how much $ is added
	//Not sure how we're working in the descriptions as it's a more graphical concept but for now I'm going to type them out
	Card Profit1 = new Card("Small Business Boom!", "profit", true, 250,0,0,0);
	//The downtown economy has exploded! EVERYONE is affected! ALL businesses with a cash flow of $1000 or less have their cash flow increased by $250
	Card Profit2 = new Card("New Management System", "profit", false, 400,0,0,0);
	// A new management system creates new efficiencies and lowers costs. Only the person who drew this card is affected.
	//gold card - value is $ per coin
	Card Gold1 = new Card("Price of Gold Soars", "gold", true, 2000,0,0,0);
	// The Central Bank is printing money in an attempt to boost the economy causing massive inflation. The price of gold skyrockets. Buyer offers $2000 for each gold coin. Everyone may sell any number of coins at this price.
	Card Gold2 = new Card("Collector wants Gold Coins", "gold", true, 1000,0,0,0);
	//Wealthy collector is looking for gold coins. Cash offer of $1000 for each coin. Everyone may sell any number of coins at this price.
	Card Gold3 = new Card("Price of Gold Soars", "gold", true, 1000,0,0,0);
	//Rioting Overseas. Oil prices threatened. Price of gold skyrockets. Buyer offers $1000 cash for each gold coin. Everyone may sell any number of coins at this price.
	Card Gold4 = new Card("Collector wants Gold Coins", "gold", true, 500,0,0,0);
	//Wealthy collector is looking for gold coins. Cash offer of $500 for each coin. Everyone may sell any number of coins at this price.
	//expense card - quite obviously the value is how much this expense costs
	Card Expense1 = new Card("Sewer Line Breaks", "expense", false, 1000,0,0,0);
	//Water is everywhere at your property! Pay $1000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Card Expense2 = new Card("Sewer Line Breaks", "expense", false, 2000,0,0,0);
	//Water is everywhere at your property! Pay $2000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Card Expense3 = new Card("Tenant Damages Your Property", "expense", false, 500,0,0,0);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Card Expense4 = new Card("Tenant Damages Your Property", "expense", false, 500,0,0,0);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	Card Expense5 = new Card("Tenant Damages Your Property", "expense", false, 1000,0,0,0);
	//Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $1000(one time). Take out a bank loan if necessary to cover these expenses. Card applies only to the person who drew it. If you own NO real estate, ignore this card.
	//stock card - no value necessary
	Card Stock1 = new Card("Stock - MYT4U Electronics Co.","stock",true,0,0,0,0);
	//MYT4U takes a gamble on new home entertainment tech. Will it hit big or be the next Beta-Max? Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns MYT4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns MYT4U loses half their shares.
	Card Stock2 = new Card("Stock - GRO4US Fund","stock",true,0,0,0,0);
	//The market is in flux and there will be monumental market swings over the next few months. How will mutual funds fair in this time of change? Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns GRO4US DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns GRO4US loses half their shares.	
	Card Stock3 = new Card("Stock - ON2U Entertainment Co.","stock",true,0,0,0,0);
	//Studio backs fresh director for its summer blockbuster. Groundbreaking production could be too ambitious. Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns ON2U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns ON2U loses half their shares.
	Card Stock4 = new Card("Stock - OK4U Drug Co.","stock",true,0,0,0,0);
	//OK4U begins trial on possible life-saving drug. Side effects are untested. Could change the world... if it works. Cardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns OK4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns OK4U loses half their shares.
	//repercent - how much percentage selling your property would yield you (aka if it's current cost + 10%, you'd yield 110% of the original cost in the sale minus what you owe
	Card REPercent1 = new Card("House Buyer - 3BR/2BA","repercent",true,110,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent2 = new Card("House Buyer - 2BR/1BA","repercent",true,110,0,0,0);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent3 = new Card("House Buyer - 3BR/2BA","repercent",true,120,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent4 = new Card("House Buyer - 2BR/1BA","repercent",true,120,0,0,0);
	//Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent5 = new Card("House Buyer - 3BR/2BA","repercent",true,115,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent6 = new Card("Plex Buyer","repercent",true,110,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent7 = new Card("Plex Buyer","repercent",true,105,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 5%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent8 = new Card("Plex Buyer","repercent",true,115,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REPercent9 = new Card("Plex Buyer","repercent",true,120,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//refixed - value is the amount of money you get for selling property
	Card REFixed1 = new Card("House Buyer - 3BR/2BA","refixed",true,15000,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed2 = new Card("House Buyer - 3BR/2BA","refixed",true,1000,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed3 = new Card("House Buyer - 3BR/2BA","refixed",true,20000,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed4 = new Card("House Buyer - 3BR/2BA","refixed",true,5000,0,0,0);
	//Buyer searching for 3Br/2Ba house. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REHOffer1 = new Card("House or Condo Buyer - 2BR/1BA","hoffer",true,45000,0,0,0);
	//You are offered $45,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REHOffer2 = new Card("House or Condo Buyer - 2BR/1BA","hoffer",true,65000,0,0,0);
	//You are offered $65,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed5 = new Card("Plex Buyer","refixed",true,1000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed6 = new Card("Plex Buyer","refixed",true,30000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $30,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed7 = new Card("Plex Buyer","refixed",true,15000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed8 = new Card("Plex Buyer","refixed",true,5000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed9 = new Card("Plex Buyer","refixed",true,1000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed10 = new Card("Plex Buyer","refixed",true,20000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REFixed11 = new Card("Plex Buyer","refixed",true,10000,0,0,0);
	//Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	//aoffer - value is amount of money you get for selling each unit
	Card REAOffer1 = new Card("Apartment House Buyer","aoffer",true,25000,0,0,0);
	//Buyer offers $25,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REAOffer2 = new Card("Apartment House Buyer","aoffer",true,45000,0,0,0);
	//Buyer offers $45,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REAOffer3 = new Card("Apartment House Buyer","aoffer",true,30000,0,0,0);
	//REIT offers $30,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	Card REAOffer4 = new Card("Apartment House Buyer","aoffer",true,40000,0,0,0);
	//REIT offers $40,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.
	
	/* 
	 * Write a method below that evaluates what the card type is + who it effects and performs operations based on that and yeah stuff
	 * Then put them all into a stack so they can be used in game!
	 * ldasjkfdasjf;lads
	 */
	public static void main(String[] args) {
		/* Need a decision function
		 *Need separate functionalities (if statements) based on card type
		 * Need a way that every player who is affected gets the decision option
		 * Do we check if they have the proper real estate needed? Or do we assume the player knows and obviously make it so they can't sell something they don't have
		*/
	}
	
}

