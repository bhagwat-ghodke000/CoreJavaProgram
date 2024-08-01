package Demo;

	import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	public class InTheListRemoveOddNumber  {
	    public static void main(String[] args) {
	        List<Integer> al = new ArrayList<Integer>();
	        al.add(10);
	        al.add(13);
	        al.add(8);
	        al.add(5);
	        al.add(10);
	        al.add(12);
	        al.add(8);
	        al.add(5);
	        al.add(12);
	        al.add(8);
	        al.add(5);
	        
	        
	     List<Integer> collect3 = al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	     
	     
	     
	     List<Integer> sorted = al.stream().sorted().collect(Collectors.toList());
	     System.out.println(collect3);
	     
	     System.out.println(sorted);
	        
	       // al.sort(Comparator.comparing());
	        
	        // Remove odd numbers
	        al.removeIf(n -> (n % 2 != 0));
	        
	        Set<Integer> collect = al.stream().distinct().collect(Collectors.toSet());
	        
	        List<Integer> collect2 = collect.stream().collect(Collectors.toList());
	        Integer integer = al.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	        
	        
	        // Print the list to check the result
	        System.out.println(integer);
	    }
	}

