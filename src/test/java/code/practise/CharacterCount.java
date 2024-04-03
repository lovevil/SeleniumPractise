package code.practise;

public class CharacterCount {

	public static String checkCount(String str) {
		int count = 1;
		int increment = 1;

		String val = "";

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i += increment) {
			
			for (int j = i + 1; j < arr.length; j++) {
			
				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}

			}

			val = val + arr[i] + count;
			increment = count;
			count = 1;
		}

		return val;

	}

	public static void main(String[] args) {

		System.out.println(checkCount("aabbbcdddda"));
	}

}
