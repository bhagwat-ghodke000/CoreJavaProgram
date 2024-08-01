package Demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHigestWithoutUsingSorted {
	
	
	public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(8);
        al.add(5);
        al.add(10);
        al.add(12);
        al.add(8);
        al.add(5);
        al.add(12);
        al.add(8);
        al.add(5);
        
        
        List<Integer> collect = al.stream().sorted((a1,a2)-> a1.compareTo(a2)).collect(Collectors.toList());
        
        System.out.println(collect);

        if (al.size() < 2) {
            System.out.println("List must contain at least two elements.");
            return;
        }
        
        Optional<Integer> max = al.stream().max(Comparator.naturalOrder());
        
        List<Integer> list2 = new ArrayList<Integer>();
        
        for(int i:al) {
        	
        	if(!max.get().equals(i)) {
        		
        		list2.add(i);
        	}
        	
        }
        
        System.out.println("List 2 :"+ list2);
        
        Optional<Integer> max2 = list2.stream().max(Comparator.naturalOrder());
        
        System.out.println(max2.get());

        Optional<Integer> highest = al.stream().max(Comparator.naturalOrder());
        Optional<Integer> secondHighest = al.stream()
                                             .filter(num -> !num.equals(highest.orElse(Integer.MIN_VALUE)))
                                             .max(Comparator.naturalOrder());
        
        
        System.out.println(highest);

        if (secondHighest.isPresent()) {
            System.out.println("The second highest value is: " + secondHighest.get());
        } else {
            System.out.println("There is no second highest value.");
        }
    }

}
