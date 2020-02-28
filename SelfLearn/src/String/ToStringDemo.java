package String;
public class ToStringDemo {

	public static void main(String[] args) {
		Emp e = new Emp(96882, "Sonu Kumar Sah");
		System.out.println(e);

	}
}

class Emp{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId= " + empId + ", empName= " + empName + "]";
	}
	
	/*@Override
	public String toString() {							Manually modify the return type of toString Methods from object class
		return empId  + " : " + empName;
	}*/
	
	
}