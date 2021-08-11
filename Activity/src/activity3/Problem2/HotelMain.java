package activity3.Problem2;

import java.util.Scanner;

public class HotelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cost = 0;
		System.out.println("Hotel Tariff Calculator " + "\n" + "1. Deluxe Room"  + "\n" + "2. Deluxe AC Room"+ "\n" + "3. Suite AC Room"+ "\n" + "Select Room Type:");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Hotel Name:");
		String a = sc.nextLine();
		System.out.println("Room Square Feet Area:");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Room has TV (yes/no):");
		Boolean c = sc.hasNext();
		sc.nextLine();
		System.out.println("Room has Wifi (yes/no):");
		Boolean d = sc.hasNext();
	
	if(n == 1) {
		DeluxeRoom dr = new DeluxeRoom(a,b,c,d);
		int cp = dr.getRatePerSqFeet();
		System.out.println(cp);
		 cost = dr.calculateTariff(cp);
		
	}
	else if(n == 2) {
		DeluxeSeaViewRoom ds = new DeluxeSeaViewRoom(a,b,c,d);
		int dp = ds.getRatePerSqFeet();
		System.out.println(dp);
		cost = ds.calculateTariff(dp);
	}
	else if(n == 3) {
		SuiteRoom sr = new SuiteRoom(a,b,c,d);
		int srp = sr.getRatePerSqFeet();
		System.out.println(srp);
		cost = sr.calculateTariff(srp);
	}
	System.out.println("Room Tariff per day is:" + cost);
	}
}
