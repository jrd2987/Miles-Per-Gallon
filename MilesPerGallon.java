/*
Programmer: Justin Doggett
Date: 5/9/2017
Description: This program asks the user for the number of miles driven and the gallons of gas used. This also calulates the car's miles per gallon
             and displays the result on the screen.
*/

import java.util.Scanner;

public class MilesPerGallon
{
	public static void main(String [] args)
	{
		int miles; //holds the value of the number of the miles driven.
		int gallons; //holds the value of the number of gallons used.
		int mPG; //holds the value of the calculated miles/gallons.

		//Creates a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);

		//Ask the user how many miles have been driven
		System.out.println("How many miles have been driven?");
		miles = keyboard.nextInt();

		//Prompt the user to enter the gallons of gas used
		System.out.println("How many gallons of gas have been used?");
		gallons = keyboard.nextInt();

		//Calculate the miles per gallon
		mPG = miles/gallons;

		//Display the miles per gallon
		System.out.println("The miles per gallon for this car is: " + mPG);
	}
}





