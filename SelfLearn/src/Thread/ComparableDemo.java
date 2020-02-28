package Thread;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		List<Employee> emp = new LinkedList<>();
		emp.add(new Employee(102, "Sonu"));
		emp.add(new Employee(200, "Monu"));
		emp.add(new Employee(488, "Alok"));
		emp.add(new Employee(101, "Somu"));
		emp.forEach(System.out::println);
		// Instead of Collection we are comparing at object level - by using comparable
		// in this case we are simply passing the List reference which needs to be shorted.
		Collections.sort(emp);
		
		System.out.println("Post sorting");
		emp.forEach(System.out::println);
	}
}
class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empId> o.empId?1:this.empId<o.empId?-1:0;
	}

}
