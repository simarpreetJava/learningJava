package _29July;

/**
 * 8.35pm - 10.07pm
 *
 */
public class LearnClass {
	public static void main(String[] args) {

		for(int contestantNumber = 1; contestantNumber <= 6; contestantNumber++) {
			
			System.out.println("Contestant #" + contestantNumber);
		}
		
	}
}	
/*
	
	
	String[] contestants = {"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Wing"};
		//						#99		   #44     #

		int[] contestantNumbers = {44, 405, 99, 67,79, 0};
		
		// I want their superpowers info
		// I want their team info
		// I want their stats
		// I want their weakness spot
		
		//sarya de arrays?
		//counter -> classes
		//10 arrays
		//1 class da array bnavage -> uhde ch info hougi
		//1 array - 1 class rather than 10s of arrays
		

		//scalability
	
	----------------------
	String[] contestants = {"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Wing"};
		//						#99		   #44     #

		int[] contestantNumbers = {44, 405, 99, 67,79, 0};

		for(int contestantNumber = 1; contestantNumber <= 6; contestantNumber++) {

			System.out.println("Contestant #" + contestantNumber);
		}
		
		System.out.println("\n\n----Name Update----\n\n");
		
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			
			System.out.println("Contestant #" + (position++) //1->2->update->use 
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}
		
		--------------------
	
	
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			
			System.out.println("Contestant #" + (++position ) //1->2->update->use 
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}
	
	position = position + 1 ===> ++position // value lao -> +1 kro  -> update kro -> use kro
	
	position++			phla use kro -> then value ch plus kro -> update kro
	
			
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			
			System.out.println("Contestant #" + (position = position + 1 ) //1->2->update->use 
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}
		
	
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			
			System.out.println("Contestant #" + (position + 1 ) //1->2->use | 1->2->use
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}
	
	
	
	System.out.println("\n\n----Name Update----\n\n");
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			System.out.println("Contestant #" + position++
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}
		
	
	//limit 0->5 ~ array size | length
		//2 vaari -> index++
		// 6 < 5
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			//index: 0, 2, 4, 6
			System.out.println("Contestant #" + (index + 1)//0 -> 1 ->  use
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
			//index: 1, 2, 3, 5
		}	
	
	
	System.out.println("\n\n----Name Update----\n\n");
		//limit 0->5 ~ array size | length
		//2 vaari -> index++
		// 6 < 5
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			//index: 0, 2, 4, 6
			System.out.println("Contestant #" + (index = index + 1)//0 -> 1 -> index:1 -> use
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
			//index: 1, 2, 3, 5
		}

//limit 0->5 ~ array size | length
		//2 vaari -> index++
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			//123456
			//0123456
			System.out.println("Contestant #" + (index++)
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}

##

	System.out.println("\n\n----Name Update----\n\n");
		int position = 1;
		for(int index = 0; index < contestantNumbers.length; index++) {//array nu dekh reha
			
			System.out.println("Contestant #" + position++ 
											  + " -- " 
											  + contestants[index]
											  + " , Number: " 
											  + contestantNumbers[index]
								);
		}

####

		String[] contestants = {"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Wing"};
		//						#99		   #44     #

		int[] contestantNumbers = {44, 405, 99, 67,79, 0};

		for(int index = 0; index < contestants.length; index++) {


			//new
			System.out.println("Contestant #" + contestantNumbers[index] 
					  						  + " -- " 
					  						  + contestants[index]
							  );

		}
	}
21321321321
	String[] contestants = {"Hisoka", "Gon", "Killua", "Kurapika", "Leoreo", "Wing"};
		//						#99		   #44     #

		int[] contestantNumbers = {44, 405, 99, 67,79, 0};

		for(int contestantNumber = 0; contestantNumber < contestants.length; contestantNumber++) {

			//old
			System.out.println("Contestant #" + contestantNumbers 
											  + " -- " 
											  + contestants[contestantNumber]);


			//new
			System.out.println("Contestant #" + contestantNumbers[contestantNumber] 
					  						  + " -- " 
					  						  + contestants[contestantNumber]
	  );
		}


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