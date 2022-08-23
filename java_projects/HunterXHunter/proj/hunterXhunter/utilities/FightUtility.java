package proj.hunterXhunter.utilities;

import proj.hunterXhunter.characters.Person;
import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;

/**
 * @author Naman Attri
 * This class is responsible for having generalized methods 
 * 	seperated from the game logic for Fight.class
 */
public class FightUtility {
	
	/**
	 * @param p
	 * @return statement
	 * creates attack statment
	 * ATT(Gon): 110
	 */
	public String createAttackStatement(Person p) {
		String ret = String.join(GlobalConstants.EMPTY_STRING,
								 CharactersConstants.ATT,
								 GlobalConstants.LEFT_ROUND_BRACKET,
								 p.getFirstName(),
								 GlobalConstants.RIGHT_ROUND_BRACKET,
								 GlobalConstants.COLON_SPACE,
								 p.getAtt().toString());
		return ret;
	}
	/**
	 * @param p
	 * @return statement
	 * creates hp statement
	 * HP(Gon): 500
	 */
	public String createHpStatement(Person p, Integer hp) {
		String ret = String.join(GlobalConstants.EMPTY_STRING,
								 CharactersConstants.HP,
								 GlobalConstants.LEFT_ROUND_BRACKET,
								 p.getFirstName(),
								 GlobalConstants.RIGHT_ROUND_BRACKET,
								 GlobalConstants.COLON_SPACE,
								 hp.toString());
		return ret;
	}
	/**
	 * @param p
	 * @return statement
	 * creates defend statement
	 * DEF(110)
	 */
	public String createDefendStatement(Person p) {
		String ret = String.join(GlobalConstants.EMPTY_STRING,
								 CharactersConstants.DEF,
								 GlobalConstants.LEFT_ROUND_BRACKET,
								 p.getDef().toString(),
								 GlobalConstants.RIGHT_ROUND_BRACKET);
		
		return ret;
	}
}
