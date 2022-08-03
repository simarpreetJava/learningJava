package _27July;


public class For {


	public static void main(String[] args) {

		String meetingPerson = "Killua";

		System.out.println("Gon(Internally): Wait, who is that?");
		System.out.println("Gon(Internally): Oh, "+ meetingPerson +"....");

		System.out.println("\nNarrator: Gon was admiring "+ meetingPerson +", until ___ pops up.");

		System.out.println("\nGon(Internally): I'm sensing malicious intent...");
		System.out.println("Gon(Internally): is it Hisoka?");

		boolean isItHisoka = true;
		if(isItHisoka) {
			System.out.println("Gon(Internally): I'll smash his ego with my best comeback. "
					+ "\n\t\tIt'll hardly takes 10s to shush him away\n");

			
			
			for( int whenToStop = 10; whenToStop > 0; whenToStop-- ) {
				
				System.out.println("You're weird, Hisoka.");
			}
			
		}else {
			System.out.println("\n Maybe it's just wind...");
		}
	}


}




/*


#########
		String meetingPerson = "Killua";

		System.out.println("Gon(Internally): Wait, who is that?");
		System.out.println("Gon(Internally): Oh, "+ meetingPerson +"....");

		System.out.println("\nNarrator: Gon was admiring "+ meetingPerson +", until ___ pops up.");

		System.out.println("\nGon(Internally): I'm sensing malicious intent...");
		System.out.println("Gon(Internally): is it Hisoka?");

		boolean isItHisoka = true;
		if(isItHisoka) {
			System.out.println("Gon(Internally): I'll smash his ego with my best comeback. "
					+ "\n\t\tIt'll hardly takes 10s to shush him away\n");

			int whenToStop = 10;
			
			for(  ; whenToStop-- > 0;  ) {
				
				System.out.println("You're weird, Hisoka.");
			}
			
		}else {
			System.out.println("\n Maybe it's just wind...");
		}
	}



----------------------------------------------------------------------------------------
System.out.println("Gon was admiring Killua, until ___ pops up.");


		//Gon was admiring Killua *while* insulting Hisoka. [kini der tak?]
		//Gon was admiring Killua *while* insulting Hisoka for 10 minutes.

		for( int whenToStop = -2; whenToStop <= 5 ; whenToStop++) {
			System.out.println(whenToStop + ": Gon To Hisoka: You're weird!");
		}
		
		//0 ya 1 5
		//15 -> -5
		//05 -> +5
	
		
		//1
		//000000000
		//876543210
		//1
		//4 + 1 -/ 101
		
		//72
		//64(6) + 8(3)
		//00100100
		 
		
		
		//5 ----  true   --- 5->4 -> 0

-------------------

//infinite
//while(true) {
//	
//	System.out.println("Gon To Hisoka: You're weird!");
//}
//
for( ; ; ) {
	System.out.println("Gon To Hisoka: You're weird!");
	
}

//easy to catch mistake
		for(int whenToStop = 100; whenToStop == 0; whenToStop++) {

		}
		//start --> end 
		for(int whenToStop = 100; whenToStop == 0; whenToStop--) {

			System.out.println(whenToStop);
		}

		while(isItHisoka) {
			System.out.println("Gon To Hisoka: You're weird!");

			if(whenToStop-- ==0)
				break;
		}


 */