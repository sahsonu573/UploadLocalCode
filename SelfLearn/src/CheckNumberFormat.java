import java.util.Scanner;

public class CheckNumberFormat {

	public static void main(String[] args) {

		boolean flag = true;
		int var1 = 0, var2=0 , number = 4566;

		var1= number%10;
		number /= 10;
		var2= number%10;
		while (number>0) {
			if (var1 >= var2) {
				flag= true;
				System.out.println(var2);
			}

			else {
				flag= false;
				System.out.println("before break");
				break;
			}
			var1= number%10;
			number /= 10;
			var2= number%10;
		}


		if(flag) {
			System.out.println("Num is in increasing order");
		}
		else
			System.out.println("Num is not in increasing order");

		/*String str= "1234";
		System.out.println(str.charAt(0));
		for (int j =str.length(); j>0; j--) {
			System.out.print(j);
		}
		 */

		/*while (number>0) {
		var1 = number%10;
		number=number/10;
		var2=number%10;
		//number=number/10;
		//sum= sum*10 + reminder;
		if (var1<var2) {
			number=number/10;
			//var2=var1;
		}else {
			flag=false;
			break;
		}

	} */

	}
}