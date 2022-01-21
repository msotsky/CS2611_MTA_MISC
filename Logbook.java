//package lab1;
/* 
 * @author Max Sotsky, Mitchell MacDonald, Hyeokju(Justin) Chae
 * @date sept 15 2020
 * @title lab 1
 * 
 */
/*
1January - 31 days
2February - 28 days in a common year and 29 days in leap years
3March - 31 days
4April - 30 days
5May - 31 days
6June - 30 days
7July - 31 days
8August - 31 days
9September - 30 days
10October - 31 days
11November - 30 days
12December - 31 days
*/

import java.io.*; 
import java.util.*;

//import javax.lang.model.util.ElementScanner6;

public class Logbook {

	// Instance variables
	private int logMonth,logYear;
	private int[] entry = new int[31];
	private GregorianCalendar logCalendar;
	
	// Constructor
	public Logbook ( int month, int year ) {
		// pre: month is a valid calendar month between 1 and 12 inclusive
		// post: creates an empty logbook for the specified month, 
		//       i.e., a logbook in which all  entries are zero,
		//       if month is an invalid value, default to today's date
		if (month >= 1 && month <= 12)
			this.logMonth = month;
		else
			this.logMonth = getMonth() +1;
		this.logYear = year;
		if (this.logMonth == 2)
		{
			//if(isLeapYear())
			if(this.logYear % 4 == 0)
				entry = new int[29];
			else
				entry = new int[28];
											// <--- This wasn't working for some reason
											//		and the TA's were not available
			//else
				//entry = new int[28];
		}
		else if(this.logMonth == 1 || this.logMonth == 3 || this.logMonth == 5 || this.logMonth == 7 || this.logMonth == 12)
			entry = new int[31];
		else
			entry = new int[30];
	}
	
	// Logbook marking operations/methods 
	public void putEntry ( int day, int value ) {
		// pre: day is less than or equal to the number of days in the logbook month
		// post: stores the value as the logbook entry for the specified day
		if (day <= this.entry.length)
			this.entry[day -1] = value;

	}
	
	public int getEntry ( int day ){
		// pre: day is less than or equal to the number of days in the logbook month
		// post: returns the logbook entry for the specified day or -1 if there is no 
		//       such day
		if (day <= this.entry.length)
			return this.entry[day -1];
		else
			return -1;
	}
	
	// General operations/methods 
	public int getMonth ( ) {
		// post: returns the logbook month
		return logMonth;
	} 
	
	public int getYear ( ) {
		// post: returns the logbook year

		//return logYear;
		return logYear;
	} 
	
	public int getDaysInMonth ( ) {
		// post: returns the number of days in the logbook month
		return this.entry.length;	
	}
	
	// Helper method 

	/*
January - 31 days
February - 28 days in a common year and 29 days in leap years
March - 31 days
April - 30 days
May - 31 days
June - 30 days
July - 31 days
August - 31 days
September - 30 days
October - 31 days
November - 30 days
December - 31 days
*/
	private boolean isLeapYear() {
		return (logCalendar.isLeapYear(logYear));
	}
	

}
