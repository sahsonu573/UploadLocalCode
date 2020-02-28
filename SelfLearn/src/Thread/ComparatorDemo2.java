package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		std.add(new Student("Sonu",42,212));
		std.add(new Student("Alok",21,527));
		std.add(new Student("Somesh",10,536));
		std.add(new Student("Manoj",29,379));
		std.add(new Student("Gaurav",63,270));
		std.forEach(System.out::println);
		// Collection is comparing object data and then shorting - by using comparable
		Collections.sort(std, (s1,s2) -> {
			return s1.sMarks>s2.sMarks?1:s1.sMarks<s2.sMarks?-1:0;		// print inc
			// return s1.rollNo>s2.rollNo?1:s1.rollNo<s2.rollNo?-1:0;		// print increasing
			//	return s1.rollNo>s2.rollNo?-1:s1.rollNo<s2.rollNo?1:0;		// print reverse
		});
		
		System.out.println("After Sort");
		std.forEach(System.out::println);

	}

}
class Student{

	String sName;
	int rollNo;
	int sMarks;

	public Student(String sName, int rollNo, int sMarks) {
		super();
		this.sName = sName;
		this.rollNo = rollNo;
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sName= " + sName + ", rollNo= " + rollNo + ", sMarks= " + sMarks + "]";
	}

	public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}

} 