package oldProg;
public class EncapsulationMainClass {

	public static void main(String[] args) {
		EmployeeEncapsulationTest emp = new EmployeeEncapsulationTest();
		emp.setEmpId(654798);
		emp.setName("Sonu");
		System.out.println("Emp name is "+ emp.getName() + " and EmpId is "+ emp.getEmpId());

	}

}
