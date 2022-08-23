public class TempProject {
	abstract class Person{
		String name;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	class Freec extends Person{
		String name = "Freec";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Person p = new TempProject().new Freec();
		System.out.println(p.getName());
		

		//		System.out.println(GON);
		//		printSlow();

		//		String[] options = {"attack", "defend", "special power"};
		//		showOptions(options);

		
	}

	/*


	//		String s = String.format("A: %s", "yo");
	public void showOptions(String[] options) {

		String statement = createOptionStatement(options);
		printSlowly(statement, GlobalConstants.TEXT_TIME);
	}


public void reqAndValidatePlayerOption(String response, String[] options) {
		util.showOptions(options);
		String resp = util.promptUser();
		resp = util.validateOptionsAndReprompt(response, options);
	}







	for(Person[] q: matchUp) {
			for(Person j: q)
				System.out.print("\t"+ j + "\t\t\t" + "vs ");
			System.out.println();
		}
Random random = new Random();
		Integer randomCharacter = 1 + random.nextInt(3);
		//		i=1;
		System.out.println("random: " + randomCharacter);
		String player = "A";
		String[] contestants = {"A", "B", "C", "D"};
		String[][] ret = new String[contestants.length/2][2];

		ret[0][0] = player;
		ret[0][1] = contestants[randomCharacter];

		if(randomCharacter<contestants.length-1)
			ret[1][1] = contestants[contestants.length-1];
		else
			ret[1][1]=contestants[contestants.length-randomCharacter];
		
		if(randomCharacter%2==1) 
			ret[1][0]=contestants[contestants.length/2];
		else
			ret[1][0]=contestants[randomCharacter-1];


		for(String[] q: ret) {
			for(String j: q)
				System.out.print(j + "\t");
			System.out.println();
		}



		//		//1
		//		xx[1][0]=s[i+1];//2 | 3-1 | 4-2***
		//		xx[1][1]=s[i+2];//3 | 3****
		//		
		//		//2
		//		xx[1][0]=s[i-1];//1 | 3-2 | 4-3
		//		xx[1][1] = s[i+1];//3 | 3*****
		//		
		//		//3
		//		xx[1][0]=s[i=i-1];//2 | 3-3 | 4-2***
		//		xx[1][1]=s[i];//1	  | 3 -2 | 4-3***


		//		if(i%2 == 0) {
		//			xx[1][0]=s[s.length-(s.length-1)];
		//		}else {
		//			xx[1][0]=s[s.length-(s.length/2)];
		//		}
		//		xx[1][1] = s[3];



		//		if(i<s.length-1) {
		//			xx[1][1] = s[s.length-1];
		//		}
		//		if(i==(s.length-1)) {
		//			xx[1][1]=s[s.length-i];
		//		}
		//		if(i%2==1) {
		//			xx[1][0]=s[s.length/2];
		//		}
		//		if(i%2==0) {
		//			xx[1][0]=s[i-1];
		//		}
		 * 


		
	public static void Tournament(String[] args) {
		Person p = new Freecs();

		Tournament t = new Tournament(p);
		System.out.println(t.player);
		System.out.println(t.contestants);
		for(String c: t.contestants)
			System.out.println(c);

		System.out.println(t.contestantStatus.toString());
		for(String[] i: t.contestantStatus) {
			for(String j: i)
				System.out.print(j + "\t");
			System.out.println();
		}
	}

	 */

	public static void showOptions(String[] options) {
		//		String s = String.format("A: %s", "yo");
		Character start = 'A';
		String statement = "";
		StringBuilder build = new StringBuilder();
		for(String option: options) {
			build.append(start++);
			build.append(": ");
			build.append(option);
			build.append("\t");
		}
		statement = build.toString();
		System.out.println(statement);
	}

	private static void printSlow() throws InterruptedException {
		for(char s: GON.toCharArray()) {
			System.out.print(s);
			Thread.sleep(5);
		}
	}


	public static final String GON_BYE1 = 
			"" ;


	public static final String GON_SHOCKED = 
			"⠀⠀⠀⠀⠀⠀⠀⠀⠰⣶⣶⣦⡀⠀⠀⠀⠀⢲⣶⠀⠀⠀⠀⣶⣶⣶⣶⣶⣶⣆⠀⠀⠀⠀⢀⣶⡆⠀⠀⠀⠀⢀⣴⣶⡶⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣦⣄⠀⠀⠸⣿⣧⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⢠⣿⡿⠀⠀⢀⣠⣾⣿⣿⣿⠃⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣷⣄⠀⣿⣿⣆⢰⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⣰⣿⣿⠇⣠⣴⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠻⣦⣄⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠙⣿⣿⣦⣄⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⣠⣾⡇⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⠃⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣟⠿⢿⣿⣟⠿⣿⣿⣿⣿⠟⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣛⠛⣃⣤⡀⠈⠀⠀⠉⠉⠀⠀⠀⢀⣾⡿⠿⠿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣋⢉⠜⠋⠀⠉⠀⠀⠀⠀⠀⠀⠀⠚⠉⠈⠙⢦⠾⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⡅⠀⠀⣀⣤⣤⣀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⠀⠐⢾⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⠏⠀⢀⡞⠁⠀⠀⡙⠆⠀⠀⠀⠀⢰⢋⠁⠀⠙⢳⡀⢲⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣊⡙⡇⠀⢸⠁⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⣷⡆⠀⠀⠈⡇⠀⡿⣛⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⢻⣿⣿⡀⠈⠆⠀⠀⠈⠋⠀⠀⠀⠀⠀⠀⠙⠁⠀⠀⢰⠃⢰⣿⣿⠋⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠼⢿⣷⡇⠀⠀⠀⠀⠀⠀⠀⠠⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⢿⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠬⠽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣋⡝⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠣⡀⠀⠀⠀⠀⠀⠀⢤⣤⠀⠀⠀⠀⠀⠀⢀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠂⠄⣀⠀⠀⠐⠒⠀⠀⣀⡠⠐⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣶⣶⣿⣿⣶⣦⣤⣶⣾⣷⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠧⠀⠀⠀⠀⠀⠀⠀⠀" ;

	public static final String GON_BYE = 
			"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⡆⠀⠀⢀⣠⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣷⣤⡀⣼⣿⣿⣿⣿⣤⣾⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣤⣴⣦⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⣿⣿⣿⣿⣿⡿⣿⢿⡿⠿⠿⣿⣿⣿⣯⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡟⠛⠀⠁⠀⠀⠀⠀⠀⠉⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⢀⣤⡀⠀⠀⠀⠔⠒⢆⢸⠟⣿⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣾⠀⡇⠀⠘⠀⠀⠀⢀⠀⠈⢸⣼⣷⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠢⢤⣇⡀⠀⢰⠂⠀⠉⠈⣀⣴⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣶⣦⣦⣤⣠⣶⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⡂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣶⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⣀⣶⣧⣨⣿⡿⠋⠉⢿⣿⣏⣹⣶⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⡿⠛⠁⠉⠀⠀⠀⠀⠙⠉⠻⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀" ;

	public static final String GON = 
			"⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢦⢤⡄\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⣄⠀⠀⠀⠀⣿⣿⣆⠀⠀⠀⠀⠀⠀⢀⡄⠀⢻⣿⠏\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⣄⠀⠀⣿⣿⣿⣷⡀⠀⠀⠀⢠⣾⡇⠀⠚⡆\r\n"
					+ "⠀⠀⠀⠀⠀⢠⣄⣀⠀⠀⢿⣿⣿⣷⣄⣿⣿⣿⣿⣿⣦⠀⣴⣿⣿⡇⠐⢠⠁\r\n"
					+ "⠀⠀⠀⠀⠀⠘⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠂⡌\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣁⡔\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣾⣿⠁\r\n"
					+ "⠀⠀⠀⠀⠀⠘⣷⣶⣽⣿⣿⡟⠛⠛⠂⠀⠉⠉⠉⠀⠚⠛⢛⣻⣿⣿⣿⠃\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⢏⠄⠠⠀⠀⠀⠀⠀⡠⠄⠒⠍⢿⣿⣿⠏\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⡇⠀⠀⣀⡀⠀⠀⠀⠀⢀⣀⡀⠀⠈⣿⠏\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠘⡿⠇⠰⢹⣶⣮⠀⠀⠀⠀⣱⣶⣮⠂⢰⢏\r\n"
					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢬⣲⠠⠸⣿⠟⠀⠀⡀⠀⠻⣿⠏⠂⣾⡹\r\n"
					+ "⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣵⡆⠀⠀⢀⡀⠀⠀⢀⡀⠀⠀⢰⣾⣶⣦\r\n"
					+ "⠀⠀⠀⣠⣶⣿⣿⣿⡷⢶⣿⣦⣀⠈⠫⢉⣉⠩⠃⣀⣴⣿⡾⣿⣿⣿⣿\r\n"
					+ "⢀⣤⣴⣿⣿⣿⣿⣿⠿⢛⣾⣿⣿⣿⣷⣶⣤⢔⣲⣽⣿⣿⣿⡟⢿⣿⣿⣿";





}




/*






private void initiateFightWithPlayer(Person[] matchUp) {
		Person[] match = selectUserAndBot(matchUp);
		Person user = match[0];
		Person bot = match[1];
		Integer userHP = user.getHp();
		Integer botHP = bot.getHp();

		String userHPStatement = "HP(" + user.getFirstName() + ")";
		String botHPStatement = "HP(" + bot.getFirstName() + ")";
		String userDefendStatement = "DEF(" + user.getDef() + ")";
		String botDefendStatement = "DEF(" + bot.getDef() + ")";
		System.out.println("Fight");

		System.out.println(userHPStatement + ": " + userHP 
				+ "\t" 
				+ botHPStatement + ": " + botHP);
		String[] options = {"attack", "defend"};
		String turn = "player";
		String userPrevActionStatus = "";
		String botPrevActioStatus = "";

		while(userHP >= 0 && botHP >= 0) {


			if(turn.equalsIgnoreCase("player")) {
				util.showOptions(options);
				String option = util.promptUser();
				option = util.validateOptionsAndReprompt(option, options);
				if(option.equalsIgnoreCase(GlobalConstants.A)) {
					userPrevActionStatus = "attack";
					System.out.println(user.getFirstName() + ": " + " Attacks");
					//done
					if(botPrevActioStatus.equalsIgnoreCase("defend")) {
						System.out.print(botHPStatement + " " + botHP 
								+ botDefendStatement + " "
								+ "-" + " " + user.getAtt());
						botHP -= user.getAtt() + bot.getDef();
						System.out.println(userHPStatement + ": " + userHP 
								+ "\t" 
								+ botHPStatement + ": " + botHP);
					}else {
						System.out.println(botHPStatement + " " + botHP 
								+ "-" + " " + user.getAtt());
						botHP -= user.getAtt();
						System.out.println(userHPStatement + ": " + userHP 
								+ "\t" 
								+ botHPStatement + ": " + botHP);
					}
					turn = "bot";
				}else if(option.equals(GlobalConstants.B)){
					userPrevActionStatus = "defend";
					turn = "bot";
				}
			}else if(turn.equalsIgnoreCase("bot")){
				Random rand = new Random();
				Integer botAction = rand.nextInt(1);
				if(options[botAction].equalsIgnoreCase("attack")) {
					botPrevActioStatus = "attack";

					System.out.println(bot.getFirstName() + ": " + " Attacks");
					if(userPrevActionStatus.equalsIgnoreCase("defend")) {
						System.out.print(userHPStatement + " " + userHP 
								+ userDefendStatement +" "
								+ "-" + " " + bot.getAtt());
						userHP -= bot.getAtt() + user.getDef();
						System.out.println(userHPStatement + ": " + userHP 
								+ "\t" 
								+ botHPStatement + ": " + botHP);
					}else {
						System.out.println(userHPStatement + " " + userHP 
								+ "-" + " " + bot.getAtt());
						userHP -= bot.getAtt();
						System.out.println(userHPStatement + ": " + userHP 
								+ "\t" 
								+ botHPStatement + ": " + botHP);
					}

					turn = "player";
				}else {
					botPrevActioStatus = "defend";
					turn = "player";
				}
			}
		}
	}

	private Person[] selectUserAndBot(Person[] matchUp) {
		Person user;
		Person bot;
		if(matchUp[0].getLastName().equalsIgnoreCase(player)) {
			user = matchUp[0];
			bot = matchUp[1];
		}else {
			user = matchUp[1];
			bot = matchUp[0];
		}
		Person[] match = {user,bot};
		return match;
	}



*/
