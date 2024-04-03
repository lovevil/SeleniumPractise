package code.practise;

import org.testng.annotations.Test;

public class CheckWordOccuranceInString {
	
	
	
	public static int checkOccurance(String word, String paragraph) {
		
		String arr[] = paragraph.split(" ");
		
		int count=0;
		
		for(String val:arr) {
			
			if(val.equals(word)) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	public static void main(String[] args) {
		String word = "the";
		String paragraph = " work this is the of para of another work of the time that i have worked of him";
		System.out.println(checkOccurance(word , paragraph));
	}

}
