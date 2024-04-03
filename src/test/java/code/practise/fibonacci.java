package code.practise;

public class fibonacci {

	static int a = 0;
	static int b = 1;
	static int c = a + b;

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			System.out.println(a);

			a = b;
			b = c;
			c = a + b;

		}

	}

}
