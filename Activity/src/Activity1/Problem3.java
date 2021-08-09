package Activity1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Problem3 p3 = new Problem3();
		int value = p3.productDigits(n);
		
		if(value == -1)
			System.out.println("Invalid Input");
		else
			System.out.println(value);
		
	}
	
	public int productDigits(int n) {
		int product = 1;
		int r;
		if(n < 0 || n > 32767)
			return -1;
		while(n != 0)
		{
			r=n%10;
			product = product * r;
			n=n/10;
			
		}
		return product;
		
	}
}
