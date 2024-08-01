package Demo;

public class PrimeCheacker {
	

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        // Check from 2 to the square root of the number
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int number = 29; // Replace with your number to check
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	       
	    }
	}
