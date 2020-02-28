package oldProg;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n= sc.nextInt();
		int tem=n;
		int sum=0, r;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum + (r*r*r);
		}
		if (tem== sum)
			System.out.println("Number is Armstrong");
		else 
			System.out.println("Not an armstrong nn.");
	}

}
