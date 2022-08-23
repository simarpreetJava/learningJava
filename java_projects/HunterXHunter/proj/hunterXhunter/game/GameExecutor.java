package proj.hunterXhunter.game;

import proj.hunterXhunter.constants.GlobalConstants;
import proj.hunterXhunter.utilities.Utility;

/**
 * @author Ravi dineshbai Patel
 * This class is responsible for 
 * 	+ looping game whole code
 * 		: In other words, asking whether to reRun code or not
 *  + execute the game story code.
 *  + It makes uses of utility and game story classes via composition
 */
public class GameExecutor {
	private static Utility util = new Utility();
	private static GameStory story = new GameStory();

	/**
	 * Executes the primary code(gameStory)
	 * Handles whether whole code should be reRun or not
	 * Also, responsible for any open resource like scanner obj
	 */
	public void startGame() {
		String startAgain = GlobalConstants.NO;

		try {
			do {
				GameExecutor.executeStory();
				startAgain = util.promptUser(GlobalConstants.PLAY_AGAIN, 
											 GlobalConstants.GRAPHIC_TIME);
			}while(GlobalConstants.YES.equalsIgnoreCase(startAgain));
			util.printSlowly(GlobalConstants.THANK_YOU, 
							 GlobalConstants.GRAPHIC_TIME);
		}catch(Exception e){
			util.printSlowly(GlobalConstants.ERROR, 
							 GlobalConstants.TEXT_TIME);
		}finally {
			util.closeResources();
		}
	}

	
	/**
	 * Execute various main events in the game story
	 * Makes use of GameStory class for accessing the events.
	 */
	private static void executeStory() {

		story.intro();
		story.chooseCharacterType();
		story.collectPlayerDetails();
		
		story.journeyToTournament();
		story.reachTournamentPalace();
		
		story.startTournamentArc();
		story.endTournamentArc();
		
	}
}



