package Mansi_Q2;

public class Sport {

	String name;
	Integer popularityRate;
	

	public Sport() {
		this.name = "Volleyball";
		this.popularityRate = 85;
	}
	
	public Sport(String name, Integer rating) {
		this.name = name;
		this.popularityRate = rating;
	}

	//getters setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopularityRate() {
		return popularityRate;
	}

	public void setPopularityRate(Integer popularityRate) {
		this.popularityRate = popularityRate;
	}

}
