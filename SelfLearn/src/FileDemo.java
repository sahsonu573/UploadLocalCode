import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import jdk.internal.util.xml.impl.ReaderUTF8;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\sonsah\\Desktop\\AppD training\\demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos= new DataOutputStream(fos);
		dos.writeUTF("Demo Content in the File2");
		System.out.println("File created ");
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
	}

}
