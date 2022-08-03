package _27July;


public class DoWhile {


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

			int whenToStop = 10;// Hisoka pyschology hack

			while(whenToStop-- > 0){
				
				System.out.println("You're weird, Hisoka.");
			}

		}else {
			System.out.println("\n Maybe it's just wind...");
		}
	}


}



/*
#do-while
if(isItHisoka) {
			System.out.println("Gon(Internally): I'll smash his ego with my best comeback. "
					+ "\n\t\tIt'll hardly takes 10s to shush him away\n");

			int whenToStop = 0;// Hisoka pyschology hack

			do{
				System.out.println("You're weird, Hisoka.");
			}while(whenToStop-- > 0); 

		}else {
			System.out.println("\n Maybe it's just wind...");
		}


#while

#withoutIf
if(isItHisoka) {
			System.out.println("Gon(Internally): I'll smash his ego with my best comeback. "
					+ "\n\t\tIt'll hardly takes 10s to shush him away\n");

			int whenToStop = 10;// Hisoka pyschology hack: he made it zero

			while(whenToStop-- > 0){
				System.out.println("You're weird, Hisoka.");
			}

		}else {
			System.out.println("\n Maybe it's just wind...");
		}


#withIf
		if(isItHisoka) {
			System.out.println("Gon(Internally): I'll smash his ego with my best comeback. "
					+ "\n\t\tIt'll hardly takes 10s to shush him away\n");

			int whenToStop = 10;// Hisoka pyschology hack
			
			while(isItHisoka){
				
				System.out.println("You're weird, Hisoka.");
				
				if(whenToStop-- < 0)
					break;
			}
			
		}else {
			System.out.println("\n Maybe it's just wind...");
		}
	}

.................................................................................................................................................
System.out.println("Gon was admiring Killua, until ___ pops up.");

		boolean isItHuman = false;
		int whenToStop = 100;



		do {
			System.out.println("Hisoka is pretty powerful? Right");
			System.out.println("Hisoka is pretty powerful? Right");

			if(whenToStop-- ==0)
				break;
		}while(isItHuman);

		//alternative

		//do
		System.out.println("Hisoka is pretty powerful? Right");
		//only while
		while(isItHuman) {
			System.out.println("Hisoka is pretty powerful? Right");
			if(whenToStop-- ==0)
				break;
		}


 */