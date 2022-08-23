package simar_Q2;

/**
 * @author Simarpreet Kaur
 * Noun class for anime 
 * Has name of the anime and its rating
 */
public class Anime {

	String name;
	Integer rating;
	
	/**
	 * sets default name and rating
	 */
	public Anime() {
		this.name = "Hunter X Hunter";
		this.rating = 5;
	}
	
	/**
	 * @param name
	 * @param rating
	 * parameterized constructor
	 */
	public Anime(String name, Integer rating) {
		this.name = name;
		this.rating = rating;
	}

	/**
	 * @return
	 * getter anime name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * setter anime name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 * getter anime rating
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating
	 * setter anime rating
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
