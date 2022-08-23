package _20July;

public class MeetingPerson_Switch {

	public static void main(String[] args) {

		String meetingPerson = "killua";
	
		switch(meetingPerson) {

			case "killua": 
					System.out.println("Gon: killua");
			case "Kurapika":
					System.out.println("Gon: Kurapika");
			case "Leoreo": 
				System.out.println("Gon: Leoreo");
			case "Wing":   
					System.out.println("Gon: Wing");
			case "Hisoka": 
					System.out.println("Gon: Hisoka");
		}
		
	}
}
/*

		
		//meetingPerson == "killua"
		// == is implicit in case of switch statements
		// switch -> if
		// case -> condition
		// case is acting like condition if(condition)
		
		
		//= assignment operator
		//== compare: comparison operator
		// syntactic sugar: if else if: haar shingaar | make up
		
		//haar shingar
	
//		if(meetingPerson == "killua"){//killua
//			System.out.println("Gon: killua");
//		}
//		else if(meetingPerson == "Wing"){//Leoreo
//			System.out.println("Gon: Wing");
//		}
//		else if(meetingPerson == "Leoreo"){//Leoreo
//			System.out.println("Gon: Leoreo");
//		}
//		else if(meetingPerson == "Hisoka"){//Hisoka
//			System.out.println("Gon: Hisoka");
//		}
		
//		if(meetingPerson == "killua"){//killua
//		System.out.println("Gon: killua");
//		}
//		else{//100 person, 99 lines of code in else
//			
//			if(meetingPerson == "Wing"){//Leoreo
//				System.out.println("Gon: Wing");
//			}
//			if(meetingPerson == "Leoreo"){//Leoreo
//				System.out.println("Gon: Leoreo");
//			}
//			if(meetingPerson == "Hisoka"){//Hisoka
//				System.out.println("Gon: Hisoka");
//			}
//		}
//		
//		if(meetingPerson == "Leoreo"){//Leoreo
//			System.out.println("Gon: Leoreo");
//		}
//		if(meetingPerson == "Hisoka"){//Hisoka
//			System.out.println("Gon: Hisoka");
//		}
//		
		//old code: true | false khud kr re si | mehnt
		//1st mehnt switch classes | 2nd mehnt: true false
//		if(true){//Kurapika
//			System.out.println("Kurapika");
//		}
//		if(false){//Leoreo
//			System.out.println("Leoreo");
//		}
//		if(false){//Hisoka
//			System.out.println("Hisoka");
//		}
	



*/