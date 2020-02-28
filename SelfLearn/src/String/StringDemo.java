package String;
public class StringDemo {

	public static void main(String[] args) {
		String str="Sonu";
		String str1= "Kumar";
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		str="Manoj Sah";
		System.out.println(str.hashCode());
		String s = new String("Sonu");
		System.out.println(s.hashCode());
		String Str3= str.substring(1);
		System.out.println(Str3);
	}
}
