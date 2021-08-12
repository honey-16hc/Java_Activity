package activity5;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList<String> al= new ArrayList<>();
	ArrayList<String> bl= new ArrayList<>();
	System.out.println("Enter the top 5 scorers of IPL Season 13");
	for(int i=0;i<5;i++) {
		al.add(sc.nextLine());
	}
	System.out.println("Enter the top 5 scorers of IPL Season 12");
	for(int i=0;i<5;i++) {
		bl.add(sc.nextLine());
	}
	System.out.println(bl);
	al.retainAll(bl);
	System.out.println("Consistent run scorers ");
	for(String i:al) {
		System.out.println(i);
	}
	
}

}