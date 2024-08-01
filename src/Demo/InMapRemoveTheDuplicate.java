package Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class InMapRemoveTheDuplicate {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Shivraj");
		m.put(5, "Bhagwat");
		m.put(2, "Datta");
		m.put(3, "Ghodke");
		m.put(4, "Datta");
		
		System.out.println(m);
		
		Map<Integer, String> uniqueMap = new HashMap<>();
        // Create a set to track the values already added
        Set<String> seenValues = new HashSet<>();

        // Iterate over the original map
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            // Check if the value has already been added
            if (!seenValues.contains(entry.getValue())) {
                // Add the value to the set and the entry to the unique map
                seenValues.add(entry.getValue());
                uniqueMap.put(entry.getKey(), entry.getValue());
            }
        }
        
        System.out.println(uniqueMap);
        System.out.println(seenValues);
				
				
	}

}
