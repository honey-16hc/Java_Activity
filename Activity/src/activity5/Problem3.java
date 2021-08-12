package activity5;

import java.util.HashSet;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		HashSet<String> hm = new HashSet<String>();
		for(int i=0;i<n;i++) {
			hm.add(sc.nextLine());
		}
		System.out.println(hm.size());
	}
}
