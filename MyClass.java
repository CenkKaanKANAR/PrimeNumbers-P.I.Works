
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 500; i < 600; i++) {
			
			if(isPrime(i)) {
				System.out.println(i + " is a prime number");
			}
		}
			
	}
	
    public static boolean isPrime(int n) {

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
        
    
}
