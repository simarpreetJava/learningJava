package proj.hunterXhunter.execute;

import proj.hunterXhunter.game.GameExecutor;

/**
 * @author Ravi dineshbai Patel
 * GameDescription:  Interactive fiction (IE)
 * 	+ Linear text based game.
 *  + Gives choices to players.
 *  + 2 playable characters
 *  + fighting mechanism: attack | defend
 * ClassDescription: 
 *    Responsible for running the game.
 * 
 */
public class EntryPoint {
	
	/**
	 * @param args
	 * main method for initializing the code
	 */
	public static void main(String[] args) {
		
			GameExecutor hunterXhunter = new GameExecutor();
			hunterXhunter.startGame();
	}
}


