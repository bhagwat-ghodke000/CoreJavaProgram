package Practice;

public class Overriding2 extends MethodOverriding1 {
	
	Overriding2(){
		
		super();
		
		System.out.println("Default Constructor");
	}



public static void main(String[] args) {
	
	String name = "Shivraj";
	System.out.println(name);
	
	MethodOverriding1 n = new MethodOverriding1();
	n.setClas("BSC");
	n.setName("Shubhame");
	
	System.out.println(n.toString());
	
	Overriding2 m = new Overriding2();
	//m.methodOne();
}


}
