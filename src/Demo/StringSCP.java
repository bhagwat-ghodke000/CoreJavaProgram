package Demo;

public class StringSCP {
	
	public static void main(String[] args) {
		
//		String s1=new String("spring");
//		s1.concat("fall");
//		s1=s1+"winter";
//		
//		String s2=s1.concat("summer");
//		System.out.println(s1);
//		System.out.println(s2);
		
		
//		String s1=new String("you cannot change me!");
//		String s2=new String("you cannot change me!");
//		System.out.println(s1==s2);//false
//		String s3="you cannot change me!";
//		System.out.println(s1==s3);//false
//		String s4="you cannot change me!";
//		System.out.println(s3==s4);//true
//		String s5="you cannot "+"change me!";
//		System.out.println(s3==s5);//true
//		String s6="you cannot ";
//		String s7=s6+"change me!";
//		System.out.println(s3==s7);//false
//		final String s8="you cannot ";
//		String s9=s8+"change me!";
//		System.out.println(s3==s9);//true
//		System.out.println(s6==s8);//true
		
		
		String s1=new String("bhaskar");
		String s2=s1.concat("software");
		String s3=s2.intern();
		String s4="bhaskarsoftware";
		System.out.println(s3==s4);//true
		
		System.out.println(s2==s4);


	}

}
