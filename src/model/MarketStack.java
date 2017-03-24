package model;
import java.util.Arrays;
import java.util.Stack;
import java.util.List;

public class MarketStack extends CardStack
{
	//Not sure how we're working in the descriptions as it's a more graphical concept but for now I'm going to type them out
/*
	private static MarketCard Profit1 = new MarketCard("Small Business Boom!",
										"The downtown economy has exploded! EVERYONE is affected! ALL businesses with a cash flow of $1000 or less have their cash flow increased by $250", 
										"profit", true, 250, "");
	private static MarketCard Profit2 = new MarketCard("New Management System", 
										"A new management system creates new efficiencies and lowers costs. Only the person who drew this MarketCard is affected.",
										"profit", false, 400, "");
	*/
	//gold MarketCard - value is $ per coin
//	private static MarketCard Gold1 = new MarketCard("Price of Gold Soars", 
//										"The Central Bank is printing money in an attempt to boost the economy causing massive inflation. The price of gold skyrockets. Buyer offers $2000 for each gold coin. Everyone may sell any number of coins at this price.",
//										"gold", true, 2000);
//	private static MarketCard Gold2 = new MarketCard("Collector wants Gold Coins", 
//										"Wealthy collector is looking for gold coins. Cash offer of $1000 for each coin. Everyone may sell any number of coins at this price.",
//										"gold", true, 1000);
//	private static MarketCard Gold3 = new MarketCard("Price of Gold Soars", 
//										"Rioting Overseas. Oil prices threatened. Price of gold skyrockets. Buyer offers $1000 cash for each gold coin. Everyone may sell any number of coins at this price.",
//										"gold", true, 1000);
//	private static MarketCard Gold4 = new MarketCard("Collector wants Gold Coins", 
//										"Wealthy collector is looking for gold coins. Cash offer of $500 for each coin. Everyone may sell any number of coins at this price.",
//										"gold", true, 500);
	
	//expense MarketCard - quite obviously the value is how much this expense costs
	private static MarketCard Expense1 = new MarketCard("Sewer Line Breaks", 
										"Water is everywhere at your property! Pay $1000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.",
										"expense",  1000, "");
	private static MarketCard Expense2 = new MarketCard("Sewer Line Breaks", 
										"Water is everywhere at your property! Pay $2000 for a new sewer line (one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.",
										"expense", 2000, "");
	private static MarketCard Expense3 = new MarketCard("Tenant Damages Your Property", 
										"Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.",
										"expense", 500, "");
	private static MarketCard Expense4 = new MarketCard("Tenant Damages Your Property", 
										"Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $500(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.",
										"expense", 500, "");
	private static MarketCard Expense5 = new MarketCard("Tenant Damages Your Property", 
										"Tenant refuses to pay rent. After the tenant has been evicted, you discover significant damage to your property. Insurance covers most repairs, but you still must pay $1000(one time). Take out a bank loan if necessary to cover these expenses. MarketCard applies only to the person who drew it. If you own NO real estate, ignore this MarketCard.",
										"expense", 1000 ,"");
	
	//stock MarketCard - no value necessary
	//private static MarketCard Stock1 = new MarketCard("Stock - MYT4U Electronics Co.", 
	//									"MYT4U takes a gamble on new home entertainment tech. Will it hit big or be the next Beta-Max? MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns MYT4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns MYT4U loses half their shares.",
	//									"stock",true,0, "MYT4U");
	//private static MarketCard Stock2 = new MarketCard("Stock - GRO4US Fund", 
	//									"The market is in flux and there will be monumental market swings over the next few months. How will mutual funds fair in this time of change? MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns GRO4US DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns GRO4US loses half their shares.",
	//									"stock",true,0, "GRO4US");
	//private static MarketCard Stock3 = new MarketCard("Stock - ON2U Entertainment Co.", 
	//									"Studio backs fresh director for its summer blockbuster. Groundbreaking production could be too ambitious. MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns ON2U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns ON2U loses half their shares.",
	//									"stock",true,0, "ON2U");
	//private static MarketCard Stock4 = new MarketCard("Stock - OK4U Drug Co.", 
	//									"OK4U begins trial on possible life-saving drug. Side effects are untested. Could change the world... if it works. MarketCardholder Rolls 1 Die. Die = 1-3, STOCK SPLITS! Everyone who owns OK4U DOUBLES their number of shares. Die 4-6, STOCK REVERSE SPLITS! Everyone who owns OK4U loses half their shares.",
	//									"stock",true,0,"OK4U");
	
	//repercent - how much percentage selling your property would yield you (aka if it's current cost + 10%, you'd yield 110% of the original cost in the sale minus what you owe
	private static MarketCard REPercent1 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",110,"3Br2Ba");
	private static MarketCard REPercent2 = new MarketCard("House Buyer - 2BR/1BA", 
										"Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",110,"2Br1Ba");
	private static MarketCard REPercent3 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",120,"3Br2Ba");
	private static MarketCard REPercent4 = new MarketCard("House Buyer - 2BR/1BA", 
										"Buyer looking to aquire 2Br/1Ba rentals. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",120,"2Br1Ba");
	private static MarketCard REPercent5 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",115,"3Br2Ba");
	private static MarketCard REPercent6 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 10%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",110,"plex");
	private static MarketCard REPercent7 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 5%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",105,"plex");
	private static MarketCard REPercent8 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 15%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",115,"plex");
	private static MarketCard REPercent9 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus 20%. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"repercent",120,"plex");
	
	//refixed - value is the amount of money you get for selling property
	private static MarketCard REFixed1 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",15000,"3Br2Ba");
	private static MarketCard REFixed2 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",10000,"3Br2Ba");
	private static MarketCard REFixed3 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",20000,"3Br2Ba");
	private static MarketCard REFixed4 = new MarketCard("House Buyer - 3BR/2BA", 
										"Buyer searching for 3Br/2Ba house. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",5000,"3Br2Ba");
	private static MarketCard REFixed5 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",1000,"plex");
	private static MarketCard REFixed6 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $30,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",30000,"plex");
	private static MarketCard REFixed7 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $15,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",15000,"plex");
	private static MarketCard REFixed8 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $5,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",5000,"Plex");
	private static MarketCard REFixed9 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $1,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",1000,"Plex");
	private static MarketCard REFixed10 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $20,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",20000,"Plex");
	private static MarketCard REFixed11 = new MarketCard("Plex Buyer", 
										"Buyer looking for all Apartment and Plexes in any combination of units. Offers your original cost plus $10,000. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"refixed",10000,"Plex");
	
	//aoffer - value is amount of money you get for selling each unit
	private static MarketCard REHOffer1 = new MarketCard("House or Condo Buyer - 2BR/1BA", 
										"You are offered $45,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"hoffer",45000,"2Br1Ba");
	private static MarketCard REHOffer2 = new MarketCard("House or Condo Buyer - 2BR/1BA", 
										"You are offered $65,000 for a 2Br/1Ba House or Condo. Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"hoffer",65000,"2Br1Ba");
	private static MarketCard REAOffer1 = new MarketCard("Apartment House Buyer", 
										"Buyer offers $25,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"aoffer",25000,"Plex");
	private static MarketCard REAOffer2 = new MarketCard("Apartment House Buyer", 
										"Buyer offers $45,000 per unit for all units in apartment houses of any size. (His 1031 tax-deferred exchange time is running out.) Buyer has their own financing. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"aoffer",45000,"Plex");
	private static MarketCard REAOffer3 = new MarketCard("Apartment House Buyer", 
										"REIT offers $30,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"aoffer",30000,"Plex");
	private static MarketCard REAOffer4 = new MarketCard("Apartment House Buyer", 
										"REIT offers $40,000 per unit for all units in apartment houses of 12 units or more. Buyer has capital from the sale of another apartment complex. Everyone may sell any number of properties at this price. If you sell, pay off the related mortgage and give up the cash flow on this property.",
										"aoffer",40000,"Plex");
	private Stack<MarketCard> _marketCardStack; 
	
	public MarketStack()
	{	
		
		MarketCard[] marketCardArray = {//Profit1, Profit2,
										//Gold1, Gold2, Gold3, Gold4, 
										Expense1, Expense2, Expense3, Expense4, Expense5,
										//Stock1, Stock2, Stock3, Stock4,
										REPercent1, REPercent2, REPercent3, REPercent4, REPercent5, REPercent6, REPercent7, REPercent8, REPercent9,
										REFixed1, REFixed2, REFixed3, REFixed4, REFixed5, REFixed6, REFixed7, REFixed8, REFixed9, REFixed10, REFixed11,
										REHOffer1, REHOffer2,
										REAOffer1, REAOffer2, REAOffer3, REAOffer4};
		randomizeCards(marketCardArray);
		List<MarketCard> list = Arrays.asList(marketCardArray);
		Stack<MarketCard> MarketCardStack = new Stack<MarketCard>();
		MarketCardStack.addAll(list);
			
		_marketCardStack = MarketCardStack; 
	}

	//profit MarketCard - value is how much $ is added
	
	/*
	 * 
	 *
	 * 
	 */
	private static MarketCard currentcard = new MarketCard(null, null, null, 1, null);
	
	public void Action(Player player){
		currentcard = _marketCardStack.pop();
		currentcard.display(); //will be a method in MarketCard to display the GUI for the card
		if (currentcard.getType() == "expense"){
			//This needs to ONLY ACCESS the financial statement of the current player
				if (FinancialStatement.assets <= currentcard.getValue()){
					FinancialStatement.assets = 0;
				}
				else {
					FinancialStatement.assets -= currentcard.getValue();
				}
				
		}}}
	// i cant do anything other than expenses until financial statement is done :) 
		
	/*	else if (currentcard.getType() == "repercent"){
				// they all affect everyone
				for i in players {
					if i.finacialstatement.properties contains currentcard.getAddit(){
						// ask player if they'd like to sell
					}
				}
				
		}
		else if (currentcard.getType() == "refixed"){
				// they all affect everyone
				for i in players {
					if i.finacialstatement.properties contains currentcard.getAddit(){
						// ask player if they'd like to sell
					}
				}
		}
		else if currentcard.getType() == "REHOffer2"{
				// they all affect everyone
				for i in players {
					if i.finacialstatement.properties contains currentcard.getAddit(){
						// ask player if they'd like to sell
					}
				}
	}
	
	/* Need a decision function
	 *Need separate functionalities (if statements) based on MarketCard type
	 * Need a way that every player who is affected gets the decision option
	 * Do we check if they have the proper real estate needed? Or do we assume the player knows and obviously make it so they can't sell something they don't have
	*/

	


