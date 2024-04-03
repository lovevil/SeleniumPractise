package code.practise;

public class FactorialRecursion {
	
	static public int getFactorial(int num) {
		
		int fact = 1;
		
		if(num==0 || num==1) {
			return 1;
		}
		else {
			fact = num * getFactorial(num-1);
		}
		
		return fact;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getFactorial(5));

	}

}
