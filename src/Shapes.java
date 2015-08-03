import java.util.Scanner;

/**
 * Author: Jackson       				SE Project 1
 * Due: August 10						30 Points
 * Description: Program will calculate volume or surface area dependent upon user input.
 * Input: length, width, height, or radius dependent upon the object.
 * Assumptions: User needs massive guidance to successfully navigate the program.
 */
public class Shapes {

	public static Scanner keyboardScanner = new Scanner(System.in); //Defined global - will be used throughout program.
	
	public static void main(String[] args) {
		
		System.out.println("Hello there! I'll be computing surface area or volume for you today!");
		System.out.println("Please select which you'd like to compute. Enter 'SA'for surface area  or 'V' for volume.");
		
		String userChoice = keyboardScanner.next(); //Allow any input BUT if it isn't SA or V, go to the else statement.
		
		
		if (userChoice == "SA") {
			System.out.println("Great! Now select your object. 'RS' for a rectangular solid, 'C' for a cylinder ");
			System.out.println("'S' for a sphere or 'C' for a cone");
			//TODO: get values from user.
			String objectChoice = keyboardScanner.next();
			System.out.println(objectChoice);
			
		}
		
		
		if (userChoice == "V") {
			System.out.println("Volume, awesome.");
		}
		
		else {
			System.out.println("Allegedly Java needs an else.");
		}
				
	}

}
