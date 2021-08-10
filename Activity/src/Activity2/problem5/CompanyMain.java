package Activity2.problem5;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name:");
		String name = sc.nextLine();
		System.out.println("Enter the employees:");
		String emp = sc.nextLine();
		System.out.println("Enter TeamLead:");
		String team = sc.nextLine();
		int flag=0;
		String[] parts = emp.split(",");
		for(int i=0;i<parts.length;i++) {
			if(team.equalsIgnoreCase(parts[i])) {
				flag=1;
			}
		}
		if(flag == 1) {
			
			Company cmp = new Company();
			cmp.setName(name);
			cmp.setEmployees(emp);
			cmp.setTeamlead(team);
			System.out.println("Name: " + cmp.getName());
			System.out.println("Emploees: " + cmp.getEmployees());
			System.out.println("Lead: " + cmp.getTeamlead());
			
		}
		else
			System.out.println("Invalid input. ");
	
		
	}

}
