package activity4.problem6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String[] al = {"Chennai Super Kings","Sun Risers Hyderabad", "Delhi Capitals", "Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		System.out.println("Enter the expected winner team of IPL Season 13");
		String winner = sc.nextLine();
		Boolean flag = check(winner,al);
		if(! flag)
			throw new TeamNameNotFound();
		System.out.println("Enter the expected runner  team of IPL Season 13");
		String runner  = sc.nextLine();
		Boolean q = check(winner,al);

		if(q) {
			System.out.println("Expected IPL Season 13 winner: " + winner + "\n" + "Expected IPL Season 13 runner: " + runner);
		}

		else {
			throw new TeamNameNotFound();
		}
	}
	public static boolean check(String x,String[] al) throws Exception {
		boolean c = false;
		for(int i = 0;i< 8;i++) {
			if(x.equalsIgnoreCase(al[i])) {
				System.out.println(al[i]);
				c = true;
				break;
			}		
		}
		return c;
	}

}
