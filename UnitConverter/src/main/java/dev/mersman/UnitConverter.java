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



/*
 * package dev.mersman.unitconverter;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Scanner userInput;
		int menuSelection=0;
		int subMenuSelection=0;
		double value = 0;
		double multiplier=1;
		String unit = " ";
		
		userInput = new Scanner(System.in);
		menuSelection = userInput.nextInt();
		userInput.nextLine();
		
		
		
		while(menuSelection != 4) {
		
		System.out.println("Please select an option:");
		System.out.println("1. Volume conversions");//48 Cups to Teaspoons
		System.out.println("2. Distance conversions");//1.609344 Miles to Kilometers
		System.out.println("3. Temperature conversions");//0.832674 US Gallons to Imperial Gallons
		System.out.println("4. Quit");
		
		MenuSelect(menuSelection);
		subMenuSelection = userInput.nextInt();
		userInput.nextLine();	
		
			
			
		
		System.out.println("That is equal to " + value + " " + unit);
		
		}
	}
	
	public double cupToTea(double cups) {
		return cups*48;
	}
	
	public static void MenuSelect(int i) {
		
		
		// Main menu switch
			switch(i) {
				case 1: {
					System.out.println("1. Cups to Teaspoons");
					System.out.println("2. Teaspoons to Cups");
					System.out.println("3. Tablespoons to Cups");
					System.out.println("4. Cups to Tablespoons");
					System.out.println("5. Cancel");
					
					MenuSelect(menuSelection);
					subMenuSelection = userInput.nextInt();
		            userInput.nextLine();	
					//multiplier = 48;	
					//unit = "Teaspoons";					
					break;
				}
				case 2:{
					System.out.println("1. Miles to Kilometers");
					System.out.println("2. Kilometers to Miles");
					System.out.println("3. Miles to Feet");
					System.out.println("4. Cancel");
					//multiplier = 1.609344;	
					//unit = "Kilometers";					
					break;
				}
				case 3:{
					System.out.println("1. Farenheit to Celsius");
					System.out.println("2. Celsius to Farenheit");
					System.out.println("3. Cancel");
					//multiplier = 0.832674;
					//unit = "Imperial Gallons";					
					break;
				}
				case 4:{
					System.exit(0);
				}
				default:{
					System.out.println("Enter a valid selection.");
				}
			}
			
									
			//subMenuSelection = userInput.nextInt();
			//userInput.nextLine();			
			//value *= multiplier; 
			
	}
	
	
}
  */
