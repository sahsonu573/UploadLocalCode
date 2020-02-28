package oldProg;
import java.util.Scanner;

public class Palindrome  {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter any number : ");
int n = sc.nextInt();
int t=n;
int s=0,r;
while (n>0) {
	r=n%10;
	n=n/10;
	s= s*10 + r;
}
if (s==t)
	System.out.println(t +" is Palindrome number");
else 
	System.out.println(t + " is not a Palindrome number.");
	}

}
	