/*
 * Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the
 * following formula:
 * 
 * 			a = (v1 - v0) / t
 * 
 * Write a program that prompts the user to enter the starting
 * velocity v0 in meters/second, the ending velocity v1 in 
 * meters/second, and the time span t in seconds, then displays
 * the average acceleration.
 */

import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user for velocity and time
		System.out.print("Enter v0, v1, and t: ");
		
		// Capture the input
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		
		// Compute the average acceleration 
		double acceleration = (v1 - v0) / t;
		
		// Display the acceleration
		System.out.println("The average acceleration is " + acceleration);

	}

}
