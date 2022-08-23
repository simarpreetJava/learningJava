package Naman_Q3;

public class TestHarness3 {

	public int textTask(String text, Integer num, Character c){

		String number = Integer.toString(num);
		String aplhabet = Character.toString(c);

		String concatString = text + number + aplhabet;//changed
		boolean houseCheck = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i++]);
		}

		if(houseCheck) {
			return 999;
		}else {
			return 888;
		}
	}

	public int textTask(String text, Character c, Integer num ){

		String number = Integer.toString(num);
		String aplhabet = Character.toString(c);

		String concatString = text + aplhabet + number;
		boolean houseCheck = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i++]);
		}

		if(houseCheck) {
			return 999;
		}else {
			return 888;
		}
	}

	public int textTask(Integer num, Character c, String text){

		String number = Integer.toString(num);
		String aplhabet = Character.toString(c);

		String concatString = number + aplhabet + text;
		boolean houseCheck = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i++]);
		}

		if(houseCheck) {
			return 999;
		}else {
			return 888;
		}
	}

}
