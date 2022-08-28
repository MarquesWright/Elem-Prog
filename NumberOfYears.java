/*
 * Write a program that prompts the user to enter the minutes
 * (e.g., 1 billion), and displays the number of years and
 * remaining days for the minutes. For simplicity, assume that
 * a year has 365 days.
 */

import java.util.Scanner;

public class NumberOfYears {

	public static void main(String[] args) {
		// Create a constant for a year
		final int YEAR = 365;
		final int HOUR = 60;
		final int DAY = 24;
		
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter minutes
		System.out.print("Enter the number of minutes: ");
		
		// Capture the user input
		int minutes = sc.nextInt();
		
		// Determine how many years there are
		int hours = minutes / HOUR;
		int days = hours / DAY;
		int years = days / YEAR;
		int remaining_days = days % YEAR;
		
		// Display the results
		System.out.println(minutes + " minutes is approxiately " + years + " years and " + remaining_days + " days");
		

	}

}
