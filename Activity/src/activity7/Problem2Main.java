package activity7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import activity6.problem2.Team;
import activity6.problem2.TeamComparator;

public class Problem2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Runnable p =()->System.out.println("Main thread");
        p.run();
        
        
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
Comparator c = (o1,o2)->{ return ((Team) o1).getNumberOfMatches().compareTo(((Team) o2).getNumberOfMatches());
};
Collections.sort(ar, c);
System.out.println("Team list after sort by number of matches");
for(Team t: ar)
	System.out.println(t);


	}

}
