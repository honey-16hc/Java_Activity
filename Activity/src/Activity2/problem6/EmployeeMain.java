package Activity2.problem6;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter Address:");
		String adrs = sc.nextLine();
		System.out.println("Enter Mobile:");
		String mobile = sc.nextLine();

		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress(adrs);
		emp.setMobile(mobile);
		System.out.println("Employee Details" + "\n" + "Name:" + emp.getName() + "\n" + "Address:" + emp.getAddress() + "\n" + "Mobile:" + emp.getMobile());
		System.out.println("Verify and Update the details: ");
		int choice = menu();
		if( choice != 4) {
		switch(choice) {
		case 1:
		    System.out.println("Current name is: " + emp.getName());
		    System.out.println("Enter name:");
			String updatedName = sc.nextLine();
			emp.setName(updatedName);
			choice = menu();
		    break;
		  case 2:
		    System.out.println("Current address is: " + emp.getAddress());
		    System.out.println("Enter Address:");
			String updatedadrs = sc.nextLine();
			emp.setAddress(updatedadrs);
			choice = menu();
		    break;
		  case 3:
		    System.out.println("Current mobile number is: " + emp.getMobile());
		    System.out.println("Enter mobile:");
			String updatedmobile = sc.nextLine();
			emp.setMobile(updatedmobile);
			choice = menu();
		    break;
		}
		}
		if( choice == 4)
			System.out.println("The details are:" + "\n" + "Name:" + emp.getName() + "\n" + "Address:" + emp.getAddress() + "\n" + "Mobile:" + emp.getMobile());

	}
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");
		int ch = sc.nextInt();
		return ch;
		}
}
