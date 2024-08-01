package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StartWithExample {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		
		al.add("Shubham");
		al.add("Shrikant");
		al.add("Satta");
		al.add("Sawan");
		al.add("BO");
		
		
		boolean anyMatch = al.stream().anyMatch(s->s.equals("Shrikantd"));
		
		System.out.println(anyMatch);
		
		boolean allMatch = al.stream().allMatch(s->s.length()>3);
		
		if(allMatch) {
			
			System.out.println("All length greater than 3");
		}else {
			
			System.out.println("Some length in less than 3");
		}
		
		
		 List<String> collect = al.stream().filter(a -> a.startsWith("S") || a.startsWith("s")).collect(Collectors.toList());
		 
		 System.out.println(collect);
		 
		 
		 Boolean collect2 = al.stream().allMatch(a->a.startsWith("S"));
		 System.out.println(collect2);
		 
		 
		 Map<Character,Long> collect4 = al.stream().flatMapToInt(String::chars).mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	    System.out.println(collect4);
	   List<Integer> list = new ArrayList<Integer>();
	   
	   list.add(10);
	   list.add(20);
	   list.add(21);
	   list.add(50);
	   list.add(20);
	   list.add(7);
	   
	   int sum = list.stream().mapToInt(a->a).sum();
	   
	   System.out.println(sum);
	   
	   List<Integer> collect3 = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	   System.out.println(collect3);
	   
	   List<Integer> collect5 = list.stream().sorted().distinct().collect(Collectors.toList());
	   System.out.println(collect5);
	   
	   List<Integer> collect6 = list.stream().sorted().distinct().skip(1).collect(Collectors.toList());
	   System.out.println(collect6);
	   
	   
	   List<Integer> collect7 = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	   System.out.println(collect7);
	   
	   List<Integer> collect8 = collect7.stream().sorted((a,b)->b.compareTo(a)).distinct().skip(1).collect(Collectors.toList());
	   System.out.println(collect8);
	   
	   
	   List<Integer> collect9 = collect7.stream().distinct().collect(Collectors.toList());
	   Integer integer = collect9.get(1);
	   collect9.removeIf(a->a.equals(integer));
	   System.out.println(collect9);
	   
	   List<Integer> collect10 = list.stream().sorted().distinct().collect(Collectors.toList());
	   System.out.println(collect10);
	   
	   Integer integer2 = collect10.get(1);
	   boolean removeIf = collect10.removeIf(a->a.equals(integer2));
	   System.out.println(collect10);
	}
	   
	   

}
