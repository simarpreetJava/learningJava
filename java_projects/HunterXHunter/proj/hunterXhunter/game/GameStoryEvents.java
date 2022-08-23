package proj.hunterXhunter.game;

import proj.hunterXhunter.characters.Freecs;
import proj.hunterXhunter.characters.Person;
import proj.hunterXhunter.characters.Zorudikuu;
import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;
import proj.hunterXhunter.utilities.Utility;

/**
 * @author Ravi dineshbai Patel
 * Contains all the events in the game
 * 	from intro -> journey 
 * 			   -> tournament place
 * 			   -> fights
 * 			   -> winner
 */
public class GameStoryEvents {
	private static Utility util = new Utility();
	private static Person player;
	private static String winnerName;
	
	/*----------------------Introduction-----------------------------*/
	/**
	 * Introduces the game world.
	 * No prompts
	 */
	protected void welcomeAndIntroduceWorld() {
		String[] narratorIntro = createIntroDialogues();
		util.printSlowly(narratorIntro, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
		System.out.println(GlobalConstants.EMPTY_LINE);
	}
	/**
	 * Shows game logo
	 * No prompts
	 */
	protected void showGameLogo() {
		util.printSlowly(CharactersConstants.LOGO, 
				         GlobalConstants.GRAPHIC_TIME);
	}
	
	/**
	 * @return dialogues for introducing the world
	 * creates dialogues as an array of Strings
	 * No prompts
	 */
	private String[] createIntroDialogues() {
		String[] ret = {CharactersConstants.WELCOME, 
						CharactersConstants.WORLD_DESC,
						CharactersConstants.CHARACTERS_GOAL};
		return ret;
	}
	/*------------------chooseCharacterType----------------------*/
	/**
	 * Prints player choice of character
	 * No prompts
	 */
	protected void printPlayerChoice() {
		String playerChoice = String.join(GlobalConstants.BLANK_SPACE,
										  CharactersConstants.CHOSEN, 
										  player.getLastName(), 
										  CharactersConstants.CLAN);

		util.printSlowly(playerChoice, CharactersConstants.AUTHOR ,GlobalConstants.TEXT_TIME);
	}
	/**
	 * @param choice
	 * @prompt
	 * Checks user input option against options given to the user
	 * Re prompt user with options and a msg to input again
	 */
	protected void validatePlayerChoiceElseReprompt(String choice) {
		boolean prompt = true;
		while(prompt) {
			switch(choice.toLowerCase()) {
				case CharactersConstants.CHOICE_A:  
						player = new Freecs(); break;
				case CharactersConstants.CHOICE_B: 
						player = new Zorudikuu(); break;
				default: util.printSlowly(CharactersConstants.CHOOSE_AorB, 
										  GlobalConstants.TEXT_TIME);
			}

			if(player instanceof Person)
				prompt=false;
			else
				choice = util.promptUser();
		}
	}
	/**
	 * @return character chosen: A or B
	 * @prompt
	 * Prompts user with option A or B, for character type
	 */
	protected String chooseYourCharacterType() {
		util.printSlowly(CharactersConstants.CHOOSE_CHAR, GlobalConstants.TEXT_TIME);
		String choicePrompt = String.join(GlobalConstants.EMPTY_STRING,
										  CharactersConstants.CHARACTER_CHOICES,
										  GlobalConstants.EMPTY_LINE,
										  GlobalConstants.EMPTY_LINE,
										  CharactersConstants.CHOOSE_AorB);
		String choice = util.promptUser(choicePrompt, GlobalConstants.GRAPHIC_TIME);
		return choice;
	}
	/*-------------------collectPlayerDetails----------------------*/
	/**
	 * @prompt
	 * Prompts user to input his|her homeTown
	 */
	protected void requestPlayerHomeTown() {
		String playerTown = util.promptUser(CharactersConstants.DETAILS_TOWN, GlobalConstants.TEXT_TIME);
		playerTown = util.convertToPascalCase(playerTown);
		player.setTown(playerTown);
	}
	/**
	 * @prompt
	 * Prompts user to input his|her first name
	 */
	protected void requestPlayerFirstName() {
		String playerName = util.promptUser(CharactersConstants.DETAILS_NAME, GlobalConstants.TEXT_TIME);
		playerName = util.convertToPascalCase(playerName);
		player.setFirstName(playerName);
	}
	/**
	 * prints request to input your details in the console
	 */
	protected void printNeedForPlayerDetails() {
		util.printSlowly(CharactersConstants.PLAYER_DETAILS, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}
	/*-------------------journeyToTournament----------------------*/
	/**
	 * dialogue for player journey
	 */
	protected void playerSetsOnJourney() {
		String playerJourney = String.join(GlobalConstants.BLANK_SPACE, 
										   player.getFullName(), 
										   CharactersConstants.FROM,
										   player.getTown(),
										   CharactersConstants.PLAYER_JOURNEY);
		util.printSlowly(playerJourney, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}
	/**
	 * dialogue for how tough journey to tournament was in a statement.
	 */
	protected void elaborateJourneyToTournament() {
		util.printSlowly(CharactersConstants.JOURNEY_DESC, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}
	/**
	 * dialogue for tournament importance in the game world
	 */
	protected void elaborateTournamentImportance() {
		util.printSlowly(CharactersConstants.TOURNAMENT_DESC, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}
	/*-------------------reachTournamentPalace----------------------*/
	/**
	 * Events when player reaches tournament place
	 */
	protected void reachTournamentPalace() {

		elaborateToughJourney();
		playerEntersTournamentPalace();
		strangersAcknowledgingPlayer();
		playerConvoWithPresident();
	}
	/**
	 * conversation with a static character in game
	 */
	protected void playerConvoWithPresident() {
		presidentGreetAndAsksName();
		playerResponseForName();
		
		presidentCommentOnFather();
		playerResponseForFather();
		
		String response = presidentRequestsForParry();
		playerResponseToParry(response);
		
		handoverToTournament();
	}
	/**
	 * @return response from Player to president
	 */
	protected String presidentRequestsForParry() {
		String response = playerResponseForParryToPresident();
		return response;
	}
	/**
	 * @return response from Player to president
	 * @prompt
	 */
	protected String playerResponseForParryToPresident() {
		util.printSlowly(CharactersConstants.REQ_PARRY, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);

		String[] options = {GlobalConstants.YES, GlobalConstants.NO};
		util.showOptions(options);

		String response = util.promptUser();
		response = util.validateOptionsAndReprompt(response, options);

		return response;
	}
	/**
	 * player agrees to parry with president
	 * Events for parrying
	 */
	protected void playerParryWithPresident() {
		playerAttacksPresident();
		playerDefendsFromPresident();
	}
	/**
	 * @prompt
	 * shows option for only attack
	 * player can only choose attack, else reprompt for input
	 */
	protected void playerAttacksPresident() {
		String[] onlyAttack = {CharactersConstants.OPTION_ATTACK, GlobalConstants.EMPTY_STRING};
		String showdown = String.join(GlobalConstants.EMPTY_STRING, 
									  CharactersConstants.PRESIDENT_NAME, 
									  GlobalConstants.BLANK_SPACE,
									  CharactersConstants.VS,
									  GlobalConstants.BLANK_SPACE,
									  player.getFullName());
		util.printSlowly(showdown, GlobalConstants.TEXT_TIME);
		util.showOptions(onlyAttack);
		presidentParryProvokeToPlayer(CharactersConstants.ATTACK_ME, GlobalConstants.A);
		util.printSlowly(CharactersConstants.ACK_PLAYER_ATTACK, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}
	/**
	 * @prompt
	 * shows option for only defend
	 * player can only choose defend, else reprompt for input
	 */
	protected void playerDefendsFromPresident() {
		String[] options = {"", "defend"};
		util.showOptions(options);
		presidentParryProvokeToPlayer(CharactersConstants.DEFEND_FROM_ME, GlobalConstants.B);
		util.printSlowly(CharactersConstants.IMPRESSED, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}
	/**
	 * @param presidentProvoke
	 * @param option
	 * @prompt
	 * president request for parry
	 * prompts user to say yes or no ie A or B
	 * re-prompts if anything else except A or B
	 */
	protected void presidentParryProvokeToPlayer(String presidentProvoke, String option) {
		util.printSlowly(presidentProvoke, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);

		String statement = String.join(GlobalConstants.BLANK_SPACE, 
									   GlobalConstants.ONLY_OPTION,
									   option);

		boolean prompt = true;
		while(prompt) {

			String resp = util.promptUser();

			if(option.equalsIgnoreCase(resp))
				prompt=false;
			else
				util.printSlowly(statement, GlobalConstants.TEXT_TIME);
		}
	}
	/**
	 * @dialogue
	 * after parry with president
	 * some story narrative
	 * shift to starting tournament
	 */
	protected void handoverToTournament() {
		util.printSlowly(CharactersConstants.MORE_CHAR_ENTERS_TOURNAMENT, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
		util.printSlowly(CharactersConstants.ACK_OTHER_CANDIDATES, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
		util.printSlowly(CharactersConstants.REST_DISQUALIFIED, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
		util.printSlowly(CharactersConstants.INTRO_SATOTZ, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @param response to president parry
	 * @prompt
	 * if yes: fight mode starts
	 * if no: president dialogue
	 */
	protected void playerResponseToParry(String response) {
		if(response.equalsIgnoreCase(GlobalConstants.A))
			playerParryWithPresident();
		else
			util.printSlowly(CharactersConstants.WISE_CHOICE, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * dynamic response in story dialogues
	 * uses instance of to check whether 
	 * 	current player obj is of any class in characters package
	 */
	protected void playerResponseForFather() {
		String narrativePlayername = formattedName();
		if(player instanceof Freecs) {
			util.printSlowly(CharactersConstants.FREECS_FATHER, narrativePlayername, GlobalConstants.TEXT_TIME);
		}else if(player instanceof Zorudikuu) {
			util.printSlowly(CharactersConstants.ZORU_FATHER, narrativePlayername, GlobalConstants.TEXT_TIME);
		}
	}
	/**
	 * @dialogue
	 * dynamic response in story dialogues
	 * uses instance of to check whether 
	 * 	current player obj is of any class in characters package
	 */
	protected void presidentCommentOnFather() {
		if(player instanceof Freecs) {
			presidentFreecsNameResponse();
		}else if(player instanceof Zorudikuu) {
			presidentZorudikkuNameResponse();
		}
	}
	/**
	 * @dialogue
	 * dynamic response in story dialogues
	 * uses instance of to check whether 
	 * 	current player obj is of any class in characters package
	 */
	protected void playerResponseForName() {
		if(player instanceof Freecs) {
			freecsNameResponse();
		}else if(player instanceof Zorudikuu) {
			zorrudikkuNameResponse();
		}
	}

	/**
	 * @dialogue
	 * president greets the player and ask his name
	 */
	protected void presidentGreetAndAsksName() {
		util.printSlowly(CharactersConstants.ACK_ARRIVAL,CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
		util.printSlowly(CharactersConstants.ASK_NAME,CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * president responds to player character if of Freecs type.
	 */
	protected void presidentFreecsNameResponse() {
		String presidentResponse = String.join(GlobalConstants.EMPTY_STRING,
				CharactersConstants.AH,
				player.getLastName(),
				GlobalConstants.BLANK_SPACE,
				CharactersConstants.FREEC_RESP_CLAN);
		util.printSlowly(presidentResponse,CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * president responds to player character if of Zorudikku type.
	 */
	protected void presidentZorudikkuNameResponse() {
		String presidentResponse = String.join(GlobalConstants.EMPTY_STRING,
				CharactersConstants.AH,
				CharactersConstants.ZORU_RESP_CLAN,
				GlobalConstants.BLANK_SPACE,
				player.getLastName(),
				GlobalConstants.BLANK_SPACE,
				CharactersConstants.CLAN);

		String[] zorudikkuResponse = {presidentResponse, CharactersConstants.ZORU_RESP_CLAN2};
		util.printSlowly(zorudikkuResponse,CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}
	/**
	 * @dialogue
	 * president responds to player character if of Zorrudikku type.
	 */
	protected void zorrudikkuNameResponse() {
		String narrativePlayername = formattedName();
		String playerResponse = String.join(GlobalConstants.EMPTY_STRING, 
				player.getFirstName(), 
				CharactersConstants.ZORU_TELL_NAME);
		util.printSlowly(playerResponse, narrativePlayername, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * president responds to player character if of Freecs type.
	 */
	protected void freecsNameResponse() {
		String narrativePlayername = formattedName();
		String playerResponse = String.join(GlobalConstants.BLANK_SPACE, 
				CharactersConstants.FREECS_TELL_NAME,
				player.getFullName());
		util.printSlowly(playerResponse, narrativePlayername, GlobalConstants.TEXT_TIME);
	}
	
	/**
	 * @return Player dialogue name
	 * formats name like "Simar: " 
	 */
	protected String formattedName() {
		return String.join(GlobalConstants.EMPTY_STRING,
				player.getFirstName(),
				GlobalConstants.COLON_SPACE);
	}
	
	/**
	 * @dialogue
	 * stranger dialgoues for the player when he entres tournament palace
	 */
	protected void strangersAcknowledgingPlayer() {
		String[] strangerDialogues = createStrangerDialogues();
		util.printSlowly(strangerDialogues, CharactersConstants.STRANGER, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * author dialogue when player enters tournament palace
	 */
	protected void playerEntersTournamentPalace() {
		String entersTournamentPalace = String.join(GlobalConstants.BLANK_SPACE, 
				CharactersConstants.AS,
				player.getFullName(),
				CharactersConstants.ENTERS_TOURNAMENT_PALACE);
		util.printSlowly(entersTournamentPalace, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}

	/**
	 * @dialogue
	 * author dialogue on how journet to tournament palace was tough for the player
	 */
	protected void elaborateToughJourney() {
		util.printSlowly(CharactersConstants.JOURNEY_STRUGGLES, CharactersConstants.AUTHOR, GlobalConstants.TEXT_TIME);
	}
	/**
	 * @return dialogues 
	 * dialogues used by strangers to praise the player
	 */
	private String[] createStrangerDialogues() {
		String fromClan = String.join(GlobalConstants.BLANK_SPACE, 
				CharactersConstants.STRANGER_PLAYER_CLAN, 
				player.getLastName(),
				CharactersConstants.CLAN);

		String[] ret = {CharactersConstants.STRANGER_FIRST_TOENTER, 
				CharactersConstants.STRANGER_FORMIDABLE,
				fromClan};
		return ret;
	}
	
	
	/*-------------------startTournament----------------------*/
	/**
	 * Makes use of tournament class to match player with other characters
	 * Fetches winner of the tournament
	 */
	protected void tournamentArc() {
		describeTournamentAndTraining();

		Tournament tournament = new Tournament(player);
		Person[][] matchUps = tournament.randomMatchUp(player);
	
		winnerName = tournament.fightUntilWinner(matchUps);
	}
	
	/**
	 * prints tournament and training description
	 */
	private void describeTournamentAndTraining() {
		util.printSlowly(CharactersConstants.TOURNAMENT_DESC2, CharactersConstants.SATOTZ, GlobalConstants.TEXT_TIME);
		util.printSlowly(CharactersConstants.TRAINING_DESC, CharactersConstants.SATOTZ, GlobalConstants.TEXT_TIME);
	}

	/*-------------------endTournament----------------------*/
	/**
	 * Once winner is declared
	 * It checks whether player won or not
	 * if yes: prints happy art of player char
	 * if not: prints sad art of player char
	 */
	protected void endTournamentArc() {
		if(winnerName.equalsIgnoreCase(player.getLastName())) {
			endTournamentArcHappy();
		}else {
			endTournamentArcSad();
		}
	}
	/**
	 * prints sad art
	 */
	private void endTournamentArcSad() {
		congratulateWinner();
		presidentToPlayer_EndTournament();
		util.printSlowly(player.getLostArt(), GlobalConstants.GRAPHIC_TIME);
	}
	/**
	 * prints happy art
	 */
	private void endTournamentArcHappy() {
		congratulateWinner();
		presidentToPlayer_EndTournament();
		util.printSlowly(player.getWonArt(), GlobalConstants.GRAPHIC_TIME);
	}

	/**
	 * president addresses player depending on the result of the tournament
	 */
	private void presidentToPlayer_EndTournament() {
		String[] presidentDialogue;
		if(player.getLastName().equalsIgnoreCase(winnerName)) {
			String[] tmp = {CharactersConstants.TOUR_END_HAPPY,
							CharactersConstants.GOOD_lUCK};
			presidentDialogue = tmp;
		}else {
			String presToPlayer = String.join(GlobalConstants.COMMA,
											  player.getFirstName(),
											  CharactersConstants.BETTER_LUCK);
			String[] tmp = {CharactersConstants.TOUR_END_HAPPY,
					presToPlayer};
			presidentDialogue = tmp;
		}
		util.printSlowly(presidentDialogue, CharactersConstants.PRESIDENT, GlobalConstants.TEXT_TIME);
	}
	/**
	 * prints congratulations to the winner irrespective of player won or not
	 */
	private void congratulateWinner() {
		String congratulateWinner = String.join(GlobalConstants.COMMA,
												winnerName,
												CharactersConstants.CONGRATULATIONS);
		util.printSlowly(congratulateWinner, GlobalConstants.TEXT_TIME);
	}

	
}
