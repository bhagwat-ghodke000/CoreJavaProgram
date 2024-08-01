package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class DifferencateTheCharacterAndNumber {
	
	
	public static void main(String[] args) {
		
		String s = "2341ABCD43CD23ZY";
		
		char[] charArray = s.toCharArray();
		
		StringBuilder letter = new StringBuilder();
		
		StringBuilder digit = new StringBuilder();
		
		HashSet<Character> ch = new HashSet<Character>();
		
		for(Character c:charArray) {
			
			if(Character.isLetter(c)) {
				
				letter.append(c);
				
				ch.add(c);
			}else if(Character.isDigit(c)) {
				
				digit.append(c);
			}
		}
		
		System.out.println("Digits "+digit);
		
		System.out.println("character "+letter);
		
		System.out.println(ch);
		
		Object[] array = ch.toArray();
		
		StringBuilder s1 = new StringBuilder();
		for(int i=0;i<=array.length-1;i++) {
			
			s1.append(array[i]);
		}
		
		   System.out.println(s1);
		
		
		}

}
