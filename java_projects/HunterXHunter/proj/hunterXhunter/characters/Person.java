package proj.hunterXhunter.characters;

import proj.hunterXhunter.constants.GlobalConstants;

/**
 * @author Simarpreet kaur
 * Abstract class for character classes like:Freecs.class, Kurta.class etc.
 * includes getters and setters
 * For flexibility in game code
 */
public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String town;
	private String wonArt;   
	private String lostArt;  
	private String fightStance;  
	public String getFightStance() {
		return fightStance;
	}
	public void setFightStance(String fightStance) {
		this.fightStance = fightStance;
	}
	private Integer hp; 
	private Integer att;
	private Integer def;

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
