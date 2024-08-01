package Demo;

import java.util.Arrays;

public class FiendTwoStringIsAnagramsOrNot {
	
	public static void main(String[] args) {
		
		String s = "Police";
		
		String s2 = "loiceP";
		
		if(s.length() != s2.length()) {
			
			System.out.println("Length is not match. It is a not Anagram");
		}
		
		char[] c = s.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c2);
		
		if(Arrays.equals(c, c2)) {
			
			System.out.println("It is a Anagram");
		}

	}

}
