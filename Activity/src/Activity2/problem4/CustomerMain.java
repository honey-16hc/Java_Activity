package Activity2.problem4;

import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String details = sc.nextLine();
	
		String[] parts = details.split(",");

		Customer cust = new Customer();
		cust.setName(parts[0]); 
		cust.setAddress(parts[1]);
		cust.setMobile(parts[2]);
		System.out.println("Name: " + cust.getName() + "\n" + "Address:  " + cust.getAddress() + "\n" + "Mobile: "+ cust.getMobile());
	}
}
