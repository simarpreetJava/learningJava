package proj.hunterXhunter.game;

/**
 * @author Ravi dineshbai Patel
 * It is an abstract layer for all events in the game.
 * This class encapsulates GameStory events into phases via methods
 * Makes use of GameStoryEvents class via composition.
 */
public class GameStory {
	private static GameStoryEvents event = new GameStoryEvents();

	/**
	 * Introductory events of the game
	 */
	protected void intro() {
		
		event.showGameLogo();
		event.welcomeAndIntroduceWorld();
	}
	
	/**
	 * Gives user 2 types of character
	 * Prints their choice to console
	 */
	protected void chooseCharacterType() {
		
		String choice = event.chooseYourCharacterType();
		event.validatePlayerChoiceElseReprompt(choice);
		event.printPlayerChoice();
	}

	/**
	 * Prompts user for their details: name and town
	 */
	protected void collectPlayerDetails() {
		
		event.printNeedForPlayerDetails();
		event.requestPlayerFirstName();
		event.requestPlayerHomeTown();
	}
	
	/**
	 * Describes events: tournament | journey
	 * Have no prompts for the user
	 */
	protected void journeyToTournament() {
		
		event.elaborateTournamentImportance();
		event.elaborateJourneyToTournament();
		event.playerSetsOnJourney();
	}
	
	/**
	 * Describes user reaching tournament location
	 * Also, following events after reaching
	 * Prompts user with choices in playerConvoWithPresident
	 */
	protected void reachTournamentPalace() {
		
		event.playerEntersTournamentPalace();
		event.strangersAcknowledgingPlayer();
		event.playerConvoWithPresident();
	}
	
	/**
	 * Starts tournament: 
	 * 	matchUps 
	 *  fights between player and game characters
	 */
	protected void startTournamentArc() {
		event.tournamentArc();
	}

	/**
	 * Ends tournament via declaring winner
	 * Prints player status: 
	 * 		happy(won) | sad(lost)
	 */
	protected void endTournamentArc() {
		event.endTournamentArc();
	}
	
}



