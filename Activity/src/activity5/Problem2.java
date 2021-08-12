package activity5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		int countF = 0, countH = 0;
		Scanner sc =  new Scanner(System.in);
		int n =sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			if(al.get(i) >= 50 && al.get(i) < 100) {
				countF++;
			}
			else if(al.get(i) >= 100)
				countH++;
}
		System.out.println(countF+"\n" + countH);
	}
	
}
