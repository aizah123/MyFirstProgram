package practice20;

import java.io.PrintStream;

public class LearnCasting {
	
	static int number = 24;
	static double salary = 5400.35;
	
	
		 int rent = 2100;
		 double mayRent= rent;
		 float aprilRent = (float) mayRent;
		
	
	public static void main(String[] args) {
		float num = LearnCasting.number;
		int newSalary = (int) LearnCasting.salary;
		LearnCasting pp = new LearnCasting();
		 
		System.out.println(LearnCasting.number);
		System.out.println(num);
		System.out.println(newSalary);
		System.out.println(pp.mayRent);
	
		
	}

}
