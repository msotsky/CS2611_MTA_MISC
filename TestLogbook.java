package lab1;

import java.io.*;

public class TestLogbook {

	public static void main(String[] args) throws IOException {
		 int month,              // Input month
         	 year,               // Input year
         	 day,                // Input day
         	 entry,              // Input logbook entry
         	 dofw;               // Day of the week
		 boolean stop = false;   // Signals end of test
		 char ans;               // Y/N answer for report of test 1
		 Logbook testLog;

     //-----------------------------------------------------------------
     // Initialize reader and tokenizer for the input stream -
     //   for reading 'tokens' (namely the month & year) 
     //   input from the keyboard.  
     //
     // Initialize reader - To read a character at a time
     InputStreamReader reader = new InputStreamReader(System.in);
     
     // Initialize the tokenizer -
     //   To read tokens (words and numbers separated by whitespace)
     StreamTokenizer tokens = new StreamTokenizer(reader);
     
     // Note: use the nextToken( ) method to step through a stream of tokens. 
     //   Use tokenizer's nval to obtain the number read.
     //   Since nval is of type double, cast it to an int.
     
     // Create a logbook 
     System.out.print("\n\nEnter the month and year for the logbook month: ");
     tokens.nextToken(); 
     month = (int)tokens.nval; 
     tokens.nextToken( );
     year = (int)tokens.nval;
     testLog = new Logbook(month,year);

     // Test 1 : Tests the month, year, and daysInMonth operations.
     System.out.println("Month : " + testLog.getMonth());
     System.out.println("Year  : " + testLog.getYear());
     System.out.println("# days in month : " + testLog.getDaysInMonth());

     System.out.print("Another Logbook (Y/N)?  ");
     ans = (char)System.in.read();
     if (ans == 'N' || ans == 'n') stop = true;

     while ( !stop ){           // repeat if desired
         System.out.print("\n\nEnter the month and year for the logbook month: ");
         tokens.nextToken(); 
         month = (int)tokens.nval; 
         tokens.nextToken( );
         year = (int)tokens.nval;
         testLog = new Logbook(month,year);

         // Test 1 : Tests the month, year, and daysInMonth operations.
         System.out.println("Month : " + testLog.getMonth());
         System.out.println("Year  : " + testLog.getYear());
         System.out.println("# days in month : " + testLog.getDaysInMonth());
         
         System.out.print("Another Logbook (Y/N)?  ");
         ans = (char)System.in.read();
         if (ans == 'N' || ans == 'n') stop = true;
	}
     
     // Test 2 : Tests the putEntry and getEntry operations.
     stop = false;
     while ( !stop ){
         System.out.print("\nEnter day and entry (0 0 to exit Test 2) : ");
         tokens.nextToken(); 
         day = (int)tokens.nval; 
         tokens.nextToken( );
         entry = (int)tokens.nval;

         if ( day != 0 ){
             testLog.putEntry(day, entry);
             System.out.println("Logbook:");
             for ( day = 1 ; day <= testLog.getDaysInMonth() ; day++ ){
                 
                 System.out.print(day + " " + testLog.getEntry(day) + "\t");
                 if ( day % 5 == 0 )
                     System.out.println( );
             }
             System.out.println( );
         }
         else 
        	 stop = true;
     }
 
     
	}
}
