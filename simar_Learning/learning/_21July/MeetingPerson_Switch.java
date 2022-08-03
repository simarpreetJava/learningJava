package _21July;

public class MeetingPerson_Switch {

	public static void main(String[] args) {

		String meetingPerson = "Kurapika";
		String mood = "sad";

 		System.out.println("Gon Greeting: " + meetingPerson + " (" + mood + ")");
		
		switch (mood) {
		case "happy":
			System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
		case "sad":
			System.out.println("Hey, are you alright " + meetingPerson + ".");
		}
	}

}
/*
 * 
 * 



//4

 		System.out.println("Gon Greeting: " + meetingPerson + " (" + mood + ")");
		
		switch (mood) {
		case "happy":
			System.out.println("Hey, seeing you happy, " + meetingPerson + ", makes me happy too.");
		case "sad":
			System.out.println("Hey, are you alright " + meetingPerson + ".");
		}

		
 
 
 //1st 
			String meetingPerson = "Kurapika";
			String mood = "sad";

			switch (meetingPerson) {
			case "killua":
				System.out.println("Gon: killua");
				if (mood == "happy")
					System.out.println("Hey, seeing you happy, killua, makes me happy too.");
				if (mood == "sad")
					System.out.println("Hey, are you alright killua.");

			case "Kurapika":
				System.out.println("Gon: Kurapika");
				if (mood == "happy")
					System.out.println("Hey, seeing you happy, Kurapika, makes me happy too.");
				if (mood == "sad")
					System.out.println("Hey, are you alright Kurapika.");

			case "Leoreo":
				System.out.println("Gon: Leoreo");
				if (mood == "happy")
					System.out.println("Hey, seeing you happy, Leoreo, makes me happy too.");
				if (mood == "sad")
					System.out.println("Hey, are you alright Leoreo.");

			case "Wing":
				System.out.println("Gon: Wing");
				if (mood == "happy")
					System.out.println("Hey, seeing you happy, Wing, makes me happy too.");
				if (mood == "sad")
					System.out.println("Hey, are you alright Wing.");

			}
 */