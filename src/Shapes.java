import java.util.Scanner;

/**
 * Author: Jackson                      SE Project 1
 * Due: August 10						30 Points
 * Description: Program will calculate volume or surface area dependent upon user input.
 * Input: length, width, height, or radius dependent upon the object.
 * Assumptions: User needs guidance to successfully navigate the program.
 */
public class Shapes {

	public static Scanner keyboardScanner = new Scanner(System.in); //Used throughout program
	
	public static void main(String[] args) {
		
		/*
		 * Here we'll define a ton of variables.
		 */
		double userWidth = 0;
		double userLength = 0;
		
		System.out.println("Hello there! I'll be computing surface area " +
                        "or volume for you today!");
		System.out.print("Please select which you'd like to compute." +
                       " Enter 'SA'for surface area  or 'V' for volume: ");
		
		 String userChoice = keyboardScanner.nextLine(); //Allow user input.
                
                if (userChoice.equals("SA")) {
                    System.out.println("Awesome. Surface area has been chosen.");
                    //Get length.
                    System.out.print("Please enter the length: ");
                    userLength = keyboardScanner.nextDouble();
                    //Get width now.
                    System.out.println("Thanks. Now input the width");
                    userWidth = keyboardScanner.nextDouble();
                }
                
                
                else if (userChoice.equals("V"))  {
                    System.out.println("Output for V");
                }

                else {
                	System.out.println("You've submitted something that isn't valid. " + 
                					   "Please restart the application.");
                }

                
                                                            
			
	}

}
