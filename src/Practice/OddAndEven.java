package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddAndEven{
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(104);
		al.add(100);
		al.add(10);
		al.add(1020);
		al.add(10);
		
		List<Integer> collect = al.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = al.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = al.stream().sorted((Integer a,Integer b)->b.compareTo(a)).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		List<Integer> collect4 = al.stream().distinct().collect(Collectors.toList());
		System.out.println(collect4);
		
//		String string = al.toString();
//		System.out.println(string);
		
		List<Integer> collect5 = al.stream().map(a->a.toString().startsWith("1") ? a : null).collect(Collectors.toList());
		
		List<Integer> numbersStartingWith1 = al.stream().filter(a -> a.toString().startsWith("1")).collect(Collectors.toList());
		
		System.out.println(numbersStartingWith1);
		
		boolean collect6 =al.stream().anyMatch(a->a>100);
		
		System.out.println(collect6);
		
		if(collect6) {
			
			System.out.println("Present");
		}else {
			
			System.out.println("Absent");
		}
		
		boolean allMatch = al.stream().allMatch(a->a%2==0);
		
		if(allMatch) {
			
			System.out.println("All number is even");
		}else {
			
			System.out.println("Not all number is even");
		}
		
		boolean allMatch2 = al.stream().allMatch(a->a.toString().startsWith("10"));
		
		if(allMatch2) {
			
			System.out.println("All start with 10");
		}else {
			
			System.out.println("All not start with 10");
		}
		
		
	}

	
}
