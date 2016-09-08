package gcLabz2;

import java.util.Scanner;

public class Labs2AdventureGame {

	private static Scanner k;

	public static void main(String[] args) {
		
		//declare variables
		String yourName;
		String dragonName;
		String choiceString;
		String battleString;
		String headInt;	
		String weaponString;
		String colorString;
		
			//program output and prompts
			System.out.println("Welcome! What is your name? (enter your name):  ");
			//open scanner
			k= new Scanner (System.in);
			//user input
			yourName = k.nextLine();
			
			//blank line for visual appeal
			System.out.println();
			// program output
			System.out.println("Would you like to play a game? (enter yes or no):  ");
			//user input
			choiceString = k.nextLine();
			
			//switches for continue and fight or run, 
			switch (choiceString) {
			case "no":
				System.out.println("Goodbye!");
				break;
			case "yes":
				System.out.println("Excellent!  You are walking across a field and you encounter a fire-breathing dragon!");
				System.out.println("What would you do? (enter face the beast or run away):  ");
				battleString = k.nextLine();
				
			switch (battleString) {
			case "run away":
				System.out.println("Goodbye!");
					break;
			case "face the beast":
				System.out.println("You approach the dragon.  You see that he has _ heads. (enter 1, 2, or 3): ");
				headInt = k.nextLine();
				System.out.println("No one has ever faced a " + headInt + " headed dragon before!  Choose your weapon.");
				System.out.println("(enter slingshot, sword, or bow and arrow: )");
				weaponString = k.nextLine();
				
			//switches for weapon and color
			switch (weaponString) {
			case "slingshot":
			case "sword":
			case "bow and arrow":
				System.out.println("Armed with your " + (weaponString) + ", you approach the dragon.  You can feel its fiery");
				System.out.println("breath as you get closer.  It stares at you with its__ eyes.  (enter red or blue): ");
				colorString = k.nextLine();
				
			switch (colorString) {
			case "red":
			case "blue":
				System.out.println("Oh thank goodness! " + (colorString) + " dragons are friendly.  You pet it and become frineds.");
				System.out.println("You name the dragon ____. (enter a name):");
				dragonName = k.nextLine();
			
