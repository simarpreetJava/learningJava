package proj.hunterXhunter.game;

import java.util.Random;

import proj.hunterXhunter.characters.Person;
import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;
import proj.hunterXhunter.utilities.FightUtility;
import proj.hunterXhunter.utilities.Utility;

/**
 * @author Ravi dineshbai Patel
 * Responsible for simulating a fight between a player and a bot
 * It provides dynamic functionality in fight instead of being static
 * player can choose to attack or defend, similarly for bot.
 */
public class Fight{
	private static FightUtility fUtil = new FightUtility();
	private static Utility util = new Utility();
	private Person player;
	private Person bot;
	private Integer playerHP;
	private Integer botHP;
	private String turn = GlobalConstants.EMPTY_STRING;
	private String playerPrevAction = GlobalConstants.EMPTY_STRING;
	private String botPrevAction = GlobalConstants.EMPTY_STRING;
	private String[] options;
	/**
	 * default constructor
	 * populates options used by player and bot
	 * attack | defend
	 */
	private Fight(){
		String[] options = {CharactersConstants.OPTION_ATTACK, 
							CharactersConstants.OPTION_DEFEND};
		this.options= options; 
	}
	/**
	 * @param player
	 * @param bot
	 * Parameterized constructor
	 * constructor overloading
	 * populate fields
	 */
	public Fight(Person player, Person bot) {
		this();
		this.player = player;
		this.bot = bot;
		this.playerHP = player.getHp();
		this.botHP = bot.getHp();
	}
	/**
	 * @return winner
	 * responsible for fight between player and bot
	 * updates turn, which is used to switch between bot and player
	 * loops while one of the contestant hp<0
	 * returns winner last name
	 */
	public String beginMatch() {
		util.printSlowly(CharactersConstants.FIGHT_ON, GlobalConstants.FIGHT_TIME);
		util.printSlowly(getAllHpStatusStatement(), GlobalConstants.FIGHT_TIME);

		turn = player.getFirstName();

		final String playerName = player.getFirstName();
		final String botName = bot.getFirstName();
		
		while(playerHP > 0 && botHP >0) {
			if(turn.equalsIgnoreCase(playerName)) {
				playerFights(playerName, botName);
			}else if (turn.equalsIgnoreCase(botName)) {
				botFights(playerName, botName);
			}
		}
		String winner = playerHP > botHP ? player.getLastName():bot.getLastName();
		return winner;
	}
	/**
	 * @param playerName
	 * @param botName
	 * responsible for bot actions in a fight
	 */
	private void botFights(final String playerName, final String botName) {
		String option = getRandomOption();
		botDecidesActionAndAct(botName, playerName, option);
		turn  = playerName;
	}
	/**
	 * @param playerName
	 * @param botName
	 * responsible for player actions in a fight
	 */
	private void playerFights(final String playerName, final String botName) {
		String option = getOptionFromPlayer();
		playerDecidesActionAndAct(playerName, botName, option);
		turn = botName;
	}
	/**
	 * responsible for getting player option in a fight
	 */
	private String getOptionFromPlayer() {
		util.showOptions(options);
		String option =util.promptUser();
		option = util.validateOptionsAndReprompt(option, options);
		option = getEquivalentChoiceFromOptions(option);
		return option;
	}
	/**
	 * @param botName
	 * @param playerName
	 * @param option
	 * responsible for bot actions in a fight
	 */
	private void botDecidesActionAndAct(final String botName, final String playerName, String option) {
		switch(option) {
		case CharactersConstants.OPTION_ATTACK: 
			botAttack(botName, playerName);
			break;
		case CharactersConstants.OPTION_DEFEND:
			botPrevAction = CharactersConstants.OPTION_DEFEND;
			break;
		}
	}
	/**
	 * @param playerName
	 * @param botName
	 * @param option
	 * responsible for player actions in a fight
	 */
	private void playerDecidesActionAndAct(final String playerName, String botName, String option) {
		switch(option) {
		case CharactersConstants.OPTION_ATTACK:
			playerAttack(playerName, botName);
			break;
		case CharactersConstants.OPTION_DEFEND:
			playerPrevAction = CharactersConstants.OPTION_DEFEND;
			break;
		}
		util.printSlowly(getAllHpStatusStatement(), GlobalConstants.FIGHT_TIME);
	}
	/**
	 * @param playerName
	 * @param 
	 * responsible for player attack actions in a fight
	 */
	private void playerAttack(final String playerName, final String botName) {
		playerPrevAction = CharactersConstants.OPTION_ATTACK;
		util.printSlowly(getAttackStatement(playerName), GlobalConstants.FIGHT_TIME);
		
		switch(botPrevAction) {
		case CharactersConstants.OPTION_ATTACK: 
			util.printSlowly(getPlayerAttacksBot(), GlobalConstants.FIGHT_TIME);
			botHP -= player.getAtt();
			break;
			
		case CharactersConstants.OPTION_DEFEND: 
			util.printSlowly(getDefendStatement(botName), null);
			util.printSlowly(getPlayerAttacksBotDef(), GlobalConstants.FIGHT_TIME);
			botHP -= player.getAtt() + bot.getDef();
			break;
		default: 
		}
	}
	/**
	 * @param botName
	 * @param playerName
	 * responsible for bot attack actions in a fight
	 */
	private void botAttack(final String botName, final String playerName) {
		botPrevAction = CharactersConstants.OPTION_ATTACK;
		util.printSlowly(getAttackStatement(botName), GlobalConstants.FIGHT_TIME);

		switch(playerPrevAction) {
		case CharactersConstants.OPTION_ATTACK: 
			util.printSlowly(getBotAttacksUser(), GlobalConstants.FIGHT_TIME);
			playerHP -= bot.getAtt();
			
			break;
		case CharactersConstants.OPTION_DEFEND:
			util.printSlowly(getDefendStatement(playerName), GlobalConstants.FIGHT_TIME);
			util.printSlowly(getBotAttacksUserDef(), GlobalConstants.FIGHT_TIME);
			playerHP -= bot.getAtt() + player.getDef();
			break;
		default: 
		}
		util.printSlowly(getAllHpStatusStatement(), GlobalConstants.FIGHT_TIME);
	}
	/**
	 * @param option
	 * @return Attacks, Defend from options
	 * responsible for choice corresponding to player input 
	 * A->Attacks
	 * B->Defends
	 */
	private String getEquivalentChoiceFromOptions(String option) {
		String ret = GlobalConstants.EMPTY_STRING;
		
		if(option.equalsIgnoreCase(GlobalConstants.A))
			ret = options[0];
		else
			ret = options[1];
		
		return ret;
	}
	
	/**
	 * @return attack statement
	 * generates print stmt when player attack bot
	 */
	private String getPlayerAttacksBot() {
		String ret = String.join(GlobalConstants.BLANK_SPACE,
				getBotHpStatement(),
				GlobalConstants.HYPHEN,
				getPlayerAttackStatement());
		return ret;
	}
	/**
	 * @return attack statement
	 * generates print stmt when bot attack player
	 */
	private String getBotAttacksUser() {
		String ret = String.join(GlobalConstants.BLANK_SPACE,
				getPlayerHpStatement(),
				GlobalConstants.HYPHEN,
				getBotAttackStatement());
		return ret;
	}
	/**
	 * @return attack statement with defence
	 * generates print stmt when player attack bot who chose to defend
	 */
	private String getPlayerAttacksBotDef() {
		String ret = String.join(GlobalConstants.BLANK_SPACE,
				getBotHpStatement(),
				GlobalConstants.PLUS,
				getBotDefStatement(),
				GlobalConstants.HYPHEN,
				getPlayerAttackStatement());
		return ret;
	}
	/**
	 * @return attack statement with defend
	 * generates print stmt when bot attack player who chose to defend
	 */
	private String getBotAttacksUserDef() {
		String ret = String.join(GlobalConstants.BLANK_SPACE,
				getPlayerHpStatement(),
				GlobalConstants.PLUS,
				getPlayerDefStatement(),
				GlobalConstants.HYPHEN,
				getBotAttackStatement());
		return ret;
	}
	/**
	 * @param name
	 * @return defend statement
	 * generates defend statement action chosen by bot or player
	 */
	private String getDefendStatement(String name) {
		String ret = String.join(GlobalConstants.EMPTY_STRING, 
				name,
				GlobalConstants.COLON_SPACE,
				CharactersConstants.OPTION_DEFEND);
		return ret;
	}
	/**
	 * @param name
	 * @return attack statement action
	 * generates attack statement action chosen by bot or player
	 */
	private String getAttackStatement(String name) {
		String ret = String.join(GlobalConstants.EMPTY_STRING, 
				name,
				GlobalConstants.BLANK_SPACE,
				CharactersConstants.OPTION_ATTACK);
		return ret;
	}
	/**
	 * @return option
	 * random option attack | defend for bot
	 */
	private String getRandomOption() {
		Random rand = new Random();
		Integer botAction = rand.nextInt(1);
		String option = options[botAction];
		return option;
	}
	/**
	 * @return hp bar
	 * generates statement showing updated HP of player and bot
	 */
	private String getAllHpStatusStatement() {
		String ret = String.join(GlobalConstants.BLANK_SPACE,
				getPlayerHpStatement(),
				GlobalConstants.TAB,
				getBotHpStatement());
		return ret;
	}
	/**
	 * @return hp statment
	 * generates HP statement used in HP bar
	 */
	private String getPlayerHpStatement() {
		String ret = fUtil.createHpStatement(player, playerHP);
		return ret;
	}
	/**
	 * @return hp statmenet
	 * generates HP statement used in HP bar
	 */
	private String getBotHpStatement() {
		String ret = fUtil.createHpStatement(bot, botHP);
		return ret;
	}
	/**
	 * @return defend statement
	 * generates defend statement used in actions
	 */
	private String getPlayerDefStatement() {
		String ret = fUtil.createDefendStatement(player);
		return ret;
	}
	/**
	 * @return attack statement
	 * generates attack statement for player
	 */
	private String getPlayerAttackStatement() {
		String ret = fUtil.createAttackStatement(player);
		return ret;
	}
	/**
	 * @return defend statement
	 * generates defend statement for bot
	 */
	private String getBotDefStatement() {
		String ret = fUtil.createDefendStatement(bot);
		return ret;
	}
	/**
	 * @return attack statement
	 * generates attack statement for bot
	 */
	private String getBotAttackStatement() {
		String ret = fUtil.createAttackStatement(bot);
		return ret;
	}
}