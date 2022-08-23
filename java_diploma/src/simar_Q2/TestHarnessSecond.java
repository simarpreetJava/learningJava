package simar_Q2;

/**
 * @author Simarpreet Kaur
 * To test Anime class
 */
public class TestHarnessSecond {

	//variables used
	private static final String ANIME_NAME  = "Anime name: ";
	private static final String ANIME_RATING  = "Anime rating: ";
	private static final String DASHED_LINE = "-----------------------------------------";

	
	/**
	 * @param args
	 * main method to test the functionality
	 */
	public static void main(String[] args) {
		
		Anime hunterXhunter = new Anime();
		printAnime(hunterXhunter);
		System.out.println(DASHED_LINE);
		Anime demonSlayer = new Anime("Demon Slayer", 4);
		printAnime(demonSlayer);
	}
	
	/**
	 * @param anime
	 * prints fields of the anime object
	 */
	private static void printAnime(Anime anime) {
		System.out.println(ANIME_NAME + anime.getName());
		System.out.println(ANIME_RATING + anime.getRating());
	}
}
