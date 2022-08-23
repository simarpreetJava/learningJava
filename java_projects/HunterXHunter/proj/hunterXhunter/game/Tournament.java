package proj.hunterXhunter.game;

import java.util.Random;


import proj.hunterXhunter.characters.Freecs;
import proj.hunterXhunter.characters.Kurta;
import proj.hunterXhunter.characters.Paradinight;
import proj.hunterXhunter.characters.Person;
import proj.hunterXhunter.characters.Zorudikuu;
import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;
import proj.hunterXhunter.utilities.Utility;

/**
 * @author Ravi dineshbai Patel
 * Responsible for managing a tournament
 * Keep check on player status of a match
 * Fetches winner of the match and update record
 * Fetches winner of the tournament in the end
 */
public class Tournament {
	private String player;
	private Person[] allCharacters;
	private Person[] contestants;
	private String[] contestantNames;
	private Integer numberOfContestants;
	private String[][] contestantStatus;
	private static Utility util = new Utility();

	/**
	 * default initialization restricted
	 */
	private Tournament() {
		Person[] tmp = {new Freecs(), 
				new Zorudikuu(),
				new Kurta(),
				new Paradinight(),
		};
		allCharacters = tmp;
	}

	/**
	 * @param player
	 * Parameterized constructor with constructor overloading
	 * fills data for 
	 * 	+ contestants(candidates) class obj in tournament
	 * 	+ contestants only last names
	 * 	+ number of contestants
	 *  + contestants'status: ELIGIBLE 
	 */
	public Tournament(Person player) {
		this();
		this.player = player.getLastName();
		populateContestants(player);
		populateContestantNamesAndNumber();
		populateContestantStatus();
	}
	/**
	 * @param player
	 * fills contestant array with players
	 */
	private void populateContestants(Person player) {
		contestants= new Person[4];

		int i=0;
		contestants[i] = player;

		for(Person contestant: allCharacters) {

			String contestantName = contestant.getLastName();
			if(!this.player.equalsIgnoreCase(contestantName)) {
				contestants[++i]=contestant;
			}
		}
	}
	/**
	 * fills contestant array with name | status
	 * eg:
	 * [	[Freecs, ELIGIBLE]		]
	 * [	[Kurapika, ELIGIBLE]	]
	 */
	private void populateContestantStatus() {
		contestantStatus = new String[numberOfContestants][2];
		for(int i=0; i<numberOfContestants;i++) {
			for(int j=0; j<contestantStatus[i].length;j++) {
				if(j==0)
					contestantStatus[i][j] = this.contestantNames[i];
				else
					contestantStatus[i][j] = GlobalConstants.ELIGIBILE;
			}
		}
	}
	/**
	 * fills number of contestant
	 * fills contestant names
	 */
	private void populateContestantNamesAndNumber() {
		numberOfContestants = contestants.length;

		String[] tmp = new String[numberOfContestants];
		contestantNames = tmp;

		for(int i =0; i<tmp.length; i++) {
			contestantNames[i]=contestants[i].getLastName();
		}
		contestantNames = tmp;
	}
	/**
	 * @param player
	 * @return matchUp for the tournament
	 * eg:
	 * 	[	[Freecs, Kurapika]			]
	 * 	[	[Zorrudiku, Paradinight]	]
	 */
	public Person[][] randomMatchUp(Person player){
		Person[][]  ret = new Person[this.numberOfContestants/2][2];
		Random rand = new Random();
		Integer randomCharacter = 1 + rand.nextInt(3);

		ret = setPlayerAtPosition0(player, ret, randomCharacter);
		ret = setRestOfCharacters(ret, randomCharacter);

		return ret;
	}

	/**
	 * @param ret
	 * @param randomCharacter
	 * @return matchUps
	 * set 2nd match with random character except player
	 */
	private Person[][] setRestOfCharacters(Person[][] ret, Integer randomCharacter) {
		if(randomCharacter<contestants.length-1)
			ret[1][1] = contestants[contestants.length-1];
		else
			ret[1][1]=contestants[contestants.length-randomCharacter];

		if(randomCharacter%2==1) 
			ret[1][0]=contestants[contestants.length/2];
		else
			ret[1][0]=contestants[randomCharacter-1];
		
		return ret;
	}

	/**
	 * @param player
	 * @param ret
	 * @param randomCharacter
	 * @return matchUp
	 * set 1st match having player vs random character
	 */
	private Person[][] setPlayerAtPosition0(Person player, Person[][] ret, Integer randomCharacter) {
		ret[0][0]=player;
		ret[0][1]=this.contestants[randomCharacter];
		return ret;
	}
	/**
	 * @param matchUps
	 * @return tournament winner
	 * responsible for fighting player and characters in tournament
	 */
	public String fightUntilWinner(Person[][] matchUps) {
		String ret = GlobalConstants.EMPTY_STRING;

		util.printSlowly(CharactersConstants.ELIMINATION_PHASE, GlobalConstants.TEXT_TIME);
		getRoundClearedContestants(matchUps, CharactersConstants.CLEARED, CharactersConstants.JUDGING);
		matchUps = updateMatchUps(matchUps);
		util.printSlowly(CharactersConstants.FINAL_PHASE, GlobalConstants.TEXT_TIME);
		ret = getRoundClearedContestants(matchUps, CharactersConstants.WINNER, CharactersConstants.ELIMINATED);

		return ret;
	}
	/**
	 * @param matchUps
	 * @param status
	 * @return match winner
	 * responsible for fighting a match
	 */
	private String getRoundClearedContestants(Person[][] matchUps, String winnerStatus, String restStatus) {
		String winner = GlobalConstants.EMPTY_STRING;
		for(Person[] matchUp: matchUps) {
			String roundStart = printRoundStart();
			util.printSlowly(roundStart, GlobalConstants.TEXT_TIME);
			winner = fightRound(winner, matchUp);
			printWinnerOfRound(winner);
			updateContestantsStatus(winner,winnerStatus,restStatus);
			printRoundResult();
		}
		return winner;
	}

	private void printWinnerOfRound(String winner) {
		String winnerOfRound = String.join(GlobalConstants.BLANK_SPACE,
					CharactersConstants.WINNER_OF,
					CharactersConstants.ROUND,
					winner);
		util.printSlowly(GlobalConstants.EMPTY_LINE, GlobalConstants.TEXT_TIME);
		util.printSlowly(winnerOfRound, GlobalConstants.TEXT_TIME);
		util.printSlowly(GlobalConstants.EMPTY_LINE, GlobalConstants.TEXT_TIME);
	}

	private String printRoundStart() {
		util.printSlowly(GlobalConstants.EMPTY_LINE, GlobalConstants.TEXT_TIME);
		String roundStart = String.join(GlobalConstants.BLANK_SPACE,
					CharactersConstants.ROUND,
					CharactersConstants.START);
		return roundStart;
	}
	/**
	 * @param matchUps
	 * @return matchUps
	 * update matchUp array after a match
	 */
	private Person[][] updateMatchUps(Person[][] matchUps) {
		Person[] qualifiedContestants = populateQualifiedContestants(matchUps);
		Person[][] newMatchUps = new Person[qualifiedContestants.length/2][2];
		newMatchUps[0] = qualifiedContestants;
		return newMatchUps;
	}
	/**
	 * @param matchUps
	 * @return passedContestants
	 * after 1st round, ie, 2 match
	 * 	winner of both match will be extracted
	 */
	private Person[] populateQualifiedContestants(Person[][] matchUps) {
		Person[] qualifiedContenstants = new Person[matchUps.length];
		int index = 0;
		for(String[] q: contestantStatus) {
			if(q[1].equalsIgnoreCase(CharactersConstants.CLEARED)) {
				for(Person[] contestants:matchUps) {
					for(Person contestant: contestants) {
						if(contestant.getLastName().equalsIgnoreCase(q[0])) {
							qualifiedContenstants[index++] = contestant;
						}
					}
				}
			}
		}
		return qualifiedContenstants;
	}
	/**
	 * 
	 */
	private void printRoundResult() {
		for(String[] q: contestantStatus) {
			for(String j: q) {
				String playerStatus; 
				if(j.equalsIgnoreCase(CharactersConstants.FREECS))
				playerStatus = String.join(GlobalConstants.TAB, 
										   GlobalConstants.TAB, 
										   j+CharactersConstants.NAME_SPACE, 
										   GlobalConstants.TAB);
				else if(j.equalsIgnoreCase(CharactersConstants.KURTA))
					playerStatus = String.join(GlobalConstants.TAB, 
											   GlobalConstants.TAB, 
											   j+CharactersConstants.NAME_SPACE+CharactersConstants.NAME_SPACE, 
											   GlobalConstants.TAB);
				else
				playerStatus = String.join(GlobalConstants.TAB, 
										   GlobalConstants.TAB, 
										   j, 
										   GlobalConstants.TAB);
				util.printSlowlyWithoutNewLine(playerStatus, GlobalConstants.TEXT_TIME);
			}
			util.printSlowlyWithoutNewLine(GlobalConstants.EMPTY_LINE, GlobalConstants.TEXT_TIME);
		}
	}
	/**
	 * @param winner
	 * @param matchUp
	 * @return winner of a match
	 * 
	 */
	private String fightRound(String winner, Person[] matchUp) {
		printGraphicFight(matchUp);

		boolean shouldBotsFightOrNot=true;
		for(Person p: matchUp) {
			if(p.getLastName().equalsIgnoreCase(player)) {
				shouldBotsFightOrNot=false;
				winner = playerVsBot(matchUp);
			}
		}
		if(shouldBotsFightOrNot) {
			winner = chooseRandomWinnerFromBots(matchUp);
		}
		return winner;
	}

	private void printGraphicFight(Person[] matchUp) {
		String playerVsBotArt = String.join(GlobalConstants.EMPTY_STRING, 
				                                 matchUp[0].getFightStance(),
				                                 CharactersConstants.FIGHT_VS,
				                                 matchUp[1].getFightStance());
		String playerVsBot_Name = String.join(GlobalConstants.BLANK_SPACE,
											  GlobalConstants.EMPTY_LINE,
											  GlobalConstants.EMPTY_LINE,
								              matchUp[0].getFullName(),
								              CharactersConstants.VS,
								              matchUp[1].getFullName());
		util.printSlowly(playerVsBotArt, GlobalConstants.GRAPHIC_TIME);
		util.printSlowly(playerVsBot_Name, GlobalConstants.GRAPHIC_TIME);
	}
	/**
	 * @param winner
	 * @param winnerStatus
	 * 
	 * update contestant status, after a match
	 */
	private void updateContestantsStatus(String winner, String winnerStatus, String restStatus) {
		for(String[] contestant: contestantStatus) {
			if(contestant[0].equalsIgnoreCase(winner)) 
				contestant[1] = CharactersConstants.CLEARED;
			else if(contestant[1] != winnerStatus)
				contestant[1] = restStatus;
		}
	}
	/**
	 * @param matchUp
	 * @return winner
	 * @prompt
	 * player fights a character in game
	 * attack | defend
	 */
	private String playerVsBot(Person[] matchUp) {

		Person player = (this.player == matchUp[0].getLastName()) ? matchUp[0] : matchUp[1];
		Person bot = (this.player != matchUp[0].getLastName()) ? matchUp[0] : matchUp[1];
		Fight fight = new Fight(player, bot);
		String winner = fight.beginMatch();
		return winner;
	}
	/**
	 * @param matchUp
	 * @return winner(bot)
	 * if bot fights with each, then a random winner is chosen
	 * instead of showing a fight between them
	 */
	private String chooseRandomWinnerFromBots(Person[] matchUp) {

		Random rand = new Random();
		Integer index = rand.nextInt(1);

		Person winner = matchUp[index];
		String winnerName = winner.getLastName();

		return winnerName;
	}
}


