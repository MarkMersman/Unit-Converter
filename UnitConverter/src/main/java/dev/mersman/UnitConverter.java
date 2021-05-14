package dev.mersman;

import java.util.Scanner;

public class UnitConverter {

	public static void main(String[] args) {
		
		Scanner userInput;
		int menuSelection=0;
		double value = 0;
		double multiplier=1;
		String unit = " ";
		
		while(menuSelection != 4) {
		
		System.out.println("Please select an option:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		
		userInput = new Scanner(System.in);
		menuSelection = userInput.nextInt();
		userInput.nextLine();
		//userInput.close();
		
			switch(menuSelection) {
				case 1: {
					System.out.println("Enter the amount of Cups: ");
					multiplier = 48;	
					unit = "Teaspoons";					
					break;
				}
				case 2:{
					System.out.println("Enter the amount of Miles: ");
					multiplier = 1.609344;	
					unit = "Kilometers";					
					break;
				}
				case 3:{
					System.out.println("Enter the amount of US Gallons: ");
					multiplier = 0.832674;
					unit = "Imperial Gallons";					
					break;
				}
				case 4:{
					System.exit(0);
				}
				default:{
					System.out.println("Enter a valid selection.");
				}
			}
			
			
			//userInput = new Scanner(System.in);
			
			value = userInput.nextDouble();
			userInput.nextLine();			
			value *= multiplier; 
			//serInput.close();
		
		System.out.println("That is equal to " + String.format("%.4f", value) + " " + unit);
		
		}
	}
}


