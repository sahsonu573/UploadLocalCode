package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Sonu");
		System.out.println(sbf.hashCode());
		sbf.append(" Kumar");
		System.out.println(sbf);
		StringBuffer sbfq = new StringBuffer("Demo");
		System.out.println(sbfq.hashCode());
		
		
		StringBuilder sb = new StringBuilder("Sonu");
		System.out.println(sb.hashCode());
		sb.append(" Kumar");
		System.out.println(sb);
		StringBuilder sbfqa = new StringBuilder("Demo");
		System.out.println(sbfqa.hashCode());
	}

}
