package Demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInString {
	
	
	public static void main(String[] args) {
		
		
		String s = "Progremming";
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<Character>();
		
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		
		System.out.println(set);
		
		for(char c:set) {
			
			sb.append(c);
		}
		
		System.out.println(sb);

		
	}
	
}
