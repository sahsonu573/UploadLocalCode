package oldProg;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13
		int k=0, a=1, b=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		System.out.print("1 1 ");
		while (k< n) {
			k= a+b;
			if (k>n)
				break;
				System.out.print(k + " ");
				a=b;
				b=k;
		}
		
	}

}
