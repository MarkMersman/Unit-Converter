package dev.mersman;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Scanner userInput;
		int menuSelection=0;		
				
		userInput = new Scanner(System.in);
		
		
		while(menuSelection != 4) {
		
		System.out.println("Enter 1 to start or 4 to quit.");
		menuSelection = userInput.nextInt();
		userInput.nextLine();
			
		System.out.println("Please select an option:");
		System.out.println("1. Volume conversions");//48 Cups to Teaspoons
		System.out.println("2. Distance conversions");//1.609344 Miles to Kilometers
		System.out.println("3. Temperature conversions");//0.832674 US Gallons to Imperial Gallons
		System.out.println("4. Quit");
		
		
		menuSelection = userInput.nextInt();
		//userInput.nextLine();
		
		menuSelection = MenuSelect(menuSelection, userInput);
		
		if ((menuSelection > 10) && (menuSelection < 33)) {
			doConversion(menuSelection, userInput);
		}
		
		
		
		}
	}
	
		
	public static int MenuSelect(int i, Scanner  input) {
		
		int mainSelection = i;
		int subMenuSelection=0;
		
		
		
		// Main menu switch
			switch(mainSelection) {
				case 1: {
					System.out.println("1. Cups to Teaspoons");
					System.out.println("2. Teaspoons to Cups");
					System.out.println("3. Tablespoons to Cups");
					System.out.println("4. Cups to Tablespoons");
					System.out.println("5. Cancel");
										
						
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
					System.out.println("1. Fahrenheit to Celsius");
					System.out.println("2. Celsius to Fahrenheit");
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
			
									
			subMenuSelection = input.nextInt();
			input.nextLine();	
			
			return subMenuSelect(mainSelection, subMenuSelection);
			//value *= multiplier; 
			
	}
	
	public static int subMenuSelect(int main, int sub) {
		
						
			switch(sub) {
				case 1:{
					if(main == 1) {
					
					return 11;
					
					}
					else if(main == 2) {
						return 21;
					}
					else if(main == 3) {
						return 31;
					}
				}
				case 2: {
					if(main == 1) {
						return 12;
					}
					else if(main == 2) {
						return 22;
					}
					else if (main == 3) {
						return 32;
					}
				}
				case 3:{
					if (main == 1) {
						return 13;
					}
					else if(main == 2) {
						return 23;
					}
					else if (main == 3) {
						return 0;
					}
				}
				case 4: {
					if (main == 1) {
						return 14;
					}
					else {
						return 0;						
					}
				}
				case 5:{
					return 0;
				}
				default:{
					return 0;
				}
			}
	}
	
	public static void doConversion(int i, Scanner in) {
		
		String inUnit = "";
		String outUnit = "";
		double value = 99;
		double result = 99;
		
		System.out.println("Input number of units to convert: ");
		
		value = in.nextDouble();
		in.nextLine();
		
		switch(i) {
			case 11:{
				inUnit = "Cups";
				outUnit = "Teaspoons";
				result = cupToTea(value);
				break;
			}
			case 12:{
				inUnit = "Teaspoons";
				outUnit = "Cups";
				result = teaToCup(value);
				break;
			}
			case 13:{
				inUnit = "Tablespoons";
				outUnit = "Cups";
				result = tableToCup(value);
				break;
			}
			case 14: {
				inUnit = "Cups";
				outUnit = "Tablespoons";
				result = cupToTable(value);
				break;
			}
			case 21:{
				inUnit = "Miles";
				outUnit = "Kilometers";
				result = milesToKilo(value);	
				break;
			}
			case 22:{
				inUnit = "Kilometers";
				outUnit = "Miles";
				result = kiloToMiles(value);
				break;
			}
			case 23:{
				inUnit = "Miles";
				outUnit = "Feet";
				result = milesToFeet(value);
				break;
			}
			case 31:{
				inUnit = "Fahrenheit";
				outUnit = "Celsius";
				result = fToC(value);
				break;
			}
			case 32:{
				inUnit = "Celsius";
				outUnit = "Fahrenheit";
				result = cToF(value);
				break;
			}
			case 0:{
				return;
			}
		}
		
		
		outputAnswer(inUnit,outUnit,value,result);
		
	}
	
	public static void outputAnswer(String in, String out,double val, double answer) {
		System.out.println(val + " " + in + " = " + String.format("%.4f", answer) + " " + out);
		//String.format("%.4f", value)
	}
	
	//volume conversion methods
	public static double cupToTea(double input) {
		return input*48;
	}
	
	public static double teaToCup(double in) {
		return in/48;
	}
	
	public static double tableToCup(double in) {
		return in/16;
	}
	
	public static double cupToTable(double in) {
		return in*16;
	}
	
	//distance conversion methods 
	
	public static double milesToFeet(double in) {
		return in*5280;
	}
	
	public static double milesToKilo(double in) {
		return in*1.60934;
	}
	
	public static double kiloToMiles(double in) {
		return in*0.621371;
	}
	
	//Temperature conversion methods
	
	public static double fToC(double in) {
		return ((in - 32)* (5/9));
	}
	
	public static double cToF(double in) {
		return ((in*(9/5))+32);
	}
}
