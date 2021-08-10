package Activity2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String stringF = sc.nextLine();
	String stringS = sc.nextLine();
	
	String first_1 = stringF.substring(0, 1);
	String first_rem = stringF.substring(1);
	String player1 = first_1.toUpperCase() + first_rem.toLowerCase();
	System.out.println(player1);
	System.out.println(stringS.toUpperCase());

	}

}
