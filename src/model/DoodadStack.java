package model;

import java.util.*;

public class DoodadStack extends CardStack
{
	private static DoodadCard D01 = new DoodadCard("New Tennis Racket", 200);
	private static DoodadCard D02 = new DoodadCard("Food Processor",200);
	private static DoodadCard D03 = new DoodadCard("Birthday Party for You Child", 500); //if you have a child 
	private static DoodadCard D04 = new DoodadCard("Next-Gen Game Console", 600);
	private static DoodadCard D05 = new DoodadCard("First Car for Child (Take out a loan if you must)", 5000); //if you have a child 
	private static DoodadCard D06 = new DoodadCard("Jet Ski (Take out a loan if you must)", 3000);
	private static DoodadCard D07 = new DoodadCard("New Tailored Suit", 1000);
	private static DoodadCard D08 = new DoodadCard("New Rims for Your DoodadCard (Take outa  loan if you must)", 2000);
	private static DoodadCard D09 = new DoodadCard("New Car Stereo", 700);
	private static DoodadCard D10 = new DoodadCard("Go to Casino", 800);
	private static DoodadCard D11 = new DoodadCard("New Easy Chair", 500);
	private static DoodadCard D12 = new DoodadCard("Cappuccino Machine", 300);
	private static DoodadCard D13 = new DoodadCard("Pay for Lunch with Friends", 200);
	private static DoodadCard D14 = new DoodadCard("New Computuer (Take out a loan if you must)", 1800);
	private static DoodadCard D15 = new DoodadCard("Golf Club Membership (Take out a loan if you must)", 2000);
	private static DoodadCard D16 = new DoodadCard("Child Needs Braces (Take out a loan if you must)", 4000); 
	//if you have a child 
	private static DoodadCard D17 = new DoodadCard("Concert Tickets", 200);
	private static DoodadCard D18 = new DoodadCard("New Watch", 200);
	private static DoodadCard D19 = new DoodadCard("New Tires", 600);
	private static DoodadCard D20 = new DoodadCard("Replace Car Air Conditioner", 700);
	private static DoodadCard D21 = new DoodadCard("Get Newest Phone", 300);
	private static DoodadCard D22 = new DoodadCard("New Sunglasses", 200);
	private static DoodadCard D23 = new DoodadCard("New Gym Clothes", 300);
	private static DoodadCard D24 = new DoodadCard("New Clothes", 1000);
	private static DoodadCard D25 = new DoodadCard("Private Tutoring for Your Child", 500); 
	//if you have a child
	private static DoodadCard D26 = new DoodadCard("Big Screen TV (Take out a loan if you must)", 2500);
	private static DoodadCard D27 = new DoodadCard("Date Night: Dinner, Concert & Dessert", 500);
	private static DoodadCard D28 = new DoodadCard("Take a Trip to Wine Country", 1000);
	private static DoodadCard D29 = new DoodadCard("Buy Local Artist's Painting", 800);
	private static DoodadCard D30 = new DoodadCard("High School Reunion", 500);
	private static DoodadCard D31 = new DoodadCard("Build a Home Gym (Take out a loan if you must)", 3000);
	private static DoodadCard D32 = new DoodadCard("New Golf Clubs", 800);
	private static DoodadCard D33 = new DoodadCard("Costume Jewlry", 400);
	private static DoodadCard D34 = new DoodadCard("Fishing Boat (Take out a loan if you must)", 5000);
	private static DoodadCard D35 = new DoodadCard("New Bowling Ball", 100);
	private static DoodadCard D36 = new DoodadCard("Repaint Your House", 600);
	private static DoodadCard D37 = new DoodadCard("New Sound System", 1500);
	private static DoodadCard D38 = new DoodadCard("Visit the Dentist (Maybe get a shiny gold tooth!)", 700);
	private static DoodadCard D39 = new DoodadCard("Help Pay for Child's Wedding", 2000);
	private static DoodadCard D40 = new DoodadCard("Family Vacation (Take out a loan if you must)", 2500);
	private static DoodadCard D41 = new DoodadCard("Remodel Kitchen (Take out a loan if you must)", 7500);
	private static DoodadCard D42 = new DoodadCard("Season Tickets", 1500);
	
	// Constructor just calls makes this stack a randomized stack with Doodad cards
	public DoodadStack()
	{
		DoodadCard[] cardArray = {D01, D02, D03, D04, D05, D06, D07, D08, D09, D10,
								  D11, D12, D13, D14, D15, D16, D17, D18, D19, D20,
								  D21, D22, D23, D24, D25, D26, D27, D28, D29, D30,
								  D31, D32, D33, D34, D35, D36, D37, D38, D39, D40, D41, D42};
		
		super.randomizeCards(cardArray);
	}

	



	

}