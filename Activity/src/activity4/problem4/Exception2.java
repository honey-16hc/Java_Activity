package activity4.problem4;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
		 System.out.println("Enter the number of overs");
		 int over = sc.nextInt();
		 int run[] = new int[over];
		 System.out.println("Enter the number of runs for each over");
		 for(int i=0;i<over;i++) {
		  run[i] = sc.nextInt();
		 }
		 System.out.println("Enter the over number");
		 int num = sc.nextInt();
		 System.out.println("Runs scored in this over : " + run[(num - 1)]);
		 
		}
		catch (Exception e) {
			
			 System.out.println(e.toString());
		
		}
	}

}
