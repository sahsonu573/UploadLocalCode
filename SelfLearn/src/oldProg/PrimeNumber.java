package oldProg;
public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime=true;
		int num=100;
		for (int i=2; i<Math.sqrt(num);i++ ) {
			if (num%i==0) {
				isPrime=false;
				break;
			}
		}
			if (isPrime) {
				System.out.println("prime");	
			}
			else
				System.out.println("not prime");
				
		}
		

	}


