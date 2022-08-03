package _28July;

public class Arrays {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] contestants = {"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Wing"};
		
		for(int contestantNumber = 0; contestantNumber < contestants.length; contestantNumber++) {

			System.out.println("Contestant #" + contestantNumber + " -- " + contestants[contestantNumber]);
		}
	}
}	
/*




#2222

		for(int contestantNumber = 1; contestantNumber <= 6; contestantNumber++) {
			
			System.out.println("Contestant #" + contestantNumber);
		}

#1111

int contestantNumber = 1;
System.out.println("Contestant #" + contestantNumber);

#0000
		System.out.println("Contestant #1");
		System.out.println("Contestant #2");
		System.out.println("Contestant #3");
		System.out.println("Contestant #4");
		System.out.println("Contestant #5");
		System.out.println("Contestant #6");
=========================================================



		String[] contestants = 
			{"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Biski", "Wing", "A"};

		//		System.out.println(contestants.length);

		for(int contestantNumber = 0; contestantNumber < contestants.length; contestantNumber++) {

			System.out.print("Contestant #" + contestantNumber);
			System.out.println("--" + contestants[contestantNumber]);//contestants[1]
		}



for(int contestantNumber = 0; contestantNumber <= 6; contestantNumber++) {
	System.out.print("Contestant #" + contestantNumber);
	System.out.println("--" + contestants[contestantNumber]);//contestants[1]
}


//10 people
int contestantNumber = 1;
System.out.println("Contestant #" + contestantNumber + " - Hisoka");
System.out.println("Contestant #" + contestantNumber + " - Gon");
System.out.println("Contestant #" + contestantNumber + " - Killua");
System.out.println("Contestant #" + contestantNumber + " - Kurapika");
System.out.println("Contestant #" + contestantNumber + " - Leoreo");
System.out.println("Contestant #" + contestantNumber + " - Biski");
System.out.println("Contestant #" + contestantNumber + " - Wing");


for(int contestantNumber = 1; contestantNumber <= 10; contestantNumber++) {
	System.out.println("Contestant #" + contestantNumber);
}

while(contestantNumber<=10) {

			System.out.println("Contestant #" + contestantNumber);
			contestantNumber++;
		}
 */