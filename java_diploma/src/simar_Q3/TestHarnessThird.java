package simar_Q3;

public class TestHarnessThird {

	/**
	 * @param text
	 * @param num
	 * @param check
	 * @return int
	 * 
	 * Converts arguments into String data type
	 * Concatenates all of them into one string
	 * check if string endswith "house"
	 * 	returns 999 if yes | 888 if no
	 * print every 2nd char of the concatenated string
	 */
	public int stringOperation(String text, Integer num, Boolean check){
		int ret = 0;
		
		String number = Integer.toString(num);
		String checked = Boolean.toString(check);
		
		String statement = text + number + checked;//changed
		boolean isHouseAtLast = statement.endsWith("house");
		
		if(isHouseAtLast) {
			ret = 999;
		}else {
			ret = 888;
		}
		
		char[] array = statement.toCharArray();
		for(int i = 0; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
		
		return ret;
	}
	
	/**
	 * Overloaded method
	 * @param text
	 * @param num
	 * @param check
	 * @return int
	 * 
	 * Converts arguments into String data type
	 * Concatenates all of them into one string
	 * check if string endswith "house"
	 * 	returns 999 if yes | 888 if no
	 * print every 2nd char of the concatenated string
	 */
	public int stringOperation(Integer num, Boolean check, String text){
		int ret = 0;
		
		String number = Integer.toString(num);
		String checked = Boolean.toString(check);
		
		String statement = number + checked + text;//changed
		boolean isHouseAtLast = statement.endsWith("house");
		
		if(isHouseAtLast) {
			ret = 999;
		}else {
			ret = 888;
		}
		
		char[] array = statement.toCharArray();
		for(int i = 0; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
		
		return ret;
	}

	/**
	 * Overloaded method
	 * @param text
	 * @param num
	 * @param check
	 * @return int
	 * 
	 * Converts arguments into String data type
	 * Concatenates all of them into one string
	 * check if string endswith "house"
	 * 	returns 999 if yes | 888 if no
	 * print every 2nd char of the concatenated string
	 */
	public int stringOperation(String text, Boolean check, Integer num){
		int ret = 0;
		
		String number = Integer.toString(num);
		String checked = Boolean.toString(check);
		
		String statement = text + checked + number;//changed
		boolean isHouseAtLast = statement.endsWith("house");
		
		if(isHouseAtLast) {
			ret = 999;
		}else {
			ret = 888;
		}
		
		char[] array = statement.toCharArray();
		for(int i = 0; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
		
		return ret;
	}

}
