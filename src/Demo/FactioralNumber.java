package Demo;

public class FactioralNumber {
	
	
	public static void main(String[] args) {
        int number = 5; // Replace with the number you want to find the factorial of
        long factorial = findFactorialIterative(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long findFactorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }	
	

}
