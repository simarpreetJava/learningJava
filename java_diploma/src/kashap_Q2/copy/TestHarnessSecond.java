package kashap_Q2.copy;

/**
 * @author Kashyap
 * To test movie class
 */
public class TestHarnessSecond {

	/**
	 * testing movie class
	 */
	public static void main(String[] args) {
		
		Movie dune = new Movie();
		System.out.println("Movie name: " + dune.getName());
		System.out.println("Movie rating: "+ dune.getRating());
		System.out.println("__________________________________________________________________\n");
		
		Movie godfather = new Movie("Godfather", 4);
		System.out.println("Movie name: " + godfather.getName());
		System.out.println("Movie rating: "+ godfather.getRating());
		System.out.println("__________________________________________________________________\n");
	}
}
