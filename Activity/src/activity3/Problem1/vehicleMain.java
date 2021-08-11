package activity3.Problem1;

import java.util.Scanner;

public class vehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler " + "\n" + "2.Two Wheeler"  + "\n" + "Enter Vehicle Type:");
		int n = sc.nextInt();
		sc.nextLine();
		
			String c = "";
			System.out.println("Vehicle Make:");
			String a = sc.nextLine();
			System.out.println("Vehicle Number:");
			String b = sc.nextLine();
			System.out.println("Fuel Type: " + "\n" + "1.Petrol"  + "\n" + "2.Diesel");
			int fuel = sc.nextInt();
			sc.nextLine();
			System.out.println("Fuel Capacity: ");
			int d = sc.nextInt();
			System.out.println("Engine CC: ");
			int e = sc.nextInt();
			sc.nextLine();
			if(fuel == 1)
				 c = "Petrol";
			else
				 c = "Diesel";
			
			if(n == 1) {
			System.out.println("Audio System: ");
			String f = sc.nextLine();
			System.out.println("Number of Doors:");
			int g = sc.nextInt();
		
			FourWheeler four = new FourWheeler(a,b,c,d,e,f,g);
			four.displayMake();
			four.displayBasicInfo();
			four.displayDetailInfo();
		}
		
			else if(n == 2) {
			System.out.println("Kick Start Available(yes/no):");
			Boolean f = sc.hasNext();
			
			TwoWheeler two = new TwoWheeler(a,b,c,d,e,f);
			two.displayMake();
			two.displayBasicInfo();
			two.displayDetailInfo();
		}
	}
}
