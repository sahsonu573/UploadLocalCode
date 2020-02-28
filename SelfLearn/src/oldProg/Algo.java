package oldProg;
public class Algo {

	public static void main(String[] args) {
		int x=1234, y=0;
		do  {
			y=y+(x%10);
			x= x/10;
			}
		while (x==0);
		System.out.println(y);
				

	}

}
