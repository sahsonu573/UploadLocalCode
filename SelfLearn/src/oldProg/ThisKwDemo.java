package oldProg;
public class ThisKwDemo {
public static void main(String[] args) {
OneC o = new OneC(7);
}
}

class OneC{
	int i ;									// instance variable
	public OneC(int i) {					// here i is Local variable
		this.i=i;					// this keyword says that this.i is instance variable  ---- ASK current instance variable
System.out.println(i);
	}
}
