package code.practise;

public class FactorialWhileLoop {

	static public int getFactorial(int num) {

		int fact = 1;

		while (num > 0) {

			fact = fact * num;
			num--;

		}

		return fact;
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}

}
