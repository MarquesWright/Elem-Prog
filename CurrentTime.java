/*
 * Write a program that prompts the user to enter the time
 * zone offset to GMT and displays the time in the specified
 * time zone.
 */


import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user
		System.out.print("Enter the time zone offset to GMT: ");
		
		// Capture the user input
		long offset = sc.nextInt();
		
		// Compute the current time
		long totalMilliseconds = System.currentTimeMillis(); 		 // total milliseconds
		long totalSeconds = totalMilliseconds / 1000;		 	 // total seconds
		long currentSecond = totalSeconds % 60;				 // current second
		
		long totalMinutes = totalSeconds / 60;				 // total minutes
		long currentMinute = totalMinutes % 60;			 	 // current minute in the hour
		
		long totalHours = totalMinutes / 60;				 // total hours
		long currentHour = (totalHours + offset) % 24;			 // current hour
		
    		// Display the results
		System.out.println("The current time is " + currentHour + ":" + 
				currentMinute + ":" + currentSecond + " GMT");

	}

}
