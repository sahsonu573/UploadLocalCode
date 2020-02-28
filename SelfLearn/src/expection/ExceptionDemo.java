package expection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i =8, j=2, k =0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter value of j ");
		// int a[]= new int[4];
		
		try {
			
			j=Integer.parseInt(bf.readLine());
			k=i/j;
			/*for(int x=0; x<=4; x++) {
				a[x]=x+5  ;
			}
			for (int value : a) {
				System.out.print(value+" ");
			}*/
		}
		catch (IOException e) {
			System.out.println("Input can be only integer ----ERROR --> "+e);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide the number ------> "+ e);
			System.out.println(k);
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is less ------> "+ e);
		}*/
		catch (Exception e) {
			System.out.println("Unknown Excepton");
		}
		finally{
			// We should close the resources which we have used in the about set of code.
			try {
				bf.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("OutPut Value: "+k);
		}
		
	}

}
