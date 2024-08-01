package Practice;

import java.util.HashMap;

public class BirthDateFormat {
	
	public static void main(String[] args) {
		
		String date="20-05-2000";
		
		String replace = date.replace('-', '/');
		
		System.out.println(date);
		
		System.out.println(replace);
		
		
		String s="BBfBCDSFREDSABCB";
		
		char[] charArray = s.toCharArray();
		
		int length = charArray.length;
		
		int count = 0;
		
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		
		
		for(int i=0;i<=length-1;i++) {
			
			
			for(int j=0;j<=length-1;j++) {
				
				if(charArray[i] == charArray[j]) {
					
					count++;
				}
			}
			
			h.put(charArray[i], count);
			
			count=0;
			
			
		}
		
		System.out.println(h);
		
	}

}
