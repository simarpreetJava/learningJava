// @Simarpreet Kaur
//https://www.tinkercad.com/things/455NJQopxLz-final-projecthunterxhunterv10/editel?sharecode=3dg9tdFqUQOqHFpfpWpnUQx0yHQug3Cm-Cx0xzfqxj8

#include<LiquidCrystal.h>
//button input pins
#define buttonLeft 8
#define buttonRight 9

//initialize lc lib with pin
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

//constants related to display
const String START_GAME = " To Start Game";
const String PRESS_ANY_BUTTON = "Press Any Button";
const String GAME_LOGO = "Hunter X Hunter";
const String GAME_VERSION = "        (v 1.0)";
const String FIGHTER_CHOICES = "A)Gon  B)Kiru"; 
const String GON = "Gon";
const String KIRU = "Kiru";
const String STAT_LOGO = "LOGO";
const String STAT_CHAR_CHOICE = "CHAR_CHOICE";
const String STAT_CHAR_SELECTED = "CHAR_SELECTED";
const String STAT_PRINT_PLAYER_STAT = "PRINT_PLAYER_STAT";
const String STAT_BOT_SELECT = "BOT_SELECT";
const String STAT_SHOW_VS_FIGHT = "SHOW_VS_FIGHT";
const String STAT_FIGHT_ON = "FIGHT_ON";
const String STAT_FIGHTING = "FIGHTING";
const String STAT_SHOW_HP_OPTIONS = "SHOW_HP_OPTIONS";
const String STAT_BOT_TURN = "BOT_TURN";
const String STAT_PLAYER_TURN = "PLAYER_TURN";
const String STAT_BOT_THINKING = "BOT_THINKING";
const String STAT_FIGHT_OVER = "FIGHT_OVER";
const String STAT_PLAY_AGAIN = "PLAY_AGAIN";
const String OPT_ATTACK = "Hit";
const String OPT_DEFEND = "Defend";
const String A = "A";
const String B = "B";

const String options[2] = {OPT_ATTACK, OPT_DEFEND};
const String BOTS[6] = {"Hiso", "Zoro", "Leo",
                    "Wing", "Nero", "Merm"};

const int GON_HP = 90;
const int GON_ATT = 35;
const int GON_DEF = 9;
const int KIRU_HP = 80;
const int KIRU_ATT = 45;
const int KIRU_DEF = 6;
const int NUM_OF_BOTS = sizeof(BOTS)/sizeof(BOTS[0]);
const int HP_MIN = 50;
const int HP_MAX = 100;
const int ATT_MIN = 30;
const int ATT_MAX = 50;
const int DEF_MIN = 1;
const int DEF_MAX = 10;

/*
 *  @main
 * This method initializes lcd and buttons
 * for input and output
 * It is also responsible for 
 * calling starting the game code.
*/
void setup()
{
 //set up LCD (columns,rows)	
 lcd.begin(16, 2);
 //Read: push buttons
 pinMode(buttonLeft,INPUT);
 pinMode(buttonRight,INPUT);
  
 pressButtonToStart();
}

//regular updated varialbes
String player = "";
String bot = "";
String status = "";
int count = 0;
int randNumber = 0;
int randNum_Flag = 0;
int randHpAttDef_Flag = 0;
int rand_HP = 0; 
int rand_ATT = 0;
int rand_DEF = 0;
int playerHP = 0;
int playerATT = 0;
int playerDEF = 0;
int botHP = 0;
int botATT = 0;
int botDEF = 0;
int botAction =0;
int countForFight = 7;
bool eitherButtonPressed = false;
/*
 * keeps iterating over game events to provide all the functionality 
 */
void loop()
{
  int buttonA = digitalRead(buttonLeft);
  int buttonB = digitalRead(buttonRight);
  
  bool botHits = botAction == 0;
  bool botDefend = botAction == 1;
  bool buttonAPressed = buttonA == 1;
  bool buttonBPressed = buttonB == 1;
  eitherButtonPressed = buttonA == 1 
					 || buttonB == 1;
  
  increaseCounter(eitherButtonPressed);
  generateRandomNum_UntilBotSelected();
  generateRandom_HP_ATT_DEF();
  
  //each event has its own click check and status               //X|| STATUS
  printGameLogo();											   //0|| STAT_LOGO
  chooseChar();												  //1|| STAT_CHAR_CHOICE
  charSelectedByPlayer(buttonAPressed, buttonBPressed);      //2|| STAT_CHAR_SELECTED
  printPlayerStats(); 									    //3|| STAT_PRINT_PLAYER_STAT
  selectRandomBot();									   //4|| STAT_BOT_SELECT
  printFightVsLines();									  //5|| STAT_SHOW_VS_FIGHT
  printFightOn();									     //6|| STAT_FIGHT_ON
  showHpAndOptions();								    //7|| STAT_FIGHT_ON
  playerAttacks(buttonAPressed);					   //8|| STAT_PLAYER_TURN
  playerDefends(buttonBPressed);					  //8|| STAT_PLAYER_TURN
  thinkingBot();									 //9|| STAT_BOT_THINKING
  botAttacks(botHits);								//10|| STAT_BOT_TURN
  botDefends(botDefend);						   //10|| STAT_BOT_TURN
  checkWinner();								  //11|| STAT_FIGHT_OVER STAT_PLAY_AGAIN
  showPlayAgain();								 //12|| STAT_FIGHT_OVER
  playerPlaysAgain(buttonAPressed);				//13|| STAT_PLAY_AGAIN
  playerNotPlayAgain(buttonBPressed);		   //13|| STAT_PLAY_AGAIN
}
/*
 * @Secondary
 * for maintaining the flow of the code
 */
void increaseCounter(bool eitherButtonPressed){
  if(eitherButtonPressed){
  	count++;
  }
}

bool flagWinner = false;
/*
 * @Primary
 * logic to handle if player choose to play again: restarts the game
 */
void playerPlaysAgain(bool choice){
  	bool countCheck = (count > countForFight && count < 200);
    bool statusCheck = status == STAT_PLAY_AGAIN;
  	bool isPlayAgain = statusCheck 
      				 && choice
      				 && countCheck;
  if(isPlayAgain){
  	status = STAT_LOGO;
    count = 0;
    countForFight = 7;
    flagWinner = false;
  }
}
/*
 * @Primary
 * logic to handle if player chooses not to play: end game with thank-you
 */
void playerNotPlayAgain(bool choice){
 	bool countCheck = (count > countForFight && count < 200);
    bool statusCheck = status == STAT_PLAY_AGAIN;
  	bool isThankYou = statusCheck 
      				 && choice
      				 && countCheck;	
  if(isThankYou){
  	lcd.clear();
  	ut_print1stLine("---- Thank ----");
    ut_print2ndLine(" ---  You ---");
    flagWinner = false;
    status = "GAME_END";
    delay(100000000000);
  }
  	
}
/*
 * @Primary
 * displays play again with options
 */
void showPlayAgain(){
  	bool countCheck = (count > countForFight && count < 100);
    bool statusCheck = status == STAT_FIGHT_OVER;
  	bool showPlay = statusCheck 
      				 && eitherButtonPressed
      				 && countCheck;
 	
  if(showPlay){
  	lcd.clear();
  	ut_print1stLine("Play Again?");
    ut_print2ndLine("A)Yes    B)No");
    delay(100);
    status = STAT_PLAY_AGAIN;
    countForFight++;
  }
}
/*
 * @Primary
 * checks HP of each fighter and declares winner if one of them is zero
 */
void checkWinner(){
  bool isWinner = (playerHP < 0 || botHP < 0) 
    			  && eitherButtonPressed
    			  && flagWinner
    			  && status != STAT_FIGHT_OVER
    			  && status != STAT_PLAY_AGAIN;
  if(isWinner){
  	status = STAT_FIGHT_OVER;
    String winner = playerHP > botHP ? player : bot;
    delay(700);
    lcd.clear();
  	ut_print1stLine("[!] Winner [!]");
    ut_print2ndLine(winner);
    delay(100);
    countForFight++;
  }
}
/*
 * @Primary
 * logic for bot to defend from the players' attack
 */
void botDefends(bool botDefend){
 	bool countCheck = (count > countForFight && count < 100);
    bool statusCheck = status == STAT_BOT_TURN;
  	bool isBotDefends = statusCheck 
      				 && botDefend
      				 && countCheck;
  	
  if(isBotDefends){
    lcd.clear();
  	ut_print1stLine("Bot Defends:");
    ut_print2ndLine(getDefendStatement(bot));
    botHP += botDEF;
    status = STAT_SHOW_HP_OPTIONS;
    countForFight++;
    botAction = 0;
    delay(100);
  }
}
/*
 * @Primary
 * logic for bot to attack the player
 */
void botAttacks(bool botHits){
    bool countCheck = (count > countForFight && count < 100);
    bool statusCheck = status == STAT_BOT_TURN;
  	bool isBotAttack = statusCheck 
      				 && botHits
      				 && eitherButtonPressed
      				 && countCheck;
  	
  if(isBotAttack){
    lcd.clear();
  	ut_print1stLine("Bot Attacks:");
    ut_print2ndLine(getAttackStatement(bot));
    playerHP -= botATT;
    status = STAT_SHOW_HP_OPTIONS;
    countForFight++;
    botAction = 1;
    delay(100);
  }
}

/*
 * @Primary
 * displays Bot Thinks
 */
void thinkingBot(){
 	bool countCheck = (count > countForFight && count < 100);
  	bool statusCheck = status == STAT_BOT_THINKING;
  	bool isBotThink = statusCheck 
      				&& eitherButtonPressed 
      				&& countCheck;
  if(isBotThink){
    lcd.clear();
    ut_print1stLine(getUpdatedHP());
    ut_print2ndLine("Bot Thinks");
    delay(200);
    countForFight++;
    status = STAT_BOT_TURN;
  }
}

/*
 * @Secondary
 * fetches and formats defend statement 
 */
String getDefendStatement(String fighter){
 
  char fighterFirstAlpha = getFirstAlphabet(fighter);
  String statement = "";
  String leftRB = "(";
  String rightRB = ")";
  String plus = "+";
  if(fighter.equalsIgnoreCase(player)){
  	statement = fighterFirstAlpha 
      		  + leftRB 
      		  + playerHP + plus + playerDEF  
      		  + rightRB;
  }else if(fighter.equalsIgnoreCase(bot)){
  	statement = fighterFirstAlpha 
      		  + leftRB 
      		  + botHP + plus + botDEF 
      		  + rightRB;
  }
  return statement;	
}
/*
 * @Primary
 * logic to handle player action defend from the bot's attack
 */
void playerDefends(bool playerDefends){
 	bool countCheck = (count > countForFight && count < 100);
    bool statusCheck = status == STAT_PLAYER_TURN;
  	bool isPlayerDefends = statusCheck 
      				 && playerDefends
      				 && countCheck;
  	
  if(isPlayerDefends){
    lcd.clear();
  	ut_print1stLine("Player Defends:");
    ut_print2ndLine(getDefendStatement(player));
    playerHP += playerDEF;
    status = STAT_BOT_THINKING;
    countForFight++;
    delay(100);
  }
}

/*
 * @Secondary
 * fetches and formats attack to bot statement
 */
String getFighterFormattedATT(String fighter){
 
  char fighterFirstAlpha = getFirstAlphabet(fighter);
  String statement = "";
  String leftRB = "(";
  String rightRB = ")";
  if(fighter.equalsIgnoreCase(player)){
  	statement = fighterFirstAlpha 
      		  + leftRB 
      		  + playerATT 
      		  + rightRB;
  }else if(fighter.equalsIgnoreCase(bot)){
  	statement = fighterFirstAlpha 
      		  + leftRB
      		  + botATT 
      		  + rightRB;
  }
  return statement;	
}
/*
 * @Secondary
 * fetches and formats attack statment
 */
String getAttackStatement(String attacker){
  String statement = "";
  if(attacker.equalsIgnoreCase(player)){
  	String botFormattedHP = getFighterFormattedHP(bot);
    String playerFormattedATT = getFighterFormattedATT(player);
    statement = botFormattedHP + " "
      		  + "-" + " " 
      		  + playerFormattedATT;
  }else if(attacker.equalsIgnoreCase(bot)){
  	String playerFormattedHP = getFighterFormattedHP(player);
    String botFormattedATT = getFighterFormattedATT(bot);
    statement = playerFormattedHP + " "
      		  + "-" + " " 
      		  + botFormattedATT;
  }
  
  return statement;
}
/*
 * @Primary
 * logic to handle player action for Hitting the bot
 */
void playerAttacks(bool playerHits){
 	bool countCheck = (count > countForFight && count < 100);
    bool statusCheck = status == STAT_PLAYER_TURN;
  	bool isPlayerAttack = statusCheck 
      				 && playerHits
      				 && countCheck;
  	
  if(isPlayerAttack){
    lcd.clear();
  	ut_print1stLine("Player Attacks:");
    ut_print2ndLine(getAttackStatement(player));
    botHP -= playerATT;
    status = STAT_BOT_THINKING;
    countForFight++;
    delay(100);
  }
}
/*
 * @Secondary
 * fetches and formats stats for the fighter
 */
String getFighterFormattedHP(String fighter){
 
  char fighterFirstAlpha = getFirstAlphabet(fighter);
  String statement = "";
  String leftRB = "(";
  String rightRB = ")";
  if(fighter.equalsIgnoreCase(player)){
  	statement = fighterFirstAlpha 
      		  + leftRB 
      		  + playerHP 
      		  + rightRB;
  }else if(fighter.equalsIgnoreCase(bot)){
  	statement = fighterFirstAlpha 
      		  + leftRB 
      		  + botHP 
      		  + rightRB;
  }
  return statement;	
}
/*
 * @Secondary
 * fetches and formats current HP of the fighter
 */
String getUpdatedHP(){
  	char playerFirstAlpha = getFirstAlphabet(player);
  	char botFirstAlpha = getFirstAlphabet(bot);
  	String playerHPStatement = getFighterFormattedHP(player);
  	String botHPStatement = getFighterFormattedHP(bot);
  
  	String blankSpace = " ";
  	String colon = ":";
  	String statement = "HP" + colon 
      				 + playerHPStatement
      				 + blankSpace
      				 + botHPStatement;
	return statement;
}
/*
 * @Secondary
 * fetches and formats options
 */
String getOptionsStatement(){
 	String blankSpace = "   ";
  	String optionsStatement = A + ")" 
      						+ options[0]
      						+ blankSpace
      						+ B + ")" 
      						+ options[1]; 
	return optionsStatement;
}
/*
 * @Primary
 * displays current HP with options
 */
void showHpAndOptions(){
 	bool countCheck = count > countForFight && count < 100;
    bool statusCheck = status == STAT_SHOW_HP_OPTIONS;
  	bool showHpOptions = statusCheck 
      				 && eitherButtonPressed 
      				 && countCheck;
 	
  	if(showHpOptions){
      	lcd.clear();
  		ut_print1stLine(getUpdatedHP());
        ut_print2ndLine(getOptionsStatement());
      	delay(100);
  		status = STAT_PLAYER_TURN;
      	countForFight++;
  }

}
/*
 * @Primary
 * displays Fight ON!! 
 */
void printFightOn(){
 	bool countCheck = count > 6 && count < 31;
    bool statusCheck = status == STAT_FIGHT_ON;
  	bool showVsLines = statusCheck && eitherButtonPressed && countCheck;
 	
  	if(showVsLines){
      	lcd.clear();
  		ut_print1stLine("      FIGHT     ");
        ut_print2ndLine("       ON!!     "); 
  		status = STAT_SHOW_HP_OPTIONS;
      	flagWinner = true;
      	delay(100);
  }

}
/*
 * @Secondary
 * fetches and formats stats 
 */
String getStatsLine(){
 	String playerStats = getPlayerHyphnStats();
    String botStats = getBotHyphnStats();
  	String p_b_stats = playerStats 
          					+ " "
          					+ " "
          					+ botStats;
  	return p_b_stats;
}
/*
 * @Secondary
 * fetches and formats stats for the player
 */
String getPlayerHyphnStats(){
  	String hyphen = "-";
 	String playerHyphnStats = playerHP  + hyphen
      					    + playerATT + hyphen
      					    + playerDEF + "";
  	return playerHyphnStats;
	
}
/*
 * @Secondary
 * fetches and formats stats for the bot
 */
String getBotHyphnStats(){
  	String hyphen = "-";
 	String botHyphnStats = botHP  + hyphen
      					 + botATT + hyphen
      					 + botDEF + "";
  	return botHyphnStats;
	
}
/*
 * @Secondary
 * extracts first syllable from the text
 */
char getFirstAlphabet(String text){
 	char firstAlphabet = text.charAt(0);
  	return firstAlphabet;
}
/*
 * @Secondary
 * formats name of the fighter 
 */
String getFormattedName(String text){
 	
  char firstAlphabet = getFirstAlphabet(text);
  String formattedText = text 
    					 + "(" 
    					 + firstAlphabet 
    					 + ")";
  return formattedText;
}
/*
 * @Secondary
 * generates 1p vs bot line with stats
 */
String getPvsBText(){
 	
  String formattedP = getFormattedName(player);
  String formattedB = getFormattedName(bot);
  String pVsB = formattedP 
    			  + "vs"
      			  + formattedB;
    
  return pVsB;
}
/*
 * @Primary
 * displays fight line
 */
void printFightVsLines(){
    bool countCheck = count > 5 && count < 26;
    bool statusCheck = status == STAT_SHOW_VS_FIGHT;
  	bool showVsLines = statusCheck && eitherButtonPressed && countCheck;
 	
  	if(showVsLines){
      	lcd.clear();
  		String pVsB = getPvsBText();
  		ut_print1stLine(pVsB);
      	String statsLine = getStatsLine();
        ut_print2ndLine(statsLine); 
  		status = STAT_FIGHT_ON;
  }
}
/*
 * @Secondary
 * generate random stats for bot
 */
void generateRandom_HP_ATT_DEF(){
 	
  if(randHpAttDef_Flag == 0){
  	rand_HP = random(HP_MIN, HP_MAX);
	rand_ATT = random(ATT_MIN, ATT_MAX);
	rand_DEF = random(DEF_MIN, DEF_MAX);
  }
}
/*
 * @Secondary
 * generates random number for BOT index
 */
void generateRandomNum_UntilBotSelected(){
 	
  if(randNum_Flag == 0){
  	randNumber = random(0, NUM_OF_BOTS);
  }
}
/*
 * @Secondary
 * populates bot stats with random numbers
 */
void setRandomBotStats(){	
  
  botHP = rand_HP ;
  botATT = rand_ATT;
  botDEF = rand_DEF;
  randHpAttDef_Flag++;
}
/*
 * @Secondary
 * selects fighter which will fight with the player
 */  
String selectBot(){	
  String botName = BOTS[randNumber];
  randNum_Flag++;
  setRandomBotStats();
  return botName;
}
 /*
 * @Secondary
 * displays fighter names 2*times
 */ 
void showBots(int times){
 	
  for(int j=0; j< times; j++){
  	for(int i=0; i<NUM_OF_BOTS; i++){
    		delay(18);
            ut_print2ndLine("                  ");
          	ut_print2ndLine(BOTS[i]);
  	}
  }
}
/*
 * @Primary
 * select a random fighter from BOT array
 */
void selectRandomBot(){
	bool countCheck = count > 4 && count < 21;
    bool statusCheck = status == STAT_BOT_SELECT;
  	bool showRandomSelection = statusCheck && eitherButtonPressed && countCheck;
  
  	if(showRandomSelection){
        lcd.clear();
      	ut_print1stLine("Random Opponent");
		showBots(2);
        bot = selectBot();
        String randomBot = "*" + bot + "*";
        ut_print2ndLine(randomBot);
      	status = STAT_SHOW_VS_FIGHT;
    }
}

/*
 * @Secondary
 * get stats of the fighter in formatted manner
 */
String getPlayerFormattedStats(){
	String formattedStats= player 
      		 				+ "("
      		 				+ playerHP + "-" 
			 				+ playerATT + "-"
			 				+ playerDEF
             				+ ")";
	return formattedStats;
}




 /*
 * @Primary
 * Displays selected fighter stats
 */
void printPlayerStats(){
 	bool countCheck = count > 3 && count < 16;
    bool statusCheck = status == STAT_PRINT_PLAYER_STAT;
  	bool showPlayerStats = statusCheck 
						 && eitherButtonPressed 
						 && countCheck;
	
	if(showPlayerStats){
        lcd.clear();
      	String inst_stats = player + "(HP-ATT-DEF)";
		ut_print1stLine(inst_stats);
		String playerStats = getPlayerFormattedStats();
		ut_print2ndLine(playerStats);
		status = STAT_BOT_SELECT;
	}
}

/*
 * @Secondary
 * populates player stats from constants
 */
void setPlayerStats(String player){
	if(player == GON){
		playerHP = GON_HP;
		playerATT = GON_ATT;
		playerDEF = GON_DEF;
	} else if(player == KIRU){
		playerHP = KIRU_HP;
		playerATT = KIRU_ATT;
		playerDEF = KIRU_DEF;
	}
}
/*
 * @Secondary
 * Displays fighter selected by the player
 */
void printFighterChosen(){
    ut_print1stLine("Fighter Chosen:");
  	ut_print2ndLine(player); 
}


/*
 * @Primary
 * Selects the fighter for the player
 */
void charSelectedByPlayer(bool buttonAPressed, bool buttonBPressed){
  bool countCheck = count > 2 && count < 11;
  bool statusCheck = status == STAT_CHAR_SELECTED;
  bool gonSelected = statusCheck && buttonAPressed && countCheck;
  bool kiruSelected = statusCheck && buttonBPressed && countCheck;

  
  if(gonSelected){
    lcd.clear();
  	player = GON;
	printFighterChosen();
	setPlayerStats(player);
    status = STAT_PRINT_PLAYER_STAT;
  }else if(kiruSelected){
    lcd.clear();
  	player = KIRU;
    printFighterChosen();
	setPlayerStats(player);
    status = STAT_PRINT_PLAYER_STAT;
  }
 
}

/*
 * @Primary
 * Prints a choice to the player
 */
void chooseChar(){
  bool countCheck = count > 1 && count < 6;
  bool statusCheck = status == STAT_CHAR_CHOICE;
  bool showCharChoice = statusCheck 
					  && eitherButtonPressed 
					  && countCheck;

  
  if(showCharChoice){
  	lcd.clear();
    ut_print1stLine("Choose A Fighter");
  	ut_print2ndLine(FIGHTER_CHOICES); 
    
    status = STAT_CHAR_SELECTED;
  }
}

/*
 * @Primary
 * Prints game logo and version
 */
void printGameLogo(){
  bool countCheck = count > 0 && count < 3;
  bool statusCheck = status == STAT_LOGO;
  bool showGameLogo = statusCheck 
				    && eitherButtonPressed 
					&& countCheck;  
    
  if(showGameLogo){
    lcd.clear();
    ut_print1stLine(GAME_LOGO);
  	ut_print2ndLine(GAME_VERSION); 
  
    status = STAT_CHAR_CHOICE;
  }
}

/*
 * @Primary
 * Tells user to press any button
 * to start the game
 */
void pressButtonToStart(){
  	ut_print1stLine(START_GAME);
  	ut_print2ndLine(PRESS_ANY_BUTTON);
  	status = STAT_LOGO;
}
/*
 * @Secondary
 * Prints 1st line on LCD
 */
void ut_print1stLine(String text){
	lcd.setCursor(0,0);
    lcd.print(text); 
}
/*
 *  @Secondary
 * Prints 2nd line on LCD
 */
void ut_print2ndLine(String text){
	lcd.setCursor(0,1);
    lcd.print(text); 
}