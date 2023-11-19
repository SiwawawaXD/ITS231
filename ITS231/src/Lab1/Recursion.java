package Lab1;

public class Recursion {
	static int result = 0;
	static int subsum(int n) {
		
		if(n>0) {
			if(n%2 == 0) {
				result = result - n;
				subsum(n-1);
			}
			else {
				result = result + n;
				subsum(n-1);
			}
		}
		return result;
    }
    
	static int sumDigit(int n) {
		if(n>0) {
			result = result + n%10 + sumDigit(n/10);
		}
        return result;
    }
    
	public static void main(String[] args) {
          

            // Test Uncomment these lines below to test your subsum code
                /*
                 System.out.println("Calculating subsum(10):");
		 System.out.println("Your answer is "+subsum(10));
                 System.out.println("The correct answer is -5");
                 System.out.println("-----------------------"); 
            */

            /*
                 System.out.println("sumDigit(123456789)");
		 System.out.println("Your answer is "+ sumDigit(123456789));
                 System.out.println("The correct answer is 45");
            */
	}

}
