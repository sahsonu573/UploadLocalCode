package oldProg;
import java.io.IOException;

public class InputFromUserDemo {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter any input: ");
		String str="0";
		while (Integer.parseInt(str) < 1) {
			int i= System.in.read();
			System.out.print((char)i);
		}

	}
}
