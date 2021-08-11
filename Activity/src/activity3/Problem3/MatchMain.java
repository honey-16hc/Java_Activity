package activity3.Problem3;

import java.util.Scanner;

public class MatchMain {
public static void main(String [] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the match format " + "\n" + "1.ODI"  + "\n" + "2.T20"+ "\n" + "3. Test");
	int n = sc.nextInt();
	System.out.println("Enter the Current score:");
	int a = sc.nextInt();
	System.out.println("Enter the current Over:");
	float b = sc.nextFloat();
	System.out.println("Enter the Target Score:");
	int c = sc.nextInt();
	
	if(n == 1) {
	ODIMatch odi = new ODIMatch(a,b,c);
	int e = odi.calculateBalls();
	float d = odi.calculateRunRate();
	odi.display(d, e);
	}
	
	else if(n == 3) {
		TestMatch tm = new TestMatch(a,b,c);
		int e = tm.calculateBalls();
		float d = tm.calculateRunRate();
		tm.display(d, e);
	}
	else if(n == 2) {
		T20Match t2m = new T20Match(a,b,c);
		int e = t2m.calculateBalls();
		float d = t2m.calculateRunRate();
		t2m.display(d, e);
	}
}
}
