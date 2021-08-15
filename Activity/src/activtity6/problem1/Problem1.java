package activtity6.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered");
		int n = sc.nextInt();
		sc.nextLine();
		//Map<String, Integer> hm = new HashMap<String, Integer>();
		///ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Player> br = new ArrayList<Player>();
		for(int i=0;i<n;i++) {
			System.out.println("Please enter player name");
           String val = sc.nextLine();
         //  ar.add(val);
           System.out.println("Please select the skill of the player "+ "\n"  + "1.All Rounder "+"\n"+ "2.Batsman"+"\n"	+ "3.Bowler");
           int skill = sc.nextInt();
           sc.nextLine();
           if(skill == 1)
        	   br.add(new Player(val,"All Rounder"));
           else if(skill == 2)
        	   br.add(new Player(val, "Batsman"));
           else if(skill == 3)
        	   br.add(new Player(val,"Bowler"));
         //  hm.put(val, skill);
		}
		System.out.println("Player Details");
		Collections.sort(br, new PlayerComparator());
		for(Player p:br)
			System.out.println(p);
	}
}
