package oldProg;

import java.util.Scanner;

public class IntegerWrapperClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = 5;
	Integer in= new Integer (i);
	System.out.println(i);
	
	int x = 6;
	Integer iiii= x;
	System.out.println(iiii);
	
	Integer ii = new Integer (4343);
	
	// Unboxing or Unwrapping
	int k = ii.intValue();
	System.out.println(k);
	
	// Auto Unboxing or Unwrapping
	int j= ii-343;
	System.out.println(j);
}
}
