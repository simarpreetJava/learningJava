package Naman_Q2;

public class TestHarnessSecond {

	public static void main(String[] args) {
		
		VideoGame witcher3 = new VideoGame();
		System.out.println("Video game name: " + witcher3.getName());
		System.out.println("Video game rating: "+ witcher3.getRating());
		System.out.println("==================================================================\n");
		
		VideoGame doom = new VideoGame("Doom", 7);
		System.out.println("Video game name: " + doom.getName());
		System.out.println("Video game rating: "+ doom.getRating());
		System.out.println("==================================================================\n");
	}
}
