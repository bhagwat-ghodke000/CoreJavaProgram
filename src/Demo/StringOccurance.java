package Demo;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
	
	public static void main(String[] args) {
		
Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Shivraj");
		m.put(5, "Bhagwat");
		m.put(2, "Datta");
		m.put(3, "Ghodke");
		m.put(4, "Datta");

		 Map<Integer, Map<Character, Integer>> keyWiseOccurrences = new HashMap<>();

	        for (Map.Entry<Integer, String> entry : m.entrySet()) {
	            Integer key = entry.getKey();
	            String value = entry.getValue();

	            Map<Character, Integer> charCountMap = countCharacters(value);
	            keyWiseOccurrences.put(key, charCountMap);
	        }

	        // Print the occurrences of each alphabet key-wise
	        for (Map.Entry<Integer, Map<Character, Integer>> entry : keyWiseOccurrences.entrySet()) {
	            System.out.println("Key: " + entry.getKey());
	            for (Map.Entry<Character, Integer> charEntry : entry.getValue().entrySet()) {
	                System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
	            }
	            System.out.println();
	        }
	    }

	    // Method to count the occurrences of each character in a string
	    public static Map<Character, Integer> countCharacters(String value) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char ch : value.toCharArray()) {
	            if (Character.isLetter(ch)) {  // Only count alphabetic characters
	                ch = Character.toLowerCase(ch); // Make the counting case-insensitive
	                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	            }
	        }

	        return charCountMap;
	}

}
