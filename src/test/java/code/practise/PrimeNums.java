package code.practise;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {
	
	public static boolean isPrime(int num) {
		boolean prime = true;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				prime = false;
			}
		}
		
		return prime;
	}
	
	public static List<Integer> primeNumsInRange(int start,int end){
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i= start;i<=end;i++) 
		{
			boolean prime = true;
			
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					prime = false;
				}
			}
			
			if(prime)
			{
				list.add(i);
			}			
		}
		
		
		return list;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(isPrime(23));
		 
		System.out.println(primeNumsInRange(1,1000));
		
		System.out.println(primeNumsInRange(1,1000).size());

	}

}
