package _25July;

public class While {

	
	public static void main(String[] args) {

		System.out.println("Gon was admiring Killua, until ___ pops up.");
		
		boolean isItHisoka = true;
		int whenToStop = 100;

		
		
		
		while(isItHisoka) {
			System.out.println("Gon To Hisoka: You're weird!");
			
			if(whenToStop-- ==0)
				break;
//			break;
//			System.out.println();
		}
	}
	

}



/*




0th

	public static void main(String[] args) {

		System.out.println("Gon was admiring Killua, until ___ pops up.");
		
		boolean isItHisoka = true;

		while(isItHisoka) {
			System.out.println("Gon To Hisoka: You're weird!");
		}
	}




NOtes

	public static void main(String[] args) {

		//infinitely
		//killua happi

		//hisoka toh kheej
		//pattern
		//boolean: true | false
		//binary - 0|1

		System.out.println("Gon is planning something...");
		boolean start = true;
		int whenToStop = 100;
		
		
		//dead sure | maybe: variables|conditions
		
		while(start) {//confused: in start: yes | no
			
			System.out.println("Gon To Hisoka: You're weird");

			whenToStop = whenToStop-1;
			
			if(whenToStop == 0) { 
				break;//stop it already!
			}// he's confused
			
			System.out.println();
			
//			break;// while loop break kr deni: dead sure about it
//			System.out.println();
		}

		System.out.println("Gon to Hisoka: Are you satisfied now? ");
	}


	private static void gonIrritatingHisoka(int whenToStop) {

		System.out.println("Gon To Hisoka: You're weird");

		//boolean: true | false --- 
		if(whenToStop == 0) { }//tu hun apne aap nu call ni krna 
		else {				
			gonIrritatingHisoka(whenToStop--); 
		}
	}

	// we'll do nothing when value is 100
	// else, we'll keep pounding Hisoka.


4th

	public static void main(String[] args) {

		//infinitely
		//killua happi

		//hisoka toh kheej
		//pattern
		//boolean: true | false
		//binary - 0|1

		System.out.println("Gon is planning something...");
		boolean start = true;
		int whenToStop = 100;
		
		
		//dead sure | maybe: variables|conditions
		
		while(start) {//confused: in start: yes | no
			
			System.out.println("Gon To Hisoka: You're weird");

			whenToStop = whenToStop-1;
			
			if(whenToStop == 0) { 
				break;//stop it already!
			}// he's confused
			
			System.out.println();
			
//			break;// while loop break kr deni: dead sure about it
//			System.out.println();
		}

		System.out.println("Gon to Hisoka: Are you satisfied now? ");
	}





3rd
	public static void main(String[] args) {

		//infinitely
		//killua happi

		//hisoka toh kheej
		//pattern
		//boolean: true | false
		//binary - 0|1

		System.out.println("Gon is planning something...");
		boolean start = true;
		int whenToStop = 100;

		while(start) {

			System.out.println("Gon To Hisoka: You're weird");

			whenToStop = whenToStop-1;
			if(whenToStop == 0) { 
				break;//stop it already!
			}
		}

		System.out.println("Gon to Hisoka: Are you satisfied now? ");
	}



Fresher: code chl je bss yr, yehi duya h
intermediate: syntax must be top-notch
veteran: memory level thing + performance of the code + scalability: code should be able to withstand for a certain period of time

 */