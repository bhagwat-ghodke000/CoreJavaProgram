package Exception;

public class FinallyBlock {
	
	public static int add() {
		
		try
		{
		System.out.println("Try Block");
		return 777;
		}
		catch(ArithmeticException e)
		{
		return 888;
		}
		finally{
			System.out.println("Finally block");
		    return 999;
		}

	}
	
	public static void main(String[] args) {
		
		FinallyBlock f = new FinallyBlock();
		f.add();
		
		//long a = 5;
		
		
		
		// System.out.println("COmplete finally block");
		
	}

}
