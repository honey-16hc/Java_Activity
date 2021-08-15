package activity6.problem3;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DisplayTeamMain {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	Map<String, Team> tmap = new TreeMap<>();
	for(int i =0;i<n; i++) {
		
		String tm = sc.nextLine();
		String[] parts = tm.split("\\|");
		
		if(tmap.containsKey(parts[0])) {
		Team team = tmap.get(parts[0]);
		team.addPlayer(parts[1]);
		}
		else {
			Team team = new Team(parts[0]);
			team.addPlayer(parts[1]);
			tmap.put(parts[0],team);
		}
	}
	System.out.println("Team and Players in ascending order");
	Set<Map.Entry<String, Team>> s = tmap.entrySet();
	
	for(Entry<String, Team> me : s) {
		System.out.println(me.getKey());
		for (Player player : me.getValue().getPlayerList()) {
			System.out.println("--"+player.getName());
		}
	    }
 }
}
