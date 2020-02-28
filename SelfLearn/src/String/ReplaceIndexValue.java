package String;

public class ReplaceIndexValue {
	public static void main(String[] args) {
		String str ="0123456789A0123456789B0123456789C";
		
		char[] ch= str.toCharArray();
		System.out.println(ch);
		for (int i=0; i<ch.length; i++) {
			// System.out.print(ch[i]+ " ");
			
			try {
				if (i%5==0) {
					ch[i]= ch[i-4];
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				
			}
			System.out.print(ch[i]);
		}
	}
}
