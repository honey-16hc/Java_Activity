package problem3;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name:");
		String name = sc.nextLine();
		System.out.println("Enter session:");
		String session = sc.nextLine();
		System.out.println("Enter runs:");
		int runs = sc.nextInt();
		
		Innings inn = new Innings();
		inn.setTeamname(name);
		inn.setInningsname(session);
		inn.setRuns(runs);
		inn.displayInningsDetails();
		
		
		
		
	}

}
