package proj.hunterXhunter.characters;

import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;

/**
 * @author Simarpreet kaur
 * POJO class for character Freecs
 * This is currently playable character
 * includes getters and setters
 * Extends Person abstract class for flexibility in design
 */
public class Freecs extends Person{
	
	private String firstName = CharactersConstants.FREECS_DEFAULT_NAME;
	private String lastName = CharactersConstants.FREECS;
	private String town = CharactersConstants.FREECS_DEFAULT_TOWN;
	private String wonArt = CharactersConstants.FREEC_HAPPY;
	private String lostArt = CharactersConstants.FREECS_SAD;
	private String fightStance = CharactersConstants.FREECS_FIGHT_STANCE;  
	public String getFightStance() {
		return fightStance;
	}
	public void setFightStance(String fightStance) {
		this.fightStance = fightStance;
	}
	private Integer hp = CharactersConstants.FREECS_HP;
	private Integer att = CharactersConstants.FREECS_ATT;
	private Integer def= CharactersConstants.FREECS_DEF;
	
	/**
	 * get full name from the fields
	 */
	public String getFullName() {
		String ret = String.join(GlobalConstants.BLANK_SPACE, 
												   firstName, 
												   lastName);
		return ret;
	}
	/**
	 * gets first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * sets first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return art for winning
	 */
	public String getWonArt() {
		return wonArt;
	}
	/**
	 * @param art for winning
	 */
	public void setWonArt(String wonArt) {
		this.wonArt = wonArt;
	}
	/**
	 * @return art for losing
	 */
	public String getLostArt() {
		return lostArt;
	}
	/**
	 * @param art for losing
	 */
	public void setLostArt(String lostArt) {
		this.lostArt = lostArt;
	}
	/**
	 *gets town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * sets town
	 */
	public void setTown(String town) {
		this.town = town;
	}
	/**
	 * gets last name
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * sets last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * gets hp
	 */
	public Integer getHp() {
		return hp;
	}
	/**
	 * sets hp
	 */
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	/**
	 * gets attack
	 */
	public Integer getAtt() {
		return att;
	}
	/**
	 * sets attack
	 */
	public void setAtt(Integer att) {
		this.att = att;
	}
	/**
	 * gets defence
	 */
	public Integer getDef() {
		return def;
	}
	/**
	 * sets defence
	 */
	public void setDef(Integer def) {
		this.def = def;
	}
}
