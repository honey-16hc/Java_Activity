package activity6.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Team> ar = new ArrayList<Team>();
				System.out.println("Enter number of teams:");
		int n = sc.nextInt();
		 sc.nextLine();
		for(int i=0;i<n;i++) {
		System.out.println("Enter team " + (i+1) + " detail");
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter number of matches");
		Long no = sc.nextLong();
		sc.nextLine();
		ar.add(new Team(name,no));
		}
		
		Collections.sort(ar,new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team t: ar)
			System.out.println(t);
	}

}
