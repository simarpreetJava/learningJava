package proj.hunterXhunter.characters;

import proj.hunterXhunter.constants.CharactersConstants;
import proj.hunterXhunter.constants.GlobalConstants;
/**
 * @author Simarpreet kaur
 * POJO class for character Paradinight
 * includes getters and setters
 * Extends Person abstract class for flexibility in design
 */
public class Paradinight extends Person {

	private String firstName = CharactersConstants.PARADINIGHT_DEFAULT_NAME;
	private String lastName = CharactersConstants.PARADINIGHT;
	private String town = CharactersConstants.PARADINIGHT_DEFAULT_TOWN;
	private String fightStance = CharactersConstants.PARADINIGHT_FIGHT_STANCE;  
	public String getFightStance() {
		return fightStance;
	}
	public void setFightStance(String fightStance) {
		this.fightStance = fightStance;
	}
	private Integer hp = CharactersConstants.PARADINIGHT_HP;
	private Integer att = CharactersConstants.PARADINIGHT_ATT;
	private Integer def= CharactersConstants.PARADINIGHT_DEF;

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
