package Problem2;

public class EmployeeMain {
	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		emp.setName("Ravi");
		emp.setAddress("Pune");
		emp.setMobile("9998887771");
		System.out.println("Employee Details" + "\n" + "Name:" + emp.getName() + "\n" + "Address:" + emp.getAddress() + "\n" + "Mobile:" + emp.getMobile());
		
	}
}
