package controller;

import view.*;
import model.*;

public class Cashflow
{
	public static void main(String[] args)
	{
		DoodadStack ds = new DoodadStack();
		
		int initialSize = ds.getStack().getSize();
		for(int i=0; i<initialSize; i++)
		{
			int num = i+1;
			System.out.println(num + ": " + ds.getStack().pop().getTitle());
		}
		
	}
}
