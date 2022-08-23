package proj.hunterXhunter.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;

/**
 * @author Naman Attri
 * This class is responsible for having generalized methods 
 * 	seperated from the game logic
 */
public class Utility {
	private static Scanner input = new Scanner(System.in);
	
	/**
	 * @param options
	 * it shows options in a format 
	 * A) ... B) ...
	 */
	public void showOptions(String[] options) {

		String statement = createOptionStatement(options);
		printSlowly(statement, GlobalConstants.TEXT_TIME);
	}
	/**
	 * @param options
	 * @return shows *Either A or B or C ...
	 * create statement to let user know that 
	 *  they have given wrong input
	 */
	public String createWrongChoiceStatement(String[] options) {
		Character start = GlobalConstants.CHAR_A;
		String statement = GlobalConstants.EMPTY_STRING;

		StringBuilder build = new StringBuilder();
		build.append(GlobalConstants.EITHER_CHOOSE);

		for(int i=0; i<options.length;i++) {

			build.append(GlobalConstants.BLANK_SPACE);
			build.append(start++);
			build.append(GlobalConstants.BLANK_SPACE);
			
			if(i < options.length-1)
				build.append(GlobalConstants.OR);
		}
		statement = build.toString();
		return statement;
	}
	/**
	 * @param options
	 * @return statement A) ... B) ...
	 * depending on the size of option array
	 * it creates option statement
	 * size: 4, then A)...B)...C)...D)...
	 */
	public String createOptionStatement(String[] options) {
		Character start = GlobalConstants.CHAR_A;
		String statement = GlobalConstants.EMPTY_STRING;
		StringBuilder build = new StringBuilder();

		for(String option: options) {
			build.append(start++);
			build.append(GlobalConstants.COLON_SPACE);
			build.append(option);
			build.append(GlobalConstants.TAB);
		}
		statement = build.toString();
		return statement;
	}
	/**
	 * @param text
	 * @return converted text
	 * used to convert any text to pascal case
	 * abc to Abc
	 */
	public String convertToPascalCase(String text) {
		String ret = GlobalConstants.EMPTY_STRING;

		Character c = Character.toUpperCase(text.charAt(0));
		String rest = text.substring(1).toLowerCase();
		ret = c + rest;

		return ret;
	}
	/**
	 * @param response
	 * @param options
	 * @return player validated response
	 * if player chose give wrong input as an option
	 * then it prompts user again and again until 
	 * player provides a valid response
	 */
	public String validateOptionsAndReprompt(String response, String[] options) {
		Character option = GlobalConstants.CHAR_A;
		boolean prompt = true;
		String wrongChoice = createWrongChoiceStatement(options);

		while(prompt) {

			for(int i=0; i<options.length;i++) {

				String choice = option.toString();
				if(response.equalsIgnoreCase(choice)) {
					prompt = false;
					break;
				}
				option++;
			}
			if(prompt) {
				printSlowly(wrongChoice, GlobalConstants.TEXT_TIME);
				response = promptUser();
				option = GlobalConstants.CHAR_A;
			}
		}
		return response;
	}
	/**
	 * @param promptMsg
	 * @param time
	 * @return response from player
	 * ask user for a input with a premessage
	 */
	public String promptUser(String promptMsg, Long time) {
		String ret = GlobalConstants.EMPTY_STRING;

		printSlowly(promptMsg, time);
		System.out.print(CharactersConstants.PLAYER_RESPONSE);

		input = new Scanner(System.in);
		ret = input.next();
		System.out.println();

		return ret;
	}
	/**
	 * @return response from the player
	 * asks user for a input without premessage
	 */
	public String promptUser() {
		String ret = GlobalConstants.EMPTY_STRING;
		System.out.print(CharactersConstants.PLAYER_RESPONSE);
		try {
			ret = input.next();
		}catch(InputMismatchException e) {
			System.out.println(GlobalConstants.ERR_IN);
		}
		System.out.println();

		return ret;
	}
	/**
	 * @param dialogues
	 * @param gameChar
	 * @param time(ms)
	 * prints text from an array 
	 * with delay depending upon the time
	 */
	public void printSlowly(String[] dialogues, String gameChar, Long time){

		for(String dialogue: dialogues) {
			printSlowly(dialogue, gameChar, time);
		}
	}
	/**
	 * @param dialogues
	 * @param gameChar
	 * @param time(ms)
	 * prints given text with characterName
	 * with delay depending upon the time
	 * eg: 
	 * AUTHOR: .. .. ..
	 */
	public void printSlowly(String dialogue, String gameChar, Long time) {
		System.out.print(gameChar);
		printSlowly(dialogue, time);
	}
	
	/**
	 * @param dialogues
	 * @param gameChar
	 * @param time(ms)
	 * prints given texts and add a new line after that
	 * with delay depending upon the time
	 */
	public void printSlowly(String text, Long time){

		printSlow(text, time);
		System.out.println();
	}
	
	/**
	 * @param dialogues
	 * @param gameChar
	 * @param time(ms)
	 * prints given texts without a new line after that
	 * with delay depending upon the time
	 */
	public void printSlowlyWithoutNewLine(String text, Long time){
		printSlow(text, time);
	}
	/**
	 * @param dialogues
	 * @param gameChar
	 * @param time(ms)
	 * prints given texts
	 * with delay depending upon the time
	 */
	private void printSlow(String text, Long time) {
		for(Character c: text.toCharArray()) {
			System.out.print(c);
			sleep(time);
		}
	}
	/**
	 * @param time(ms)
	 * puts main thread to sleep for given time
	 */
	private void sleep(Long time) {
		try {
			Thread.sleep(time);
		}catch (InterruptedException e) {
			System.out.println(GlobalConstants.ERR_PRINT);
			e.printStackTrace();
		}
	}
	/**
	 * closes the scanner object
	 */
	public void closeResources() {
		input.close();
	}
}
