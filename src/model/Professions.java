package model;

import java.util.*;

public class Professions
{
	Profession Nurse = new Profession("Nurse", 3100, 600, 400, 100, 100, 200, 600, 0, 0, 200, 500, 47000, 6000, 5000, 4000);
	
	Profession Teacher = new Profession("Teacher", 3300, 500, 500, 100, 100, 200, 700, 0, 0, 
			200, 400, 50000, 12000, 5000, 4000);
	
	Profession TruckDriver = new Profession("TruckDriver", 2500, 500, 400, 0, 100, 100, 600, 
			0, 0, 200, 800, 38000, 0, 4000, 3000);
	
	Profession Secretary = new Profession("Secretary", 2500, 500, 400, 0, 100, 100, 600, 0, 0,
			100, 700, 38000, 0, 4000, 3000);
	
	Profession Engineer = new Profession("Engineer", 4900, 1000, 700, 100, 200, 200, 1000, 0, 0, 
			200, 400, 75000, 12000, 7000, 5000);
	
	Profession BusinessManager = new Profession("BusinessManager", 4600, 900, 700, 100, 100, 200, 
			1000, 0, 0, 300, 400, 75000, 12000, 6000, 4000);
	
	Profession AirlinePilot = new Profession("AirlinePilot", 9500, 2000, 1000, 0, 300, 700, 2000,
			0, 0, 400, 2500, 90000, 0, 15000, 22000);
	
	Profession Lawyer = new Profession("Lawyer", 7500, 1800, 1100, 300, 200, 200, 1500, 0, 0, 400, 
			2000, 115000, 78000, 11000, 7000);
	
	Profession PoliceOfficer = new Profession("PoliceOfficer", 3000, 600, 400, 0, 100, 100, 700, 0, 0,
			200, 500, 46000, 0, 5000, 3000);
	
	Profession Doctor = new Profession("Doctor", 13200, 3200, 1900, 700, 300, 200, 2000, 0, 0, 700, 
			3500, 202000, 150000, 19000, 10000);
	
	Profession Mechanic = new Profession("Mechanic", 2000, 400, 300, 0, 100, 100, 400, 0, 0, 100,
			700, 31000, 0, 3000, 3000);
	
	Profession Janitor = new Profession("Janitor", 1600, 300, 200, 0, 100, 100, 300, 0, 0, 100,
			600, 20000, 0, 4000, 3000);
	

	Profession[] profs = {Nurse, Teacher, TruckDriver, Secretary, Engineer, BusinessManager, 
	                      AirlinePilot, Lawyer, PoliceOfficer, Doctor, Mechanic, Janitor};	
	
	public Profession playerProf;
	
	public Professions() {}
	
	
	
	public Profession getProfession()
	{
		Random rand = new Random();
		int n = rand.nextInt(11);
		return profs[n];
	}
	
	public static void main String(args[])
	{
		
	}
	
}