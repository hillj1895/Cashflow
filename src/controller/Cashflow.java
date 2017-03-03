package controller;

import view.*;
import model.*;

public class Cashflow
{
	public static void main(String[] args)
	{
		MarketStack ms = new MarketStack();
		
		int initialSize = ms.getSize();
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + ms.pop().getTitle());
		}
	}
}
