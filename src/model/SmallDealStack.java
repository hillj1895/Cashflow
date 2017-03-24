package model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SmallDealStack extends CardStack
{
	private static DealCard SD01 = new DealCard("",
									"",
									, , , );
	private static DealCard SD02 = new DealCard("",
									"",
									, , , );
	private static DealCard SD03 = new DealCard("",
									"",
									, , , );
	private static DealCard SD04 = new DealCard("",
									"",
									, , , );
	private static DealCard SD05 = new DealCard("",
									"",
									, , , );
	private static DealCard SD06 = new DealCard("",
									"",
									, , , );
	private static DealCard SD07 = new DealCard("",
									"",
									, , , );
	private static DealCard SD08 = new DealCard("",
									"",
									, , , );
	private static DealCard SD09 = new DealCard("",
									"",
									, , , );
	private static DealCard SD10 = new DealCard("",
									"",
									, , , );
	private static DealCard SD11 = new DealCard("",
									"",
									, , , );
	private static DealCard SD12 = new DealCard("",
									"",
									, , , );
	private static DealCard SD13 = new DealCard("",
									"",
									, , , );
	private static DealCard SD14 = new DealCard("",
									"",
									, , , );
	private static DealCard SD15 = new DealCard("",
									"",
									, , , );
	private static DealCard SD16 = new DealCard("",
									"",
									, , , );
	private static DealCard SD17 = new DealCard("",
									"",
									, , , );
	private static DealCard SD18 = new DealCard("",
									"",
									, , , );
	private static DealCard SD19 = new DealCard("",
									"",
									, , , );
	private static DealCard SD20 = new DealCard("",
									"",
									, , , );
	private static DealCard SD21 = new DealCard("",
									"",
									, , , );
	private static DealCard SD22 = new DealCard("",
									"",
									, , , );
	private static DealCard SD23 = new DealCard("",
									"",
									, , , );
	private static DealCard SD24 = new DealCard("",
									"",
									, , , );
	private static DealCard SD25 = new DealCard("",
									"",
									, , , );
	private static DealCard SD26 = new DealCard("",
									"",
									, , , );
	private static DealCard SD27 = new DealCard("",
									"",
									, , , );
	private static DealCard SD28 = new DealCard("",
									"",
									, , , );
	private static DealCard SD29 = new DealCard("",
									"",
									, , , );
	private static DealCard SD30 = new DealCard("",
									"",
									, , , );
	private static DealCard SD31 = new DealCard("",
									"",
									, , , );
	private static DealCard SD32 = new DealCard("",
									"",
									, , , );
	private static DealCard SD33 = new DealCard("",
									"",
									, , );
	private static DealCard SD34 = new DealCard("",
									"",
									, , , );
	private static DealCard SD35 = new DealCard("",
									"",
									, , , );
	private static DealCard SD36 = new DealCard("",
									"",
									, , , );
	private static DealCard SD37 = new DealCard("",
									"",
									, , , );
	private static DealCard SD38 = new DealCard("",
									"",
									, , , );
	private Stack<DealCard> _bigDealStack;		
	
	public SmallDealStack()
	{
		DealCard[] sdArray = {SD01, SD02, SD03, SD04, SD05, SD06, SD07, SD08, SD09, SD10, 
				  SD11, SD12, SD13, SD14, SD15, SD16, SD17, SD18, SD19, SD20, 
				  SD21, SD22, SD23, SD24, SD25, SD26, SD27, SD28, SD29, SD30, 
				  SD31, SD32, SD33, SD34, SD35, SD36, SD37, SD38};
		super.randomizeCards(sdArray);
		List<DealCard> list = Arrays.asList(sdCardArray);
		Stack<DealCard> SDCardStack = new Stack<DealCard>();
		SDCardStack.addAll(list);
			
		_bigDealStack = SDCardStack; 
	}

	
}

