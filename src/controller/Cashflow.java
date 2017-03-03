package controller;

import view.*;
import model.*;

public class Cashflow
{
	public static void main(String[] args)
	{
		BigDealStack bds = new BigDealStack();
		
		int initialSize = bds.getSize();
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + bds.pop().getTitle());
		}
	}
}
