package Mansi_Q2;

public class TestHarnessSecond {

	public static void main(String[] args) {
		
		Sport volleyball = new Sport();
		System.out.println("Sport name: " + volleyball.getName());
		System.out.println("Sport popularity: "+ volleyball.getPopularityRate());
		System.out.println("==================================================================\n");
		System.out.println("==================================================================\n");
		
		Sport hockey = new Sport("Hockey", 40);
		System.out.println("Sport name: " + hockey.getName());
		System.out.println("Sport popularity: "+ hockey.getPopularityRate());
		System.out.println("==================================================================\n");
		System.out.println("==================================================================\n");
	}
}
