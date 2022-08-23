package Mansi_Q3;

public class TestHarness3 {
	
	public static void main(String[] args) {
		new TestHarness3().overloadTask("LoveMyhouse", 22, 123213467L);
		System.out.println();
		new TestHarness3().overloadTask(22, 123213467L, "LoveMyhouse");
		System.out.println();
		new TestHarness3().overloadTask("LoveMyhouse", 123213467L, 22);
		System.out.println();
		
	}

	public int overloadTask(String text, Integer num, Long adhaarCard){

		String number = Integer.toString(num);
		String identityProof = Long.toString(adhaarCard);

		String concatString = text + number + identityProof;
		boolean housePresent = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length;) {
			System.out.println(array[i]);
			i = i +2;
		}

		if(housePresent) {
			return 999;
		}else {
			return 888;
		}
	}
	public int overloadTask(Integer num, Long adhaarCard, String text){

		String number = Integer.toString(num);
		String identityProof = Long.toString(adhaarCard);

		String concatString = number + identityProof + text;
		boolean housePresent = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length;) {
			System.out.println(array[i]);
			i = i +2;
		}

		if(housePresent) {
			return 999;
		}else {
			return 888;
		}
	}
	public int overloadTask(String text, Long adhaarCard, Integer num){

		String number = Integer.toString(num);
		String identityProof = Long.toString(adhaarCard);

		String concatString = text + identityProof + number;
		boolean housePresent = concatString.endsWith("house");

		char[] array = concatString.toCharArray();
		for(int i = 0; i < array.length;) {
			System.out.println(array[i]);
			i = i +2;
		}

		if(housePresent) {
			return 999;
		}else {
			return 888;
		}
	}
}
