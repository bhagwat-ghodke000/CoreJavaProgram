package Demo;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name = "Shivraj";
		
		System.out.println(name);
		
		StringBuilder out = new StringBuilder();
		
		char[] chars = name.toCharArray();
		
		System.out.println(chars);
		
		for(int i= chars.length - 1; i>=0;i--) {
			out.append(chars[i]);
			
			System.out.println(chars[i]);
			
			
		}
	}

}
