/*
 * Given an airplane's acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an
 * airplane to take off using the following formula
 * 
 * 		length = v^2 / 2 * a
 * 
 * Write a program that prompts the user to enter v in
 * meters/second (m/s) and the acceleration a in meters/second 
 * squared (m/s^2), then, displays the minimum runway length.
 */

import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter speed and acceleration: ");
		
		// Capture input data
		double speed = sc.nextDouble();
		double acc = sc.nextDouble();
		
		// Compute the runway length
		double length = Math.pow(speed, 2) / (2 * acc);
		
		// Print the results
		System.out.println("The minimum runway length for this airplane is " + (int)(length * 1000) / 1000.0);
		
	}

}
