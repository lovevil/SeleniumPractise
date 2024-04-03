package code.practise;

public class Anagram {

	public boolean checkAnagram(String one, String two) {

		boolean anagram = false;

		String a = one.replaceAll("\\s", "");
		String b = two.replaceAll("\\s", "");

		if (a.length() != b.length()) {

		} else {

			String sorteda = sortString(a);
			String sortedb = sortString(a);

			if (sorteda.equals(sortedb)) {
				anagram = true;
			}

		}

		return anagram;
	}

	public String sortString(String str) {

		String sorted = "";

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			sorted = sorted + arr[i];
		}

		return sorted;

	}

	public static void main(String[] args) {
		
		System.out.println(new Anagram().checkAnagram("  a nu r ag", "g aru na"));

	}

}
