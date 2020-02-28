package String;
import java.util.Scanner;

public class StringOperationDemo {

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String:- ");
		s1=sc.nextLine();
		System.out.print("Enter 2nd String:- ");
		s2=sc.nextLine();
		// get the length of the String
		System.out.println("Length of the first String is "+ s1.length());
		System.out.println("Length of the first String is "+ s2.length());
		// Concatenation  of both String
		String s3= s1.concat(" "+s2);
		System.out.println(s3);
		// converting the string in the upper case
		s3=s3.toUpperCase();
		System.out.println(s3);
	}

}