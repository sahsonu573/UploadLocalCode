package oldProg;
public class TernaryClass {

	public static void main(String[] args) {
		/*	int a, b;
		a = 5;
		if (a==9087) {
			b=6;
			System.out.println(b);
		}
			else {
				b = 7;
				System.out.println(b);
			}
		b=a==5?6:7;
		System.out.println(b); */
		Object obj1;
		if (true) {
			obj1= new Integer(10);
		}
		else
			obj1 = new Double (13.0);
		System.out.println(obj1);
		
		System.out.println("=======================================");
		Object obj2;
		obj2 = true?new Integer(10) : new Double (14.0);
		System.out.println(obj2);
		if (System.out.printf("Hello Print without semicolumn")==null) {
			
	} 
		}

}
