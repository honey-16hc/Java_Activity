package Activity1;

import java.util.Scanner;

public class Problem4 {
	static int[] feedback ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		
		int[] arr = new int[n];
		int[] brr = new int[n];
		feedback = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(0);
		}
		}
		for(int j =0;j<n;j++) {
			brr[j] = sc.nextInt();
			if(brr[j] < 0) {
				System.out.println("Invalid Input");
				System.exit(0);
		}
		}
		highestFeedBack(arr,brr,n);
		for(int i =0;i<n;i++) {
			System.out.println(feedback[i]);
		}
		
}
	
	public static void highestFeedBack(int medical[],int healthcare[],int size) {
		for(int i=0;i<size;i+=2) {
			if(medical[i] == healthcare[i])
			{
				feedback[i] = medical[i];
				if(medical[i+1] > healthcare[i+1])
				{
					feedback[i+1] = medical[i+1];
				}
				else 
					feedback[i+1] = healthcare[i+1];
			}
			else {
				feedback[i] = medical[i];
				feedback[i+1] = medical[i+1];
				feedback[i] = healthcare[i];
				feedback[i+1] = healthcare[i+1];
			}
		}
	}
}
