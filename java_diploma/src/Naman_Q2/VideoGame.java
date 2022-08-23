package Naman_Q2;

public class VideoGame {

	String name;
	Integer rating;
	

	public VideoGame() {
		this.name = "The Witcher 3";
		this.rating = 10;
	}
	
	public VideoGame(String name, Integer rating) {
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
