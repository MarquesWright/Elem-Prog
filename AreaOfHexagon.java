/*
 * Write a program that prompts the user to enter the side of
 * a hexagon and displays its area. The formula for computing
 * the area of a hexagon is:
 * 		area = (3 * Math.sqrt(3)/2) * Math.pow(s, 2)
 * 
 * where s is the length of a side.*/

import java.util.Scanner;

public class AreaOfHexagon {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the length of the side
		System.out.print("Enter the length of the side: ");
		
		// Capture the user input
		double length = sc.nextDouble();
		
		// Compute the area of a hexagon
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
		
		// Display the area of the hexagon
		System.out.println("The area of the hexagon is " + (int)(area * 10000) / 10000.0);

	}

}
