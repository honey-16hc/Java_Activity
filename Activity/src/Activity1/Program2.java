package Activity1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int[] arr =new int[n];
				for(int i =0;i<n;i++)
				{
					arr[i] = sc.nextInt();
					if(arr[i] < 0) {
						System.out.println("Invalid Input");
						System.exit(0);
					}
				}
		int check = countRepeaters(arr,n);
		if(check == -1) {
			System.out.println("Invalid Input");
		}
		else 
			System.out.println(check);
	}
	public static int countRepeaters(int[] arr, int n) {
		int count = 0;
		for(int i =0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i] == arr[j])
				count = count + 1;
		}
		}
		return count*2;
	}
	
}
