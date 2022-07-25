package _22July;

public class Recursion {

	public static void main(String[] args) {

		int whenToStop = 100;
		gonIrritatingHisoka(whenToStop);
	}


	private static void gonIrritatingHisoka(int whenToStop) {

		System.out.println("Gon To Hisoka: You're weird");

		if(whenToStop == 0) { }
		else {				
			gonIrritatingHisoka(whenToStop--); 
		}
	}
	
	// we'll do nothing when value is 100
   // else, we'll keep pounding Hisoka.
	
}
/*


2nd
	private static void gonIrritatingHisoka(int whenToStop) {

		System.out.println("Gon To Hisoka: You're weird");

		if(whenToStop == 0) { }
		else {				
			gonIrritatingHisoka(whenToStop--); 
		}
	}
	


1st

	public static void main(String[] args) {

		gonIrritatingHisoka();
	}


	private static void gonIrritatingHisoka() {

		System.out.println("Gon To Hisoka: You're weird");
		gonIrritatingHisoka();
	}





0
		//Hisoka
		int whenToStop=1;
//		while(true)
//		System.out.println("Gon To Hisoka: You're weird");
		gonIrritatingHisoka(whenToStop);



		//1,2

		if(stopME == 0) {// 100==100? no
			//kuch na kar | func end ho juga
		}else {

		System.out.println("Gon To Hisoka: You're weird");

		//1->2  
		stopME++;
		//stopME + 1 | stopME += 1

		gonIrritatingHisoka(stopME);//recursion









 */