package kashap_Q2.copy;

/**
 * @author Kashyap
 * Movie class
 */
public class Movie {

	String name;
	Integer rating;
	

	public Movie() {
		this.name = "Dune";
		this.rating = 3;
	}
	
	public Movie(String name, Integer rating) {
		this.name = name;
		this.rating = rating;
	}

	//getters setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
