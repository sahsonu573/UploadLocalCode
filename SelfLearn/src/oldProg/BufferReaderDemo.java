package oldProg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Enter String Value: ");
		String s = inp.readLine();
		System.out.println("String Value "+ s);
		System.out.print("Enter Integer Value: ");
		int i = Integer.parseInt(inp.readLine());
		System.out.println("Integer value "+ i);
	}
}
