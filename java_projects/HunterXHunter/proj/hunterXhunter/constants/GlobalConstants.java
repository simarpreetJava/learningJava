package proj.hunterXhunter.constants;

/**
 * @author Simarpreet kaur
 * This class contain static information such as:
 * yes, no, A, B, either choose and the like
 * These are use throughout other classes; mainly GameStoryEvents, Tournament and Fights.
 */
public class GlobalConstants {
	private GlobalConstants() {}
	//Character
	public static final Character CHAR_A = 'A';
	//Long
	public static final Long GRAPHIC_TIME = 1L;
	public static final Long TEXT_TIME = 7L;
	public static final Long FIGHT_TIME = 0L;
	//String
	public static final String YES = "yes";
	public static final String NO = "no";
	public static final String A = "A";
	public static final String B = "B";
	public static final String C = "C";
	public static final String BLANK_SPACE = " ";
	public static final String EMPTY_STRING = "";
	public static final String EMPTY_LINE = "\n";
	public static final String COLON_SPACE = ": ";
	public static final String COLON = ":";
	public static final String HYPHEN = "-";
	public static final String PLUS = "+";
	public static final String TAB = "\t";
	public static final String OR = "or";
	public static final String COMMA = ",";
	public static final String LEFT_ROUND_BRACKET = "(";
	public static final String RIGHT_ROUND_BRACKET = ")";
	public static final String EITHER_CHOOSE = "Either choose";
	public static final String ONLY_OPTION = "*Choose only option";
	public static final String ELIGIBILE = "ELIGIBILE";
	public static final String ERROR = "[Error:] Game is down due to some technical issues, contact admin.";
	public static final String ERR_PRINT = "[Error:] printing";
	public static final String ERR_IN = "[ERROR:] while taking an input from the user";
	
	public static final String PLAY_AGAIN = 
			  "===================================================\n"
			+ "     Do you want to play again? Write 'yes'   "
			+ "\n===================================================";
	
	public static final String THANK_YOU = 
					  "===================================================\n"
					+ "     Thank you for playing this game.    \n"
					+ "     @Made by:\n"
					+ "             Simarpreet Kaur\n"
					+ "             Naman Attri\n"
					+ "             Ravi dineshbai Patel\n"
					+ "===================================================\n";
}
