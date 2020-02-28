package expection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyTryWithResources {
public static void main(String[] args) throws Exception {
	String str="";
	/*BufferedReader br = null;
	
	try {
		br= new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
	}
	catch (Exception e) {
		
	}
	finally {
		br.close();
	}*/
	// Instead of above code we can skip catch & finally block as from Java & we have feature instead of creating a sperate bloc to close the resource
	// We can close that from try block only --- refer the below code
	// Wd can use this kind of code where ever we are using any external resource, socket, etc
	try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
		str=br.readLine();
	}
}
}
