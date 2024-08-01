package Practice;

public class SingleToneClass {
	
	private String s1;
	
	
	public SingleToneClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	private SingleToneClass(String s1) {
		
		this.s1 = s1;
	}
	
	private static SingleToneClass o=null;
	
	
	private static SingleToneClass getTest(String s1) {
		
		if(o==null) {
			o= new SingleToneClass(s1);
		}
		
		return o;
	}
	
	
	public static void main(String[] args) {
		
		SingleToneClass t = new SingleToneClass();
		
		System.out.println(t.getTest("Shubham").hashCode());
		
        SingleToneClass t1 = new SingleToneClass();
		
		System.out.println(t1.getTest("Shure").hashCode());
		
		
		
	}
	
	

}
