package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHigest {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(3);
		al.add(10);
		al.add(15);
		al.add(9);
		
		int size = al.size()-2;
		
		Collections.sort(al);
		
		Integer integer = al.get(size);
		
		System.out.println(integer);
		
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Iterate through the list
        for (int num : al) {
            if (num > highest) {
                // Update second highest and highest
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                // Update second highest if current number is distinct and greater than second highest
                secondHighest = num;
            }
            
            System.out.println(secondHighest);
		
		
	}
	}

}
