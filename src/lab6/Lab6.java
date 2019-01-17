package lab6;

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userChoice;

		int numSides;
		int dieRoll1;
		int dieRoll2;
		int i = 1;

		do {

			System.out.println("Welcome to the Grand Circus Casino!\n");
			System.out.println("How many sides should each die have? ");
			numSides = scnr.nextInt();
			System.out.println("Roll " + i + ": ");
			dieRoll1 = generateRandomDiceRoll(numSides);
			dieRoll2 = generateRandomDiceRoll(numSides);
			System.out.println(dieRoll1);
			System.out.println(dieRoll2);
			System.out.println(specialMessage(dieRoll1, dieRoll2));
			System.out.println("\n" + "Would you like to roll again? (y/n): ");
			userChoice = scnr.next();

			i++;
			
		} while (userChoice.equalsIgnoreCase("y"));

		scnr.close();

	}

	public static int generateRandomDiceRoll(int numSides) {
		Random randGen = new Random();
		int randomNum = (randGen.nextInt(numSides) + 1);
		return randomNum;
		
	}
	
	public static String specialMessage(int dieRoll1, int dieRoll2) {
		if ((dieRoll1 == 1) && (dieRoll2 == 1)) {
			return "You rolled snake eyes!";
		}
			else if ((dieRoll1 == 6) && (dieRoll2 == 6)) {
				return "You rolled boxcars!";
			}
			else if ((dieRoll1 == 1) && (dieRoll2 == 2)) {
				return "You rolled craps!";
			}
			else if ((dieRoll1 == 2) && (dieRoll2 == 1)) {
				return "You rolled craps!";
			}
			else {
				return null;
			}
	}
		
}
