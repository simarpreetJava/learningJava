package _21July;

public class MeetingPerson_IfElseIf {

	public static void main(String[] args) {

		String meetingPerson = "Wing";
		String mood = "sad";

		interactionWithPerson(meetingPerson, mood);
	}


	//	
	//	private static void interactionWithPerson(String meetingPerson, String mood) {
	//		
	//		greetPerson(meetingPerson, mood);
	//		checkMoodAndResponse(meetingPerson, mood);
	//	}
	//	
	private static void interactionWithPerson(String meetingPerson, String mood) {

		if(meetingPerson == "killua"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Kurapika"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Leoreo"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Wing"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
	}

	//	private static void greetPerson(String meetingPerson, String mood) {
	//		System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");
	//	}
	
	
	private static void greetPerson(String meetingPerson, String mood) {
		if(meetingPerson == "Killua"){
			System.out.println("Gon: Killua");
		}
		if(meetingPerson == "Kurapika"){
			System.out.println("Gon: Kurapika");
		}
		if(meetingPerson == "Leoreo"){
			System.out.println("Gon: Leoreo");
		}
		if(meetingPerson == "Wing"){
			System.out.println("Gon: Wing");
		}
	}

	
	private static void checkMoodAndResponse(String meetingPerson, String mood) {
		if(mood == "happy")
			System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
		if(mood == "sad") //else | else if
			System.out.println("Hey, are you alright " + meetingPerson + "."); 
		//we don't need to write 8 lines
	}
}

/*


5th		end

		String meetingPerson = "Wing";
		String mood = "sad";

		interactionWithPerson(meetingPerson, mood);


4th     functions

		String meetingPerson = "Wing";
		String mood = "sad";

		greetPerson(meetingPerson, mood);
		checkMoodAndResponse(meetingPerson, mood);



3rd
		String meetingPerson = "Wing";
		String mood = "sad";

		System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");
		if(mood == "happy")
			System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
		if(mood == "sad")
			System.out.println("Hey, are you alright " + meetingPerson + "."); 


2nd     function

				String meetingPerson = "Wing";
		String mood = "sad";


		if(meetingPerson == "killua"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Kurapika"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Leoreo"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}
		else if(meetingPerson == "Wing"){
			greetPerson(meetingPerson, mood);
			checkMoodAndResponse(meetingPerson, mood);
		}

2nd
	if(meetingPerson == "killua"){//killua
			System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright " + meetingPerson + "."); 
		}
		else if(meetingPerson == "Kurapika"){
			System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright " + meetingPerson + "."); 
		}
		else if(meetingPerson == "Leoreo"){
			System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright " + meetingPerson + "."); 
		else if(meetingPerson == "Wing"){
			System.out.println("Gon Greeting: " + meetingPerson + " (" + mood +")");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright " + meetingPerson + "."); 
		}
		}



1st
		String meetingPerson = "Wing";
		String mood = "sad";

		if(meetingPerson == "killua"){//killua
			System.out.println("Gon Greeting: killua");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, killua, makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright killua."); 
		}
		else if(meetingPerson == "Kurapika"){
			System.out.println("Gon Greeting: Kurapika");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, Kurapika, makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright Kurapika."); 
		}
		else if(meetingPerson == "Leoreo"){
			System.out.println("Gon Greeting: Leoreo");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, Leoreo, makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright Leoreo."); 
		}
		else if(meetingPerson == "Wing"){
			System.out.println("Gon Greeting: Wing");

			if(mood == "happy")
				System.out.println("Hey, seeing you happy, Wing, makes me happy too.");
			if(mood == "sad")
				System.out.println("Hey, are you alright Wing."); 
		}



 */